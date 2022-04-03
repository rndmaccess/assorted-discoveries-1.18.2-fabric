package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADStructurePoolStarts;

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

    private static ConfiguredStructureFeature<?, ?> register(String id, ConfiguredStructureFeature<?, ?> configuredStructure) {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;

        return Registry.register(registry, new Identifier(Reference.MOD_ID, id), configuredStructure);
    }
}
