package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.SweetBerryBushBlock;

public class ADBerryBushBlock extends SweetBerryBushBlock {

    private static final VoxelShape WITCHS_CRADLE_STAGE_0_SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 9.0D, 14.0D);

    public ADBerryBushBlock(Properties properties) {
        super(properties);
    }

    /**
     * Called when the player right-clicks a block.
     */
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
            BlockHitResult hit) {
        int currentAge = state.getValue(AGE);
        boolean maxAgeFlag = currentAge == this.getMaxAge();

        if (!maxAgeFlag && player.getItemInHand(handIn).getItem() == Items.BONE_MEAL) {
            return InteractionResult.PASS;
        } else if (currentAge > 1) {
            dropResources(state, level, pos);
            level.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F,
                    0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
            return InteractionResult.SUCCESS;
        }
        return super.use(state, level, pos, player, handIn, hit);
    }

    /**
     * Creates the bounding box for this block.
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        if (this.asBlock().equals(ADBlocks.WITCHS_CRADLE.get()) && state.getValue(AGE).equals(0)) {
            return WITCHS_CRADLE_STAGE_0_SHAPE;
        } else {
            return super.getShape(state, blockGetter, pos, context);
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack getCloneItemStack(BlockGetter world, BlockPos pos, BlockState state) {
        if (this.equals(ADBlocks.BLUEBERRY_BUSH.get())) {
            return new ItemStack(ADItems.BLUEBERRIES.get());
        } else if (this.equals(ADBlocks.WITCHS_CRADLE.get())) {
            return new ItemStack(ADItems.WITCHS_CRADLE_BRANCH.get());
        } else {
            return super.getCloneItemStack(world, pos, state);
        }
    }

    /**
     * @return The max age of this plant.
     */
    private int getMaxAge() {
        return 3;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity) {
            if (this.asBlock().equals(ADBlocks.WITCHS_CRADLE.get())) {
                if (entityIn.getType() != EntityType.SLIME) {
                    super.entityInside(state, level, pos, entityIn);
                }
            } else {
                if (entityIn.getType() != EntityType.FOX && entityIn.getType() != EntityType.BEE) {
                    entityIn.makeStuckInBlock(state, new Vec3(0.8F, 0.75D, 0.8F));
                }
            }
        }
    }

    /**
     * Decides what blocks this plant can be placed on.
     */
    @Override
    public PlantType getPlantType(BlockGetter blockGetter, BlockPos pos) {
        return PlantType.PLAINS;
    }
}
