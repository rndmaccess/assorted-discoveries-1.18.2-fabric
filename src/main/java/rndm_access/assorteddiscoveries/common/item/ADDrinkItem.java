package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class ADDrinkItem extends Item {
    private Item returnItem;

    public ADDrinkItem(Properties properties) {
        super(properties);
        this.returnItem = Items.GLASS_BOTTLE;
    }

    public ADDrinkItem(Properties properties, Item returnItemIn) {
        super(properties);
        this.returnItem = returnItemIn;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stackIn, Level level, LivingEntity livingEntityIn) {
        if (livingEntityIn instanceof Player) {
            Player playerEntity = (Player) livingEntityIn;
            boolean flag = playerEntity.isCreative();

            if (!flag) {
                playerEntity.addItem(new ItemStack(this.returnItem, 1));
                return super.finishUsingItem(stackIn, level, livingEntityIn);
            }
        }
        return stackIn;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
