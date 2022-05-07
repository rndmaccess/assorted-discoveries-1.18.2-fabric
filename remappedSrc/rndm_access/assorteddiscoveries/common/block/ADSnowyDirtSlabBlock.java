package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ADSnowyDirtSlabBlock extends ADSoilSlabBlock {
    public static final BooleanProperty SNOWY;

    public ADSnowyDirtSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(SNOWY, false));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        boolean flag = neighborState.isOf(Blocks.SNOW_BLOCK) || neighborState.isOf(Blocks.SNOW);

        if (direction != Direction.UP || state.get(TYPE).equals(SlabType.BOTTOM)) {
            return state;
        } else {
            return state.with(SNOWY, flag);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState stateAt = world.getBlockState(pos);
        BlockState stateAbove = world.getBlockState(pos.up());
        boolean flag = stateAbove.isOf(Blocks.SNOW_BLOCK) || stateAbove.isOf(Blocks.SNOW);

        if (stateAt.isOf(this)) {
            return stateAt.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, false).with(SNOWY, flag);
        } else {
            FluidState fluidState = world.getFluidState(pos);
            BlockState grassSlab = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, fluidState.isOf(Fluids.WATER));
            Direction direction = context.getPlayerLookDirection();

            return direction != Direction.DOWN
                    && (direction == Direction.UP || !(context.getHitPos().y - pos.getY() > 0.5D))
                            ? grassSlab
                            : grassSlab.with(TYPE, SlabType.TOP).with(SNOWY, flag);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(SNOWY);
    }

    static {
        SNOWY = Properties.SNOWY;
    }
}
