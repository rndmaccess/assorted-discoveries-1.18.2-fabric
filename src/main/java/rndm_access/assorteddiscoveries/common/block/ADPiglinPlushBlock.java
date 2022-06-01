package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADPiglinPlushBlock extends ADZombifiedPiglinPlushBlock {
    private static final VoxelShape NORTH_LEFT_ARM_SHAPE;
    private static final VoxelShape NORTH_RIGHT_ARM_SHAPE;
    private static final VoxelShape NORTH_ARM_SHAPES;

    public ADPiglinPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthArmOutlineShape() {
        return NORTH_ARM_SHAPES;
    }

    static {
        NORTH_LEFT_ARM_SHAPE = Block.createCuboidShape(12.0D, 3.0D, 7.5D, 14.5D, 8.0D, 10.5D);
        NORTH_RIGHT_ARM_SHAPE = Block.createCuboidShape(1.5D, 3.0D, 7.5D, 4.0D, 8.0D, 10.5D);
        NORTH_ARM_SHAPES = VoxelShapes.union(NORTH_LEFT_ARM_SHAPE, NORTH_RIGHT_ARM_SHAPE);
    }
}
