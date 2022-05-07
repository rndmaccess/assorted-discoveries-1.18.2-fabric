package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.common.core.ADBlockTags;
import rndm_access.assorteddiscoveries.common.core.ADEntityTypeTags;

public class ADSnapdragonBlock extends FlowerBlock {
    public ADSnapdragonBlock(StatusEffect suspiciousStewEffect, int effectDuration, AbstractBlock.Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return ADBlockTags.SNAPDRAGON_PLANTABLE_ON.contains(floor.getBlock());
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = (double) pos.getX() + random.nextFloat();
        double y = (double) pos.getY() + random.nextFloat();
        double z = (double) pos.getZ() + random.nextFloat();

        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0D, 0.0D, 0.0D);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {

        EntityType<?> type = entity.getType();

        if (entity instanceof LivingEntity && !(ADEntityTypeTags.SNAPDRAGON_TELEPORT_EXCEPTIONS.contains(type))) {
            LivingEntity livingEntity = (LivingEntity) entity;

            if (!world.isClient() && !livingEntity.isSneaking() && ((LivingEntity) entity).getVelocity().y == 0.0D) {
                livingEntity.setVelocity(0.0, 0.0, 0.0);

                double d = livingEntity.getX();
                double e = livingEntity.getY();
                double f = livingEntity.getZ();

                for(int i = 0; i < 16; ++i) {
                    double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5D) * 16.0D;
                    double h = MathHelper.clamp(livingEntity.getY() + (double)(livingEntity.getRandom().nextInt(16) - 8), (double)world.getBottomY(), (double)(world.getBottomY() + ((ServerWorld)world).getLogicalHeight() - 1));
                    double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5D) * 16.0D;
                    if (livingEntity.hasVehicle()) {
                        livingEntity.stopRiding();
                    }

                    if (livingEntity.teleport(g, h, j, true)) {
                        SoundEvent soundEvent = livingEntity instanceof FoxEntity ? SoundEvents.ENTITY_FOX_TELEPORT : SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                        world.playSound((PlayerEntity)null, d, e, f, soundEvent, SoundCategory.PLAYERS, 1.0F, 1.0F);
                        livingEntity.playSound(soundEvent, 1.0F, 1.0F);
                        break;
                    }
                }
            }
        }
    }
}
