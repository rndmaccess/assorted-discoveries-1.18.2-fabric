package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADCatPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG = Block.box(9.0D, 0.0D, 7.5D, 10.0D, 2.0D, 8.5D);
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG = Block.box(6.0D, 0.0D, 7.5D, 7.0D, 2.0D, 8.5D);
    protected static final VoxelShape NORTH_TORSO = Block.box(5.5D, 2.0D, 6.0D, 10.5D, 6.0D, 11.5D);
    protected static final VoxelShape NORTH_HEAD = Block.box(5.0D, 3.0D, 1.0D, 11.0D, 8.5D, 6.0D);
    protected static final VoxelShape NORTH_RIGHT_EAR = Block.box(9.0D, 8.5D, 4.0D, 10.0D, 9.5D, 6.0D);
    protected static final VoxelShape NORTH_LEFT_EAR = Block.box(6.0D, 8.5D, 4.0D, 7.0D, 9.5D, 6.0D);
    protected static final VoxelShape NORTH_RIGHT_EYE = Block.box(8.5D, 6.0D, 0.5D, 10.5D, 7.0D, 1.0D);
    protected static final VoxelShape NORTH_LEFT_EYE = Block.box(5.5D, 6.0D, 0.5D, 7.5D, 7.0D, 1.0D);
    protected static final VoxelShape NORTH_NOSE = Block.box(6.5D, 3.5D, 0.0D, 9.5D, 5.5D, 1.0D);
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG = Block.box(9.0D, 0.0D, 10.0D, 10.0D, 2.0D, 11.0D);
    protected static final VoxelShape NORTH_BACK_LEFT_LEG = Block.box(6.0D, 0.0D, 10.0D, 7.0D, 2.0D, 11.0D);
    protected static final VoxelShape NORTH_TAIL1_PIECE = Block.box(7.5D, 3.0D, 11.5D, 8.5D, 4.0D, 14.0D);
    protected static final VoxelShape NORTH_TAIL2_PIECE = Block.box(7.5D, 2.0D, 13.0D, 8.5D, 3.0D, 16.0D);

    protected static final VoxelShape NORTH_LEGS = Shapes.or(NORTH_FRONT_RIGHT_LEG, NORTH_FRONT_LEFT_LEG,
            NORTH_BACK_RIGHT_LEG, NORTH_BACK_LEFT_LEG);
    protected static final VoxelShape NORTH_TAIL = Shapes.or(NORTH_TAIL1_PIECE, NORTH_TAIL2_PIECE);
    protected static final VoxelShape NORTH_EARS = Shapes.or(NORTH_RIGHT_EAR, NORTH_LEFT_EAR);
    protected static final VoxelShape NORTH_EYES = Shapes.or(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
    protected static final VoxelShape NORTH_BODY = Shapes.or(NORTH_TORSO, NORTH_HEAD, NORTH_LEGS, NORTH_TAIL,
            NORTH_EARS, NORTH_EYES);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_BODY, NORTH_NOSE);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADCatPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
