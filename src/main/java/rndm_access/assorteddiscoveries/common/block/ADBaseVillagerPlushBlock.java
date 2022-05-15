package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADBaseVillagerPlushBlock extends ADAbstractPlushBlock {
    // Zombie Villager Shapes
    public static final VoxelShape NORTH_ZOMBIE_VILLAGER_LEFT_ARM;
    public static final VoxelShape NORTH_ZOMBIE_VILLAGER_RIGHT_ARM;
    public static final VoxelShape NORTH_ZOMBIE_VILLAGER_ARMS;

    // Villager Shapes
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_RIGHT_FOOT;
    protected static final VoxelShape NORTH_LEFT_FOOT;
    protected static final VoxelShape NORTH_ARM;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_NOSE;
    protected static final VoxelShape NORTH_FEET;
    protected static final VoxelShape NORTH_FACE;
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADBaseVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getNorthOutlineShape() {
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
        NORTH_ZOMBIE_VILLAGER_LEFT_ARM = Block.createCuboidShape(11.0D, 2.0D, 3.0D, 14.0D, 5.0D, 10.5D);
        NORTH_ZOMBIE_VILLAGER_RIGHT_ARM = Block.createCuboidShape(2.0D, 2.0D, 3.0D, 5.0D, 5.0D, 10.5D);

        NORTH_HEAD = Block.createCuboidShape(4.0D, 5.0D, 5.5D, 12.0D, 14.0D, 12.0D);
        NORTH_TORSO = Block.createCuboidShape(5.0D, 1.5D, 7.0D, 11.0D, 5.0D, 11.0D);
        NORTH_RIGHT_FOOT = Block.createCuboidShape(5.5D, 0.0D, 8.0D, 7.5D, 1.5D, 10.0D);
        NORTH_LEFT_FOOT = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 10.5D, 1.5D, 10.0D);
        NORTH_ARM = Block.createCuboidShape(4.5D, 1.5D, 5.0D, 11.5D, 5.0D, 9.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.5D, 8.0D, 5.0D, 10.5D, 10.0D, 5.5D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 8.0D, 5.0D, 7.5D, 10.0D, 5.5D);
        NORTH_NOSE = Block.createCuboidShape(7.0D, 4.5D, 3.5D, 9.0D, 7.5D, 5.5D);

        NORTH_ZOMBIE_VILLAGER_ARMS = VoxelShapes.union(NORTH_ZOMBIE_VILLAGER_LEFT_ARM, NORTH_ZOMBIE_VILLAGER_RIGHT_ARM);

        NORTH_FEET = VoxelShapes.union(NORTH_RIGHT_FOOT, NORTH_LEFT_FOOT);
        NORTH_FACE = VoxelShapes.union(NORTH_LEFT_EYE, NORTH_RIGHT_EYE, NORTH_NOSE);
        NORTH_BODY = VoxelShapes.union(NORTH_HEAD, NORTH_TORSO, NORTH_ARM);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET, NORTH_FACE, NORTH_BODY);

        SOUTH_SHAPE = ADVoxelShapeHelper.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADVoxelShapeHelper.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADVoxelShapeHelper.rotate90Y(NORTH_SHAPE);
    }
}
