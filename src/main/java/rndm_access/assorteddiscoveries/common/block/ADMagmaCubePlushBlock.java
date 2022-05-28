package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADMagmaCubePlushBlock extends ADDirectionalTallPlushBlock {
    protected static final VoxelShape BOTTOM_NORTH_SHAPE;
    protected static final VoxelShape MIDDLE_NORTH_SHAPE;
    protected static final VoxelShape TOP_NORTH_SHAPE;

    public ADMagmaCubePlushBlock(AbstractBlock.Settings settings, VoxelShape bottomNorthShape,
                                 VoxelShape middleNorthShape, VoxelShape topNorthShape) {
        super(settings, bottomNorthShape, middleNorthShape, topNorthShape);
    }

    public ADMagmaCubePlushBlock(AbstractBlock.Settings settings) {
        super(settings, BOTTOM_NORTH_SHAPE, MIDDLE_NORTH_SHAPE, TOP_NORTH_SHAPE);
    }

    static {
        BOTTOM_NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addBottomMagmaCubeBodyShape().addBottomMagmaCubeEyeShapes().build();
        MIDDLE_NORTH_SHAPE = new ADPlushOutlineShapeBuilder(BOTTOM_NORTH_SHAPE).addMiddleMagmaCubeBodyShape().addMiddleMagmaCubeEyeShapes().build();
        TOP_NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addTopMagmaCubeBodyShape().addTopMagmaCubeEyeShapes().build();
    }
}