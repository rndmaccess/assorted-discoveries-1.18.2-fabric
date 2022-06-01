package rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.ADReference;

public class ADPlacedFeatureKeys {
    public static RegistryKey<PlacedFeature> of(String path) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, ADReference.makeId(path));
    }
}
