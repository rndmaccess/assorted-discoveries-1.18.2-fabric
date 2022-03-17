package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADZombieDemonPlushBlock extends ADZombiePlushBlock {
    protected static final VoxelShape NORTH_LEFT_HORN = Block.box(11.0D, 12.0D, 7.5D, 14.0D, 16.0D, 10.5D);
    protected static final VoxelShape NORTH_RIGHT_HORN = Block.box(2.0D, 12.0D, 7.5D, 5.0D, 16.0D, 10.5D);
    protected static final VoxelShape NORTH_HORNS = Shapes.or(NORTH_LEFT_HORN, NORTH_RIGHT_HORN);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(ADZombiePlushBlock.NORTH_SHAPE, NORTH_HORNS);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADZombieDemonPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
