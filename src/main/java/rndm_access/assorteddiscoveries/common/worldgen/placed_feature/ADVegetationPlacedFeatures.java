package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class ADVegetationPlacedFeatures {
    /*
    public static final PlacedFeature PATCH_BLUEBERRY_COMMON = ADFeatureUtils.register("patch_blueberry_common",
            ADVegetationFeatures.PATCH_BLUEBERRY_BUSH.placed(getCommonBushPlacement()));
    public static final PlacedFeature PATCH_BLUEBERRY_RARE = ADFeatureUtils.register("patch_blueberry_rare",
            ADVegetationFeatures.PATCH_BLUEBERRY_BUSH.placed(getRareBushPlacement()));
    public static final PlacedFeature PATCH_WITCHS_CRADLE_COMMON = ADFeatureUtils.register("patch_witchs_cradle_common",
            ADVegetationFeatures.PATCH_WITCHS_CRADLE.placed(getCommonBushPlacement()));
    public static final PlacedFeature PATCH_WITCHS_CRADLE_RARE = ADFeatureUtils.register("patch_witchs_cradle_rare",
            ADVegetationFeatures.PATCH_WITCHS_CRADLE.placed(getRareBushPlacement()));
    public static final PlacedFeature SNAPDRAGON_AND_GRASS_DEFAULT = PlacementUtils.register(
            "snapdragon_and_grass_default",
            ADVegetationFeatures.SNAPDRAGON_AND_GRASS_DEFAULT.placed(RarityFilter.onAverageOnceEvery(32),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    private static List<PlacementModifier> getCommonBushPlacement() {
        return getBushPlacement(32);
    }

    private static List<PlacementModifier> getRareBushPlacement() {
        return getBushPlacement(384);
    }

    private static List<PlacementModifier> getBushPlacement(int chance) {
        Builder<PlacementModifier> builder = ImmutableList.builder();

        builder.add(InSquarePlacement.spread());
        builder.add(PlacementUtils.HEIGHTMAP_WORLD_SURFACE);
        builder.add(RarityFilter.onAverageOnceEvery(chance));
        builder.add(BiomeFilter.biome());
        return builder.build();
    }
     */
}
