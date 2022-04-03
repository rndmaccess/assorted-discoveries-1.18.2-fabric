package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOreConfiguredFeatures;

import java.util.List;

public class ADOrePlacedFeatures {
    public static final PlacedFeature ORE_SMOKY_QUARTZ;

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    static {
        ORE_SMOKY_QUARTZ = ADPlacedFeatures.register("ore_smoky_quartz",
                ADOreConfiguredFeatures.ORE_SMOKY_QUARTZ.withPlacement(modifiersWithCount(16, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE)));
    }
}
