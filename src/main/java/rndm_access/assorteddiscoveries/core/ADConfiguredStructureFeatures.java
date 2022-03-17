package rndm_access.assorteddiscoveries.core;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.levelgen.structure.ADStructurePoolStarts;

public class ADConfiguredStructureFeatures {
    public static final ConfiguredStructureFeature<?, ?> TAIGA_CABIN = register("taiga_cabin", ADStructureFeatures.CABIN
            .get().configured(new JigsawConfiguration(() -> ADStructurePoolStarts.TAIGA_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> ICY_TAIGA_CABIN = register("icy_taiga_cabin",
            ADStructureFeatures.CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.ICY_TAIGA_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> FOREST_CABIN = register("forest_cabin",
            ADStructureFeatures.CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.FOREST_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> BIRCH_FOREST_CABIN = register("birch_forest_cabin",
            ADStructureFeatures.CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.BIRCH_FOREST_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> DARK_FOREST_CABIN = register("dark_forest_cabin",
            ADStructureFeatures.CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.DARK_FOREST_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> CRIMSON_FOREST_CABIN = register("crimson_forest_cabin",
            ADStructureFeatures.NETHER_CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.CRIMSON_FOREST_CABIN_START, 7)));
    public static final ConfiguredStructureFeature<?, ?> WARPED_FOREST_CABIN = register("warped_forest_cabin",
            ADStructureFeatures.NETHER_CABIN.get()
                    .configured(new JigsawConfiguration(() -> ADStructurePoolStarts.WARPED_FOREST_CABIN_START, 7)));

    private static ConfiguredStructureFeature<?, ?> register(String name,
            ConfiguredStructureFeature<?, ?> configuredStructureFeature) {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;

        return Registry.register(registry, AssortedDiscoveries.makeModLocation(name), configuredStructureFeature);
    }
}
