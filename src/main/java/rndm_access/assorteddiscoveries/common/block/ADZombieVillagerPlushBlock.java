package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADZombieVillagerPlushBlock extends ADVillagerPlushBlock {
    public static final VoxelShape LEFT_ARM_SHAPE;
    public static final VoxelShape RIGHT_ARM_SHAPE;
    private static final VoxelShape ARM_SHAPES;

    public ADZombieVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthArmOutlineShape() {
        return ARM_SHAPES;
    }

    static {
        LEFT_ARM_SHAPE = Block.createCuboidShape(11.0D, 2.0D, 3.0D, 14.0D, 5.0D, 10.5D);
        RIGHT_ARM_SHAPE = Block.createCuboidShape(2.0D, 2.0D, 3.0D, 5.0D, 5.0D, 10.5D);
        ARM_SHAPES = VoxelShapes.union(LEFT_ARM_SHAPE, RIGHT_ARM_SHAPE);
    }
}