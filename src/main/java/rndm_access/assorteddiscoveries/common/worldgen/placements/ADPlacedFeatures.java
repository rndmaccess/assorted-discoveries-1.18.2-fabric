package rndm_access.assorteddiscoveries.common.worldgen.placements;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.Reference;

public class ADPlacedFeatures {
    public static PlacedFeature register(String id, PlacedFeature feature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Reference.MOD_ID, id), feature);
    }
}
