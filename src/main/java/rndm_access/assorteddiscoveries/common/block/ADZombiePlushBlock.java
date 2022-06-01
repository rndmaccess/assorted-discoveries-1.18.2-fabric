package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADZombiePlushBlock extends ADAbstractHumanoidPlushBlock {
    private static final VoxelShape NORTH_HEAD_SHAPE;
    private static final VoxelShape NORTH_TORSO_SHAPE;
    private static final VoxelShape NORTH_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_LEFT_ARM_SHAPE;
    private static final VoxelShape NORTH_RIGHT_ARM_SHAPE;
    private static final VoxelShape NORTH_ARM_SHAPES;

    public ADZombiePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthNoseOutlineShape() {
        return VoxelShapes.empty();
    }

    @Override
    protected VoxelShape getNorthLegOutlineShape() {
        return NORTH_LEG_SHAPES;
    }

    @Override
    protected VoxelShape getNorthHeadOutlineShape() {
        return NORTH_HEAD_SHAPE;
    }

    @Override
    protected VoxelShape getNorthTorsoOutlineShape() {
        return NORTH_TORSO_SHAPE;
    }

    @Override
    protected VoxelShape getNorthEyeOutlineShape() {
        return NORTH_EYE_SHAPES;
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return VoxelShapes.empty();
    }

    @Override
    protected VoxelShape getNorthArmOutlineShape() {
        return NORTH_ARM_SHAPES;
    }

    @Override
    protected VoxelShape getNorthEarOutlineShape() {
        return VoxelShapes.empty();
    }

    static {
        NORTH_HEAD_SHAPE = Block.createCuboidShape(3.5D, 7.0D, 5.0D, 12.5D, 15.0D, 13.5D);
        NORTH_TORSO_SHAPE = Block.createCuboidShape(4.0D, 2.0D, 7.0D, 12.0D, 7.0D, 12.0D);
        NORTH_LEFT_LEG_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 11.5D, 2.0D, 11.0D);
        NORTH_RIGHT_LEG_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 8.0D, 7.5D, 2.0D, 11.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 11.0D, 4.5D, 11.0D, 13.0D, 5.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 11.0D, 4.5D, 7.0D, 13.0D, 5.0D);
        NORTH_LEFT_ARM_SHAPE = Block.createCuboidShape(11.0D, 5.0D, 3.0D, 14.0D, 8.0D, 10.5D);
        NORTH_RIGHT_ARM_SHAPE = Block.createCuboidShape(2.0D, 5.0D, 3.0D, 5.0D, 8.0D, 10.5D);
        NORTH_ARM_SHAPES = VoxelShapes.union(NORTH_LEFT_ARM_SHAPE, NORTH_RIGHT_ARM_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_LEFT_LEG_SHAPE, NORTH_RIGHT_LEG_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
    }
}
