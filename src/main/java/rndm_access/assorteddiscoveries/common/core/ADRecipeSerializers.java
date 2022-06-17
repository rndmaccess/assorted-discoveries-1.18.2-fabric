package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.crafting.ADCuttingRecipe;
import rndm_access.assorteddiscoveries.common.item.crafting.ADWoodcuttingRecipe;

public class ADRecipeSerializers {
    public static final RecipeSerializer<ADWoodcuttingRecipe> WOODCUTTING;

    public static void registerSerializers() {
        AssortedDiscoveries.LOGGER.info("Registered recipe serializers");
    }

    /**
     * Called during mod initialization to register every recipe serializer.
     */
    private static <T extends Recipe<Inventory>> RecipeSerializer<T> register(String id, RecipeSerializer<T> serializer) {
        return Registry.register(Registry.RECIPE_SERIALIZER, ADReference.makeId(id), serializer);
    }

    static {
        WOODCUTTING = register("woodcutting", new ADCuttingRecipe.Serializer<>(ADWoodcuttingRecipe::new));
    }
}
