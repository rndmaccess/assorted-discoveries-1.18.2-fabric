package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADSlimePlushBlock extends ADMagmaCubePlushBlock {
    private static final VoxelShape NORTH_BOTTOM_MOUTH_SHAPE;
    private static final VoxelShape NORTH_MIDDLE_MOUTH_SHAPE;
    private static final VoxelShape NORTH_TOP_MOUTH_SHAPE;

    public ADSlimePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthBottomOutlineShape() {
        return VoxelShapes.union(super.getNorthBottomOutlineShape(), NORTH_BOTTOM_MOUTH_SHAPE);
    }

    @Override
    public VoxelShape getNorthMiddleOutlineShape() {
        return VoxelShapes.union(super.getNorthMiddleOutlineShape(), NORTH_BOTTOM_MOUTH_SHAPE, NORTH_MIDDLE_MOUTH_SHAPE);
    }

    @Override
    public VoxelShape getNorthTopOutlineShape() {
        return VoxelShapes.union(super.getNorthTopOutlineShape(), NORTH_TOP_MOUTH_SHAPE);
    }

    static {
        NORTH_BOTTOM_MOUTH_SHAPE = Block.createCuboidShape(6.0D, 2.0D, 2.5D, 7.0D, 3.0D, 3.0D);
        NORTH_MIDDLE_MOUTH_SHAPE = Block.createCuboidShape(6.5D, 10.5D, 3.5D, 7.5D, 11.5D, 4.0D);
        NORTH_TOP_MOUTH_SHAPE = Block.createCuboidShape(7.0D, 1.0D, 5.5D, 7.5D, 1.5D, 6.0D);
    }
}
