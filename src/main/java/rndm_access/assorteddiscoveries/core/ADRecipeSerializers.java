package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.crafting.ADSingleItemRecipe;
import rndm_access.assorteddiscoveries.common.item.crafting.ADWoodcuttingRecipe;

public class ADRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister
            .create(ForgeRegistries.RECIPE_SERIALIZERS, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ADWoodcuttingRecipe>> WOODCUTTING = RECIPE_SERIALIZERS
            .register("woodcutting", () -> {
                return new ADSingleItemRecipe.Serializer<>(ADWoodcuttingRecipe::new);
            });
}
