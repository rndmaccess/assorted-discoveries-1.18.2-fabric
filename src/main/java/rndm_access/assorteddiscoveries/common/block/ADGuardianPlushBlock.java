package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADGuardianPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_TAIL1;
    protected static final VoxelShape NORTH_TAIL2;
    protected static final VoxelShape NORTH_FIN1;
    protected static final VoxelShape NORTH_FIN2;
    protected static final VoxelShape NORTH_EYE_BALL;
    protected static final VoxelShape NORTH_EYE_BROW;
    protected static final VoxelShape NORTH_LEFT_TOP_HORN;
    protected static final VoxelShape NORTH_LEFT_BOTTOM_HORN;
    protected static final VoxelShape NORTH_RIGHT_TOP_HORN;
    protected static final VoxelShape NORTH_RIGHT_BOTTOM_HORN;
    protected static final VoxelShape NORTH_TAIL;
    protected static final VoxelShape NORTH_EYE;
    protected static final VoxelShape NORTH_HORNS;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADGuardianPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_BODY = Block.createCuboidShape(4.0D, 0.0D, 1.5D, 12.0D, 8.0D, 9.0D);
        NORTH_TAIL1 = Block.createCuboidShape(5.0D, 2.0D, 9.0D, 11.0D, 6.0D, 11.0D);
        NORTH_TAIL2 = Block.createCuboidShape(6.0D, 3.0D, 11.0D, 10.0D, 5.0D, 12.0D);
        NORTH_FIN1 = Block.createCuboidShape(7.0D, 2.0D, 12.0D, 9.0D, 6.0D, 13.0D);
        NORTH_FIN2 = Block.createCuboidShape(7.0D, 1.0D, 13.0D, 9.0D, 7.0D, 15.0D);
        NORTH_EYE_BALL = Block.createCuboidShape(6.5D, 3.0D, 1.0D, 9.5D, 6.0D, 1.5D);
        NORTH_EYE_BROW = Block.createCuboidShape(5.0D, 6.0D, 1.0D, 10.0D, 7.0D, 1.5D);
        NORTH_LEFT_TOP_HORN = Block.createCuboidShape(10.5D, 6.5D, 2.0D, 13.5D, 9.5D, 4.0D);
        NORTH_LEFT_BOTTOM_HORN = Block.createCuboidShape(12.0D, 0.0D, 2.0D, 13.5D, 3.0D, 4.0D);
        NORTH_RIGHT_TOP_HORN = Block.createCuboidShape(2.5D, 6.5D, 2.0D, 5.5D, 9.5D, 4.0D);
        NORTH_RIGHT_BOTTOM_HORN = Block.createCuboidShape(2.5D, 0.0D, 2.0D, 4.5D, 3.0D, 4.0D);
        NORTH_TAIL = VoxelShapes.union(NORTH_TAIL1, NORTH_TAIL2, NORTH_FIN1, NORTH_FIN2);
        NORTH_EYE = VoxelShapes.union(NORTH_EYE_BALL, NORTH_EYE_BROW);
        NORTH_HORNS = VoxelShapes.union(NORTH_LEFT_TOP_HORN, NORTH_LEFT_BOTTOM_HORN, NORTH_RIGHT_TOP_HORN,
                NORTH_RIGHT_BOTTOM_HORN);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_TAIL, NORTH_EYE, NORTH_HORNS);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
