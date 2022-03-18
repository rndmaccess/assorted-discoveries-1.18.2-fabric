package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADDesertVillagerPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_MAIN;
    protected static final VoxelShape NORTH_POMPOM;
    protected static final VoxelShape NORTH_HAT;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADDesertVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape northShape() {
        return NORTH_SHAPE;
    }

    @Override
    protected VoxelShape southShape() {
        return SOUTH_SHAPE;
    }

    @Override
    protected VoxelShape westShape() {
        return WEST_SHAPE;
    }

    @Override
    protected VoxelShape eastShape() {
        return EAST_SHAPE;
    }

    static {
        NORTH_HAT_MAIN = Block.createCuboidShape(3.0D, 12.0D, 4.5D, 13.0D, 14.0D, 13.0D);
        NORTH_POMPOM = Block.createCuboidShape(6.0D, 14.0D, 7.0D, 10.0D, 15.0D, 10.5D);
        NORTH_HAT = VoxelShapes.union(NORTH_HAT_MAIN, NORTH_POMPOM);
        NORTH_SHAPE = VoxelShapes.union(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HAT);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
