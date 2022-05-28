package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADSlimePlushBlock extends ADMagmaCubePlushBlock {
    private static final VoxelShape BOTTOM_NORTH_SHAPE;
    private static final VoxelShape MIDDLE_NORTH_SHAPE;
    private static final VoxelShape TOP_NORTH_SHAPE;

    public ADSlimePlushBlock(AbstractBlock.Settings settings) {
        super(settings, BOTTOM_NORTH_SHAPE, MIDDLE_NORTH_SHAPE, TOP_NORTH_SHAPE);
    }

    static {
        BOTTOM_NORTH_SHAPE = new ADPlushOutlineShapeBuilder(ADMagmaCubePlushBlock.BOTTOM_NORTH_SHAPE)
                .addBottomSlimeMouthShape().build();
        MIDDLE_NORTH_SHAPE = new ADPlushOutlineShapeBuilder(ADMagmaCubePlushBlock.MIDDLE_NORTH_SHAPE)
                .addBottomSlimeMouthShape().addMiddleSlimeMouthShape().build();
        TOP_NORTH_SHAPE = new ADPlushOutlineShapeBuilder(ADMagmaCubePlushBlock.TOP_NORTH_SHAPE)
                .addTopSlimeMouthShape().build();
    }
}
