package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADEndermanPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD_SHAPE;
    protected static final VoxelShape NORTH_TORSO_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_LEG_SHAPE;
    protected static final VoxelShape NORTH_LEFT_LEG_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_ARM1_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_ARM2_SHAPE;
    protected static final VoxelShape NORTH_MIDDLE_ARM_SHAPE;
    protected static final VoxelShape NORTH_LEFT_ARM1_SHAPE;
    protected static final VoxelShape NORTH_LEFT_ARM2_SHAPE;
    protected static final VoxelShape NORTH_GRASS_BLOCK_SHAPE;
    protected static final VoxelShape NORTH_BODY_SHAPE;
    protected static final VoxelShape NORTH_EYES_SHAPE;
    protected static final VoxelShape NORTH_LEGS_SHAPE;
    protected static final VoxelShape NORTH_ARMS_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADEndermanPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_HEAD_SHAPE = Block.createCuboidShape(5.5D, 12.0D, 7.0D, 10.5D, 16.0D, 12.0D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(6.0D, 7.5D, 7.5D, 10.0D, 12.0D, 11.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(8.5D, 14.5D, 6.5D, 10.0D, 15.0D, 7.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(6.0D, 14.5D, 6.5D, 7.5D, 15.0D, 7.0D);
        NORTH_RIGHT_LEG_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 9.0D, 9.5D, 7.5D, 10.0D);
        NORTH_LEFT_LEG_SHAPE = Block.createCuboidShape(6.5D, 0.0D, 9.0D, 7.5D, 7.5D, 10.0D);
        NORTH_RIGHT_ARM1_SHAPE = Block.createCuboidShape(10.0D, 9.5D, 7.0D, 11.0D, 11.5D, 8.0D);
        NORTH_RIGHT_ARM2_SHAPE = Block.createCuboidShape(9.0D, 7.5D, 7.0D, 10.0D, 10.5D, 8.0D);
        NORTH_MIDDLE_ARM_SHAPE = Block.createCuboidShape(7.0D, 4.5D, 7.0D, 9.0D, 8.5D, 8.0D);
        NORTH_LEFT_ARM1_SHAPE = Block.createCuboidShape(5.0D, 9.5D, 7.0D, 6.0D, 11.5D, 8.0D);
        NORTH_LEFT_ARM2_SHAPE = Block.createCuboidShape(6.0D, 7.5D, 7.0D, 7.0D, 10.5D, 8.0D);
        NORTH_GRASS_BLOCK_SHAPE = Block.createCuboidShape(6.5D, 5.0D, 4.0D, 9.5D, 8.0D, 7.0D);
        NORTH_BODY_SHAPE = VoxelShapes.union(NORTH_HEAD_SHAPE, NORTH_TORSO_SHAPE);
        NORTH_EYES_SHAPE = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_LEGS_SHAPE = VoxelShapes.union(NORTH_RIGHT_LEG_SHAPE, NORTH_LEFT_LEG_SHAPE);
        NORTH_ARMS_SHAPE = VoxelShapes.union(NORTH_RIGHT_ARM1_SHAPE, NORTH_RIGHT_ARM2_SHAPE,
                NORTH_MIDDLE_ARM_SHAPE, NORTH_LEFT_ARM1_SHAPE, NORTH_LEFT_ARM2_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY_SHAPE, NORTH_EYES_SHAPE, NORTH_LEGS_SHAPE,
                NORTH_ARMS_SHAPE, NORTH_GRASS_BLOCK_SHAPE);
        SOUTH_SHAPE = ADShapeUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADShapeUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADShapeUtil.rotate90Y(NORTH_SHAPE);
    }
}
