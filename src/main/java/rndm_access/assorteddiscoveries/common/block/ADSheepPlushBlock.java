package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADSheepPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_TUFF;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG_TUFF;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_TUFF;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG_TUFF;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_MOUTH;
    protected static final VoxelShape NORTH_LEG_TUFFS;
    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADSheepPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_TORSO = Block.createCuboidShape(4.0D, 4.0D, 4.5D, 12.0D, 9.0D, 14.0D);
        NORTH_HEAD = Block.createCuboidShape(4.5D, 5.0D, 2.0D, 11.5D, 12.0D, 8.0D);
        NORTH_FRONT_RIGHT_LEG_TUFF = Block.createCuboidShape(4.0D, 2.0D, 4.5D, 7.0D, 4.0D, 7.5D);
        NORTH_FRONT_RIGHT_LEG = Block.createCuboidShape(4.5D, 0.0D, 5.0D, 6.5D, 2.0D, 7.0D);
        NORTH_BACK_LEFT_LEG_TUFF = Block.createCuboidShape(9.0D, 2.0D, 11.0D, 12.0D, 4.0D, 14.0D);
        NORTH_BACK_LEFT_LEG = Block.createCuboidShape(9.5D, 0.0D, 11.5D, 11.5D, 2.0D, 13.5D);
        NORTH_FRONT_LEFT_LEG_TUFF = Block.createCuboidShape(9.0D, 2.0D, 4.5D, 12.0D, 4.0D, 7.5D);
        NORTH_FRONT_LEFT_LEG = Block.createCuboidShape(9.5D, 0.0D, 5.0D, 11.5D, 2.0D, 7.0D);
        NORTH_BACK_RIGHT_LEG_TUFF = Block.createCuboidShape(4.0D, 2.0D, 11.0D, 7.0D, 4.0D, 14.0D);
        NORTH_BACK_RIGHT_LEG = Block.createCuboidShape(4.5D, 0.0D, 11.5D, 6.5D, 2.0D, 13.5D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.5D, 8.0D, 1.5D, 10.5D, 9.0D, 2.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 8.0D, 1.5D, 7.5D, 9.0D, 2.0D);
        NORTH_MOUTH = Block.createCuboidShape(7.5D, 6.0D, 1.5D, 8.5D, 7.0D, 2.0D);
        NORTH_LEG_TUFFS = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG_TUFF, NORTH_BACK_LEFT_LEG_TUFF,
                NORTH_FRONT_LEFT_LEG_TUFF, NORTH_BACK_RIGHT_LEG_TUFF);
        NORTH_LEGS = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG, NORTH_BACK_LEFT_LEG, NORTH_FRONT_LEFT_LEG, NORTH_BACK_RIGHT_LEG);
        NORTH_EYES = VoxelShapes.union(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_TORSO, NORTH_HEAD, NORTH_MOUTH, NORTH_LEG_TUFFS, NORTH_LEGS, NORTH_EYES);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
