package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADBeePlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_STINGER;
    protected static final VoxelShape NORTH_LEFT_WING;
    protected static final VoxelShape NORTH_RIGHT_WING;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_FRONT;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_BACK;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_FRONT;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_BACK;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG;
    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_WINGS;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADBeePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape northShape() {
        return NORTH_SHAPE;
    }

    @Override
    protected VoxelShape southShape() {
        return SOUTH_SHAPE;
    }

    @Override
    protected VoxelShape westShape() {
        return WEST_SHAPE;
    }

    @Override
    protected VoxelShape eastShape() {
        return EAST_SHAPE;
    }

    static {
        NORTH_BODY = Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D, 7.0D, 13.0D);
        NORTH_STINGER = Block.createCuboidShape(7.5D, 3.0D, 13.0D, 8.5D, 4.0D, 14.0D);
        NORTH_LEFT_WING = Block.createCuboidShape(9.0D, 7.0D, 4.0D, 14.0D, 8.0D, 9.0D);
        NORTH_RIGHT_WING = Block.createCuboidShape(2.0D, 7.0D, 4.0D, 7.0D, 8.0D, 9.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(3.5D, 2.0D, 1.5D, 7.0D, 5.0D, 4.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(9.0D, 2.0D, 1.5D, 12.5D, 5.0D, 4.0D);
        NORTH_FRONT_LEFT_LEG_FRONT = Block.createCuboidShape(12.0D, 0.0D, 4.0D, 14.0D, 1.0D, 5.0D);
        NORTH_FRONT_LEFT_LEG_BACK = Block.createCuboidShape(12.0D, 0.0D, 5.0D, 13.0D, 1.0D, 6.0D);
        NORTH_FRONT_RIGHT_LEG_FRONT = Block.createCuboidShape(2.0D, 0.0D, 4.0D, 4.0D, 1.0D, 5.0D);
        NORTH_FRONT_RIGHT_LEG_BACK = Block.createCuboidShape(3.0D, 0.0D, 5.0D, 4.0D, 1.0D, 6.0D);
        NORTH_BACK_LEFT_LEG = Block.createCuboidShape(12.0D, 0.0D, 11.0D, 13.0D, 1.0D, 12.0D);
        NORTH_BACK_RIGHT_LEG = Block.createCuboidShape(3.0D, 0.0D, 11.0D, 4.0D, 1.0D, 12.0D);
        NORTH_LEGS = VoxelShapes.union(NORTH_FRONT_LEFT_LEG_FRONT, NORTH_FRONT_LEFT_LEG_BACK,
                NORTH_FRONT_RIGHT_LEG_FRONT, NORTH_FRONT_RIGHT_LEG_BACK, NORTH_BACK_LEFT_LEG, NORTH_BACK_RIGHT_LEG);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_WINGS = VoxelShapes.union(NORTH_LEFT_WING, NORTH_RIGHT_WING);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_STINGER, NORTH_LEGS, NORTH_EYES,
                NORTH_WINGS);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
