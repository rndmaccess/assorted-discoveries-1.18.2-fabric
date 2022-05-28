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
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

/**
 * A base class designed to help create tall plush blocks.
 *
 * @author Ryan
 *
 */
public class ADDirectionalTallPlushBlock extends ADPlushBlock {
    public static final IntProperty STACK_SIZE;
    public static final EnumProperty<DoubleBlockHalf> HALF;
    private final VoxelShape bottomNorthShape;
    private final VoxelShape bottomSouthShape;
    private final VoxelShape bottomWestShape;
    private final VoxelShape bottomEastShape;
    private final VoxelShape middleNorthShape;
    private final VoxelShape middleSouthShape;
    private final VoxelShape middleWestShape;
    private final VoxelShape middleEastShape;
    private final VoxelShape topNorthShape;
    private final VoxelShape topSouthShape;
    private final VoxelShape topWestShape;
    private final VoxelShape topEastShape;

    public ADDirectionalTallPlushBlock(AbstractBlock.Settings settings, VoxelShape bottomNorthShape,
                                       VoxelShape middleNorthShape, VoxelShape topNorthShape) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(HALF, DoubleBlockHalf.LOWER)
                .with(STACK_SIZE, 1).with(WATERLOGGED, false));
        this.bottomNorthShape = bottomNorthShape;
        this.bottomSouthShape = ADVoxelShapeHelper.rotate180Y(bottomNorthShape);
        this.bottomWestShape = ADVoxelShapeHelper.rotate270Y(bottomNorthShape);
        this.bottomEastShape = ADVoxelShapeHelper.rotate90Y(bottomNorthShape);
        this.middleNorthShape = middleNorthShape;
        this.middleSouthShape = ADVoxelShapeHelper.rotate180Y(middleNorthShape);
        this.middleWestShape = ADVoxelShapeHelper.rotate270Y(middleNorthShape);
        this.middleEastShape = ADVoxelShapeHelper.rotate90Y(middleNorthShape);
        this.topNorthShape = topNorthShape;
        this.topSouthShape = ADVoxelShapeHelper.rotate180Y(topNorthShape);
        this.topWestShape = ADVoxelShapeHelper.rotate270Y(topNorthShape);
        this.topEastShape = ADVoxelShapeHelper.rotate90Y(topNorthShape);
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

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> getStackShape(state, this.bottomNorthShape, this.middleNorthShape, this.topNorthShape);
            case SOUTH -> getStackShape(state, this.bottomSouthShape, this.middleSouthShape, this.topSouthShape);
            case WEST -> getStackShape(state, this.bottomWestShape, this.middleWestShape, this.topWestShape);
            default -> getStackShape(state, this.bottomEastShape, this.middleEastShape, this.topEastShape);
        };
    }

    /**
     * @param state       The current state this block is in.
     * @param bottomShape The shape for stack size 1.
     * @param middleShape The shape for stack size 2.
     * @param topShape    The shape for the top of stack size 3.
     * @return The appropriate bounding box for the given state.
     */
    protected static VoxelShape getStackShape(BlockState state, VoxelShape bottomShape,
                                              VoxelShape middleShape, VoxelShape topShape) {
        return switch (state.get(STACK_SIZE)) {
            case 1 -> bottomShape;
            case 2 -> middleShape;
            default -> ((state.get(HALF) == DoubleBlockHalf.UPPER) ? topShape : middleShape);
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