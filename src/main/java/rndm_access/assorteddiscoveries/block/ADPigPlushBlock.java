package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADPigPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_BODY = Block.box(4.0D, 3.0D, 4.0D, 12.0D, 9.0D, 14.0D);
    protected static final VoxelShape NORTH_HEAD = Block.box(4.5D, 6.0D, 2.0D, 11.5D, 12.0D, 7.5D);
    protected static final VoxelShape NORTH_SNOUT = Block.box(6.5D, 6.5D, 1.0D, 9.5D, 8.5D, 2.0D);
    protected static final VoxelShape NORTH_LEFT_EYE = Block.box(8.5D, 9.0D, 1.5D, 10.5D, 11.0D, 2.0D);
    protected static final VoxelShape NORTH_RIGHT_EYE = Block.box(5.5D, 9.0D, 1.5D, 7.5D, 11.0D, 2.0D);
    protected static final VoxelShape NORTH_LEFT_BACK_LEG = Block.box(10.0D, 0.0D, 12.0D, 12.0D, 3.0D, 14.0D);
    protected static final VoxelShape NORTH_RIGHT_BACK_LEG = Block.box(4.0D, 0.0D, 12.0D, 6.0D, 3.0D, 14.0D);
    protected static final VoxelShape NORTH_LEFT_FRONT_LEG = Block.box(10.0D, 0.0D, 4.0D, 12.0D, 3.0D, 6.0D);
    protected static final VoxelShape NORTH_RIGHT_FRONT_LEG = Block.box(4.0D, 0.0D, 4.0D, 6.0D, 3.0D, 6.0D);
    protected static final VoxelShape NORTH_TAIL_BOTTOM = Block.box(6.5D, 3.5D, 14.0D, 10.0D, 4.5D, 15.0D);
    protected static final VoxelShape NORTH_TAIL_SIDE = Block.box(10.0D, 4.5D, 14.0D, 11.0D, 7.5D, 15.0D);
    protected static final VoxelShape NORTH_TAIL_TOP = Block.box(7.0D, 7.5D, 14.0D, 10.0D, 8.5D, 15.0D);
    protected static final VoxelShape NORTH_TAIL_TWIRL_START = Block.box(6.0D, 6.5D, 14.0D, 7.0D, 7.5D, 15.0D);
    protected static final VoxelShape NORTH_TAIL_TWIRL_END = Block.box(7.0D, 5.5D, 14.0D, 8.0D, 6.5D, 15.0D);
    protected static final VoxelShape NORTH_EYES = Shapes.or(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
    protected static final VoxelShape NORTH_LEGS = Shapes.or(NORTH_LEFT_BACK_LEG, NORTH_RIGHT_BACK_LEG,
            NORTH_LEFT_FRONT_LEG, NORTH_RIGHT_FRONT_LEG);
    protected static final VoxelShape NORTH_TAIL = Shapes.or(NORTH_TAIL_BOTTOM, NORTH_TAIL_SIDE, NORTH_TAIL_TOP,
            NORTH_TAIL_TWIRL_START, NORTH_TAIL_TWIRL_END);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_BODY, NORTH_HEAD, NORTH_SNOUT, NORTH_EYES,
            NORTH_LEGS, NORTH_TAIL);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADPigPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
