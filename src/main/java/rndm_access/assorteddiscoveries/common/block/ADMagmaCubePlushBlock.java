package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADMagmaCubePlushBlock extends ADTallPlushBlock {
    // Bottom Magma Cube Bounding Boxes
    protected static final VoxelShape BOTTOM_BODY_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 9.0D, 13.0D);
    protected static final VoxelShape BOTTOM_NORTH_LEFT_EYE_SHAPE = Block.box(10.0D, 5.0D, 2.5D, 12.0D, 7.0D, 3.0D);
    protected static final VoxelShape BOTTOM_NORTH_RIGHT_EYE_SHAPE = Block.box(4.0D, 5.0D, 2.5D, 6.0D, 7.0D, 3.0D);
    protected static final VoxelShape BOTTOM_NORTH_EYES_SHAPES = Shapes.or(BOTTOM_NORTH_LEFT_EYE_SHAPE,
            BOTTOM_NORTH_RIGHT_EYE_SHAPE);
    protected static final VoxelShape BOTTOM_NORTH_SHAPE = Shapes.or(BOTTOM_BODY_SHAPE, BOTTOM_NORTH_EYES_SHAPES);
    protected static final VoxelShape BOTTOM_SOUTH_SHAPE = ADBoxUtil.rotate180Y(BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape BOTTOM_WEST_SHAPE = ADBoxUtil.rotate270Y(BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape BOTTOM_EAST_SHAPE = ADBoxUtil.rotate90Y(BOTTOM_NORTH_SHAPE);

    // Middle Magma Cube Bounding Box
    protected static final VoxelShape MIDDLE_BODY_SHAPE = Block.box(4.0D, 7.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    protected static final VoxelShape MIDDLE_NORTH_LEFT_EYE_SHAPE = Block.box(9.0D, 13.0D, 3.5D, 10.5D, 14.5D, 4.0D);
    protected static final VoxelShape MIDDLE_NORTH_RIGHT_EYE_SHAPE = Block.box(5.0D, 13.0D, 3.5D, 6.5D, 14.5D, 4.0D);
    protected static final VoxelShape MIDDLE_NORTH_EYES_SHAPE = Shapes.or(MIDDLE_NORTH_LEFT_EYE_SHAPE,
            MIDDLE_NORTH_RIGHT_EYE_SHAPE);
    protected static final VoxelShape MIDDLE_NORTH_SHAPE = Shapes.or(MIDDLE_BODY_SHAPE, MIDDLE_NORTH_EYES_SHAPE,
            BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_SOUTH_SHAPE = ADBoxUtil.rotate180Y(MIDDLE_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_WEST_SHAPE = ADBoxUtil.rotate270Y(MIDDLE_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_EAST_SHAPE = ADBoxUtil.rotate90Y(MIDDLE_NORTH_SHAPE);

    // Top Magma Cube Bounding Box
    protected static final VoxelShape TOP_BODY_SHAPE = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D);
    protected static final VoxelShape TOP_NORTH_LEFT_EYE_SHAPE = Block.box(6.5D, 2.0D, 5.5D, 7.5D, 3.0D, 6.0D);
    protected static final VoxelShape TOP_NORTH_RIGHT_EYE_SHAPE = Block.box(8.5D, 2.0D, 5.5D, 9.5D, 3.0D, 6.0D);
    protected static final VoxelShape TOP_NORTH_EYES_SHAPE = Shapes.or(TOP_NORTH_LEFT_EYE_SHAPE,
            TOP_NORTH_RIGHT_EYE_SHAPE);
    protected static final VoxelShape TOP_NORTH_SHAPE = Shapes.or(TOP_BODY_SHAPE, TOP_NORTH_EYES_SHAPE);
    protected static final VoxelShape TOP_SOUTH_SHAPE = ADBoxUtil.rotate180Y(TOP_NORTH_SHAPE);
    protected static final VoxelShape TOP_WEST_SHAPE = ADBoxUtil.rotate270Y(TOP_NORTH_SHAPE);
    protected static final VoxelShape TOP_EAST_SHAPE = ADBoxUtil.rotate90Y(TOP_NORTH_SHAPE);

    public ADMagmaCubePlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
        case NORTH:
            return getStackShape(state, BOTTOM_NORTH_SHAPE, MIDDLE_NORTH_SHAPE, TOP_NORTH_SHAPE);
        case SOUTH:
            return getStackShape(state, BOTTOM_SOUTH_SHAPE, MIDDLE_SOUTH_SHAPE, TOP_SOUTH_SHAPE);
        case WEST:
            return getStackShape(state, BOTTOM_WEST_SHAPE, MIDDLE_WEST_SHAPE, TOP_WEST_SHAPE);
        default:
            return getStackShape(state, BOTTOM_EAST_SHAPE, MIDDLE_EAST_SHAPE, TOP_EAST_SHAPE);
        }
    }
}
