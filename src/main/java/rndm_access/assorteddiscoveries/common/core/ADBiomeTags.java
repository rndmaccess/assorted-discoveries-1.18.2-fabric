package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import rndm_access.assorteddiscoveries.ADReference;

public class ADBiomeTags {
    public static final TagKey<Biome> ORE_SMOKY_QUARTZ;
    public static final TagKey<Biome> PATCH_BLUEBERRY_BUSH;
    public static final TagKey<Biome> PATCH_CATTAIL;
    public static final TagKey<Biome> PATCH_ENDER_PLANTS;
    public static final TagKey<Biome> PATCH_HUGE_PURPLE_MUSHROOM;
    public static final TagKey<Biome> PATCH_WITCHS_CRADLE;
    public static final TagKey<Biome> BLOOD_KELP;

    private static TagKey<Biome> of(String path) {
        return TagKey.of(Registry.BIOME_KEY, ADReference.makeId(path));
    }

    static {
        ORE_SMOKY_QUARTZ = of("has_feature/ore_smoky_quartz");
        PATCH_BLUEBERRY_BUSH = of("has_feature/patch_blueberry_bush");
        PATCH_CATTAIL = of("has_feature/patch_cattail");
        PATCH_ENDER_PLANTS = of("has_feature/patch_ender_plants");
        PATCH_HUGE_PURPLE_MUSHROOM = of("has_feature/patch_huge_purple_mushroom");
        PATCH_WITCHS_CRADLE = of("has_feature/patch_witchs_cradle");
        BLOOD_KELP = of("has_feature/blood_kelp");
    }
}
