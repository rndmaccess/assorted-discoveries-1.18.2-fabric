package rndm_access.assorteddiscoveries.common.entity.hostile;

import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import rndm_access.assorteddiscoveries.common.core.ADEntityTypes;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public class ADCharredRemnant extends ZombieEntity {
    public ADCharredRemnant(EntityType<? extends ADCharredRemnant> entityType, World world) {
        super(entityType, world);
    }

    public static boolean canSpawn(EntityType<ADCharredRemnant> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        BlockPos.Mutable mutablePos = pos.mutableCopy();

        do {
            mutablePos.move(Direction.UP);
        } while (world.getFluidState(mutablePos).isIn(FluidTags.LAVA));

        return world.getBlockState(mutablePos).isAir();
    }

    /*
    @Override
    public float getWalkTargetValue(BlockPos pos, LevelReader levelReader) {
        // This lets the charred remnant to spawn at any light level on lava.
        if (levelReader.getFluidState(pos.below()).is(FluidTags.LAVA)) {
            return 0.0F;
        } else {
            return levelReader.getMaxLightLevel();
        }
    }
    */

    /*
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
    */

    /*
    private void spawnJockey(ServerLevelAccessor serverLevelAccessor, DifficultyInstance difficulty) {
        StriderEntity strider = EntityType.STRIDER.create(this.world);
        strider.setPos(this.getX(), this.getY(), this.getZ());
        strider.finalizeSpawn(serverLevelAccessor, difficulty, MobSpawnType.JOCKEY, null, null);
        strider.setBaby(true);
        this.startRiding(strider);
        strider.positionRider(this);
        serverLevelAccessor.addFreshEntity(strider);
    }
     */

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = super.tryAttack(target);

        if (bl && this.getMainHandStack().isEmpty() && target instanceof LivingEntity) {
            float f = this.world.getLocalDifficulty(this.getBlockPos()).getLocalDifficulty();
            ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 140 * (int)f), this);
        }
        return bl;
    }

    @Override
    protected boolean burnsInDaylight() { return false; }

    @Override
    public boolean canWalkOnFluid(FluidState fluidState) {
        return fluidState.isIn(FluidTags.LAVA);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_HUSK_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_HUSK_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_HUSK_DEATH;
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_HUSK_STEP;
    }

    @Override
    protected boolean canConvertInWater() { return true; }

    protected void convertInWater() {
        this.convertTo(EntityType.HUSK);
        if (!this.isSilent()) {
            this.world.syncWorldEvent((PlayerEntity)null, 1041, this.getBlockPos(), 0);
        }
    }

    @Override
    protected ItemStack getSkull() {
        return ItemStack.EMPTY;
    }

    @Override
    public void tick() {
        super.tick();
        this.updateFloating();
    }

    private void updateFloating() {
        if (this.isInLava()) {
            ShapeContext shapeContext = ShapeContext.of(this);
            if (shapeContext.isAbove(FluidBlock.COLLISION_SHAPE, this.getBlockPos(), true)
                    && !this.world.getFluidState(this.getBlockPos().up()).isIn(FluidTags.LAVA)) {
                this.onGround = true;
            } else {
                this.setVelocity(this.getVelocity().multiply(0.5D).add(0.0D, 0.05D, 0.0D));
            }
        }
    }

    @Override
    public boolean canSpawn(WorldView world) {
        BlockPos spawnPos = new BlockPos(this.getX(), this.getY(), this.getZ());
        BlockPos spawnAbovePos = spawnPos.up();
        BlockPos spawnOnPos = spawnPos.down();

        return world.doesNotIntersectEntities(this) && isEmptyAir(world, spawnPos)
                && isEmptyAir(world, spawnAbovePos) && world.getFluidState(spawnOnPos).isIn(FluidTags.LAVA);
    }

    private boolean isEmptyAir(WorldView world, BlockPos pos) {
        return world.getFluidState(pos).isEmpty() && world.getBlockState(pos).isAir();
    }

    @Override
    protected EntityNavigation createNavigation(World world) {
        return new Navigation(this, world);
    }

    /**
     * This sub-class lets these mobs walk on lava.
     *
     * @author Ryan
     */
    static class Navigation extends MobNavigation {
        Navigation(ADCharredRemnant entity, World world) {
            super(entity, world);
        }

        @Override
        protected PathNodeNavigator createPathNodeNavigator(int range) {
            this.nodeMaker = new LandPathNodeMaker();
            return new PathNodeNavigator(this.nodeMaker, range);
        }

        @Override
        protected boolean canWalkOnPath(PathNodeType pathType) {
            if (pathType == PathNodeType.WATER) {
                return false;
            } else if (pathType != PathNodeType.WALKABLE) {
                return true;
            } else {
                return super.canWalkOnPath(pathType);
            }
        }

        @Override
        public boolean isValidPosition(BlockPos pos) {
            return this.world.getBlockState(pos).isOf(Blocks.LAVA) || super.isValidPosition(pos);
        }
    }
}
