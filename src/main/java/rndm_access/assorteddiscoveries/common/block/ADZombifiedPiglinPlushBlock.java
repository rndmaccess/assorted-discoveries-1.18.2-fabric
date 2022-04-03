package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADZombifiedPiglinPlushBlock extends ADZombiePlushBlock {
    protected static final VoxelShape NORTH_SNOUT;
    protected static final VoxelShape NORTH_RIGHT_EAR;
    protected static final VoxelShape NORTH_LEFT_EAR;
    protected static final VoxelShape NORTH_EARS;
    protected static final VoxelShape NORTH_BODY_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADZombifiedPiglinPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_SNOUT = Block.createCuboidShape(6.0D, 8.0D, 4.0D, 10.0D, 10.0D, 5.0D);
        NORTH_RIGHT_EAR = Block.createCuboidShape(1.5D, 9.0D, 8.0D, 3.5D, 12.0D, 12.0D);
        NORTH_LEFT_EAR = Block.createCuboidShape(11.5D, 9.0D, 8.0D, 14.0D, 12.0D, 12.0D);
        NORTH_EARS = VoxelShapes.union(NORTH_RIGHT_EAR, NORTH_LEFT_EAR);
        NORTH_BODY_SHAPE = VoxelShapes.union(NORTH_SNOUT, NORTH_EARS, NORTH_HEAD, NORTH_TORSO, NORTH_LEGS, NORTH_EYES);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY_SHAPE, NORTH_ARMS);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
