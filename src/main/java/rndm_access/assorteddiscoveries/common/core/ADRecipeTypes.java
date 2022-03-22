package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.crafting.ADWoodcuttingRecipe;

public class ADRecipeTypes {
    public static final RecipeType<ADWoodcuttingRecipe> WOODCUTTING = register("woodcutting");

    /**
     * @param <T>
     * @param Name The name for the recipe type.
     * @return New recipe type.
     */
    public static <T extends Recipe<?>> RecipeType<T> register(String name) {
        ResourceLocation modLoc = AssortedDiscoveries.makeModLocation(name);

        return Registry.register(Registry.RECIPE_TYPE, modLoc, new RecipeType<T>() {
            @Override
            public String toString() {
                return modLoc.toString();
            }
        });
    }
}