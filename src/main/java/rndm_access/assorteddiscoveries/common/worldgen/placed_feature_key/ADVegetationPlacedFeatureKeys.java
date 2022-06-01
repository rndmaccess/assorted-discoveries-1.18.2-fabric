package rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ADVegetationPlacedFeatureKeys {
    public static final RegistryKey<PlacedFeature> PATCH_BLUEBERRY_COMMON;
    public static final RegistryKey<PlacedFeature> PATCH_BLUEBERRY_RARE;
    public static final RegistryKey<PlacedFeature> PATCH_WITCHS_CRADLE_COMMON;
    public static final RegistryKey<PlacedFeature> PATCH_WITCHS_CRADLE_RARE;
    public static final RegistryKey<PlacedFeature> SNAPDRAGON_AND_ENDER_GRASS;

    static {
        PATCH_BLUEBERRY_COMMON = ADPlacedFeatureKeys.of("patch_blueberry_common");
        PATCH_BLUEBERRY_RARE = ADPlacedFeatureKeys.of("patch_blueberry_rare");
        PATCH_WITCHS_CRADLE_COMMON = ADPlacedFeatureKeys.of("patch_witchs_cradle_common");
        PATCH_WITCHS_CRADLE_RARE = ADPlacedFeatureKeys.of("patch_witchs_cradle_rare");
        SNAPDRAGON_AND_ENDER_GRASS = ADPlacedFeatureKeys.of("snapdragon_and_ender_grass");
    }
}
