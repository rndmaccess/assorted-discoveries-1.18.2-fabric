package rndm_access.assorteddiscoveries.common.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import rndm_access.assorteddiscoveries.common.core.ADBlockTags;
import rndm_access.assorteddiscoveries.common.core.ADItems;

import java.util.Random;

/**
 * An assortment of methods used in assorted discoveries block states.
 */
public final class ADBlockStateUtil {

    public static void dropSpruceCone(BlockState state, World world, BlockPos pos, Random random, float chance) {
        if(state.isOf(Blocks.SPRUCE_LEAVES) && random.nextFloat() <= chance) {
            Block.dropStack(world, pos, new ItemStack(ADItems.SPRUCE_CONE, 1));
        }
    }

    public static boolean isSnowSlabOrStairs(WorldAccess world, BlockPos pos, BlockState state) {
        boolean isCovered = state.isSideSolidFullSquare(world, pos, Direction.DOWN);
        return state.isIn(ADBlockTags.SNOW_STAIRS) && isCovered || state.isIn(ADBlockTags.SNOW_SLABS) && isCovered;
    }
}