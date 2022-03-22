package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADWanderingTraderPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_HOOD_FULL = Block.box(3.0D, 5.0D, 4.5D, 13.0D, 15.0D, 13.0D);
    protected static final VoxelShape NORTH_HOOD_OPENING = Block.box(4.0D, 5.0D, 4.5D, 12.0D, 11.0D, 5.5D);
    protected static final VoxelShape NORTH_HOOD = ADBoxUtil.cutBox(NORTH_HOOD_FULL, NORTH_HOOD_OPENING);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(ADBaseVillagerPlushBlock.NORTH_SHAPE, NORTH_HOOD);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADWanderingTraderPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
