package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADSwampVillagerPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_TOP;
    protected static final VoxelShape NORTH_LEFT_BACK_HAT_DETAIL;
    protected static final VoxelShape NORTH_RIGHT_BACK_HAT_DETAIL;
    protected static final VoxelShape NORTH_LEFT_FRONT_HAT_DETAIL;
    protected static final VoxelShape NORTH_MIDDLE_FRONT_HAT_DETAIL0;
    protected static final VoxelShape NORTH_MIDDLE_FRONT_HAT_DETAIL1;
    protected static final VoxelShape NORTH_HAT;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADSwampVillagerPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HAT_TOP = Block.createCuboidShape(3.0, 13.0, 4.5, 13.0, 15.0, 13.0);
        NORTH_LEFT_BACK_HAT_DETAIL = Block.createCuboidShape(9.0, 12.0, 9.0, 13.0, 13.0, 13.0);
        NORTH_RIGHT_BACK_HAT_DETAIL = Block.createCuboidShape(3.0, 11.0, 9.0, 6.5, 13.0, 13.0);
        NORTH_LEFT_FRONT_HAT_DETAIL = Block.createCuboidShape(11.0, 12.0, 4.5, 13.0, 13.0, 6.5);
        NORTH_MIDDLE_FRONT_HAT_DETAIL0 = Block.createCuboidShape(5.0, 12.0, 4.5, 9.0, 13.0, 5.5);
        NORTH_MIDDLE_FRONT_HAT_DETAIL1 = Block.createCuboidShape(8.0, 11.0, 4.5, 9.0, 12.0, 5.5);
        NORTH_HAT = VoxelShapes.union(NORTH_HAT_TOP, NORTH_LEFT_BACK_HAT_DETAIL,
                NORTH_RIGHT_BACK_HAT_DETAIL, NORTH_LEFT_FRONT_HAT_DETAIL, NORTH_MIDDLE_FRONT_HAT_DETAIL0,
                NORTH_MIDDLE_FRONT_HAT_DETAIL1);
        NORTH_SHAPE = VoxelShapes.union(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HAT);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
