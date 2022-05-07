package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import rndm_access.assorteddiscoveries.common.core.ADFeature;

public class ADOceanConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> CATTAIL_SWAMP;

    static {
        CATTAIL_SWAMP = ADConfiguredFeatures.register("cattail_swamp",
                ADFeature.CATTAIL.configure(new ProbabilityConfig(0.6F)));
    }
}
