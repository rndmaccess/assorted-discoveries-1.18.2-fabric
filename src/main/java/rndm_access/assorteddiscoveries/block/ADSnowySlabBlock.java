package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADSnowySlabBlock extends SlabBlock {
    public ADSnowySlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor levelAccessor,
            BlockPos pos, BlockPos pos2) {

        if (direction.equals(Direction.DOWN)) {
            makeSnowy(levelAccessor, pos, state);
        }

        return super.updateShape(state, direction, state2, levelAccessor, pos, pos2);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState state2, boolean p_220082_5_) {
        makeSnowy(level, pos, state);
    }

    /**
     * This is a helper method that updates the block underneath and sets snowy to
     * true. If the block has that property and the of the snowy slab block is not
     * an upper type.
     *
     * @param world
     * @param pos   The location of the this snowy block.
     * @param state The snowy slab as a block state.
     */
    private static void makeSnowy(LevelAccessor levelAccessor, BlockPos pos, BlockState state) {
        BlockPos belowPos = pos.below();
        BlockState belowState = levelAccessor.getBlockState(belowPos);
        SlabType slabType = state.getValue(TYPE);

        if (slabType != SlabType.TOP && belowState.hasProperty(BlockStateProperties.SNOWY) && state.hasProperty(TYPE)
                && !ADBlockStateUtil.isBottomSlab(belowState)) {
            levelAccessor.setBlock(belowPos, belowState.setValue(BlockStateProperties.SNOWY, true), 3);
        }
    }
}
