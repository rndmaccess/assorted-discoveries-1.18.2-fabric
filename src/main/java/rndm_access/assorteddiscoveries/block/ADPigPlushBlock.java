package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADPigPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_SNOUT;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_BACK_LEG;
    protected static final VoxelShape NORTH_RIGHT_BACK_LEG;
    protected static final VoxelShape NORTH_LEFT_FRONT_LEG;
    protected static final VoxelShape NORTH_RIGHT_FRONT_LEG;
    protected static final VoxelShape NORTH_TAIL_BOTTOM;
    protected static final VoxelShape NORTH_TAIL_SIDE;
    protected static final VoxelShape NORTH_TAIL_TOP;
    protected static final VoxelShape NORTH_TAIL_TWIRL_START;
    protected static final VoxelShape NORTH_TAIL_TWIRL_END;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_TAIL;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADPigPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_BODY = Block.createCuboidShape(4.0D, 3.0D, 4.0D, 12.0D, 9.0D, 14.0D);
        NORTH_HEAD = Block.createCuboidShape(4.5D, 6.0D, 2.0D, 11.5D, 12.0D, 7.5D);
        NORTH_SNOUT = Block.createCuboidShape(6.5D, 6.5D, 1.0D, 9.5D, 8.5D, 2.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.5D, 9.0D, 1.5D, 10.5D, 11.0D, 2.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 9.0D, 1.5D, 7.5D, 11.0D, 2.0D);
        NORTH_LEFT_BACK_LEG = Block.createCuboidShape(10.0D, 0.0D, 12.0D, 12.0D, 3.0D, 14.0D);
        NORTH_RIGHT_BACK_LEG = Block.createCuboidShape(4.0D, 0.0D, 12.0D, 6.0D, 3.0D, 14.0D);
        NORTH_LEFT_FRONT_LEG = Block.createCuboidShape(10.0D, 0.0D, 4.0D, 12.0D, 3.0D, 6.0D);
        NORTH_RIGHT_FRONT_LEG = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 6.0D, 3.0D, 6.0D);
        NORTH_TAIL_BOTTOM = Block.createCuboidShape(6.5D, 3.5D, 14.0D, 10.0D, 4.5D, 15.0D);
        NORTH_TAIL_SIDE = Block.createCuboidShape(10.0D, 4.5D, 14.0D, 11.0D, 7.5D, 15.0D);
        NORTH_TAIL_TOP = Block.createCuboidShape(7.0D, 7.5D, 14.0D, 10.0D, 8.5D, 15.0D);
        NORTH_TAIL_TWIRL_START = Block.createCuboidShape(6.0D, 6.5D, 14.0D, 7.0D, 7.5D, 15.0D);
        NORTH_TAIL_TWIRL_END = Block.createCuboidShape(7.0D, 5.5D, 14.0D, 8.0D, 6.5D, 15.0D);
        NORTH_EYES = VoxelShapes.union(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
        NORTH_LEGS = VoxelShapes.union(NORTH_LEFT_BACK_LEG, NORTH_RIGHT_BACK_LEG, NORTH_LEFT_FRONT_LEG, NORTH_RIGHT_FRONT_LEG);
        NORTH_TAIL = VoxelShapes.union(NORTH_TAIL_BOTTOM, NORTH_TAIL_SIDE, NORTH_TAIL_TOP, NORTH_TAIL_TWIRL_START, NORTH_TAIL_TWIRL_END);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_HEAD, NORTH_SNOUT, NORTH_EYES, NORTH_LEGS, NORTH_TAIL);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
