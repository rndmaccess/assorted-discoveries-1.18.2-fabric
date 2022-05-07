package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import rndm_access.assorteddiscoveries.ADReference;

public class ADBiomeTags {
    public static final TagKey<Biome> CABIN_BIRCH_FOREST_HAS_STRUCTURE;
    public static final TagKey<Biome> CABIN_DARK_FOREST_HAS_STRUCTURE;
    public static final TagKey<Biome> CABIN_FOREST_HAS_STRUCTURE;
    public static final TagKey<Biome> CABIN_ICY_TAIGA_HAS_STRUCTURE;
    public static final TagKey<Biome> CABIN_TAIGA_HAS_STRUCTURE;
    public static final TagKey<Biome> NETHER_CABIN_CRIMSON_HAS_STRUCTURE;
    public static final TagKey<Biome> NETHER_CABIN_WARPED_HAS_STRUCTURE;

    private static TagKey<Biome> of(String path) {
        return TagKey.of(Registry.BIOME_KEY, ADReference.makeId(path));
    }

    static {
        CABIN_BIRCH_FOREST_HAS_STRUCTURE = of("has_structure/cabin_birch_forest");
        CABIN_DARK_FOREST_HAS_STRUCTURE = of("has_structure/cabin_dark_forest");
        CABIN_FOREST_HAS_STRUCTURE = of("has_structure/cabin_forest");
        CABIN_ICY_TAIGA_HAS_STRUCTURE = of("has_structure/cabin_icy_taiga");
        CABIN_TAIGA_HAS_STRUCTURE = of("has_structure/cabin_taiga");
        NETHER_CABIN_CRIMSON_HAS_STRUCTURE = of("has_structure/nether_cabin_crimson");
        NETHER_CABIN_WARPED_HAS_STRUCTURE = of("has_structure/nether_cabin_warped");
    }
}
