package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADSquidPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape BODY_SHAPE;
    protected static final VoxelShape MOUTH_SHAPE;
    protected static final VoxelShape LEG1_SHAPE;
    protected static final VoxelShape LEG2_SHAPE;
    protected static final VoxelShape LEG3_SHAPE;
    protected static final VoxelShape LEG4_SHAPE;
    protected static final VoxelShape LEG5_SHAPE;
    protected static final VoxelShape LEG6_SHAPE;
    protected static final VoxelShape LEG7_SHAPE;
    protected static final VoxelShape LEG8_SHAPE;
    protected static final VoxelShape LEG9_SHAPE;
    protected static final VoxelShape LEG10_SHAPE;
    protected static final VoxelShape LEG11_SHAPE;
    protected static final VoxelShape LEG12_SHAPE;
    protected static final VoxelShape TOOTH1_SHAPE;
    protected static final VoxelShape TOOTH2_SHAPE;
    protected static final VoxelShape TOOTH3_SHAPE;
    protected static final VoxelShape TOOTH4_SHAPE;
    protected static final VoxelShape TOOTH5_SHAPE;
    protected static final VoxelShape TOOTH6_SHAPE;
    protected static final VoxelShape TOOTH7_SHAPE;
    protected static final VoxelShape TOOTH8_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape LEGS_SHAPE;
    protected static final VoxelShape TEETH_SHAPE;
    protected static final VoxelShape NORTH_EYES_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADSquidPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPE;
    }

    @Override
    protected VoxelShape getSouthOutlineShape() {
        return SOUTH_SHAPE;
    }

    @Override
    protected VoxelShape getWestOutlineShape() {
        return WEST_SHAPE;
    }

    @Override
    protected VoxelShape getEastOutlineShape() {
        return EAST_SHAPE;
    }

    static {
        BODY_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 4.0D, 12.0D, 15.0D, 12.0D);
        MOUTH_SHAPE = Block.createCuboidShape(6.0D, 4.5D, 6.0D, 10.0D, 5.0D, 10.0D);
        LEG1_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 10.5D, 11.5D, 5.0D, 11.5D);
        LEG2_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 8.5D, 11.5D, 5.0D, 9.5D);
        LEG3_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 6.5D, 11.5D, 5.0D, 7.5D);
        LEG4_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 4.5D, 11.5D, 5.0D, 5.5D);
        LEG5_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 4.5D, 9.5D, 5.0D, 5.5D);
        LEG6_SHAPE = Block.createCuboidShape(6.5D, 0.0D, 4.5D, 7.5D, 5.0D, 5.5D);
        LEG7_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 4.5D, 5.5D, 5.0D, 5.5D);
        LEG8_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 6.5D, 5.5D, 5.0D, 7.5D);
        LEG9_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 8.5D, 5.5D, 5.0D, 9.5D);
        LEG10_SHAPE = Block.createCuboidShape(4.5D, 0.0D, 10.5D, 5.5D, 5.0D, 11.5D);
        LEG11_SHAPE = Block.createCuboidShape(6.5D, 0.0D, 10.5D, 7.5D, 5.0D, 11.5D);
        LEG12_SHAPE = Block.createCuboidShape(8.5D, 0.0D, 10.5D, 9.5D, 5.0D, 11.5D);
        TOOTH1_SHAPE = Block.createCuboidShape(9.0D, 4.0D, 9.0D, 10.0D, 4.5D, 10.0D);
        TOOTH2_SHAPE = Block.createCuboidShape(7.5D, 4.0D, 9.0D, 8.5D, 4.5D, 10.0D);
        TOOTH3_SHAPE = Block.createCuboidShape(6.0D, 4.0D, 9.0D, 7.0D, 4.5D, 10.0D);
        TOOTH4_SHAPE = Block.createCuboidShape(6.0D, 4.0D, 7.5D, 7.0D, 4.5D, 8.5D);
        TOOTH5_SHAPE = Block.createCuboidShape(6.0D, 4.0D, 6.0D, 7.0D, 4.5D, 7.0D);
        TOOTH6_SHAPE = Block.createCuboidShape(7.5D, 4.0D, 6.0D, 8.5D, 4.5D, 7.0D);
        TOOTH7_SHAPE = Block.createCuboidShape(9.0D, 4.0D, 6.0D, 10.0D, 4.5D, 7.0D);
        TOOTH8_SHAPE = Block.createCuboidShape(9.0D, 4.0D, 7.5D, 10.0D, 4.5D, 8.5D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(9.5D, 10.0D, 3.5D, 11.5D, 12.0D, 4.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(4.5D, 10.0D, 3.5D, 6.5D, 12.0D, 4.0D);
        LEGS_SHAPE = VoxelShapes.union(LEG1_SHAPE, LEG2_SHAPE, LEG3_SHAPE, LEG4_SHAPE, LEG5_SHAPE,
                LEG6_SHAPE, LEG7_SHAPE, LEG8_SHAPE, LEG9_SHAPE, LEG10_SHAPE, LEG11_SHAPE, LEG12_SHAPE);
        TEETH_SHAPE = VoxelShapes.union(TOOTH1_SHAPE, TOOTH2_SHAPE, TOOTH3_SHAPE, TOOTH4_SHAPE,
                TOOTH5_SHAPE, TOOTH6_SHAPE, TOOTH7_SHAPE, TOOTH8_SHAPE);
        NORTH_EYES_SHAPE = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(BODY_SHAPE, MOUTH_SHAPE, LEGS_SHAPE, TEETH_SHAPE,
                NORTH_EYES_SHAPE);
        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
