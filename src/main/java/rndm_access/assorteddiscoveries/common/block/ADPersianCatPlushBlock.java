package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADPersianCatPlushBlock extends ADCatPlushBlock {
    private static final VoxelShape NORTH_NOSE_SHAPE;

    public ADPersianCatPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_NOSE_SHAPE;
    }

    static {
        NORTH_NOSE_SHAPE = Block.createCuboidShape(7.5D, 4.5D, 0.5D, 8.5D, 5.5D, 1.0D);
    }
}
