package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADWolfPlushBlock extends ADDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE;

    public ADWolfPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addAnimalTorsoShape().addAnimalLegShapes().addAnimalEyeShapes().addAnimalSnoutShape()
                .addAnimalHeadShape().addWolfEarShapes().addWolfTailShape().build();
    }
}
