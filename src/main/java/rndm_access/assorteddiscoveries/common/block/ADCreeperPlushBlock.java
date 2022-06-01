package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADCreeperPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_BACK_FOOT_SHAPE;
    private static final VoxelShape NORTH_FRONT_FOOT_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_MOUTH_SHAPE;
    private static final VoxelShape NORTH_RIGHT_MOUTH_SHAPE;
    private static final VoxelShape NORTH_LEFT_MOUTH_SHAPE;
    private static final VoxelShape NORTH_FOOT_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_MOUTH_SHAPES;
    private static final VoxelShape NORTH_SHAPES;

    public ADCreeperPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineTorsoShape() {
        return NORTH_TORSO_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineHeadShape() {
        return NORTH_HEAD_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineLegShape() {
        return NORTH_FOOT_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineEyeShape() {
        return NORTH_EYE_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_MOUTH_SHAPES;
    }

    static {
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0, 6.0, 4.0D, 12.0D, 14.0D, 12.0D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(6.0D, 2.0D, 6.5D, 10.0D, 6.0D, 9.5D);
        NORTH_BACK_FOOT_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 9.5D, 10.0D, 3.0D, 12.5D);
        NORTH_FRONT_FOOT_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 3.5D, 10.0D, 3.0D, 6.5D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 10.0D, 3.5D, 11.0D, 12.0D, 4.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 10.0D, 3.5D, 7.0D, 12.0D, 4.0D);
        NORTH_MIDDLE_MOUTH_SHAPE = Block.createCuboidShape(7.5D, 8.0D, 3.5D, 8.5D, 9.0D, 4.0D);
        NORTH_RIGHT_MOUTH_SHAPE = Block.createCuboidShape(7.0D, 7.5D, 3.5D, 7.5D, 8.5D, 4.0D);
        NORTH_LEFT_MOUTH_SHAPE = Block.createCuboidShape(8.5D, 7.5D, 3.5D, 9.0D, 8.5D, 4.0D);
        NORTH_FOOT_SHAPES = VoxelShapes.union(NORTH_BACK_FOOT_SHAPE, NORTH_FRONT_FOOT_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
        NORTH_MOUTH_SHAPES = VoxelShapes.union(NORTH_MIDDLE_MOUTH_SHAPE, NORTH_RIGHT_MOUTH_SHAPE, NORTH_LEFT_MOUTH_SHAPE);
        NORTH_SHAPES = VoxelShapes.union(NORTH_HEAD_SHAPE, NORTH_TORSO_SHAPE, NORTH_FOOT_SHAPES,
                NORTH_EYE_SHAPES, NORTH_MOUTH_SHAPES);
    }
}
