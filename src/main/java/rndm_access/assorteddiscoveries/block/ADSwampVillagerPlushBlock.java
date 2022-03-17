package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADSwampVillagerPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_TOP = Block.box(3.0, 13.0, 4.5, 13.0, 15.0, 13.0);
    protected static final VoxelShape NORTH_LEFT_BACK_HAT_DETAIL = Block.box(9.0, 12.0, 9.0, 13.0, 13.0, 13.0);
    protected static final VoxelShape NORTH_RIGHT_BACK_HAT_DETAIL = Block.box(3.0, 11.0, 9.0, 6.5, 13.0, 13.0);
    protected static final VoxelShape NORTH_LEFT_FRONT_HAT_DETAIL = Block.box(11.0, 12.0, 4.5, 13.0, 13.0, 6.5);
    protected static final VoxelShape NORTH_MIDDLE_FRONT_HAT_DETAIL0 = Block.box(5.0, 12.0, 4.5, 9.0, 13.0, 5.5);
    protected static final VoxelShape NORTH_MIDDLE_FRONT_HAT_DETAIL1 = Block.box(8.0, 11.0, 4.5, 9.0, 12.0, 5.5);
    protected static final VoxelShape NORTH_HAT = Shapes.or(NORTH_HAT_TOP, NORTH_LEFT_BACK_HAT_DETAIL,
            NORTH_RIGHT_BACK_HAT_DETAIL, NORTH_LEFT_FRONT_HAT_DETAIL, NORTH_MIDDLE_FRONT_HAT_DETAIL0,
            NORTH_MIDDLE_FRONT_HAT_DETAIL1);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HAT);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADSwampVillagerPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
