package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADSlimePlushBlock extends ADMagmaCubePlushBlock {
    // One Slime Bounding Boxes
    protected static final VoxelShape BOTTOM_NORTH_MOUTH_SHAPE = Block.box(6.0D, 2.0D, 2.5D, 7.0D, 3.0D, 3.0D);
    protected static final VoxelShape BOTTOM_NORTH_SHAPE = Shapes.or(ADMagmaCubePlushBlock.BOTTOM_NORTH_SHAPE,
            BOTTOM_NORTH_MOUTH_SHAPE);
    protected static final VoxelShape BOTTOM_SOUTH_SHAPE = ADBoxUtil.rotate180Y(BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape BOTTOM_WEST_SHAPE = ADBoxUtil.rotate270Y(BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape BOTTOM_EAST_SHAPE = ADBoxUtil.rotate90Y(BOTTOM_NORTH_SHAPE);

    // Two Slime Bounding Boxes
    protected static final VoxelShape MIDDLE_NORTH_MOUTH_EYE_SHAPE = Block.box(6.5D, 10.5D, 3.5D, 7.5D, 11.5D, 4.0D);
    protected static final VoxelShape MIDDLE_NORTH_SHAPE = Shapes.or(ADMagmaCubePlushBlock.MIDDLE_NORTH_SHAPE,
            MIDDLE_NORTH_MOUTH_EYE_SHAPE, BOTTOM_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_SOUTH_SHAPE = ADBoxUtil.rotate180Y(MIDDLE_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_WEST_SHAPE = ADBoxUtil.rotate270Y(MIDDLE_NORTH_SHAPE);
    protected static final VoxelShape MIDDLE_EAST_SHAPE = ADBoxUtil.rotate90Y(MIDDLE_NORTH_SHAPE);

    // Three Slime Bounding Boxes
    protected static final VoxelShape TOP_NORTH_MOUTH_EYE_SHAPE = Block.box(7.0D, 1.0D, 5.5D, 7.5D, 1.5D, 6.0D);
    protected static final VoxelShape TOP_NORTH_SHAPE = Shapes.or(ADMagmaCubePlushBlock.TOP_NORTH_SHAPE,
            TOP_NORTH_MOUTH_EYE_SHAPE);
    protected static final VoxelShape TOP_SOUTH_SHAPE = ADBoxUtil.rotate180Y(TOP_NORTH_SHAPE);
    protected static final VoxelShape TOP_WEST_SHAPE = ADBoxUtil.rotate270Y(TOP_NORTH_SHAPE);
    protected static final VoxelShape TOP_EAST_SHAPE = ADBoxUtil.rotate90Y(TOP_NORTH_SHAPE);

    public ADSlimePlushBlock(Properties properties) {
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
