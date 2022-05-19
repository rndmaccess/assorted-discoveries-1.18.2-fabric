package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.core.ADFeature;

public class ADOceanConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<?, ?>> CATTAIL_PATCH;

    public static void registerOceanConfiguredFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered ocean configured features");
    }

    static {
        CATTAIL_PATCH = ADConfiguredFeatures.register("cattail_patch", ADFeature.CATTAIL, new ProbabilityConfig(0.6F));
    }
}
