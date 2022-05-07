package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

/**
 * A base class designed to help create basic plush blocks.
 *
 * @author Ryan
 *
 */
public abstract class ADAbstractPlushBlock extends ADPlushBlock {
    public ADAbstractPlushBlock(Settings settings) {
        super(settings);
    }

    // The outline shape for when the block is facing each direction override
    // these instead of the getOutlineShape method.
    protected abstract VoxelShape getNorthOutlineShape();
    protected abstract VoxelShape getSouthOutlineShape();
    protected abstract VoxelShape getWestOutlineShape();
    protected abstract VoxelShape getEastOutlineShape();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return this.getNorthOutlineShape();
            case SOUTH:
                return this.getSouthOutlineShape();
            case WEST:
                return this.getWestOutlineShape();
            default:
                return this.getEastOutlineShape();
        }
    }
}
