package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADGrassSlabBlock extends ADSnowyDirtSlabBlock {
    public ADGrassSlabBlock(Properties properties) {
        super(properties);
    }

    public static boolean canBeGrass(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos abovepos = pos.above();
        BlockState aboveState = levelReader.getBlockState(abovepos);

        if (aboveState.is(BlockTags.SNOW)) {
            return true;
        } else if (aboveState.getFluidState().getAmount() == 8) {
            return false;
        } else {
            return !aboveState.isSolidRender(levelReader, abovepos) || ADBlockStateUtil.isBottomSlab(state);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerLevel serverLevel, BlockPos pos, Random random) {
        if (!canBeGrass(state, serverLevel, pos)) {

            BlockState stateAt = serverLevel.getBlockState(pos);
            serverLevel.setBlockAndUpdate(pos,
                    ADBlocks.DIRT_SLAB.get().defaultBlockState().setValue(TYPE, stateAt.getValue(TYPE)));
        }
    }
}
