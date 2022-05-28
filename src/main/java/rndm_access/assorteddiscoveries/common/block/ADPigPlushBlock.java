package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADPigPlushBlock extends ADDirectionalPlushBlock {
    public static final VoxelShape NORTH_SHAPE;

    public ADPigPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addAnimalEyeShapes().addAnimalHeadShape()
                .addAnimalLegShapes().addAnimalTorsoShape().addAnimalSnoutShape().build();
    }
}
