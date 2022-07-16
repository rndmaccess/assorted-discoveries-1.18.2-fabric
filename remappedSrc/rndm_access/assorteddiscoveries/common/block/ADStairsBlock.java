package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

/**
 * This class provides a public constructor, so I can add stairs.
 */
public class ADStairsBlock extends StairsBlock {
    public ADStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }
}
