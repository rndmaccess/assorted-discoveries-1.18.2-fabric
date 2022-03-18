package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADZombiePlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD = Block.box(3.5D, 7.0D, 5.0D, 12.5D, 15.0D, 13.5D);
    protected static final VoxelShape NORTH_TORSO = Block.box(4.0D, 2.0D, 7.0D, 12.0D, 7.0D, 12.0D);
    protected static final VoxelShape NORTH_LEFT_LEG = Block.box(8.5D, 0.0D, 8.0D, 11.5D, 2.0D, 11.0D);
    protected static final VoxelShape NORTH_RIGHT_LEG = Block.box(4.5D, 0.0D, 8.0D, 7.5D, 2.0D, 11.0D);
    protected static final VoxelShape NORTH_LEFT_ARM = Block.box(11.0D, 5.0D, 3.0D, 14.0D, 8.0D, 10.5D);
    protected static final VoxelShape NORTH_RIGHT_ARM = Block.box(2.0D, 5.0D, 3.0D, 5.0D, 8.0D, 10.5D);
    protected static final VoxelShape NORTH_LEFT_EYE = Block.box(9.0D, 11.0D, 4.5D, 11.0D, 13.0D, 5.0D);
    protected static final VoxelShape NORTH_RIGHT_EYE = Block.box(5.0D, 11.0D, 4.5D, 7.0D, 13.0D, 5.0D);
    protected static final VoxelShape NORTH_LEGS = Shapes.or(NORTH_LEFT_LEG, NORTH_RIGHT_LEG);
    protected static final VoxelShape NORTH_ARMS = Shapes.or(NORTH_LEFT_ARM, NORTH_RIGHT_ARM);
    protected static final VoxelShape NORTH_EYES = Shapes.or(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_HEAD, NORTH_TORSO, NORTH_LEGS, NORTH_EYES,
            NORTH_ARMS);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADZombiePlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
