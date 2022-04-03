package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.OceanPlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOceanConfiguredFeatures;

public class ADOceanPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CATTAIL_SWAMP;

    static {
        CATTAIL_SWAMP = ADPlacedFeatures.register("cattail_swamp",
                ADOceanConfiguredFeatures.CATTAIL_SWAMP.withPlacement(OceanPlacedFeatures.seagrassModifiers(64)));
    }
}
