package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import rndm_access.assorteddiscoveries.ADReference;

public class ADBiomeTags {
    public static final TagKey<Biome> CATTAIL_PATCH;
    public static final TagKey<Biome> HUGE_PURPLE_MUSHROOM;
    public static final TagKey<Biome> ORE_SMOKY_QUARTZ;
    public static final TagKey<Biome> BLUEBERRY_BUSH_PATCH;
    public static final TagKey<Biome> WITCHS_CRADLE_PATCH;
    public static final TagKey<Biome> SNAPDRAGON_AND_ENDER_GRASS;

    private static TagKey<Biome> of(String path) {
        return TagKey.of(Registry.BIOME_KEY, ADReference.makeId(path));
    }

    static {
        CATTAIL_PATCH = of("has_feature/cattail_patch");
        HUGE_PURPLE_MUSHROOM = of("has_feature/huge_purple_mushroom");
        ORE_SMOKY_QUARTZ = of("has_feature/ore_smoky_quartz");
        BLUEBERRY_BUSH_PATCH = of("has_feature/blueberry_bush_patch");
        WITCHS_CRADLE_PATCH = of("has_feature/witchs_cradle_patch");
        SNAPDRAGON_AND_ENDER_GRASS = of("has_feature/snapdragon_and_ender_grass");
    }
}
