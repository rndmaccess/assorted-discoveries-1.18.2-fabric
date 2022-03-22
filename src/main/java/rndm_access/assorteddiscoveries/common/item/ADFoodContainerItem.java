package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.function.Supplier;

public class ADFoodContainerItem extends Item {
    private Supplier<Item> returnItem;

    public ADFoodContainerItem(Properties properties) {
        super(properties);
        this.returnItem = () -> Items.BOWL;
    }

    public ADFoodContainerItem(Properties properties, Supplier<Item> returnItem) {
        super(properties);
        this.returnItem = returnItem;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stackIn, Level level, LivingEntity livingEntityIn) {
        super.finishUsingItem(stackIn, level, livingEntityIn);
        boolean flag = livingEntityIn instanceof Player && ((Player) livingEntityIn).isCreative();

        return flag ? stackIn : new ItemStack(this.returnItem.get());
    }
}
