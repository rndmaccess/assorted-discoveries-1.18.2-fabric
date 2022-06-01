package rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ADOceanPlacedFeatureKeys {
    public static final RegistryKey<PlacedFeature> CATTAIL_PATCH;

    static {
        CATTAIL_PATCH = ADPlacedFeatureKeys.of("cattail_patch");
    }
}
