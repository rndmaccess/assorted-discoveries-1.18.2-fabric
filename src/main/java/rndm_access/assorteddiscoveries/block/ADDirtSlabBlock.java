package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADDirtSlabBlock extends ADSoilSlabBlock {
    public ADDirtSlabBlock(Properties properties) {
        super(properties);
    }

    private static boolean canPropagate(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos blockpos = pos.above();
        return ADGrassSlabBlock.canBeGrass(state, levelReader, pos)
                && !levelReader.getFluidState(blockpos).is(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel serverLevel, BlockPos pos, Random random) {
        if (serverLevel.getMaxLocalRawBrightness(pos.above()) >= 9) {
            BlockState blockstate = ADBlocks.GRASS_SLAB.get().defaultBlockState();

            for (int i = 0; i < 4; ++i) {
                BlockPos atPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockPos abovePos = atPos.above();
                BlockState stateAt = serverLevel.getBlockState(atPos);

                if (stateAt.is(ADBlocks.GRASS_SLAB.get())
                        || stateAt.is(Blocks.GRASS_BLOCK) && canPropagate(blockstate, serverLevel, atPos)) {
                    serverLevel.setBlockAndUpdate(pos,
                            blockstate.setValue(TYPE, state.getValue(TYPE)).setValue(ADSnowyDirtSlabBlock.SNOWY,
                                    Boolean.valueOf(serverLevel.getBlockState(abovePos).is(Blocks.SNOW))));
                }
            }
        }
    }
}
