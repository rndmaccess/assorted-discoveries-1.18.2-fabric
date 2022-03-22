package rndm_access.assorteddiscoveries.common.worldgen.features;

import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import rndm_access.assorteddiscoveries.common.core.ADFeature;

public class ADAquaticFeatures {
    public static final ConfiguredFeature<?, ?> CATTAIL_SWAMP = ADFeatureUtils.register("cattail_swamp",
            ADFeature.CATTAIL.get().configured(new ProbabilityFeatureConfiguration(0.6F)));
}
