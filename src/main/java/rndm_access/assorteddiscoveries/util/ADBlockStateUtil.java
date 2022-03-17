package rndm_access.assorteddiscoveries.util;

import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;

/**
 * A utility class that holds helper methods for block states.
 *
 * @author Ryan
 */
public final class ADBlockStateUtil {
    private ADBlockStateUtil() {
    }

    /**
     * @param state The slab block.
     * @return True if the slab is the bottom half.
     */
    public static boolean isBottomSlab(BlockState state) {
        EnumProperty<SlabType> slabType = BlockStateProperties.SLAB_TYPE;

        return state.hasProperty(slabType) && state.getValue(slabType).equals(SlabType.BOTTOM);
    }

    /**
     * @param fluidState The fluidState to check.
     * @return True if the fluidState in the position is filled with a water source
     *         block.
     */
    public static boolean isWaterSource(FluidState fluidState) {
        return fluidState.is(FluidTags.WATER) && fluidState.isSource();
    }

    /**
     * @param state The state to check.
     * @return True if the state is the top half.
     */
    public static boolean isUpperHalf(BlockState state) {
        return isHalf(state, DoubleBlockHalf.UPPER);
    }

    /**
     * @param state The state to check.
     * @return True if the state is the bottom half.
     */
    public static boolean isLowerHalf(BlockState state) {
        return isHalf(state, DoubleBlockHalf.LOWER);
    }

    private static boolean isHalf(BlockState state, DoubleBlockHalf type) {
        EnumProperty<DoubleBlockHalf> half = BlockStateProperties.DOUBLE_BLOCK_HALF;

        return state.hasProperty(half) && state.getValue(half).equals(type);
    }
}
