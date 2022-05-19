package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.OceanPlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOceanConfiguredFeatures;

public class ADOceanPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> CATTAIL_PATCH;

    public static void registerOceanPlacedFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered ocean placed features");
    }

    static {
        CATTAIL_PATCH = ADPlacedFeatures.register("cattail_patch",
                ADOceanConfiguredFeatures.CATTAIL_PATCH, OceanPlacedFeatures.seagrassModifiers(64));
    }
}
