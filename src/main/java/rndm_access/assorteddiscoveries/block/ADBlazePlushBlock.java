package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.core.BlockPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADBlazePlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_FRONT_BOTTOM_ROD;
    protected static final VoxelShape NORTH_RIGHT_BACK_BOTTOM_ROD;
    protected static final VoxelShape NORTH_LEFT_FRONT_BOTTOM_ROD;
    protected static final VoxelShape NORTH_LEFT_BACK_BOTTOM_ROD;
    protected static final VoxelShape NORTH_MIDDLE_TOP_ROD;
    protected static final VoxelShape NORTH_LEFT_TOP_ROD;
    protected static final VoxelShape NORTH_RIGHT_TOP_ROD;

    protected static final VoxelShape NORTH_BOTTOM_RODS;
    protected static final VoxelShape NORTH_TOP_RODS;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADBlazePlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape northShape() {
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
        NORTH_HEAD = Block.createCuboidShape(4.5D, 8.0D, 5.5D, 11.5D, 15.0D, 12.5D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.5D, 11.0D, 5.0D, 7.5D, 13.0D, 5.5D);
        NORTH_LEFT_EYE = Block.createCuboidShape(8.5D, 11.0D, 5.0D, 10.5D, 13.0D, 5.5D);
        NORTH_RIGHT_FRONT_BOTTOM_ROD = Block.createCuboidShape(4.5D, 1.0D, 5.5D, 6.5D, 7.0D, 7.5D);
        NORTH_RIGHT_BACK_BOTTOM_ROD = Block.createCuboidShape(4.5D, 1.0D, 10.5D, 6.5D, 7.0D, 12.5D);
        NORTH_LEFT_FRONT_BOTTOM_ROD = Block.createCuboidShape(9.5D, 1.0D, 5.5D, 11.5D, 7.0D, 7.5D);
        NORTH_LEFT_BACK_BOTTOM_ROD = Block.createCuboidShape(9.5D, 1.0D, 10.5D, 11.5D, 7.0D, 12.5D);
        NORTH_MIDDLE_TOP_ROD = Block.createCuboidShape(7.0D, 6.0D, 13.0D, 9.0D, 12.0D, 15.0D);
        NORTH_LEFT_TOP_ROD = Block.createCuboidShape(12.5D, 6.0D, 8.0D, 14.5D, 12.0D, 10.0D);
        NORTH_RIGHT_TOP_ROD = Block.createCuboidShape(1.5D, 6.0D, 8.0D, 3.5D, 12.0D, 10.0D);

        NORTH_BOTTOM_RODS = VoxelShapes.union(NORTH_RIGHT_FRONT_BOTTOM_ROD, NORTH_RIGHT_BACK_BOTTOM_ROD, NORTH_LEFT_FRONT_BOTTOM_ROD, NORTH_LEFT_BACK_BOTTOM_ROD);
        NORTH_TOP_RODS = VoxelShapes.union(NORTH_MIDDLE_TOP_ROD, NORTH_LEFT_TOP_ROD, NORTH_RIGHT_TOP_ROD);
        NORTH_EYES = VoxelShapes.union(NORTH_RIGHT_EYE, NORTH_LEFT_EYE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_HEAD, NORTH_BOTTOM_RODS, NORTH_TOP_RODS, NORTH_EYES);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
