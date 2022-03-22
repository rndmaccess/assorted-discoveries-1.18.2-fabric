package rndm_access.assorteddiscoveries.common.item.crafting;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

/**
 * This class helps assorted discoveries create single item recipes easier.
 *
 * @author rndm_access
 */
public class ADSingleItemRecipe extends CuttingRecipe {
    private final RecipeType<?> type;
    private final RecipeSerializer<?> serializer;

    StonecuttingRecipe

    public ADSingleItemRecipe(RecipeType<?> type, RecipeSerializer<?> serializer, ResourceLocation id, String group,
            Ingredient ingredient, ItemStack result) {
        super(type, serializer, id, group, ingredient, result);

        this.type = type;
        this.serializer = serializer;
    }

    @Override
    public RecipeType<?> getType() {
        return type;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return serializer;
    }

    @Override
    public boolean matches(Container inv, Level worldIn) {
        return this.ingredient.test(inv.getItem(0));
    }

    public static class Serializer<T extends SingleItemRecipe> extends ForgeRegistryEntry<RecipeSerializer<?>>
            implements RecipeSerializer<T> {
        final SingleItemMaker<T> factory;

        public Serializer(SingleItemMaker<T> factory) {
            this.factory = factory;
        }

        @Override
        public T fromJson(ResourceLocation location, JsonObject obj) {
            String s = GsonHelper.getAsString(obj, "group", "");
            Ingredient ingredient;
            if (GsonHelper.isArrayNode(obj, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(obj, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(obj, "ingredient"));
            }

            String s1 = GsonHelper.getAsString(obj, "result");
            int i = GsonHelper.getAsInt(obj, "count");
            ItemStack itemstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(s1)), i);
            return this.factory.create(location, s, ingredient, itemstack);
        }

        @Override
        public T fromNetwork(ResourceLocation location, FriendlyByteBuf buffer) {
            String s = buffer.readUtf();
            Ingredient ingredient = Ingredient.fromNetwork(buffer);
            ItemStack itemstack = buffer.readItem();
            return this.factory.create(location, s, ingredient, itemstack);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buffer, T recipe) {
            buffer.writeUtf(recipe.getGroup());
            recipe.getIngredients().get(0).toNetwork(buffer);
            buffer.writeItem(recipe.getResultItem());
        }

        public interface SingleItemMaker<T extends SingleItemRecipe> {
            T create(ResourceLocation location, String name, Ingredient ingredient, ItemStack stack);
        }
    }
}
