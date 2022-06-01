package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADSheepPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_MOUTH_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_FOOT_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_FOOT_SHAPE;
    private static final VoxelShape NORTH_BACK_RIGHT_FOOT_SHAPE;
    private static final VoxelShape NORTH_BACK_LEFT_FOOT_SHAPE;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_FOOT_SHAPES;

    public ADSheepPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineEyeShape() {
        return NORTH_EYE_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineLegShape() {
        return VoxelShapes.union(NORTH_LEG_SHAPES, NORTH_FOOT_SHAPES);
    }

    @Override
    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_MOUTH_SHAPE;
    }

    static {
        NORTH_MOUTH_SHAPE = Block.createCuboidShape(7.5D, 6.0D, 1.0D, 8.5D, 7.0D, 1.5D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 8.0D, 1.0D, 11.0D, 10.0D, 1.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 8.0D, 1.0D, 7.0D, 10.0D, 1.5D);
        NORTH_FRONT_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.5D, 1.0D, 4.5D, 7.0D, 2.5D, 7.0D);
        NORTH_FRONT_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 1.0D, 4.5D, 11.5D, 2.5D, 7.0D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.5D, 1.0D, 12.0D, 7.0D, 2.5D, 14.5D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 1.0D, 12.0D, 11.5D, 2.5D, 14.5D);
        NORTH_FRONT_RIGHT_FOOT_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 5.0D, 6.5D, 1.0D, 6.5D);
        NORTH_FRONT_LEFT_FOOT_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 5.0D, 11.0D, 1.0D, 6.5D);
        NORTH_BACK_RIGHT_FOOT_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 12.5D, 6.5D, 1.0D, 14.0D);
        NORTH_BACK_LEFT_FOOT_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 12.5D, 11.0D, 1.0D, 14.0D);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG_SHAPE, NORTH_FRONT_LEFT_LEG_SHAPE,
                NORTH_BACK_RIGHT_LEG_SHAPE, NORTH_BACK_LEFT_LEG_SHAPE);
        NORTH_FOOT_SHAPES = VoxelShapes.union(NORTH_FRONT_RIGHT_FOOT_SHAPE, NORTH_FRONT_LEFT_FOOT_SHAPE,
                NORTH_BACK_RIGHT_FOOT_SHAPE, NORTH_BACK_LEFT_FOOT_SHAPE);
    }
}