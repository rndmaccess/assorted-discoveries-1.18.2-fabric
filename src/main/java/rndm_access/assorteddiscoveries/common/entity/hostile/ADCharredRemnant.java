package rndm_access.assorteddiscoveries.common.entity.hostile;

import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import net.minecraft.world.phys.shapes.CollisionContext;
import rndm_access.assorteddiscoveries.common.core.ADEntityTypes;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class ADCharredRemnant extends Zombie {
    public ADCharredRemnant(EntityType<? extends Zombie> zombie, Level level) {
        super(ADEntityTypes.CHARRED_REMNANT.get(), level);
    }

    public static boolean checkCharredRemnantSpawnRules(EntityType<ADCharredRemnant> entity, ServerLevelAccessor world,
            MobSpawnType spawnType, BlockPos pos, Random random) {
        MutableBlockPos mutableBlockpos = pos.mutable();

        do {
            mutableBlockpos.move(Direction.UP);
        } while (world.getFluidState(mutableBlockpos).is(FluidTags.LAVA));

        return world.getBlockState(mutableBlockpos).isAir();
    }

    @Override
    public float getWalkTargetValue(BlockPos pos, LevelReader levelReader) {
        // This lets the charred remnant to spawn at any light level on lava.
        if (levelReader.getFluidState(pos.below()).is(FluidTags.LAVA)) {
            return 0.0F;
        } else {
            return levelReader.getMaxLightLevel();
        }
    }

    @Override
    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance difficulty,
            MobSpawnType reason, @Nullable SpawnGroupData livingData, @Nullable CompoundTag compound) {
        this.getAttribute(Attributes.FOLLOW_RANGE).addPermanentModifier(new AttributeModifier("Random spawn bonus",
                this.random.nextGaussian() * 0.05D, AttributeModifier.Operation.MULTIPLY_BASE));

        if (this.random.nextFloat() < 0.05F) {
            this.setLeftHanded(true);
        } else {
            this.setLeftHanded(false);
        }

        float f = difficulty.getSpecialMultiplier();
        this.setCanPickUpLoot(this.random.nextFloat() < 0.55F * f);
        if (livingData == null) {
            livingData = new ZombieGroupData(getSpawnAsBabyOdds(serverLevelAccessor.getRandom()), true);
        }

        if (livingData instanceof ZombieGroupData) {
            ZombieGroupData zombieentity$groupdata = (ZombieGroupData) livingData;
            if (zombieentity$groupdata.isBaby) {
                this.setBaby(true);
                if (zombieentity$groupdata.canSpawnJockey) {
                    if (serverLevelAccessor.getRandom().nextFloat() < 0.05D) {
                        this.spawnJockey(serverLevelAccessor, difficulty);
                    } else if (serverLevelAccessor.getRandom().nextFloat() < 0.05D) {
                        this.spawnJockey(serverLevelAccessor, difficulty);
                    }
                }
            }

            this.setCanBreakDoors(this.supportsBreakDoorGoal() && this.random.nextFloat() < f * 0.1F);
            this.populateDefaultEquipmentSlots(difficulty);
            this.populateDefaultEquipmentEnchantments(difficulty);
        }

        if (this.getItemBySlot(EquipmentSlot.HEAD).isEmpty()) {
            LocalDate localdate = LocalDate.now();
            int i = localdate.get(ChronoField.DAY_OF_MONTH);
            int j = localdate.get(ChronoField.MONTH_OF_YEAR);
            if (j == 10 && i == 31 && this.random.nextFloat() < 0.25F) {
                this.setItemSlot(EquipmentSlot.HEAD,
                        new ItemStack(this.random.nextFloat() < 0.1F ? Blocks.JACK_O_LANTERN : Blocks.CARVED_PUMPKIN));
                this.armorDropChances[EquipmentSlot.HEAD.getIndex()] = 0.0F;
            }
        }

        this.handleAttributes(f);
        return livingData;
    }

    private void spawnJockey(ServerLevelAccessor serverLevelAccessor, DifficultyInstance difficulty) {
        Strider strider = EntityType.STRIDER.create(this.level);
        strider.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
        strider.finalizeSpawn(serverLevelAccessor, difficulty, MobSpawnType.JOCKEY, null, null);
        strider.setBaby(true);
        this.startRiding(strider);
        strider.positionRider(this);
        serverLevelAccessor.addFreshEntity(strider);
    }

    @Override
    public boolean doHurtTarget(Entity entity) {
        boolean flag = super.doHurtTarget(entity);
        if (flag && this.getMainHandItem().isEmpty() && entity instanceof LivingEntity) {
            float f = this.level.getCurrentDifficultyAt(this.blockPosition()).getEffectiveDifficulty();
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 140 * (int) f));
        }
        return flag;
    }

    @Override
    protected boolean isSunSensitive() {
        return false;
    }

    @Override
    public boolean canStandOnFluid(Fluid fluid) {
        return fluid.is(FluidTags.LAVA);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.HUSK_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.HUSK_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.HUSK_DEATH;
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.HUSK_STEP;
    }

    @Override
    protected boolean convertsInWater() {
        return true;
    }

    @Override
    protected void doUnderWaterConversion() {
        this.convertToZombieType(EntityType.HUSK);
        if (!this.isSilent()) {
            this.level.levelEvent(null, 1041, this.blockPosition(), 0);
        }
    }

    @Override
    protected ItemStack getSkull() {
        return ItemStack.EMPTY;
    }

    @Override
    public void tick() {
        super.tick();
        this.floatCharredRemant();
    }

    private void floatCharredRemant() {
        if (this.isInLava()) {
            CollisionContext iselectioncontext = CollisionContext.of(this);
            if (iselectioncontext.isAbove(LiquidBlock.STABLE_SHAPE, this.blockPosition(), true)
                    && !this.level.getFluidState(this.blockPosition().above()).is(FluidTags.LAVA)) {
                this.onGround = true;
            } else {
                this.setDeltaMovement(this.getDeltaMovement().scale(0.5D).add(0.0D, 0.05D, 0.0D));
            }
        }
    }

    @Override
    public boolean checkSpawnObstruction(LevelReader world) {
        BlockPos spawnAtPos = new BlockPos(this.getX(), this.getY(), this.getZ());
        BlockPos spawnAbovePos = spawnAtPos.above();
        BlockPos spawnOnPos = spawnAtPos.below();

        return world.isUnobstructed(this) && isEmptyAndIsAir(world, spawnAtPos) && isEmptyAndIsAir(world, spawnAbovePos)
                && world.getFluidState(spawnOnPos).is(FluidTags.LAVA);
    }

    private boolean isEmptyAndIsAir(LevelReader reader, BlockPos pos) {
        return reader.getFluidState(pos).isEmpty() && reader.getBlockState(pos).isAir();
    }

    @Override
    protected PathNavigation createNavigation(Level level) {
        return new LavaPathNavigator(this, level);
    }

    /**
     * This sub-class lets these mobs walk on lava.
     *
     * @author Ryan
     */
    static class LavaPathNavigator extends GroundPathNavigation {
        LavaPathNavigator(ADCharredRemnant entity, Level level) {
            super(entity, level);
        }

        @Override
        protected PathFinder createPathFinder(int p_179679_1_) {
            this.nodeEvaluator = new WalkNodeEvaluator();
            return new PathFinder(this.nodeEvaluator, p_179679_1_);
        }

        @Override
        protected boolean hasValidPathType(BlockPathTypes type) {
            if (type == BlockPathTypes.WATER) {
                return false;
            } else if (type != BlockPathTypes.WALKABLE) {
                return true;
            } else {
                return super.hasValidPathType(type);
            }
        }

        @Override
        public boolean isStableDestination(BlockPos pos) {
            return this.level.getBlockState(pos).is(Blocks.LAVA) || super.isStableDestination(pos);
        }
    }
}
