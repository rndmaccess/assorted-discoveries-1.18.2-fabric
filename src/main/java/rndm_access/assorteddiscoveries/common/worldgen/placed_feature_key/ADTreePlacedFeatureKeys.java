package rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ADTreePlacedFeatureKeys {
    public static final RegistryKey<PlacedFeature> HUGE_PURPLE_MUSHROOM_VEGETATION;

    static {
        HUGE_PURPLE_MUSHROOM_VEGETATION = ADPlacedFeatureKeys.of("huge_purple_mushroom_vegetation");
    }
}
