package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADPhantomPlushBlock extends ADAbstractPlushBlock {
    public static final VoxelShape NORTH_WING_SHAPE;
    public static final VoxelShape NORTH_BODY_SHAPE;
    public static final VoxelShape NORTH_TAIL_SHAPE;
    public static final VoxelShape NORTH_TAIL_END_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADPhantomPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPE;
    }

    @Override
    protected VoxelShape getSouthOutlineShape() {
        return SOUTH_SHAPE;
    }

    @Override
    protected VoxelShape getWestOutlineShape() {
        return WEST_SHAPE;
    }

    @Override
    protected VoxelShape getEastOutlineShape() {
        return EAST_SHAPE;
    }

    static {
        NORTH_WING_SHAPE = Block.createCuboidShape(1.0, 0.0, 5.0, 15.0, 2.5, 11.0);
        NORTH_BODY_SHAPE = Block.createCuboidShape(5.0, 0.0, 1.0, 11.0, 4.0, 12.0);
        NORTH_TAIL_SHAPE = Block.createCuboidShape(6.0, 0.0, 12.0, 10.0, 3.0, 14.0);
        NORTH_TAIL_END_SHAPE = Block.createCuboidShape(7.0, 0.0, 14.0, 9.0, 2.0, 16.0);
        NORTH_SHAPE = VoxelShapes.union(NORTH_WING_SHAPE, NORTH_BODY_SHAPE, NORTH_TAIL_SHAPE, NORTH_TAIL_END_SHAPE);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
