package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import rndm_access.assorteddiscoveries.common.core.ADBlockTags;

public class ADBambooFenceBlock extends FenceBlock {
    public static final BooleanProperty UP;

    public ADBambooFenceBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(UP, false));
    }

    @Override
    public boolean canConnect(BlockState state, boolean neighborIsFullSquare, Direction dir) {
        Block block = state.getBlock();
        boolean flag1 = block instanceof FenceGateBlock && FenceGateBlock.canWallConnect(state, dir);

        return !cannotConnect(state) && neighborIsFullSquare || flag1 || state.isIn(ADBlockTags.BAMBOO_FENCES);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getAxis().isVertical()) {

            if (isBambooFenceAbove(world, pos)) {
                return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos).with(UP, true);
            } else {
                return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos).with(UP, false);
            }
        } else {
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();

        if (isBambooFenceAbove(world, pos)) {
            return super.getPlacementState(context).with(UP, true);
        } else {
            return super.getPlacementState(context).with(UP, false);
        }
    }

    private static boolean isBambooFenceAbove(WorldAccess world, BlockPos pos) {
        BlockPos abovePos = pos.up();
        BlockState state = world.getBlockState(abovePos);

        return ADBlockTags.BAMBOO_FENCES.contains(state.getBlock());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(UP);
        super.appendProperties(builder);
    }

    static {
        UP = Properties.UP;
    }
}
