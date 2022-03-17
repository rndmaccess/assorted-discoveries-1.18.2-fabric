package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADGuardianPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_BODY = Block.box(4.0D, 0.0D, 1.5D, 12.0D, 8.0D, 9.0D);
    protected static final VoxelShape NORTH_TAIL1 = Block.box(5.0D, 2.0D, 9.0D, 11.0D, 6.0D, 11.0D);
    protected static final VoxelShape NORTH_TAIL2 = Block.box(6.0D, 3.0D, 11.0D, 10.0D, 5.0D, 12.0D);
    protected static final VoxelShape NORTH_FIN1 = Block.box(7.0D, 2.0D, 12.0D, 9.0D, 6.0D, 13.0D);
    protected static final VoxelShape NORTH_FIN2 = Block.box(7.0D, 1.0D, 13.0D, 9.0D, 7.0D, 15.0D);
    protected static final VoxelShape NORTH_EYE_BALL = Block.box(6.5D, 3.0D, 1.0D, 9.5D, 6.0D, 1.5D);
    protected static final VoxelShape NORTH_EYE_BROW = Block.box(5.0D, 6.0D, 1.0D, 10.0D, 7.0D, 1.5D);
    protected static final VoxelShape NORTH_LEFT_TOP_HORN = Block.box(10.5D, 6.5D, 2.0D, 13.5D, 9.5D, 4.0D);
    protected static final VoxelShape NORTH_LEFT_BOTTOM_HORN = Block.box(12.0D, 0.0D, 2.0D, 13.5D, 3.0D, 4.0D);
    protected static final VoxelShape NORTH_RIGHT_TOP_HORN = Block.box(2.5D, 6.5D, 2.0D, 5.5D, 9.5D, 4.0D);
    protected static final VoxelShape NORTH_RIGHT_BOTTOM_HORN = Block.box(2.5D, 0.0D, 2.0D, 4.5D, 3.0D, 4.0D);
    protected static final VoxelShape NORTH_TAIL = Shapes.or(NORTH_TAIL1, NORTH_TAIL2, NORTH_FIN1, NORTH_FIN2);
    protected static final VoxelShape NORTH_EYE = Shapes.or(NORTH_EYE_BALL, NORTH_EYE_BROW);
    protected static final VoxelShape NORTH_HORNS = Shapes.or(NORTH_LEFT_TOP_HORN, NORTH_LEFT_BOTTOM_HORN,
            NORTH_RIGHT_TOP_HORN, NORTH_RIGHT_BOTTOM_HORN);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_BODY, NORTH_TAIL, NORTH_EYE, NORTH_HORNS);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADGuardianPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
