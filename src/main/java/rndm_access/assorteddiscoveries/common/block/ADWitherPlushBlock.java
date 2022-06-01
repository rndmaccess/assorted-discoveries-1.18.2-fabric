package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADWitherPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_MOUTH_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_MAIN_TORSO_SHAPE;
    private static final VoxelShape NORTH_TORSO_BEND_SHAPE;
    private static final VoxelShape NORTH_TOP_SPIKE_SHAPE;
    private static final VoxelShape NORTH_BOTTOM_SPIKE_SHAPE;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_TORSO_SHAPES;
    private static final VoxelShape NORTH_SPIKE_SHAPES;
    private static final VoxelShape NORTH_SHAPES;

    public ADWitherPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPES;
    }

    static {
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0, 8.0, 4.0, 12.0, 16.0, 12.0);
        NORTH_MOUTH_SHAPE = Block.createCuboidShape(6.5, 10.0, 3.5, 9.5, 11.0, 4.0);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0, 12.0, 3.5, 7.0, 14.0, 4.0);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0, 12.0, 3.5, 11.0, 14.0, 4.0);
        NORTH_MAIN_TORSO_SHAPE = Block.createCuboidShape(6.5, 2.0, 6.5, 9.5, 8.0, 9.0);
        NORTH_TORSO_BEND_SHAPE = Block.createCuboidShape(6.5, 0.0, 6.5, 9.5, 4.0, 10.5);
        NORTH_TOP_SPIKE_SHAPE = Block.createCuboidShape(3.0, 5.0, 6.5, 13.0, 7.0, 9.0);
        NORTH_BOTTOM_SPIKE_SHAPE = Block.createCuboidShape(3.0, 2.0, 6.5, 13.0, 4.0, 9.0);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_TORSO_SHAPES = VoxelShapes.union(NORTH_MAIN_TORSO_SHAPE, NORTH_TORSO_BEND_SHAPE);
        NORTH_SPIKE_SHAPES = VoxelShapes.union(NORTH_TOP_SPIKE_SHAPE, NORTH_BOTTOM_SPIKE_SHAPE);
        NORTH_SHAPES = VoxelShapes.union(NORTH_HEAD_SHAPE, NORTH_MOUTH_SHAPE,
                NORTH_EYE_SHAPES, NORTH_TORSO_SHAPES, NORTH_SPIKE_SHAPES);
    }
}
