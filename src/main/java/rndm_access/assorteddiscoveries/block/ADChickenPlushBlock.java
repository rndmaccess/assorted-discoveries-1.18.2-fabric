package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADChickenPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_FEET_SHAPE;
    protected static final VoxelShape NORTH_TORSO_SHAPE;
    protected static final VoxelShape NORTH_WINGS_SHAPE;
    protected static final VoxelShape NORTH_HEAD_SHAPE;
    protected static final VoxelShape NORTH_WATTLE_SHAPE;
    protected static final VoxelShape NORTH_BEAK_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape NORTH_LEFT_LEG_BACK_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_LEG_BACK_SHAPE;
    protected static final VoxelShape NORTH_LEFT_LEG_FRONT_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_LEG_FRONT_SHAPE;

    protected static final VoxelShape NORTH_LEGS_SHAPE;
    protected static final VoxelShape NORTH_EYES_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADChickenPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape northShape() {
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
        NORTH_FEET_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 7.5D, 11.0D, 0.5D, 8.5D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(4.0D, 3.0D, 4.0D, 12.0D, 10.0D, 13.0D);
        NORTH_WINGS_SHAPE = Block.createCuboidShape(3.0D, 3.5D, 5.0D, 13.0D, 9.0D, 12.0D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(5.5D, 9.0D, 2.0D, 10.5D, 14.0D, 5.0D);
        NORTH_WATTLE_SHAPE = Block.createCuboidShape(6.5D, 8.5D, 1.0D, 9.5D, 11.0D, 3.0D);
        NORTH_BEAK_SHAPE = Block.createCuboidShape(6.0D, 11.0D, 0.0D, 10.0D, 12.0D, 3.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(9.0D, 12.0D, 1.5D, 10.0D, 13.0D, 2.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(6.0D, 12.0D, 1.5D, 7.0D, 13.0D, 2.0D);
        NORTH_LEFT_LEG_BACK_SHAPE = Block.createCuboidShape(5.5D, 0.0D, 9.5D, 6.5D, 3.0D, 10.5D);
        NORTH_RIGHT_LEG_BACK_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 9.5D, 10.5D, 3.0D, 10.5D);
        NORTH_LEFT_LEG_FRONT_SHAPE = Block.createCuboidShape(5.5D, 0.0D, 8.5D, 6.5D, 0.5D, 9.5D);
        NORTH_RIGHT_LEG_FRONT_SHAPE = Block.createCuboidShape(9.5D, 0.0D, 8.5D, 10.5D, 0.5D, 9.5D);

        NORTH_LEGS_SHAPE = VoxelShapes.union(NORTH_LEFT_LEG_BACK_SHAPE,
                NORTH_RIGHT_LEG_BACK_SHAPE, NORTH_LEFT_LEG_FRONT_SHAPE, NORTH_RIGHT_LEG_FRONT_SHAPE);
        NORTH_EYES_SHAPE = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET_SHAPE, NORTH_TORSO_SHAPE, NORTH_WINGS_SHAPE,
                NORTH_HEAD_SHAPE, NORTH_WATTLE_SHAPE, NORTH_BEAK_SHAPE, NORTH_LEGS_SHAPE, NORTH_EYES_SHAPE);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
