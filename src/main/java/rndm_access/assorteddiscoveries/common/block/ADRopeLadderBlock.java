package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import rndm_access.assorteddiscoveries.common.block.state.ADBlockStateProperties;

public class ADRopeLadderBlock extends LadderBlock {
    public static final IntegerProperty LENGTH = ADBlockStateProperties.LENGTH;
    public static final BooleanProperty DOWN = BlockStateProperties.DOWN;

    public ADRopeLadderBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false).setValue(LENGTH, 0).setValue(DOWN, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockPos abovePos = pos.above();
        BlockPos belowPos = pos.below();
        BlockState aboveState = level.getBlockState(abovePos);
        BlockState belowState = level.getBlockState(belowPos);
        boolean isInWater = level.getFluidState(pos).is(Fluids.WATER);
        BlockState placedState = this.defaultBlockState();

        // Place hanging ladders when they're supporting blocks up to 16.
        if (aboveState.is(this)) {
            Direction facing = aboveState.getValue(FACING);
            int length = aboveState.getValue(LENGTH);

            if (length < 16) {
                BlockPos behindPos = pos.relative(facing.getOpposite());
                BlockState behindState = level.getBlockState(behindPos);

                if (!behindState.isFaceSturdy(level, behindPos, facing)) {
                    return placedState.setValue(WATERLOGGED, isInWater).setValue(LENGTH, length + 1)
                            .setValue(FACING, facing).setValue(DOWN, belowState.is(this));
                }
                return placedState.setValue(WATERLOGGED, isInWater).setValue(FACING, facing).setValue(DOWN,
                        belowState.is(this));
            }
            return null;
        }

        // Place ladder on block facing the correct way.
        for (Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                return placedState.setValue(WATERLOGGED, isInWater).setValue(FACING, direction.getOpposite());
            }
        }
        return null;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor levelAccessor,
            BlockPos pos, BlockPos pos2) {
        Direction facing = state.getValue(FACING);
        BlockPos posAbove = pos.above();
        BlockPos posBelow = pos.below();
        BlockPos posBehind = pos.relative(facing.getOpposite());
        BlockState stateAbove = levelAccessor.getBlockState(posAbove);
        BlockState stateBelow = levelAccessor.getBlockState(posBelow);
        BlockState stateBehind = levelAccessor.getBlockState(posBehind);

        if (canSurvive(state, levelAccessor, pos)) {

            // Set the ladders length to 0 when a block is placed behind it.
            if (stateBehind.isFaceSturdy(levelAccessor, posBehind, facing)) {
                return state.setValue(LENGTH, 0).setValue(DOWN, stateBelow.is(this));
            }

            // Update each ladders length to keep the ladders length consistent.
            if (stateAbove.is(this)) {
                return state.setValue(LENGTH, stateAbove.getValue(LENGTH) + 1).setValue(DOWN, stateBelow.is(this));
            }
        }
        return Blocks.AIR.defaultBlockState();
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        Direction facing = state.getValue(FACING);
        BlockPos behindPos = pos.relative(facing.getOpposite());
        BlockState aboveState = levelReader.getBlockState(pos.above());
        BlockState behindState = levelReader.getBlockState(behindPos);
        boolean hasSupport = behindState.isFaceSturdy(levelReader, behindPos, facing);

        if (aboveState.is(this)) {
            int length = aboveState.getValue(LENGTH) + 1;

            return length <= 16;
        }
        return hasSupport;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LENGTH, DOWN, FACING, WATERLOGGED);
    }
}
