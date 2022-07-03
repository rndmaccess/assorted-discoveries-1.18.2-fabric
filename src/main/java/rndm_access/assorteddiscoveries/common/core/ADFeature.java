package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.feature.ADCattailFeature;

public class ADFeature {
    public static final Feature<ProbabilityConfig> CATTAIL = new ADCattailFeature(ProbabilityConfig.CODEC);

    private static <C extends FeatureConfig, F extends Feature<C>> void register(String path, F feature) {
        Registry.register(Registry.FEATURE, ADReference.makeId(path), feature);
    }

    /**
     * Called during initialization to register every feature.
     */
    public static void registerFeatures() {
        register("cattail", CATTAIL);

        AssortedDiscoveries.LOGGER.info("Registered features");
    }
}
