package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.block.state.ADBlockStateProperties;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

/**
 * A base class designed to help create tall plush blocks.
 *
 * @author Ryan
 *
 */
public class ADTallPlushBlock extends ADPlushBlock {
    public static final IntegerProperty PLUSH_STACK_SIZE = ADBlockStateProperties.PLUSH_STACK_SIZE_1_3;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    public ADTallPlushBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER)
                .setValue(PLUSH_STACK_SIZE, 1).setValue(WATERLOGGED, false));
    }

    public void placeTop(Level level, BlockPos pos, BlockState state) {
        FluidState fluidstate = level.getFluidState(pos);
        boolean flag = fluidstate.is(FluidTags.WATER) && fluidstate.isSource();

        if (state.getValue(PLUSH_STACK_SIZE).equals(2)) {
            level.setBlock(pos, state.setValue(HALF, DoubleBlockHalf.UPPER).setValue(PLUSH_STACK_SIZE, 3)
                    .setValue(WATERLOGGED, flag), 3);
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        Level level = context.getLevel();
        BlockState blockstate = level.getBlockState(pos);

        if (blockstate.getBlock() == this) {
            placeTop(level, pos.above(), blockstate);

            return blockstate.setValue(PLUSH_STACK_SIZE, Math.min(3, blockstate.getValue(PLUSH_STACK_SIZE) + 1));
        } else {
            return super.getStateForPlacement(context);
        }
    }

    @Override
    public boolean canBeReplaced(BlockState stateIn, BlockPlaceContext useContext) {
        BlockPos pos = useContext.getClickedPos().above();
        BlockState state = useContext.getLevel().getBlockState(pos);
        int size = stateIn.getValue(PLUSH_STACK_SIZE);

        if (useContext.getItemInHand().getItem() == this.asItem()) {
            return size < 2 || size < 3 && state.getMaterial().isReplaceable() ? true : false;
        }
        return false;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        boolean creativeFlag = player.isCreative();

        if (state.getValue(PLUSH_STACK_SIZE) == 3) {
            if (ADBlockStateUtil.isUpperHalf(state)) {
                level.destroyBlock(pos.below(), !creativeFlag);
            } else if (ADBlockStateUtil.isLowerHalf(state)) {
                level.destroyBlock(pos.above(), !creativeFlag);
            }
        }
        level.destroyBlock(pos, !creativeFlag);
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PLUSH_STACK_SIZE, HALF);
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
        switch (state.getValue(PLUSH_STACK_SIZE)) {
        case 1:
            return stackSizeShapeBottom;
        case 2:
            return stackSizeShapeMiddle;
        default:
            return state.getValue(HALF) == DoubleBlockHalf.UPPER ? stackSizeShapeTop : stackSizeShapeMiddle;
        }
    }
}
