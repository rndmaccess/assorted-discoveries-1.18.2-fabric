package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADBatPlushBlock extends ADAbstractDirectionalPlushBlock {
    private static final VoxelShape NORTH_BODY;
    private static final VoxelShape NORTH_HEAD;
    private static final VoxelShape NORTH_LEFT_EAR;
    private static final VoxelShape NORTH_RIGHT_EAR;
    private static final VoxelShape NORTH_LEFT_LEG;
    private static final VoxelShape NORTH_RIGHT_LEG;
    private static final VoxelShape NORTH_LEFT_WING;
    private static final VoxelShape NORTH_RIGHT_WING;
    private static final VoxelShape NORTH_MOUTH;
    private static final VoxelShape NORTH_RIGHT_EYE;
    private static final VoxelShape NORTH_LEFT_EYE;
    private static final VoxelShape NORTH_EARS;
    private static final VoxelShape NORTH_LEGS;
    private static final VoxelShape NORTH_WINGS;
    private static final VoxelShape NORTH_EYES;
    private static final VoxelShape NORTH_SHAPE;

    public ADBatPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
        return NORTH_SHAPE;
    }

    static {
        NORTH_BODY = Block.createCuboidShape(6.0D, 1.0D, 7.0D, 10.0D, 5.0D, 10.0D);
        NORTH_HEAD = Block.createCuboidShape(5.0D, 5.0D, 6.0D, 10.5D, 9.5D, 11.0D);
        NORTH_LEFT_EAR = Block.createCuboidShape(9.0D, 7.5D, 7.0D, 12.0D, 10.5D, 10.0D);
        NORTH_RIGHT_EAR = Block.createCuboidShape(4.0D, 7.5D, 7.0D, 7.0D, 10.5D, 10.0D);
        NORTH_LEFT_LEG = Block.createCuboidShape(9.0D, 0.0D, 8.0D, 10.0D, 1.0D, 9.0D);
        NORTH_RIGHT_LEG = Block.createCuboidShape(6.0D, 0.0D, 8.0D, 7.0D, 1.0D, 9.0D);
        NORTH_LEFT_WING = Block.createCuboidShape(10.0D, 0.5D, 7.0D, 14.0D, 5.5D, 10.0D);
        NORTH_RIGHT_WING = Block.createCuboidShape(2.0D, 0.5D, 7.0D, 6.0D, 5.5D, 10.0D);
        NORTH_MOUTH = Block.createCuboidShape(6.5D, 5.0D, 5.5D, 9.0D, 6.0D, 6.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 7.0D, 5.5D, 7.5D, 8.0D, 6.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.0D, 7.0D, 5.5D, 10.0D, 8.0D, 6.0D);
        NORTH_EARS = VoxelShapes.union(NORTH_LEFT_EAR, NORTH_RIGHT_EAR);
        NORTH_LEGS = VoxelShapes.union(NORTH_LEFT_LEG, NORTH_RIGHT_LEG);
        NORTH_WINGS = VoxelShapes.union(NORTH_LEFT_WING, NORTH_RIGHT_WING);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_BODY, NORTH_HEAD, NORTH_MOUTH, NORTH_EARS,
                NORTH_LEGS, NORTH_WINGS, NORTH_EYES);
    }
}
