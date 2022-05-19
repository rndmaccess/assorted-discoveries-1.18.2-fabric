package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADVegetationConfiguredFeatures;

import java.util.List;

public class ADVegetationPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> PATCH_BLUEBERRY_COMMON;
    public static final RegistryEntry<PlacedFeature> PATCH_BLUEBERRY_RARE;
    public static final RegistryEntry<PlacedFeature> PATCH_WITCHS_CRADLE_COMMON;
    public static final RegistryEntry<PlacedFeature> PATCH_WITCHS_CRADLE_RARE;
    public static final RegistryEntry<PlacedFeature> SNAPDRAGON_AND_ENDER_GRASS;

    public static void registerVegetationPlacedFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered vegetation placed features");
    }

    private static List<PlacementModifier> makeCommonBushPlacement() {
        return makeBushPlacement(32);
    }

    private static List<PlacementModifier> makeRareBushPlacement() {
        return makeBushPlacement(384);
    }

    private static List<PlacementModifier> makeBushPlacement(int chance) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();

        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        builder.add(RarityFilterPlacementModifier.of(chance));
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    private static List<PlacementModifier> makeSnapdragonAndEnderGrassPlacement() {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();

        builder.add(RarityFilterPlacementModifier.of(32));
        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP);
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    static {
        PATCH_BLUEBERRY_COMMON = ADPlacedFeatures.register("patch_blueberry_common",
                ADVegetationConfiguredFeatures.PATCH_BLUEBERRY_BUSH, makeCommonBushPlacement());
        PATCH_BLUEBERRY_RARE = ADPlacedFeatures.register("patch_blueberry_rare",
                ADVegetationConfiguredFeatures.PATCH_BLUEBERRY_BUSH, makeRareBushPlacement());
        PATCH_WITCHS_CRADLE_COMMON = ADPlacedFeatures.register("patch_witchs_cradle_common",
                ADVegetationConfiguredFeatures.PATCH_WITCHS_CRADLE, makeCommonBushPlacement());
        PATCH_WITCHS_CRADLE_RARE = ADPlacedFeatures.register("patch_witchs_cradle_rare",
                ADVegetationConfiguredFeatures.PATCH_WITCHS_CRADLE, makeRareBushPlacement());
        SNAPDRAGON_AND_ENDER_GRASS = ADPlacedFeatures.register("snapdragon_and_ender_grass",
                ADVegetationConfiguredFeatures.SNAPDRAGON_AND_GRASS_DEFAULT, makeSnapdragonAndEnderGrassPlacement());
    }
}
