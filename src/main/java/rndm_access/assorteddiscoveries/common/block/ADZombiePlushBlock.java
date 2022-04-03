package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADZombiePlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_LEFT_LEG;
    protected static final VoxelShape NORTH_RIGHT_LEG;
    protected static final VoxelShape NORTH_LEFT_ARM;
    protected static final VoxelShape NORTH_RIGHT_ARM;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_ARMS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADZombiePlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HEAD = Block.createCuboidShape(3.5D, 7.0D, 5.0D, 12.5D, 15.0D, 13.5D);
        NORTH_TORSO = Block.createCuboidShape(4.0D, 2.0D, 7.0D, 12.0D, 7.0D, 12.0D);
        NORTH_LEFT_LEG = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 11.5D, 2.0D, 11.0D);
        NORTH_RIGHT_LEG = Block.createCuboidShape(4.5D, 0.0D, 8.0D, 7.5D, 2.0D, 11.0D);
        NORTH_LEFT_ARM = Block.createCuboidShape(11.0D, 5.0D, 3.0D, 14.0D, 8.0D, 10.5D);
        NORTH_RIGHT_ARM = Block.createCuboidShape(2.0D, 5.0D, 3.0D, 5.0D, 8.0D, 10.5D);
        NORTH_LEFT_EYE = Block.createCuboidShape(9.0D, 11.0D, 4.5D, 11.0D, 13.0D, 5.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.0D, 11.0D, 4.5D, 7.0D, 13.0D, 5.0D);
        NORTH_LEGS = VoxelShapes.union(NORTH_LEFT_LEG, NORTH_RIGHT_LEG);
        NORTH_ARMS = VoxelShapes.union(NORTH_LEFT_ARM, NORTH_RIGHT_ARM);
        NORTH_EYES = VoxelShapes.union(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_HEAD, NORTH_TORSO, NORTH_LEGS, NORTH_EYES, NORTH_ARMS);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
