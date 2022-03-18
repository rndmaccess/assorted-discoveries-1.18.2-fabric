package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public abstract class ADAbstractBerryBushBlock extends SweetBerryBushBlock {

    public ADAbstractBerryBushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    protected abstract Item berryItem();

    /**
     * Called when the player right-clicks a block.
     */
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        boolean maxAgeFlag = age == this.getMaxAge();

        if (!maxAgeFlag && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        } else if (age > 1) {
            int j = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(this.berryItem(), j + (maxAgeFlag ? 1 : 0)));
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, (BlockState)state.with(AGE, 1), 2);
            return ActionResult.success(world.isClient);
        }
        else {
            return ActionResult.PASS;
        }
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(this.berryItem());
    }

    /**
     * @return The max age of this plant.
     */
    private int getMaxAge() {
        return 3;
    }
}
