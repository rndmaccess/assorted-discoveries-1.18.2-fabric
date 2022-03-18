package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADWitherPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD = Block.box(4.0, 8.0, 4.0, 12.0, 16.0, 12.0);
    protected static final VoxelShape NORTH_MOUTH = Block.box(6.0, 9.5, 3.5, 10.0, 10.5, 4.0);
    protected static final VoxelShape NORTH_RIGHT_EYE = Block.box(5.0, 12.0, 3.5, 7.0, 14.0, 4.0);
    protected static final VoxelShape NORTH_LEFT_EYE = Block.box(9.0, 12.0, 3.5, 11.0, 14.0, 4.0);
    protected static final VoxelShape NORTH_MAIN_TORSO = Block.box(6.5, 2.0, 6.5, 9.5, 8.0, 9.0);
    protected static final VoxelShape NORTH_TORSO_BEND = Block.box(6.5, 0.0, 6.5, 9.5, 4.0, 10.5);
    protected static final VoxelShape NORTH_TOP_SPIKE = Block.box(3.0, 5.0, 6.5, 13.0, 7.0, 9.0);
    protected static final VoxelShape NORTH_BOTTOM_SPIKE = Block.box(3.0, 2.0, 6.5, 13.0, 4.0, 9.0);
    protected static final VoxelShape NORTH_EYES = Shapes.or(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
    protected static final VoxelShape NORTH_TORSO = Shapes.or(NORTH_MAIN_TORSO, NORTH_TORSO_BEND);
    protected static final VoxelShape NORTH_SPIKES = Shapes.or(NORTH_TOP_SPIKE, NORTH_BOTTOM_SPIKE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_HEAD, NORTH_MOUTH, NORTH_EYES, NORTH_TORSO,
            NORTH_SPIKES);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADWitherPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
