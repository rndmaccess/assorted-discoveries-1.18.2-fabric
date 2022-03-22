package rndm_access.assorteddiscoveries.common.item.crafting;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;
import rndm_access.assorteddiscoveries.common.core.ADRecipeSerializers;
import rndm_access.assorteddiscoveries.common.core.ADRecipeTypes;

public class ADWoodcuttingRecipe extends ADSingleItemRecipe {

    public ADWoodcuttingRecipe(ResourceLocation id, String group, Ingredient ingredient, ItemStack result) {
        super(ADRecipeTypes.WOODCUTTING, ADRecipeSerializers.WOODCUTTING, id, group, ingredient, result);
    }

    @Override
    public boolean matches(Container inv, Level worldIn) {
        return this.ingredient.test(inv.getItem(0));
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ADBlocks.WOODCUTTER.get());
    }
}
