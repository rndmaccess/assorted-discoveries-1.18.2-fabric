package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;

public class ADSavannaVillagerPlushBlock extends ADVillagerPlushBlock {
    public ADSavannaVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return ADVillagerPlushBlock.NORTH_SAVANNA_HEADBAND_SHAPE;
    }
}
