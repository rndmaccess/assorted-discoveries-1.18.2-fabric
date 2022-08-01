package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADSheepPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D,
            12.0D, 14.0D);

    public ADSheepPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }
}