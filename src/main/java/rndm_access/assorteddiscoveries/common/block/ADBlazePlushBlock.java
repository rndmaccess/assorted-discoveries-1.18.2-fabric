package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADBlazePlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_FRONT_BOTTOM_ROD_SHAPE;
    private static final VoxelShape NORTH_RIGHT_BACK_BOTTOM_ROD_SHAPE;
    private static final VoxelShape NORTH_LEFT_FRONT_BOTTOM_ROD_SHAPE;
    private static final VoxelShape NORTH_LEFT_BACK_BOTTOM_ROD_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_TOP_ROD_SHAPE;
    private static final VoxelShape NORTH_LEFT_TOP_ROD_SHAPE;
    private static final VoxelShape NORTH_RIGHT_TOP_ROD_SHAPE;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_ROD_SHAPES;
    private static final VoxelShape NORTH_SHAPE;

    public ADBlazePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPE;
    }

    static {
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.5D, 8.0D, 5.5D, 11.5D, 15.0D, 12.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.5D, 11.0D, 5.0D, 7.5D, 13.0D, 5.5D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(8.5D, 11.0D, 5.0D, 10.5D, 13.0D, 5.5D);
        NORTH_RIGHT_FRONT_BOTTOM_ROD_SHAPE = Block.createCuboidShape(4.5D, 1.0D, 5.5D, 6.5D, 7.0D, 7.5D);
        NORTH_RIGHT_BACK_BOTTOM_ROD_SHAPE = Block.createCuboidShape(4.5D, 1.0D, 10.5D, 6.5D, 7.0D, 12.5D);
        NORTH_LEFT_FRONT_BOTTOM_ROD_SHAPE = Block.createCuboidShape(9.5D, 1.0D, 5.5D, 11.5D, 7.0D, 7.5D);
        NORTH_LEFT_BACK_BOTTOM_ROD_SHAPE = Block.createCuboidShape(9.5D, 1.0D, 10.5D, 11.5D, 7.0D, 12.5D);
        NORTH_MIDDLE_TOP_ROD_SHAPE = Block.createCuboidShape(7.0D, 6.0D, 13.0D, 9.0D, 12.0D, 15.0D);
        NORTH_LEFT_TOP_ROD_SHAPE = Block.createCuboidShape(12.5D, 6.0D, 8.0D, 14.5D, 12.0D, 10.0D);
        NORTH_RIGHT_TOP_ROD_SHAPE = Block.createCuboidShape(1.5D, 6.0D, 8.0D, 3.5D, 12.0D, 10.0D);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_ROD_SHAPES = VoxelShapes.union(NORTH_RIGHT_FRONT_BOTTOM_ROD_SHAPE, NORTH_RIGHT_BACK_BOTTOM_ROD_SHAPE,
                NORTH_LEFT_FRONT_BOTTOM_ROD_SHAPE, NORTH_LEFT_BACK_BOTTOM_ROD_SHAPE, NORTH_MIDDLE_TOP_ROD_SHAPE,
                NORTH_LEFT_TOP_ROD_SHAPE, NORTH_RIGHT_TOP_ROD_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_HEAD_SHAPE, NORTH_EYE_SHAPES, NORTH_ROD_SHAPES);
    }
}
