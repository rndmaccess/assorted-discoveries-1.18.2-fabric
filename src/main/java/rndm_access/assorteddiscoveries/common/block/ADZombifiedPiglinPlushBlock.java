package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADZombifiedPiglinPlushBlock extends ADZombiePlushBlock {
    protected static final VoxelShape NORTH_SNOUT = Block.box(6.0D, 8.0D, 4.0D, 10.0D, 10.0D, 5.0D);
    protected static final VoxelShape NORTH_RIGHT_EAR = Block.box(1.5D, 9.0D, 8.0D, 3.5D, 12.0D, 12.0D);
    protected static final VoxelShape NORTH_LEFT_EAR = Block.box(11.5D, 9.0D, 8.0D, 14.0D, 12.0D, 12.0D);
    protected static final VoxelShape NORTH_EARS = Shapes.or(NORTH_RIGHT_EAR, NORTH_LEFT_EAR);
    protected static final VoxelShape NORTH_BODY_SHAPE = Shapes.or(NORTH_SNOUT, NORTH_EARS, NORTH_HEAD, NORTH_TORSO,
            NORTH_LEGS, NORTH_EYES);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_BODY_SHAPE, NORTH_ARMS);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADZombifiedPiglinPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
