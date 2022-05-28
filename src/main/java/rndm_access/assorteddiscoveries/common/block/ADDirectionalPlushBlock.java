package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

/**
 * A base class designed to help create basic plush blocks.
 *
 * @author Ryan
 *
 */
public class ADDirectionalPlushBlock extends ADPlushBlock {
    private final VoxelShape northShape;
    private final VoxelShape southShape;
    private final VoxelShape westShape;
    private final VoxelShape eastShape;

    public ADDirectionalPlushBlock(Settings settings, VoxelShape northShape) {
        super(settings);
        this.northShape = northShape;
        this.southShape = ADVoxelShapeHelper.rotate180Y(northShape);
        this.westShape = ADVoxelShapeHelper.rotate270Y(northShape);
        this.eastShape = ADVoxelShapeHelper.rotate90Y(northShape);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> this.northShape;
            case SOUTH -> this.southShape;
            case WEST -> this.westShape;
            default -> this.eastShape;
        };
    }
}
