package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADMagmaCubePlushBlock extends ADAbstractDirectionalTallPlushBlock {
    private static final VoxelShape NORTH_BOTTOM_BODY_SHAPE;
    private static final VoxelShape NORTH_BOTTOM_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_BOTTOM_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_BOTTOM_EYE_SHAPES;
    private static final VoxelShape NORTH_BOTTOM_SHAPES;

    private static final VoxelShape NORTH_MIDDLE_BODY_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_EYE_SHAPES;
    private static final VoxelShape NORTH_MIDDLE_SHAPES;

    private static final VoxelShape NORTH_TOP_BODY_SHAPE;
    private static final VoxelShape NORTH_TOP_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_TOP_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_TOP_EYE_SHAPES;
    private static final VoxelShape NORTH_TOP_SHAPES;

    public ADMagmaCubePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthBottomOutlineShape() {
        return NORTH_BOTTOM_SHAPES;
    }

    @Override
    public VoxelShape getNorthMiddleOutlineShape() {
        return NORTH_MIDDLE_SHAPES;
    }

    @Override
    public VoxelShape getNorthTopOutlineShape() {
        return NORTH_TOP_SHAPES;
    }


    static {
        NORTH_BOTTOM_BODY_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 9.0D, 13.0D);
        NORTH_BOTTOM_LEFT_EYE_SHAPE = Block.createCuboidShape(10.0D, 5.0D, 2.5D, 12.0D, 7.0D, 3.0D);
        NORTH_BOTTOM_RIGHT_EYE_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 2.5D, 6.0D, 7.0D, 3.0D);
        NORTH_BOTTOM_EYE_SHAPES = VoxelShapes.union(NORTH_BOTTOM_LEFT_EYE_SHAPE, NORTH_BOTTOM_RIGHT_EYE_SHAPE);
        NORTH_BOTTOM_SHAPES = VoxelShapes.union(NORTH_BOTTOM_BODY_SHAPE, NORTH_BOTTOM_EYE_SHAPES);

        NORTH_MIDDLE_BODY_SHAPE = Block.createCuboidShape(4.0D, 7.0D, 4.0D, 12.0D, 16.0D, 12.0D);
        NORTH_MIDDLE_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 13.0D, 3.5D, 10.5D, 14.5D, 4.0D);
        NORTH_MIDDLE_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 13.0D, 3.5D, 6.5D, 14.5D, 4.0D);
        NORTH_MIDDLE_EYE_SHAPES = VoxelShapes.union(NORTH_MIDDLE_LEFT_EYE_SHAPE, NORTH_MIDDLE_RIGHT_EYE_SHAPE);
        NORTH_MIDDLE_SHAPES = VoxelShapes.union(NORTH_BOTTOM_SHAPES, NORTH_MIDDLE_BODY_SHAPE, NORTH_MIDDLE_EYE_SHAPES);

        NORTH_TOP_BODY_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D);
        NORTH_TOP_LEFT_EYE_SHAPE = Block.createCuboidShape(6.5D, 2.0D, 5.5D, 7.5D, 3.0D, 6.0D);
        NORTH_TOP_RIGHT_EYE_SHAPE = Block.createCuboidShape(8.5D, 2.0D, 5.5D, 9.5D, 3.0D, 6.0D);
        NORTH_TOP_EYE_SHAPES = VoxelShapes.union(NORTH_TOP_LEFT_EYE_SHAPE, NORTH_TOP_RIGHT_EYE_SHAPE);
        NORTH_TOP_SHAPES = VoxelShapes.union(NORTH_TOP_BODY_SHAPE, NORTH_TOP_EYE_SHAPES);
    }
}