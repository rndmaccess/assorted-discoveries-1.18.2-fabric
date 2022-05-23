package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADDirtSlabBlock extends SlabBlock implements Fertilizable {
    public ADDirtSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        world.setBlockState(pos, ADBlocks.GRASS_SLAB.getDefaultState().with(TYPE, state.get(TYPE))
                .with(ADGrassSlabBlock.SNOWY, ADGrassSlabBlock.isSnow(world, blockPos, blockState)));
    }
}
