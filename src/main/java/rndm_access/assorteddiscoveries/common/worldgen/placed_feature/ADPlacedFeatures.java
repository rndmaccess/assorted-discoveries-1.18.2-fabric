package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.Reference;

public class ADPlacedFeatures {
    public static RegistryKey<PlacedFeature> register(String id, PlacedFeature feature) {
        Identifier identifier = new Identifier(Reference.MOD_ID, id);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, identifier, feature);

        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, identifier);
    }
}
