package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADWolfPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_SNOUT_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape NORTH_HEAD_SHAPE;
    protected static final VoxelShape NORTH_BODY_SHAPE;
    protected static final VoxelShape NORTH_TAIL_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EAR_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EAR_SHAPE;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE;
    protected static final VoxelShape NORTH_EYE_SHAPES;
    protected static final VoxelShape NORTH_EAR_SHAPES;
    protected static final VoxelShape NORTH_LEG_SHAPES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADWolfPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_SNOUT_SHAPE = Block.createCuboidShape(6.0D, 6.0D, 1.5D, 10.0D, 8.0D, 3.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 8.5D, 2.5D, 10.5D, 10.0D, 3.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.5D, 8.5D, 2.5D, 7.0D, 10.0D, 3.0D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(5.0D, 6.0D, 3.0D, 11.0D, 11.0D, 8.0D);
        NORTH_BODY_SHAPE = Block.createCuboidShape(4.0D, 3.0D, 6.0D, 12.0D, 8.0D, 14.0D);
        NORTH_TAIL_SHAPE = Block.createCuboidShape(7.0D, 2.5D, 14.0D, 9.0D, 8.0D, 16.0D);
        NORTH_LEFT_EAR_SHAPE = Block.createCuboidShape(9.0D, 11.0D, 5.0D, 11.0D, 12.5D, 6.0D);
        NORTH_RIGHT_EAR_SHAPE = Block.createCuboidShape(5.0D, 11.0D, 5.0D, 7.0D, 12.5D, 6.0D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 11.5D, 12.0D, 3.0D, 14.0D);
        NORTH_FRONT_LEFT_LEG_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 6.0D, 12.0D, 3.0D, 8.5D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 11.5D, 6.5D, 3.0D, 14.0D);
        NORTH_FRONT_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 6.0D, 6.5D, 3.0D, 8.5D);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
        NORTH_EAR_SHAPES = VoxelShapes.union(NORTH_LEFT_EAR_SHAPE, NORTH_RIGHT_EAR_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_BACK_LEFT_LEG_SHAPE, NORTH_FRONT_LEFT_LEG_SHAPE, NORTH_BACK_RIGHT_LEG_SHAPE, NORTH_FRONT_RIGHT_LEG_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_SNOUT_SHAPE, NORTH_HEAD_SHAPE, NORTH_BODY_SHAPE, NORTH_TAIL_SHAPE, NORTH_EYE_SHAPES, NORTH_EAR_SHAPES, NORTH_LEG_SHAPES);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
