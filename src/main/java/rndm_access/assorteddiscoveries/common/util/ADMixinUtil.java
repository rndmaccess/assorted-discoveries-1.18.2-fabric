package rndm_access.assorteddiscoveries.common.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.common.core.ADItems;

import java.util.Random;

/**
 * An assortment of methods used in assorted discoveries mixins.
 */
public final class ADMixinUtil {

    public static void dropSpruceCone(BlockState state, World world, BlockPos pos, Random random, float chance) {
        if(state.isOf(Blocks.SPRUCE_LEAVES) && random.nextFloat() <= chance) {
            Block.dropStack(world, pos, new ItemStack(ADItems.SPRUCE_CONE, 1));
        }
    }
}
