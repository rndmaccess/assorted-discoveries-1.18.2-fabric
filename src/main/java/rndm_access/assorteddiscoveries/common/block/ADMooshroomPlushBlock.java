package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADMooshroomPlushBlock extends ADCowPlushBlock {
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_STEM_SHAPE;
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE;
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_TOP_SHAPE;
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADMooshroomPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HEAD_MUSHROOM_STEM_SHAPE = Block.createCuboidShape(7.5D, 13.0D, 6.0D, 8.5D, 14.0D, 7.0D);
        NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE = Block.createCuboidShape(6.0D, 14.0D, 4.5D, 10.0D, 15.0D, 8.5D);
        NORTH_HEAD_MUSHROOM_TOP_SHAPE = Block.createCuboidShape(7.0D, 15.0D, 5.5D, 9.0D, 16.0D, 7.5D);
        NORTH_HEAD_MUSHROOM_SHAPE = VoxelShapes.union(NORTH_HEAD_MUSHROOM_STEM_SHAPE, NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE,
                NORTH_HEAD_MUSHROOM_TOP_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_HEAD_MUSHROOM_SHAPE, ADCowPlushBlock.NORTH_SHAPE);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
