package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADWitchPlushBlock extends ADVillagerPlushBlock {
    private static final VoxelShape NORTH_WART_SHAPE;
    private static final VoxelShape NORTH_HAT_RIM_SHAPE;
    private static final VoxelShape NORTH_HAT_MIDDLE_SHAPE;
    private static final VoxelShape NORTH_HAT_TOP_SHAPE;
    private static final VoxelShape NORTH_HAT_POINT_SHAPE;
    private static final VoxelShape NORTH_HAT_SHAPE;

    public ADWitchPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getNorthNoseOutlineShape() {
        return VoxelShapes.union(ADVillagerPlushBlock.NORTH_NOSE_SHAPE, NORTH_WART_SHAPE);
    }

    @Override
    protected VoxelShape getNorthClothingOutlineShape() {
        return NORTH_HAT_SHAPE;
    }

    static {
        NORTH_WART_SHAPE = Block.createCuboidShape(7.0D, 5.0D, 2.5D, 8.0D, 6.0D, 3.5D);
        NORTH_HAT_RIM_SHAPE = Block.createCuboidShape(3.0D, 11.0D, 4.5D, 13.0D, 12.0D, 13.0D);
        NORTH_HAT_MIDDLE_SHAPE = Block.createCuboidShape(4.0D, 12.0D, 5.5D, 12.0D, 15.0D, 12.0D);
        NORTH_HAT_TOP_SHAPE = Block.createCuboidShape(6.0D, 15.0D, 7.5D, 10.0D, 17.5D, 10.0D);
        NORTH_HAT_POINT_SHAPE = Block.createCuboidShape(6.5D, 17.5D, 8.5D, 9.0D, 19.5D, 9.5D);
        NORTH_HAT_SHAPE = VoxelShapes.union(NORTH_HAT_RIM_SHAPE, NORTH_HAT_MIDDLE_SHAPE, NORTH_HAT_TOP_SHAPE, NORTH_HAT_POINT_SHAPE);
    }
}
