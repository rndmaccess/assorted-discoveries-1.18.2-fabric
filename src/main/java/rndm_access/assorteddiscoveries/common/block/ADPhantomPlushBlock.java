package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADPhantomPlushBlock extends ADAbstractPlushBlock {
    public static final VoxelShape NORTH_WING_SHAPE = Block.box(1.0, 0.0, 5.0, 15.0, 2.5, 11.0);
    public static final VoxelShape NORTH_BODY_SHAPE = Block.box(5.0, 0.0, 1.0, 11.0, 4.0, 12.0);
    public static final VoxelShape NORTH_TAIL_SHAPE = Block.box(6.0, 0.0, 12.0, 10.0, 3.0, 14.0);
    public static final VoxelShape NORTH_TAIL_END_SHAPE = Block.box(7.0, 0.0, 14.0, 9.0, 2.0, 16.0);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_WING_SHAPE, NORTH_BODY_SHAPE, NORTH_TAIL_SHAPE,
            NORTH_TAIL_END_SHAPE);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADPhantomPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
