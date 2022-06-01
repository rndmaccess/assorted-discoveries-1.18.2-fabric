package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADZombifiedPiglinPlushBlock extends ADZombiePlushBlock {
    private static final VoxelShape NORTH_SNOUT_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EAR_SHAPE;
    private static final VoxelShape NORTH_LEFT_EAR_SHAPE;
    private static final VoxelShape NORTH_EAR_SHAPES;

    public ADZombifiedPiglinPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthNoseOutlineShape() {
        return NORTH_SNOUT_SHAPE;
    }

    @Override
    protected VoxelShape getNorthEarOutlineShape() {
        return NORTH_EAR_SHAPES;
    }

    static {
        NORTH_SNOUT_SHAPE = Block.createCuboidShape(6.0D, 8.0D, 4.0D, 10.0D, 10.0D, 5.0D);
        NORTH_RIGHT_EAR_SHAPE = Block.createCuboidShape(1.5D, 9.0D, 8.0D, 3.5D, 12.0D, 12.0D);
        NORTH_LEFT_EAR_SHAPE = Block.createCuboidShape(11.5D, 9.0D, 8.0D, 14.0D, 12.0D, 12.0D);
        NORTH_EAR_SHAPES = VoxelShapes.union(NORTH_RIGHT_EAR_SHAPE, NORTH_LEFT_EAR_SHAPE);
    }
}
