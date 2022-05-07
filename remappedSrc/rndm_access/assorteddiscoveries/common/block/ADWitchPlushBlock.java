package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADWitchPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_RIM;
    protected static final VoxelShape NORTH_HAT_MIDDLE;
    protected static final VoxelShape NORTH_HAT_TOP;
    protected static final VoxelShape NORTH_HAT_POINT;
    protected static final VoxelShape NORTH_WART;
    protected static final VoxelShape NORTH_FACE;
    protected static final VoxelShape NORTH_HAT;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADWitchPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
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
        NORTH_HAT_RIM = Block.createCuboidShape(3.0D, 11.0D, 4.5D, 13.0D, 12.0D, 13.0D);
        NORTH_HAT_MIDDLE = Block.createCuboidShape(4.0D, 12.0D, 5.5D, 12.0D, 15.0D, 12.0D);
        NORTH_HAT_TOP = Block.createCuboidShape(6.0D, 15.0D, 7.5D, 10.0D, 17.5D, 10.0D);
        NORTH_HAT_POINT = Block.createCuboidShape(6.5D, 17.5D, 8.5D, 9.0D, 19.5D, 9.5D);
        NORTH_WART = Block.createCuboidShape(7.0D, 5.0D, 2.5D, 8.0D, 6.0D, 3.5D);
        NORTH_FACE = VoxelShapes.union(NORTH_EYEBROW, NORTH_LEFT_EYE, NORTH_RIGHT_EYE, NORTH_NOSE, NORTH_WART);
        NORTH_HAT = VoxelShapes.union(NORTH_HAT_RIM, NORTH_HAT_MIDDLE, NORTH_HAT_TOP, NORTH_HAT_POINT);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET, NORTH_FACE, NORTH_BODY, NORTH_HAT);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
