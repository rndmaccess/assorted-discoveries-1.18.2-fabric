package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADBatPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_LEFT_EAR;
    protected static final VoxelShape NORTH_RIGHT_EAR;
    protected static final VoxelShape NORTH_LEFT_LEG;
    protected static final VoxelShape NORTH_RIGHT_LEG;
    protected static final VoxelShape NORTH_LEFT_WING;
    protected static final VoxelShape NORTH_RIGHT_WING;
    protected static final VoxelShape NORTH_MOUTH;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_EARS;
    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_WINGS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADBatPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_BODY = Block.createCuboidShape(6.0D, 1.0D, 7.0D, 10.0D, 5.0D, 10.0D);
        NORTH_HEAD = Block.createCuboidShape(5.0D, 5.0D, 6.0D, 10.5D, 9.5D, 11.0D);
        NORTH_LEFT_EAR = Block.createCuboidShape(9.0D, 7.5D, 7.0D, 12.0D, 10.5D, 10.0D);
        NORTH_RIGHT_EAR = Block.createCuboidShape(4.0D, 7.5D, 7.0D, 7.0D, 10.5D, 10.0D);
        NORTH_LEFT_LEG = Block.createCuboidShape(9.0D, 0.0D, 8.0D, 10.0D, 1.0D, 9.0D);
        NORTH_RIGHT_LEG = Block.createCuboidShape(6.0D, 0.0D, 8.0D, 7.0D, 1.0D, 9.0D);
        NORTH_LEFT_WING = Block.createCuboidShape(10.0D, 0.5D, 7.0D, 14.0D, 5.5D, 10.0D);
        NORTH_RIGHT_WING = Block.createCuboidShape(2.0D, 0.5D, 7.0D, 6.0D, 5.5D, 10.0D);
        NORTH_MOUTH = Block.createCuboidShape(6.5D, 5.0D, 5.5D, 9.0D, 6.0D, 6.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 7.0D, 5.5D, 7.5D, 8.0D, 6.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.0D, 7.0D, 5.5D, 10.0D, 8.0D, 6.0D);
        NORTH_EARS = VoxelShapes.union(NORTH_LEFT_EAR, NORTH_RIGHT_EAR);
        NORTH_LEGS = VoxelShapes.union(NORTH_LEFT_LEG, NORTH_RIGHT_LEG);
        NORTH_WINGS = VoxelShapes.union(NORTH_LEFT_WING, NORTH_RIGHT_WING);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_HEAD, NORTH_MOUTH, NORTH_EARS,
                NORTH_LEGS, NORTH_WINGS, NORTH_EYES);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
