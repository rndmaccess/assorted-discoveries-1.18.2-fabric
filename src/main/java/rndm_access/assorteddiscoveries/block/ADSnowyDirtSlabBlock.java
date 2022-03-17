package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADSnowyDirtSlabBlock extends ADSoilSlabBlock {
    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;

    public ADSnowyDirtSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(SNOWY, false));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor levelAccessor,
            BlockPos pos, BlockPos pos2) {
        boolean flag = state2.is(Blocks.SNOW_BLOCK) || state2.is(Blocks.SNOW);

        if (direction != Direction.UP || ADBlockStateUtil.isBottomSlab(state)) {
            return state;
        } else {
            return state.setValue(SNOWY, Boolean.valueOf(flag));
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        BlockState stateAt = level.getBlockState(clickedPos);
        BlockState stateAbove = level.getBlockState(clickedPos.above());
        boolean flag = stateAbove.is(Blocks.SNOW_BLOCK) || stateAbove.is(Blocks.SNOW);

        if (stateAt.is(this)) {
            return stateAt.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, false).setValue(SNOWY, flag);
        } else {
            Fluid fluid = level.getFluidState(clickedPos).getType();
            BlockState grassSlab = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED,
                    fluid.equals(Fluids.WATER));
            Direction direction = context.getClickedFace();

            return direction != Direction.DOWN
                    && (direction == Direction.UP || !(context.getClickLocation().y - clickedPos.getY() > 0.5D))
                            ? grassSlab
                            : grassSlab.setValue(TYPE, SlabType.TOP).setValue(SNOWY, flag);
        }
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SNOWY);
    }
}
