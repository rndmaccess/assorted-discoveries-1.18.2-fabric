package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADMooshroomPlushBlock extends ADCowPlushBlock {
    private static final VoxelShape NORTH_HEAD_MUSHROOM_STEM_SHAPE;
    private static final VoxelShape NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE;
    private static final VoxelShape NORTH_HEAD_MUSHROOM_TOP_SHAPE;
    private static final VoxelShape NORTH_HEAD_MUSHROOM_SHAPE;

    public ADMooshroomPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineHeadShape() {
        return VoxelShapes.union(super.getNorthOutlineHeadShape(), NORTH_HEAD_MUSHROOM_SHAPE);
    }

    static {
        NORTH_HEAD_MUSHROOM_STEM_SHAPE = Block.createCuboidShape(7.5D, 13.0D, 6.0D, 8.5D, 14.0D, 7.0D);
        NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE = Block.createCuboidShape(6.0D, 14.0D, 4.5D, 10.0D, 15.0D, 8.5D);
        NORTH_HEAD_MUSHROOM_TOP_SHAPE = Block.createCuboidShape(7.0D, 15.0D, 5.5D, 9.0D, 16.0D, 7.5D);
        NORTH_HEAD_MUSHROOM_SHAPE = VoxelShapes.union(NORTH_HEAD_MUSHROOM_STEM_SHAPE,
                NORTH_HEAD_MUSHROOM_BOTTOM_SHAPE, NORTH_HEAD_MUSHROOM_TOP_SHAPE);
    }
}
