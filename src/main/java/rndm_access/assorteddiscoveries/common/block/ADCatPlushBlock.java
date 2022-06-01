package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADCatPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EAR_SHAPE;
    private static final VoxelShape NORTH_LEFT_EAR_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_EAR_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_SNOUT_SHAPE;

    public ADCatPlushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_SNOUT_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineLegShape() {
        return NORTH_LEG_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineEyeShape() {
        return NORTH_EYE_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineEarShape() {
        return NORTH_EAR_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineTailShape() {
        return VoxelShapes.empty();
    }

    @Override
    protected VoxelShape getNorthOutlineHeadShape() {
        return NORTH_HEAD_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineTorsoShape() {
        return NORTH_TORSO_SHAPE;
    }

    static {
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.5D, 3.0D, 1.0D, 11.5D, 9.5D, 8.0D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(5.0D, 2.0D, 4.0D, 11.0D, 7.0D, 12.0D);
        NORTH_RIGHT_EAR_SHAPE = Block.createCuboidShape(5.0D, 9.5D, 3.5D, 7.0D, 11.0D, 6.5D);
        NORTH_LEFT_EAR_SHAPE = Block.createCuboidShape(9.0D, 9.5D, 3.5D, 11.0D, 11.0D, 6.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(8.5D, 6.0D, 0.5D, 10.5D, 8.0D, 1.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(5.5D, 6.0D, 0.5D, 7.5D, 8.0D, 1.0D);
        NORTH_FRONT_RIGHT_LEG_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 4.0D, 7.0D, 2.0D, 6.0D);
        NORTH_FRONT_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 0.0D, 4.0D, 11.0D, 2.0D, 6.0D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 10.0D, 7.0D, 2.0D, 12.0D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 0.0D, 10.0D, 11.0D, 2.0D, 12.0D);
        NORTH_SNOUT_SHAPE = Block.createCuboidShape(6.5D, 3.5D, 0.0D, 9.5D, 5.5D, 1.0D);
        NORTH_EAR_SHAPES = VoxelShapes.union(NORTH_RIGHT_EAR_SHAPE, NORTH_LEFT_EAR_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG_SHAPE, NORTH_FRONT_LEFT_LEG_SHAPE,
                NORTH_BACK_RIGHT_LEG_SHAPE, NORTH_BACK_LEFT_LEG_SHAPE);
    }
}
