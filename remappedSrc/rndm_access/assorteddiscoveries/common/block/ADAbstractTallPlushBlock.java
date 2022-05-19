package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import rndm_access.assorteddiscoveries.common.block.state.ADProperties;

/**
 * A base class designed to help create tall plush blocks.
 *
 * @author Ryan
 *
 */
public abstract class ADAbstractTallPlushBlock extends ADPlushBlock {
    public static final IntProperty STACK_SIZE;
    public static final EnumProperty<DoubleBlockHalf> HALF;

    public ADAbstractTallPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(HALF, DoubleBlockHalf.LOWER)
                .with(STACK_SIZE, 1).with(WATERLOGGED, false));
    }

    private void placeTop(World world, BlockPos pos, BlockState state) {
        FluidState fluidstate = world.getFluidState(pos);
        boolean flag = fluidstate.isIn(FluidTags.WATER) && fluidstate.isStill();

        if (state.get(STACK_SIZE).equals(2)) {
            world.setBlockState(pos, state.with(HALF, DoubleBlockHalf.UPPER).with(STACK_SIZE, 3)
                    .with(WATERLOGGED, flag), 3);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState blockstate = world.getBlockState(pos);

        if (blockstate.isOf(this)) {
            placeTop(world, pos.up(), blockstate);
            return blockstate.with(STACK_SIZE, Math.min(3, blockstate.get(STACK_SIZE) + 1));
        }
        return super.getPlacementState(context);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        BlockPos topPos = context.getBlockPos().up();
        BlockState topState = context.getWorld().getBlockState(topPos);
        int size = state.get(STACK_SIZE);

        // Let the player continue to stack plushes as long as the conditions are met.
        return context.getStack().isOf(this.asItem()) && size < 3 && topState.getMaterial().isReplaceable();
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if(state.get(STACK_SIZE) == 3) {
            // If the stack is not full break the other half.
            if(world.getBlockState(pos.down()).isOf(this) || world.getBlockState(pos.up()).isOf(this)) {
                return state;
            }
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    // Get the bottom outline shapes.
    public abstract VoxelShape getBottomNorthOutlineShape();
    public abstract VoxelShape getBottomSouthOutlineShape();
    public abstract VoxelShape getBottomWestOutlineShape();
    public abstract VoxelShape getBottomEastOutlineShape();

    // Get the middle outline shapes.
    public abstract VoxelShape getMiddleNorthOutlineShape();
    public abstract VoxelShape getMiddleSouthOutlineShape();
    public abstract VoxelShape getMiddleWestOutlineShape();
    public abstract VoxelShape getMiddleEastOutlineShape();

    // Get the top outline shapes.
    public abstract VoxelShape getTopNorthOutlineShape();
    public abstract VoxelShape getTopSouthOutlineShape();
    public abstract VoxelShape getTopWestOutlineShape();
    public abstract VoxelShape getTopEastOutlineShape();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> getStackShape(state, getBottomNorthOutlineShape(),
                    getMiddleNorthOutlineShape(), getTopNorthOutlineShape());
            case SOUTH -> getStackShape(state, getBottomSouthOutlineShape(),
                    getMiddleSouthOutlineShape(), getTopSouthOutlineShape());
            case WEST -> getStackShape(state, getBottomWestOutlineShape(),
                    getMiddleWestOutlineShape(), getTopWestOutlineShape());
            default -> getStackShape(state, getBottomEastOutlineShape(),
                    getMiddleEastOutlineShape(), getTopEastOutlineShape());
        };
    }

    /**
     * @param state                The current state this block is in.
     * @param stackSizeShapeBottom The shape for stack size 1.
     * @param stackSizeShapeMiddle The shape for stack size 2.
     * @param stackSizeShapeTop    The shape for the top of stack size 3.
     * @return The appropriate bounding box for the given state.
     */
    protected static VoxelShape getStackShape(BlockState state, VoxelShape stackSizeShapeBottom,
                                              VoxelShape stackSizeShapeMiddle, VoxelShape stackSizeShapeTop) {
        return switch (state.get(STACK_SIZE)) {
            case 1 -> stackSizeShapeBottom;
            case 2 -> stackSizeShapeMiddle;
            default -> (state.get(HALF) == DoubleBlockHalf.UPPER ? stackSizeShapeTop : stackSizeShapeMiddle);
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STACK_SIZE, HALF, WATERLOGGED, FACING);
    }

    static {
        STACK_SIZE = ADProperties.STACK_SIZE;
        HALF = Properties.DOUBLE_BLOCK_HALF;
    }
}
