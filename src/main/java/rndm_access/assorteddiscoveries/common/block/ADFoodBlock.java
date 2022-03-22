package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CakeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ADFoodBlock extends CakeBlock {
    private int foodLevel;
    private float foodSaturation;

    public ADFoodBlock(int foodLevel, float foodSaturation, AbstractBlock.Settings settings) {
        super(settings);
        this.foodLevel = foodLevel;
        this.foodSaturation = foodSaturation;
    }

    /**
     * Called when the player right-clicks a block.
     */
    @Override
    public InteractionResult onUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult BlockRayTrace) {
        if (level.isClientSide()) {
            ItemStack itemstack = player.getItemInHand(hand);

            if (this.eatFood(level, pos, state, player) == InteractionResult.SUCCESS) {
                return InteractionResult.SUCCESS;
            } else if (itemstack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return this.eatFood(level, pos, state, player);
    }

    /**
     * If the block can be eaten add the appropriate hunger and when it has one
     * slice left remove it from the world.
     *
     * @param world  This world.
     * @param pos    The block's position.
     * @param state  The state for this block.
     * @param player The player eating the block.
     * @return Whether the block was eaten ActionResultType.SUCCESS or
     *         ActionResultType.PASS.
     */
    private InteractionResult eatFood(LevelAccessor levelAccessor, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(foodLevel, foodSaturation);
            int bites = state.getValue(BITES);

            if (bites < 6) {
                levelAccessor.setBlock(pos, state.setValue(BITES, Integer.valueOf(bites + 1)), 3);
            } else {
                levelAccessor.removeBlock(pos, false);
            }
            return InteractionResult.SUCCESS;
        }
    }
}
