package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.worldgen.feature.ADCattailFeature;

public class ADFeature {
    public static final Feature<ProbabilityConfig> CATTAIL = new ADCattailFeature(ProbabilityConfig.CODEC);

    private static <C extends FeatureConfig, F extends Feature<C>> void registerFeature(String id, F feature) {
        Registry.register(Registry.FEATURE, new Identifier(ADReference.MOD_ID, id), feature);
    }

    /**
     * Called during initialization to register every feature.
     */
    public static void registerFeatures() {
        registerFeature("cattail", CATTAIL);
    }
}
