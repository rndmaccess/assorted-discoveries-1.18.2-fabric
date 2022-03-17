package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADBaseVillagerPlushBlock extends ADPlushBlock {
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
    protected static final VoxelShape NORTH_EYEBROW;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_MOUTH;
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
    public VoxelShape northShape() {
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
        NORTH_ZOMBIE_VILLAGER_LEFT_ARM = Block.createCuboidShape(11.0D, 2.0D, 3.0D, 14.0D, 5.0D, 10.5D);
        NORTH_ZOMBIE_VILLAGER_RIGHT_ARM = Block.createCuboidShape(2.0D, 2.0D, 3.0D, 5.0D, 5.0D, 10.5D);

        NORTH_HEAD = Block.createCuboidShape(4.0D, 5.0D, 5.5D, 12.0D, 14.0D, 12.0D);
        NORTH_TORSO = Block.createCuboidShape(5.0D, 1.5D, 7.0D, 11.0D, 5.0D, 11.0D);
        NORTH_RIGHT_FOOT = Block.createCuboidShape(5.5D, 0.0D, 8.0D, 7.5D, 1.5D, 10.0D);
        NORTH_LEFT_FOOT = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 10.5D, 1.5D, 10.0D);
        NORTH_ARM = Block.createCuboidShape(4.5D, 1.5D, 5.0D, 11.5D, 5.0D, 9.0D);
        NORTH_EYEBROW = Block.createCuboidShape(5.5D, 9.0D, 5.0D, 10.5D, 10.0D, 5.5D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.5D, 8.0D, 5.0D, 10.5D, 9.0D, 5.5D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 8.0D, 5.0D, 7.5D, 9.0D, 5.5D);
        NORTH_MOUTH = Block.createCuboidShape(6.0D, 6.0D, 5.0D, 10.0D, 7.0D, 5.5D);
        NORTH_NOSE = Block.createCuboidShape(7.0D, 4.0D, 3.5D, 9.0D, 7.5D, 5.5D);

        NORTH_ZOMBIE_VILLAGER_ARMS = VoxelShapes.union(NORTH_ZOMBIE_VILLAGER_LEFT_ARM, NORTH_ZOMBIE_VILLAGER_RIGHT_ARM);

        NORTH_FEET = VoxelShapes.union(NORTH_RIGHT_FOOT, NORTH_LEFT_FOOT);
        NORTH_FACE = VoxelShapes.union(NORTH_EYEBROW, NORTH_LEFT_EYE, NORTH_RIGHT_EYE, NORTH_MOUTH, NORTH_NOSE);
        NORTH_BODY = VoxelShapes.union(NORTH_HEAD, NORTH_TORSO, NORTH_ARM);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET, NORTH_FACE, NORTH_BODY);

        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
