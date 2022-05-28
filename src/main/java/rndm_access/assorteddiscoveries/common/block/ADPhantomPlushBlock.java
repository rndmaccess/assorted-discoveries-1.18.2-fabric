package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ADPhantomPlushBlock extends ADDirectionalPlushBlock {
    private static final VoxelShape NORTH_WING_SHAPE;
    private static final VoxelShape NORTH_BODY_SHAPE;
    private static final VoxelShape NORTH_TAIL_SHAPE;
    private static final VoxelShape NORTH_TAIL_END_SHAPE;
    private static final VoxelShape NORTH_SHAPE;

    public ADPhantomPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_WING_SHAPE = Block.createCuboidShape(1.0, 0.0, 5.0, 15.0, 2.5, 11.0);
        NORTH_BODY_SHAPE = Block.createCuboidShape(5.0, 0.0, 1.0, 11.0, 4.0, 12.0);
        NORTH_TAIL_SHAPE = Block.createCuboidShape(6.0, 0.0, 12.0, 10.0, 3.0, 14.0);
        NORTH_TAIL_END_SHAPE = Block.createCuboidShape(7.0, 0.0, 14.0, 9.0, 2.0, 16.0);
        NORTH_SHAPE = VoxelShapes.union(NORTH_WING_SHAPE, NORTH_BODY_SHAPE, NORTH_TAIL_SHAPE, NORTH_TAIL_END_SHAPE);
    }
}
