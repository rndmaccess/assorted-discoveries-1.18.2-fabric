package rndm_access.assorteddiscoveries.common.worldgen.placements;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import rndm_access.assorteddiscoveries.common.data.worldgen.features.ADOreFeatures;

import java.util.List;

public class ADOrePlacements {
    public static final PlacedFeature ORE_SMOKY_QUARTZ = ADFeatureUtils.register("ore_smoky_quartz",
            ADOreFeatures.ORE_SMOKY_QUARTZ.placed(commonOrePlacement(16, PlacementUtils.RANGE_10_10)));

    private static List<PlacementModifier> orePlacement(PlacementModifier modifierOne, PlacementModifier modifierTwo) {
        return List.of(modifierOne, InSquarePlacement.spread(), modifierTwo, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(count), modifier);
    }
}
