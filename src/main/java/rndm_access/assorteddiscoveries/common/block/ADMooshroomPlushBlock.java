package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADMooshroomPlushBlock extends ADCowPlushBlock {
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_STEM_SHAPE = Block.box(7.5D, 13.0D, 6.0D, 8.5D, 14.0D, 7.0D);
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE = Block.box(6.0D, 14.0D, 4.5D, 10.0D, 15.0D,
            8.5D);
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_TOP_SHAPE = Block.box(7.0D, 15.0D, 5.5D, 9.0D, 16.0D, 7.5D);
    protected static final VoxelShape NORTH_HEAD_MUSHROOM_SHAPE = Shapes.or(NORTH_HEAD_MUSHROOM_STEM_SHAPE,
            NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE, NORTH_HEAD_MUSHROOM_TOP_SHAPE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_HEAD_MUSHROOM_SHAPE, ADCowPlushBlock.NORTH_SHAPE);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADMooshroomPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
