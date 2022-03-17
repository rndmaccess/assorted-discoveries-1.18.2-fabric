package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADDesertVillagerPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HAT_MAIN = Block.box(3.0D, 12.0D, 4.5D, 13.0D, 14.0D, 13.0D);
    protected static final VoxelShape NORTH_POMPOM = Block.box(6.0D, 14.0D, 7.0D, 10.0D, 15.0D, 10.5D);
    protected static final VoxelShape NORTH_HAT = Shapes.or(NORTH_HAT_MAIN, NORTH_POMPOM);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HAT);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADDesertVillagerPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
