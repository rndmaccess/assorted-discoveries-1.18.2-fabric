package rndm_access.assorteddiscoveries.util;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADFeatureUtils {

    /**
     * This is a helper method that adds my mod id to the feature name automatically
     * when registered.
     */
    public static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String name,
            ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, AssortedDiscoveries.makeModStringLocation(name),
                feature);
    }

    public static PlacedFeature register(String name, PlacedFeature feature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, AssortedDiscoveries.makeModStringLocation(name),
                feature);
    }
}
