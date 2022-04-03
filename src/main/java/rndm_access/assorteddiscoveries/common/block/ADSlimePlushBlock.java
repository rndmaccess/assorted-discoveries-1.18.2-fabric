package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADSlimePlushBlock extends ADMagmaCubePlushBlock {
    // One Slime Bounding Boxes
    protected static final VoxelShape BOTTOM_NORTH_MOUTH_SHAPE;
    protected static final VoxelShape BOTTOM_NORTH_SHAPE;
    protected static final VoxelShape BOTTOM_SOUTH_SHAPE;
    protected static final VoxelShape BOTTOM_WEST_SHAPE;
    protected static final VoxelShape BOTTOM_EAST_SHAPE;

    // Two Slime Bounding Boxes
    protected static final VoxelShape MIDDLE_NORTH_MOUTH_EYE_SHAPE;
    protected static final VoxelShape MIDDLE_NORTH_SHAPE;
    protected static final VoxelShape MIDDLE_SOUTH_SHAPE;
    protected static final VoxelShape MIDDLE_WEST_SHAPE;
    protected static final VoxelShape MIDDLE_EAST_SHAPE;

    // Three Slime Bounding Boxes
    protected static final VoxelShape TOP_NORTH_MOUTH_EYE_SHAPE;
    protected static final VoxelShape TOP_NORTH_SHAPE;
    protected static final VoxelShape TOP_SOUTH_SHAPE;
    protected static final VoxelShape TOP_WEST_SHAPE;
    protected static final VoxelShape TOP_EAST_SHAPE;

    public ADSlimePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getBottomNorthOutlineShape() {
        return BOTTOM_NORTH_SHAPE;
    }

    @Override
    public VoxelShape getBottomSouthOutlineShape() {
        return BOTTOM_SOUTH_SHAPE;
    }

    @Override
    public VoxelShape getBottomWestOutlineShape() {
        return BOTTOM_WEST_SHAPE;
    }

    @Override
    public VoxelShape getBottomEastOutlineShape() {
        return BOTTOM_EAST_SHAPE;
    }

    @Override
    public VoxelShape getMiddleNorthOutlineShape() {
        return MIDDLE_NORTH_SHAPE;
    }

    @Override
    public VoxelShape getMiddleSouthOutlineShape() {
        return MIDDLE_SOUTH_SHAPE;
    }

    @Override
    public VoxelShape getMiddleWestOutlineShape() {
        return MIDDLE_WEST_SHAPE;
    }

    @Override
    public VoxelShape getMiddleEastOutlineShape() {
        return MIDDLE_EAST_SHAPE;
    }

    @Override
    public VoxelShape getTopNorthOutlineShape() {
        return TOP_NORTH_SHAPE;
    }

    @Override
    public VoxelShape getTopSouthOutlineShape() {
        return TOP_SOUTH_SHAPE;
    }

    @Override
    public VoxelShape getTopWestOutlineShape() {
        return TOP_WEST_SHAPE;
    }

    @Override
    public VoxelShape getTopEastOutlineShape() {
        return TOP_EAST_SHAPE;
    }

    static {
        BOTTOM_NORTH_MOUTH_SHAPE = Block.createCuboidShape(6.0D, 2.0D, 2.5D, 7.0D, 3.0D, 3.0D);
        BOTTOM_NORTH_SHAPE = VoxelShapes.union(ADMagmaCubePlushBlock.BOTTOM_NORTH_SHAPE, BOTTOM_NORTH_MOUTH_SHAPE);
        BOTTOM_SOUTH_SHAPE = ADShapeUtil.rotate180Y(BOTTOM_NORTH_SHAPE);
        BOTTOM_WEST_SHAPE = ADShapeUtil.rotate270Y(BOTTOM_NORTH_SHAPE);
        BOTTOM_EAST_SHAPE = ADShapeUtil.rotate90Y(BOTTOM_NORTH_SHAPE);

        MIDDLE_NORTH_MOUTH_EYE_SHAPE = Block.createCuboidShape(6.5D, 10.5D, 3.5D, 7.5D, 11.5D, 4.0D);
        MIDDLE_NORTH_SHAPE = VoxelShapes.union(ADMagmaCubePlushBlock.MIDDLE_NORTH_SHAPE,
                MIDDLE_NORTH_MOUTH_EYE_SHAPE, BOTTOM_NORTH_SHAPE);
        MIDDLE_SOUTH_SHAPE = ADShapeUtil.rotate180Y(MIDDLE_NORTH_SHAPE);
        MIDDLE_WEST_SHAPE = ADShapeUtil.rotate270Y(MIDDLE_NORTH_SHAPE);
        MIDDLE_EAST_SHAPE = ADShapeUtil.rotate90Y(MIDDLE_NORTH_SHAPE);

        TOP_NORTH_MOUTH_EYE_SHAPE = Block.createCuboidShape(7.0D, 1.0D, 5.5D, 7.5D, 1.5D, 6.0D);
        TOP_NORTH_SHAPE = VoxelShapes.union(ADMagmaCubePlushBlock.TOP_NORTH_SHAPE, TOP_NORTH_MOUTH_EYE_SHAPE);
        TOP_SOUTH_SHAPE = ADShapeUtil.rotate180Y(TOP_NORTH_SHAPE);
        TOP_WEST_SHAPE = ADShapeUtil.rotate270Y(TOP_NORTH_SHAPE);
        TOP_EAST_SHAPE = ADShapeUtil.rotate90Y(TOP_NORTH_SHAPE);
    }
}
