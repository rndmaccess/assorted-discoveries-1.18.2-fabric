package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ADSnowyStairBlock extends StairsBlock {
    public ADSnowyStairBlock(BlockState state, AbstractBlock.Settings settings) {
        super(state, settings);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.equals(Direction.DOWN)) {
            makeSnowy(world, pos, state);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        makeSnowy(world, pos, state);
    }

    /**
     * This is a helper method that updates the block underneath and sets snowy to
     * true. If the block has that property and the of the snowy stair is covering
     * the block underneath.
     *
     * @param world
     * @param pos   The location of the this snowy block.
     * @param state The snowy stairs as a block state.
     */
    private static void makeSnowy(WorldAccess world, BlockPos pos, BlockState state) {
        BlockPos belowPos = pos.down();
        BlockState belowState = world.getBlockState(belowPos);

        if (belowState.contains(Properties.SNOWY) &&
                state.isSideSolidFullSquare(world, pos, Direction.DOWN) &&
                belowState.contains(Properties.SLAB_TYPE) &&
                !belowState.get(Properties.SLAB_TYPE).equals(SlabType.BOTTOM)) {
            world.setBlockState(belowPos, belowState.with(Properties.SNOWY, true), 3);
        }
    }
}
