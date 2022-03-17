package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADBaseZombieVillagerPlushBlock extends ADBaseVillagerPlushBlock {
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings settings) {
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
        NORTH_BODY = VoxelShapes.union(NORTH_HEAD, NORTH_TORSO, NORTH_ZOMBIE_VILLAGER_ARMS);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET, NORTH_FACE, NORTH_BODY);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
