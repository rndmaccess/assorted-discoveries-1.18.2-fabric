package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADPiglinPlushBlock extends ADZombifiedPiglinPlushBlock {
    protected static final VoxelShape NORTH_LEFT_ARM;
    protected static final VoxelShape NORTH_RIGHT_ARM;
    protected static final VoxelShape NORTH_ARMS;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADPiglinPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_LEFT_ARM = Block.createCuboidShape(12.0D, 3.0D, 7.5D, 14.5D, 8.0D, 10.5D);
        NORTH_RIGHT_ARM = Block.createCuboidShape(1.5D, 3.0D, 7.5D, 4.0D, 8.0D, 10.5D);
        NORTH_ARMS = VoxelShapes.union(NORTH_LEFT_ARM, NORTH_RIGHT_ARM);
        NORTH_SHAPE = VoxelShapes.union(ADZombifiedPiglinPlushBlock.NORTH_BODY_SHAPE, NORTH_ARMS);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
