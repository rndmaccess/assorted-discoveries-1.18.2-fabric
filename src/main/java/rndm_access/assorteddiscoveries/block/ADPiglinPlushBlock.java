package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADPiglinPlushBlock extends ADZombifiedPiglinPlushBlock {
    protected static final VoxelShape NORTH_LEFT_ARM = Block.box(12.0D, 3.0D, 7.5D, 14.5D, 8.0D, 10.5D);
    protected static final VoxelShape NORTH_RIGHT_ARM = Block.box(1.5D, 3.0D, 7.5D, 4.0D, 8.0D, 10.5D);
    protected static final VoxelShape NORTH_ARMS = Shapes.or(NORTH_LEFT_ARM, NORTH_RIGHT_ARM);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(ADZombifiedPiglinPlushBlock.NORTH_BODY_SHAPE, NORTH_ARMS);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADPiglinPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
