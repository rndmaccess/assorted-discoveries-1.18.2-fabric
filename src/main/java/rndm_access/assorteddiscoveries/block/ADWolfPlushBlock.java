package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADWolfPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_SNOUT_SHAPE = Block.box(6.0D, 6.0D, 1.5D, 10.0D, 8.0D, 3.0D);
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE = Block.box(9.0D, 8.5D, 2.5D, 10.5D, 10.0D, 3.0D);
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE = Block.box(5.5D, 8.5D, 2.5D, 7.0D, 10.0D, 3.0D);
    protected static final VoxelShape NORTH_HEAD_SHAPE = Block.box(5.0D, 6.0D, 3.0D, 11.0D, 11.0D, 8.0D);
    protected static final VoxelShape NORTH_BODY_SHAPE = Block.box(4.0D, 3.0D, 6.0D, 12.0D, 8.0D, 14.0D);
    protected static final VoxelShape NORTH_TAIL_SHAPE = Block.box(7.0D, 2.5D, 14.0D, 9.0D, 8.0D, 16.0D);
    protected static final VoxelShape NORTH_LEFT_EAR_SHAPE = Block.box(9.0D, 11.0D, 5.0D, 11.0D, 12.5D, 6.0D);
    protected static final VoxelShape NORTH_RIGHT_EAR_SHAPE = Block.box(5.0D, 11.0D, 5.0D, 7.0D, 12.5D, 6.0D);
    protected static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE = Block.box(9.5D, 0.0D, 11.5D, 12.0D, 3.0D, 14.0D);
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE = Block.box(9.5D, 0.0D, 6.0D, 12.0D, 3.0D, 8.5D);
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE = Block.box(4.0D, 0.0D, 11.5D, 6.5D, 3.0D, 14.0D);
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE = Block.box(4.0D, 0.0D, 6.0D, 6.5D, 3.0D, 8.5D);
    protected static final VoxelShape NORTH_EYE_SHAPES = Shapes.or(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
    protected static final VoxelShape NORTH_EAR_SHAPES = Shapes.or(NORTH_LEFT_EAR_SHAPE, NORTH_RIGHT_EAR_SHAPE);
    protected static final VoxelShape NORTH_LEG_SHAPES = Shapes.or(NORTH_BACK_LEFT_LEG_SHAPE,
            NORTH_FRONT_LEFT_LEG_SHAPE, NORTH_BACK_RIGHT_LEG_SHAPE, NORTH_FRONT_RIGHT_LEG_SHAPE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_SNOUT_SHAPE, NORTH_HEAD_SHAPE, NORTH_BODY_SHAPE,
            NORTH_TAIL_SHAPE, NORTH_EYE_SHAPES, NORTH_EAR_SHAPES, NORTH_LEG_SHAPES);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADWolfPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
