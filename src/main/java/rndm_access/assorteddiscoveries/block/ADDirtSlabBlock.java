package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import rndm_access.assorteddiscoveries.core.ADBlocks;

public class ADDirtSlabBlock extends ADSoilSlabBlock {
    public ADDirtSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockpos = pos.up();
        return ADGrassSlabBlock.canBeGrass(state, world, pos)
                && !world.getFluidState(blockpos).isIn(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(pos.up()) >= 9) {
            BlockState blockstate = ADBlocks.GRASS_SLAB.defaultBlockState();

            for (int i = 0; i < 4; ++i) {
                BlockPos atPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockPos abovePos = atPos.up();
                BlockState stateAt = world.getBlockState(atPos);

                if (stateAt.isOf(ADBlocks.GRASS_SLAB) || stateAt.isOf(Blocks.GRASS_BLOCK) && canSpread(blockstate, world, atPos)) {
                    world.setBlockState(pos, blockstate.with(TYPE, state.get(TYPE)).with(ADSnowyDirtSlabBlock.SNOWY, Boolean.valueOf(world.getBlockState(abovePos).isOf(Blocks.SNOW))));
                }
            }
        }
    }
}
