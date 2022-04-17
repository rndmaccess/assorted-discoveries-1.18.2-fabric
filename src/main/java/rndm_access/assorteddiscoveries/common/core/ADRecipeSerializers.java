package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.item.crafting.ADCuttingRecipe;
import rndm_access.assorteddiscoveries.common.item.crafting.ADWoodcuttingRecipe;

public class ADRecipeSerializers {
    public static final RecipeSerializer<ADWoodcuttingRecipe> WOODCUTTING = new ADCuttingRecipe.Serializer<>(ADWoodcuttingRecipe::new);

    public static void registerSerializers() {
        registerSerializer("woodcutting", WOODCUTTING);
    }

    /**
     * Called during mod initialization to register every recipe serializer.
     */
    private static void registerSerializer(String id, RecipeSerializer serializer) {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ADReference.MOD_ID, id), serializer);
    }
}
