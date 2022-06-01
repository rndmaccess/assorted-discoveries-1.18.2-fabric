package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADDesertVillagerPlushBlock extends ADVillagerPlushBlock {
    public ADDesertVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return ADVillagerPlushBlock.NORTH_DESERT_HAT_SHAPES;
    }
}
