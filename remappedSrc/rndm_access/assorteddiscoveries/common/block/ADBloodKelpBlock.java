package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADBloodKelpBlock extends KelpBlock {

    public ADBloodKelpBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return ADBlocks.BLOOD_KELP_PLANT;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockpos = pos.offset(this.growthDirection);

        if (state.get(AGE) < 25) {
            ADBloodKelpPlantBlock plant = (ADBloodKelpPlantBlock) this.getPlant();
            if (this.chooseStemState(world.getBlockState(blockpos))) {
                plant.growSpores(world, pos, random);
                world.setBlockState(blockpos, this.age(state, world.random));
            }
        }
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        ADBloodKelpPlantBlock plant = (ADBloodKelpPlantBlock) this.getPlant();
        super.grow(world, random, pos, state);
        plant.growSpores(world, pos, random);
    }
}
