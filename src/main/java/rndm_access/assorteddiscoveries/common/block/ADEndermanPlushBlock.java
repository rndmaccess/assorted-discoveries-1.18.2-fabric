package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;

public class ADEndermanPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 13.0D,
            12.5D, 14.0D);

    public ADEndermanPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape northOutlineShape() {
        return NORTH_SHAPE;
    }
}
