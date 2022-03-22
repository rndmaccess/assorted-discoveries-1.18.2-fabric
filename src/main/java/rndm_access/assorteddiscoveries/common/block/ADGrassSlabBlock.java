package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADGrassSlabBlock extends ADSnowyDirtSlabBlock {
    public ADGrassSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public static boolean canBeGrass(BlockState state, WorldView world, BlockPos pos) {
        BlockPos abovepos = pos.up();
        BlockState aboveState = world.getBlockState(abovepos);

        if (aboveState.isIn(BlockTags.SNOW)) {
            return true;
        } else if (aboveState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            return !aboveState.isSolidBlock(world, abovepos) || state.get(TYPE).equals(SlabType.BOTTOM);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canBeGrass(state, world, pos)) {

            BlockState stateAt = world.getBlockState(pos);
            world.setBlockState(pos, ADBlocks.DIRT_SLAB.getDefaultState().with(TYPE, stateAt.get(TYPE)));
        }
    }
}
