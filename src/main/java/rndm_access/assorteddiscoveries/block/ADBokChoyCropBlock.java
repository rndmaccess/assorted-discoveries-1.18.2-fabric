package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import rndm_access.assorteddiscoveries.common.core.ADItems;
import rndm_access.assorteddiscoveries.core.ADItems;

public class ADBokChoyCropBlock extends CropBlock {

    public ADBokChoyCropBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ADItems.BOK_CHOY_SEEDS;
    }
}
