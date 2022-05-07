package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADCabinData;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADNetherCabinData;

public class ADConfiguredStructureFeatures {
    public static final ConfiguredStructureFeature<?, ?> TAIGA_CABIN = ADStructureFeatures.CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADCabinData.TAIGA_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> ICY_TAIGA_CABIN = ADStructureFeatures.CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADCabinData.ICY_TAIGA_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> FOREST_CABIN = ADStructureFeatures.CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADCabinData.FOREST_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> BIRCH_FOREST_CABIN = ADStructureFeatures.CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADCabinData.BIRCH_FOREST_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> DARK_FOREST_CABIN = ADStructureFeatures.CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADCabinData.DARK_FOREST_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> CRIMSON_FOREST_CABIN = ADStructureFeatures.NETHER_CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADNetherCabinData.CRIMSON_FOREST_CABIN_START, 7));
    public static final ConfiguredStructureFeature<?, ?> WARPED_FOREST_CABIN = ADStructureFeatures.NETHER_CABIN.configure(
            new StructurePoolFeatureConfig(() -> ADNetherCabinData.WARPED_FOREST_CABIN_START, 7));

    private static ConfiguredStructureFeature<?, ?> register(String path, ConfiguredStructureFeature<?, ?> configuredStructure) {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;

        return Registry.register(registry, ADReference.makeId(path), configuredStructure);
    }

    /**
     * Called during initialization to register every configured structure feature.
     */
    public static void registerConfiguredStructureFeatures() {
        register("taiga_cabin", TAIGA_CABIN);
        register("icy_taiga_cabin", ICY_TAIGA_CABIN);
        register("forest_cabin", FOREST_CABIN);
        register("birch_forest_cabin", BIRCH_FOREST_CABIN);
        register("dark_forest_cabin", DARK_FOREST_CABIN);
        register("crimson_forest_cabin", CRIMSON_FOREST_CABIN);
        register("warped_forest_cabin", WARPED_FOREST_CABIN);

        AssortedDiscoveries.LOGGER.info("Registered configured structure features.");
    }
}
