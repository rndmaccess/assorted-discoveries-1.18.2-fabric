package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADCatPlushBlock extends ADDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE;

    public ADCatPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addCatHeadShape().addCatTorsoShape().addCatEarShapes()
                .addCatEyeShapes().addCatLegShapes().addCatSnoutShape().build();
    }
}
