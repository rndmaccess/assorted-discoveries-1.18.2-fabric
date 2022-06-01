package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;

public class ADGhastPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE;

    public ADGhastPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPE;
    }

    static {
        NORTH_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D);
    }
}
