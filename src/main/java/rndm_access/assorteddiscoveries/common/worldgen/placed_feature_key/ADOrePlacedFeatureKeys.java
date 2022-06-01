package rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ADOrePlacedFeatureKeys {
    public static final RegistryKey<PlacedFeature> ORE_SMOKY_QUARTZ;

    static {
        ORE_SMOKY_QUARTZ = ADPlacedFeatureKeys.of("ore_smoky_quartz");
    }
}
