package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import rndm_access.assorteddiscoveries.ADReference;

public class ADPlacedFeatureKeys {
    public static final RegistryKey<PlacedFeature> PATCH_CATTAIL;
    public static final RegistryKey<PlacedFeature> ORE_SMOKY_QUARTZ;
    public static final RegistryKey<PlacedFeature> PATCH_HUGE_PURPLE_MUSHROOM;
    public static final RegistryKey<PlacedFeature> PATCH_BLUEBERRY_COMMON;
    public static final RegistryKey<PlacedFeature> PATCH_BLUEBERRY_RARE;
    public static final RegistryKey<PlacedFeature> PATCH_WITCHS_CRADLE_COMMON;
    public static final RegistryKey<PlacedFeature> PATCH_WITCHS_CRADLE_RARE;
    public static final RegistryKey<PlacedFeature> PATCH_ENDER_PLANTS;

    public static RegistryKey<PlacedFeature> of(String path) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, ADReference.makeId(path));
    }

    static {
        PATCH_CATTAIL = of("patch_cattail");
        ORE_SMOKY_QUARTZ = of("ore_smoky_quartz");
        PATCH_HUGE_PURPLE_MUSHROOM = of("patch_huge_purple_mushroom");
        PATCH_BLUEBERRY_COMMON = of("patch_blueberry_bush_common");
        PATCH_BLUEBERRY_RARE = of("patch_blueberry_bush_rare");
        PATCH_WITCHS_CRADLE_COMMON = of("patch_witchs_cradle_common");
        PATCH_WITCHS_CRADLE_RARE = of("patch_witchs_cradle_rare");
        PATCH_ENDER_PLANTS = of("patch_ender_plants");
    }
}
