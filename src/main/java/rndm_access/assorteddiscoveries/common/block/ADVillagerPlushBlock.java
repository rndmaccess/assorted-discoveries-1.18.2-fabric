package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

/**
 * A helper class used as a base for the villager and zombie villager plushes.
 */
public class ADVillagerPlushBlock extends ADAbstractHumanoidPlushBlock {
    private static final VoxelShape NORTH_RIGHT_FOOT_SHAPE;
    private static final VoxelShape NORTH_LEFT_FOOT_SHAPE;
    private static final VoxelShape NORTH_HEAD_SHAPE;
    protected static final VoxelShape NORTH_NOSE_SHAPE;
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_ARM_SHAPES;
    private static final VoxelShape NORTH_FOOT_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;

    private static final VoxelShape NORTH_DESERT_HAT_MAIN_SHAPE;
    private static final VoxelShape NORTH_DESERT_HAT_POMPOM_SHAPE;
    protected static final VoxelShape NORTH_DESERT_HAT_SHAPES;
    protected static final VoxelShape NORTH_SAVANNA_HEADBAND_SHAPE;
    protected static final VoxelShape NORTH_SNOW_HAT_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_TOP_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_LEFT_BACK_DETAIL_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_RIGHT_BACK_DETAIL_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_LEFT_FRONT_DETAIL_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_0_SHAPE;
    private static final VoxelShape NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_1_SHAPE;
    protected static final VoxelShape NORTH_SWAMP_HAT_SHAPES;

    public ADVillagerPlushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthNoseOutlineShape() {
        return NORTH_NOSE_SHAPE;
    }

    @Override
    protected VoxelShape getNorthLegOutlineShape() {
        return NORTH_FOOT_SHAPES;
    }

    @Override
    protected VoxelShape getNorthHeadOutlineShape() {
        return NORTH_HEAD_SHAPE;
    }

    @Override
    protected VoxelShape getNorthTorsoOutlineShape() {
        return NORTH_TORSO_SHAPE;
    }

    @Override
    protected VoxelShape getNorthEyeOutlineShape() {
        return NORTH_EYE_SHAPES;
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return VoxelShapes.empty();
    }

    @Override
    protected VoxelShape getNorthArmOutlineShape() {
        return NORTH_ARM_SHAPES;
    }

    @Override
    protected VoxelShape getNorthEarOutlineShape() {
        return VoxelShapes.empty();
    }

    static {
        NORTH_RIGHT_FOOT_SHAPE = Block.createCuboidShape(5.5D, 0.0D, 8.0D, 7.5D, 1.5D, 10.0D);
        NORTH_LEFT_FOOT_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 10.5D, 1.5D, 10.0D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 5.5D, 12.0D, 14.0D, 12.0D);
        NORTH_NOSE_SHAPE = Block.createCuboidShape(7.0D, 4.5D, 3.5D, 9.0D, 7.5D, 5.5D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(5.0D, 1.5D, 7.0D, 11.0D, 5.0D, 11.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(8.5D, 8.0D, 5.0D, 10.5D, 10.0D, 5.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.5D, 8.0D, 5.0D, 7.5D, 10.0D, 5.5D);
        NORTH_ARM_SHAPES = Block.createCuboidShape(4.5D, 1.5D, 5.0D, 11.5D, 5.0D, 9.0D);
        NORTH_FOOT_SHAPES = VoxelShapes.union(NORTH_RIGHT_FOOT_SHAPE, NORTH_LEFT_FOOT_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);

        NORTH_DESERT_HAT_MAIN_SHAPE = Block.createCuboidShape(3.0D, 12.0D, 4.5D, 13.0D, 14.0D, 13.0D);
        NORTH_DESERT_HAT_POMPOM_SHAPE = Block.createCuboidShape(6.0D, 14.0D, 7.0D, 10.0D, 15.0D, 10.5D);
        NORTH_DESERT_HAT_SHAPES = VoxelShapes.union(NORTH_DESERT_HAT_MAIN_SHAPE, NORTH_DESERT_HAT_POMPOM_SHAPE);
        NORTH_SAVANNA_HEADBAND_SHAPE = Block.createCuboidShape(3.0D, 12.0D, 4.5D, 13.0D, 13.0D, 13.0D);
        NORTH_SNOW_HAT_SHAPE = Block.createCuboidShape(3.0D, 11.0D, 4.5D, 13.0D, 15.0D, 13.0D);
        NORTH_SWAMP_HAT_TOP_SHAPE = Block.createCuboidShape(3.0, 13.0, 4.5, 13.0, 15.0, 13.0);
        NORTH_SWAMP_HAT_LEFT_BACK_DETAIL_SHAPE = Block.createCuboidShape(9.0, 12.0, 9.0, 13.0, 13.0, 13.0);
        NORTH_SWAMP_HAT_RIGHT_BACK_DETAIL_SHAPE = Block.createCuboidShape(3.0, 11.0, 9.0, 6.5, 13.0, 13.0);
        NORTH_SWAMP_HAT_LEFT_FRONT_DETAIL_SHAPE = Block.createCuboidShape(11.0, 12.0, 4.5, 13.0, 13.0, 6.5);
        NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_0_SHAPE = Block.createCuboidShape(5.0, 12.0, 4.5, 9.0, 13.0, 5.5);
        NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_1_SHAPE = Block.createCuboidShape(8.0, 11.0, 4.5, 9.0, 12.0, 5.5);
        NORTH_SWAMP_HAT_SHAPES = VoxelShapes.union(NORTH_SWAMP_HAT_TOP_SHAPE, NORTH_SWAMP_HAT_LEFT_BACK_DETAIL_SHAPE,
                NORTH_SWAMP_HAT_RIGHT_BACK_DETAIL_SHAPE, NORTH_SWAMP_HAT_LEFT_FRONT_DETAIL_SHAPE,
                NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_0_SHAPE, NORTH_SWAMP_HAT_MIDDLE_FRONT_DETAIL_1_SHAPE);
    }
}
