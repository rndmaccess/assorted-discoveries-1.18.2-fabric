package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ADChickenPlushBlock extends ADAnimalPlushBlock {
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_RIGHT_WING_SHAPE;
    private static final VoxelShape NORTH_LEFT_WING_SHAPE;
    private static final VoxelShape NORTH_WATTLE_SHAPE;
    private static final VoxelShape NORTH_BEAK_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_RIGHT_FOOT_SHAPE;
    private static final VoxelShape NORTH_LEFT_FOOT_SHAPE;
    private static final VoxelShape NORTH_WING_SHAPES;
    private static final VoxelShape NORTH_MOUTH_SHAPES;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;

    public ADChickenPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineTorsoShape() {
        return NORTH_TORSO_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineHeadShape() {
        return NORTH_HEAD_SHAPE;
    }

    @Override
    protected VoxelShape getNorthOutlineMouthShape() {
        return NORTH_MOUTH_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineLegShape() {
        return NORTH_LEG_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineArmShape() {
        return NORTH_WING_SHAPES;
    }

    @Override
    protected VoxelShape getNorthOutlineEyeShape() {
        return NORTH_EYE_SHAPES;
    }

    static {
        NORTH_TORSO_SHAPE = Block.createCuboidShape(4.5D, 1.5D, 6.0D, 11.5D, 7.0D, 13.0D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 4.5D, 12.0D, 12.5D, 11.0D);
        NORTH_RIGHT_WING_SHAPE = Block.createCuboidShape(3.5D, 2.0D, 7.0D, 4.5D, 6.5D, 12.0D);
        NORTH_LEFT_WING_SHAPE = Block.createCuboidShape(11.5D, 2.0D, 7.0D, 12.5D, 6.5D, 12.0D);
        NORTH_WATTLE_SHAPE = Block.createCuboidShape(7.0D, 4.5D, 3.5D, 9.0D, 6.0D, 4.5D);
        NORTH_BEAK_SHAPE = Block.createCuboidShape(7.0D, 6.0D, 3.0D, 9.0D, 7.5D, 4.5D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 8.0D, 4.0D, 11.0D, 10.0D, 4.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 8.0D, 4.0D, 7.0D, 10.0D, 4.5D);
        NORTH_RIGHT_LEG_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 9.0D, 7.5D, 1.5D, 10.0D);
        NORTH_LEFT_LEG_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 9.0D, 11.0D, 1.5D, 10.0D);
        NORTH_RIGHT_FOOT_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 8.0D, 7.5D, 1.0D, 9.0D);
        NORTH_LEFT_FOOT_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 11.0D, 1.0D, 9.0D);
        NORTH_WING_SHAPES = VoxelShapes.union(NORTH_RIGHT_WING_SHAPE, NORTH_LEFT_WING_SHAPE);
        NORTH_MOUTH_SHAPES = VoxelShapes.union(NORTH_WATTLE_SHAPE, NORTH_BEAK_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_RIGHT_LEG_SHAPE, NORTH_LEFT_LEG_SHAPE,
                NORTH_RIGHT_FOOT_SHAPE, NORTH_LEFT_FOOT_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
    }
}
