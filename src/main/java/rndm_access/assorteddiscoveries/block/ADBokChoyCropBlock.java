package rndm_access.assorteddiscoveries.block;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import rndm_access.assorteddiscoveries.common.core.ADItems;

public class ADBokChoyCropBlock extends CropBlock {

    public ADBokChoyCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ADItems.BOK_CHOY_SEEDS.get();
    }
}
