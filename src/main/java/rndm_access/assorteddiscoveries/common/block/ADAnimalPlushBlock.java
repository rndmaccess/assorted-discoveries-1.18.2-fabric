package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

/**
 * This class has a bunch of default animal outline shapes that assorted discoveries uses often.
 */
public class ADAnimalPlushBlock extends ADAbstractAnimalPlushBlock {
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_SNOUT_SHAPE;
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;

    public ADAnimalPlushBlock(Settings settings) {
        super(settings);
    }

    protected VoxelShape getNorthOutlineTorsoShape() {
        return NORTH_TORSO_SHAPE;
    }

    protected VoxelShape getNorthOutlineHeadShape() {
        return NORTH_HEAD_SHAPE;
    }

    protected VoxelShape getNorthOutlineLegShape() {
        return NORTH_LEG_SHAPES;
    }

    protected VoxelShape getNorthOutlineEyeShape() {
        return NORTH_EYE_SHAPES;
    }

    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_SNOUT_SHAPE;
    }

    protected VoxelShape getNorthOutlineEarShape() {
        return VoxelShapes.empty();
    }

    protected VoxelShape getNorthOutlineTailShape() {
        return VoxelShapes.empty();
    }

    protected VoxelShape getNorthOutlineArmShape() {
        return VoxelShapes.empty();
    }

    static {
        NORTH_TORSO_SHAPE = Block.createCuboidShape(4.5D, 2.5D, 4.5D, 11.5D, 9.0D, 14.5D);
        NORTH_SNOUT_SHAPE = Block.createCuboidShape(6.0D, 6.0D, 0.5D, 10.0D, 8.0D, 1.5D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 1.5D, 12.0D, 13.0D, 9.5D);
        NORTH_FRONT_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 4.5D, 7.0D, 2.5D, 7.0D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 0.0D, 12.0D, 11.5D, 2.5D, 14.5D);
        NORTH_FRONT_LEFT_LEG_SHAPE = Block.createCuboidShape(9.0D, 0.0D, 4.5D, 11.5D, 2.5D, 7.0D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 12.0D, 7.0D, 2.5D, 14.5D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 9.0D, 1.0D, 11.0D, 11.0D, 1.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 9.0D, 1.0D, 7.0D, 11.0D, 1.5D);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG_SHAPE, NORTH_BACK_LEFT_LEG_SHAPE,
                NORTH_FRONT_LEFT_LEG_SHAPE, NORTH_BACK_RIGHT_LEG_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
    }
}
