package rndm_access.assorteddiscoveries.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADSnowyStairBlock extends StairBlock {
    public ADSnowyStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor world,
            BlockPos pos, BlockPos pos2) {

        if (direction.equals(Direction.DOWN)) {
            makeSnowy(world, pos, state);
        }

        return super.updateShape(state, direction, state2, world, pos, pos2);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState state2, boolean p_220082_5_) {
        makeSnowy(level, pos, state);
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
    private static void makeSnowy(LevelAccessor world, BlockPos pos, BlockState state) {
        BlockPos belowPos = pos.below();
        BlockState belowState = world.getBlockState(belowPos);

        for (int i = 0; i < BOTTOM_SHAPES.length; i++) {
            if (belowState.hasProperty(BlockStateProperties.SNOWY)
                    && state.getFaceOcclusionShape(world, pos, Direction.DOWN).optimize() == BOTTOM_SHAPES[i]
                    && !ADBlockStateUtil.isBottomSlab(belowState)) {
                world.setBlock(belowPos, belowState.setValue(BlockStateProperties.SNOWY, true), 3);
            }
        }
    }
}
