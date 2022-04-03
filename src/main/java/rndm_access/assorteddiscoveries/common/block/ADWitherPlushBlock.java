package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADWitherPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_MOUTH;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_MAIN_TORSO;
    protected static final VoxelShape NORTH_TORSO_BEND;
    protected static final VoxelShape NORTH_TOP_SPIKE;
    protected static final VoxelShape NORTH_BOTTOM_SPIKE;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_SPIKES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADWitherPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HEAD = Block.createCuboidShape(4.0, 8.0, 4.0, 12.0, 16.0, 12.0);
        NORTH_MOUTH = Block.createCuboidShape(6.0, 9.5, 3.5, 10.0, 10.5, 4.0);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.0, 12.0, 3.5, 7.0, 14.0, 4.0);
        NORTH_LEFT_EYE = Block.createCuboidShape(9.0, 12.0, 3.5, 11.0, 14.0, 4.0);
        NORTH_MAIN_TORSO = Block.createCuboidShape(6.5, 2.0, 6.5, 9.5, 8.0, 9.0);
        NORTH_TORSO_BEND = Block.createCuboidShape(6.5, 0.0, 6.5, 9.5, 4.0, 10.5);
        NORTH_TOP_SPIKE = Block.createCuboidShape(3.0, 5.0, 6.5, 13.0, 7.0, 9.0);
        NORTH_BOTTOM_SPIKE = Block.createCuboidShape(3.0, 2.0, 6.5, 13.0, 4.0, 9.0);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_TORSO = VoxelShapes.union(NORTH_MAIN_TORSO, NORTH_TORSO_BEND);
        NORTH_SPIKES = VoxelShapes.union(NORTH_TOP_SPIKE, NORTH_BOTTOM_SPIKE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_HEAD, NORTH_MOUTH, NORTH_EYES, NORTH_TORSO, NORTH_SPIKES);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
