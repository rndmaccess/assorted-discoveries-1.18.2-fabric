package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADCreeperPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_HEAD = Block.box(4.0, 7.0, 4.0D, 12.0D, 15.0D, 12.0D);
    protected static final VoxelShape NORTH_TORSO = Block.box(6.0D, 3.0D, 6.0D, 10.0D, 7.0D, 10.0D);
    protected static final VoxelShape NORTH_BACK_FOOT = Block.box(6.0D, 0.0D, 10.0D, 10.0D, 3.0D, 13.0D);
    protected static final VoxelShape NORTH_FRONT_FOOT = Block.box(6.0D, 0.0D, 3.0D, 10.0D, 3.0D, 6.0D);
    protected static final VoxelShape NORTH_LEFT_EYE = Block.box(9.0D, 11.0D, 3.5D, 11.0D, 13.0D, 4.0D);
    protected static final VoxelShape NORTH_RIGHT_EYE = Block.box(5.0D, 11.0D, 3.5D, 7.0D, 13.0D, 4.0D);
    protected static final VoxelShape NORTH_MIDDLE_MOUTH = Block.box(7.5D, 9.0D, 3.5D, 8.5D, 11.0D, 4.0D);
    protected static final VoxelShape NORTH_RIGHT_MOUTH = Block.box(6.5D, 8.0D, 3.5D, 7.5D, 10.0D, 4.0D);
    protected static final VoxelShape NORTH_LEFT_MOUTH = Block.box(8.5D, 8.0D, 3.5D, 9.5D, 10.0D, 4.0D);
    protected static final VoxelShape NORTH_FEET = Shapes.or(NORTH_BACK_FOOT, NORTH_FRONT_FOOT);
    protected static final VoxelShape NORTH_EYES = Shapes.or(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
    protected static final VoxelShape NORTH_MOUTH = Shapes.or(NORTH_MIDDLE_MOUTH, NORTH_RIGHT_MOUTH, NORTH_LEFT_MOUTH);
    protected static final VoxelShape NORTH_BODY = Shapes.or(NORTH_HEAD, NORTH_TORSO);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_FEET, NORTH_EYES, NORTH_MOUTH, NORTH_BODY);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADCreeperPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
