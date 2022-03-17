package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.KelpBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADBloodKelpBlock extends KelpBlock {

    public ADBloodKelpBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ADBlocks.BLOOD_KELP_PLANT.get();
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        BlockPos blockpos = pos.relative(this.growthDirection);

        if (state.getValue(AGE) < 25 && ForgeHooks.onCropsGrowPre(level, blockpos, level.getBlockState(blockpos),
                random.nextDouble() < 0.14D)) {

            ADBloodKelpPlantBlock body = (ADBloodKelpPlantBlock) this.getBodyBlock();
            if (this.canGrowInto(level.getBlockState(blockpos))) {
                body.growSpores(level, pos, random);
                level.setBlockAndUpdate(blockpos, this.getGrowIntoState(state, level.random));
                ForgeHooks.onCropsGrowPost(level, blockpos, level.getBlockState(blockpos));
            }
        }
    }

    @Override
    public void performBonemeal(ServerLevel level, Random random, BlockPos pos, BlockState state) {
        ADBloodKelpPlantBlock body = (ADBloodKelpPlantBlock) this.getBodyBlock();
        super.performBonemeal(level, random, pos, state);
        body.growSpores(level, pos, random);
    }
}
