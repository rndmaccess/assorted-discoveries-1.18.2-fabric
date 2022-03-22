package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADWitchPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_RIM = Block.box(3.0D, 11.0D, 4.5D, 13.0D, 12.0D, 13.0D);
    protected static final VoxelShape NORTH_HAT_MIDDLE = Block.box(4.0D, 12.0D, 5.5D, 12.0D, 15.0D, 12.0D);
    protected static final VoxelShape NORTH_HAT_TOP = Block.box(6.0D, 15.0D, 7.5D, 10.0D, 17.5D, 10.0D);
    protected static final VoxelShape NORTH_HAT_POINT = Block.box(6.5D, 17.5D, 8.5D, 9.0D, 19.5D, 9.5D);
    protected static final VoxelShape NORTH_WART = Block.box(7.0D, 5.0D, 2.5D, 8.0D, 6.0D, 3.5D);
    protected static final VoxelShape NORTH_FACE = Shapes.or(NORTH_EYEBROW, NORTH_LEFT_EYE, NORTH_RIGHT_EYE, NORTH_NOSE,
            NORTH_WART);
    protected static final VoxelShape NORTH_HAT = Shapes.or(NORTH_HAT_RIM, NORTH_HAT_MIDDLE, NORTH_HAT_TOP,
            NORTH_HAT_POINT);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_FEET, NORTH_FACE, NORTH_BODY, NORTH_HAT);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADWitchPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
