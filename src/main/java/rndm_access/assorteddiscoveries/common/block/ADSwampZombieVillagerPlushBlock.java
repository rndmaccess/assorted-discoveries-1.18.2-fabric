package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;

public class ADSwampZombieVillagerPlushBlock extends ADZombieVillagerPlushBlock {
    public ADSwampZombieVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return ADVillagerPlushBlock.NORTH_SWAMP_HAT_SHAPES;
    }
}
