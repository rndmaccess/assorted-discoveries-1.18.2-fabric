package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADCatPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG;
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_RIGHT_EAR;
    protected static final VoxelShape NORTH_LEFT_EAR;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_NOSE;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG;
    protected static final VoxelShape NORTH_TAIL1_PIECE;
    protected static final VoxelShape NORTH_TAIL2_PIECE;

    protected static final VoxelShape NORTH_LEGS;
    protected static final VoxelShape NORTH_TAIL;
    protected static final VoxelShape NORTH_EARS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADCatPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_FRONT_RIGHT_LEG = Block.createCuboidShape(9.0D, 0.0D, 7.5D, 10.0D, 2.0D, 8.5D);
        NORTH_FRONT_LEFT_LEG = Block.createCuboidShape(6.0D, 0.0D, 7.5D, 7.0D, 2.0D, 8.5D);
        NORTH_TORSO = Block.createCuboidShape(5.5D, 2.0D, 6.0D, 10.5D, 6.0D, 11.5D);
        NORTH_HEAD = Block.createCuboidShape(5.0D, 3.0D, 1.0D, 11.0D, 8.5D, 6.0D);
        NORTH_RIGHT_EAR = Block.createCuboidShape(9.0D, 8.5D, 4.0D, 10.0D, 9.5D, 6.0D);
        NORTH_LEFT_EAR = Block.createCuboidShape(6.0D, 8.5D, 4.0D, 7.0D, 9.5D, 6.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(8.5D, 6.0D, 0.5D, 10.5D, 7.0D, 1.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(5.5D, 6.0D, 0.5D, 7.5D, 7.0D, 1.0D);
        NORTH_NOSE = Block.createCuboidShape(6.5D, 3.5D, 0.0D, 9.5D, 5.5D, 1.0D);
        NORTH_BACK_RIGHT_LEG = Block.createCuboidShape(9.0D, 0.0D, 10.0D, 10.0D, 2.0D, 11.0D);
        NORTH_BACK_LEFT_LEG = Block.createCuboidShape(6.0D, 0.0D, 10.0D, 7.0D, 2.0D, 11.0D);
        NORTH_TAIL1_PIECE = Block.createCuboidShape(7.5D, 3.0D, 11.5D, 8.5D, 4.0D, 14.0D);
        NORTH_TAIL2_PIECE = Block.createCuboidShape(7.5D, 2.0D, 13.0D, 8.5D, 3.0D, 16.0D);

        NORTH_LEGS = VoxelShapes.union(NORTH_FRONT_RIGHT_LEG, NORTH_FRONT_LEFT_LEG,
                NORTH_BACK_RIGHT_LEG, NORTH_BACK_LEFT_LEG);
        NORTH_TAIL = VoxelShapes.union(NORTH_TAIL1_PIECE, NORTH_TAIL2_PIECE);
        NORTH_EARS = VoxelShapes.union(NORTH_RIGHT_EAR, NORTH_LEFT_EAR);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_BODY = VoxelShapes.union(NORTH_TORSO, NORTH_HEAD, NORTH_LEGS, NORTH_TAIL,
                NORTH_EARS, NORTH_EYES);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_NOSE);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
