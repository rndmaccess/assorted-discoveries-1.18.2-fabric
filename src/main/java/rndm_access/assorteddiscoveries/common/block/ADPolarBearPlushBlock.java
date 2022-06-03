package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADPolarBearPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_LEFT_EAR_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EAR_SHAPE;
    private static final VoxelShape NORTH_EAR_SHAPES;

    public ADPolarBearPlushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineEarShape() {
        return NORTH_EAR_SHAPES;
    }

    static {
        NORTH_LEFT_EAR_SHAPE = Block.createCuboidShape(10.0D, 11.0D, 3.0D, 13.0D, 14.0D, 6.0D);
        NORTH_RIGHT_EAR_SHAPE = Block.createCuboidShape(3.0D, 11.0D, 3.0D, 6.0D, 14.0D, 6.0D);
        NORTH_EAR_SHAPES = VoxelShapes.union(NORTH_LEFT_EAR_SHAPE, NORTH_RIGHT_EAR_SHAPE);
    }
}
