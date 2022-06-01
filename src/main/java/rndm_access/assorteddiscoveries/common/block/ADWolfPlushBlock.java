package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADWolfPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_TAIL_SHAPE;
    private static final VoxelShape NORTH_LEFT_EAR_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EAR_SHAPE;
    private static final VoxelShape NORTH_EAR_SHAPES;

    public ADWolfPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineTailShape() {
        return NORTH_TAIL_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineEarShape() {
        return NORTH_EAR_SHAPES;
    }

    static {
        NORTH_TAIL_SHAPE = Block.createCuboidShape(7.0D, 2.5D, 14.0D, 9.0D, 8.0D, 16.0D);
        NORTH_LEFT_EAR_SHAPE = Block.createCuboidShape(9.0D, 13.0D, 3.0D, 12.0D, 15.0D, 5.0D);
        NORTH_RIGHT_EAR_SHAPE = Block.createCuboidShape(4.0D, 13.0D, 3.0D, 7.0D, 15.0D, 5.0D);
        NORTH_EAR_SHAPES = VoxelShapes.union(NORTH_LEFT_EAR_SHAPE, NORTH_RIGHT_EAR_SHAPE);
    }
}
