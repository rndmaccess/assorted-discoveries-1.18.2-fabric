package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADWanderingTraderPlushBlock extends ADVillagerPlushBlock {
    private static final VoxelShape NORTH_HOOD_FULL_SHAPE;
    private static final VoxelShape NORTH_HOOD_OPENING_SHAPE;
    private static final VoxelShape NORTH_HOOD_SHAPE;

    public ADWanderingTraderPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return NORTH_HOOD_SHAPE;
    }

    static {
        NORTH_HOOD_FULL_SHAPE = Block.createCuboidShape(3.0D, 5.0D, 4.5D, 13.0D, 15.0D, 13.0D);
        NORTH_HOOD_OPENING_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 4.5D, 12.0D, 11.0D, 5.5D);
        NORTH_HOOD_SHAPE = ADVoxelShapeHelper.cutBox(NORTH_HOOD_FULL_SHAPE, NORTH_HOOD_OPENING_SHAPE);
    }
}
