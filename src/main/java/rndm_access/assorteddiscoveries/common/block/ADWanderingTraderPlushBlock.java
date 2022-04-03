package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADWanderingTraderPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HOOD_FULL;
    protected static final VoxelShape NORTH_HOOD_OPENING;
    protected static final VoxelShape NORTH_HOOD;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADWanderingTraderPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HOOD_FULL = Block.createCuboidShape(3.0D, 5.0D, 4.5D, 13.0D, 15.0D, 13.0D);
        NORTH_HOOD_OPENING = Block.createCuboidShape(4.0D, 5.0D, 4.5D, 12.0D, 11.0D, 5.5D);
        NORTH_HOOD = ADShapeUtil.cutBox(NORTH_HOOD_FULL, NORTH_HOOD_OPENING);
        NORTH_SHAPE = VoxelShapes.union(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HOOD);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
