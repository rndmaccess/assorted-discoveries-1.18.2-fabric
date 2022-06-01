package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADBeePlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_BODY_SHAPE;
    private static final VoxelShape NORTH_STINGER_SHAPE;
    private static final VoxelShape NORTH_LEFT_WING_SHAPE;
    private static final VoxelShape NORTH_RIGHT_WING_SHAPE;
    private static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    private static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_LEG_FRONT_SHAPE;
    private static final VoxelShape NORTH_FRONT_LEFT_LEG_BACK_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_LEG_FRONT_SHAPE;
    private static final VoxelShape NORTH_FRONT_RIGHT_LEG_BACK_SHAPE;
    private static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    private static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    private static final VoxelShape NORTH_WING_SHAPES;
    private static final VoxelShape NORTH_EYE_SHAPES;
    private static final VoxelShape NORTH_LEG_SHAPES;
    private static final VoxelShape NORTH_SHAPES;

    public ADBeePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPES;
    }

    static {
        NORTH_BODY_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D, 7.0D, 13.0D);
        NORTH_STINGER_SHAPE = Block.createCuboidShape(7.5D, 3.0D, 13.0D, 8.5D, 4.0D, 14.0D);
        NORTH_LEFT_WING_SHAPE = Block.createCuboidShape(9.0D, 7.0D, 4.0D, 14.0D, 8.0D, 9.0D);
        NORTH_RIGHT_WING_SHAPE = Block.createCuboidShape(2.0D, 7.0D, 4.0D, 7.0D, 8.0D, 9.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(3.5D, 2.0D, 1.5D, 7.0D, 5.0D, 4.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 2.0D, 1.5D, 12.5D, 5.0D, 4.0D);
        NORTH_FRONT_LEFT_LEG_FRONT_SHAPE = Block.createCuboidShape(12.0D, 0.0D, 4.0D, 14.0D, 1.0D, 5.0D);
        NORTH_FRONT_LEFT_LEG_BACK_SHAPE = Block.createCuboidShape(12.0D, 0.0D, 5.0D, 13.0D, 1.0D, 6.0D);
        NORTH_FRONT_RIGHT_LEG_FRONT_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 4.0D, 4.0D, 1.0D, 5.0D);
        NORTH_FRONT_RIGHT_LEG_BACK_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 5.0D, 4.0D, 1.0D, 6.0D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(12.0D, 0.0D, 11.0D, 13.0D, 1.0D, 12.0D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 11.0D, 4.0D, 1.0D, 12.0D);
        NORTH_WING_SHAPES = VoxelShapes.union(NORTH_LEFT_WING_SHAPE, NORTH_RIGHT_WING_SHAPE);
        NORTH_EYE_SHAPES = VoxelShapes.union(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
        NORTH_LEG_SHAPES = VoxelShapes.union(NORTH_FRONT_LEFT_LEG_FRONT_SHAPE, NORTH_FRONT_LEFT_LEG_BACK_SHAPE,
                NORTH_FRONT_RIGHT_LEG_FRONT_SHAPE, NORTH_FRONT_RIGHT_LEG_BACK_SHAPE, NORTH_BACK_LEFT_LEG_SHAPE,
                NORTH_BACK_RIGHT_LEG_SHAPE);
        NORTH_SHAPES = VoxelShapes.union(NORTH_BODY_SHAPE, NORTH_STINGER_SHAPE,
                NORTH_WING_SHAPES, NORTH_EYE_SHAPES, NORTH_LEG_SHAPES);

        // new ADPlushOutlineShapeBuilder().addBeeBodyShape().addBeeStingerShape()
        // .addBeeWingShapes().addBeeLegShapes().addBeeEyeShapes().build();
    }
}
