package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import rndm_access.assorteddiscoveries.common.core.ADItems;

public class ADCattailBlock extends TallFlowerBlock {

    public ADCattailBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.isFaceSturdy(getter, pos, Direction.UP) && !state.is(Blocks.MAGMA_BLOCK);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        FluidState fluidState = levelReader.getFluidState(pos);
        FluidState topFluidState = levelReader.getFluidState(pos.above());

        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) {
            return fluidState.is(Fluids.EMPTY) && super.canSurvive(state, levelReader, pos);
        }
        return fluidState.is(Fluids.WATER) && topFluidState.is(Fluids.EMPTY)
                && super.canSurvive(state, levelReader, pos);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter getter, BlockPos pos, BlockState state) {
        return new ItemStack(ADItems.CATTAIL.get());
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? Fluids.WATER.getSource(false)
                : Fluids.EMPTY.defaultFluidState();
    }

    public boolean canPlaceLiquid(BlockGetter blockGetter, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor levelAccessor, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }
}
