package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CampfireBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rndm_access.assorteddiscoveries.common.block.entity.ADDyedCampfireBlockEntity;
import rndm_access.assorteddiscoveries.common.core.ADBlockEntityTypes;

public class ADDyedCampfireBlock extends CampfireBlock {
    private ParticleEffect sparkParticle;

    public ADDyedCampfireBlock(AbstractBlock.Settings settings, ParticleEffect sparkParticle) {
        super(false, 1, settings);
        this.sparkParticle = sparkParticle;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level levelIn, BlockPos pos, Random rand) {
        if (stateIn.getValue(LIT)) {
            if (rand.nextInt(10) == 0) {
                levelIn.playLocalSound(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D,
                        SoundEvents.CAMPFIRE_CRACKLE, SoundSource.BLOCKS, 0.5F + rand.nextFloat(),
                        rand.nextFloat() * 0.7F + 0.6F, false);
            }

            // Spawn the spark particle randomly.
            if (rand.nextInt(5) == 0) {
                for (int i = 0; i < rand.nextInt(1) + 1; ++i) {
                    levelIn.addParticle(sparkParticle, pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D,
                            rand.nextFloat() / 2.0F, 5.0E-5D, rand.nextFloat() / 2.0F);
                }
            }
        }
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152755_, BlockState state,
            BlockEntityType<T> blockEntity) {
        if (p_152755_.isClientSide) {
            return state.getValue(LIT)
                    ? createTickerHelper(blockEntity, ADBlockEntityTypes.DYED_CAMPFIRE.get(),
                            ADDyedCampfireBlockEntity::particleTick)
                    : null;
        } else {
            return state.getValue(LIT)
                    ? createTickerHelper(blockEntity, ADBlockEntityTypes.DYED_CAMPFIRE.get(),
                            ADDyedCampfireBlockEntity::cookTick)
                    : createTickerHelper(blockEntity, ADBlockEntityTypes.DYED_CAMPFIRE.get(),
                            ADDyedCampfireBlockEntity::cooldownTick);
        }
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ADDyedCampfireBlockEntity(pos, state);
    }
}
