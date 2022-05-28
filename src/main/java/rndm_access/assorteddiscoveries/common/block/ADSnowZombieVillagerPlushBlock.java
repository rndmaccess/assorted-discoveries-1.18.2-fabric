package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADSnowZombieVillagerPlushBlock extends ADZombieVillagerPlushBlock {
    private static final VoxelShape NORTH_SHAPE;

    public ADSnowZombieVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder(ADZombieVillagerPlushBlock.NORTH_SHAPE)
                .addSnowVillagerHatShape().build();
    }
}
