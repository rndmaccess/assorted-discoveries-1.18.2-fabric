package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOreConfiguredFeatures;

import java.util.List;

public class ADOrePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ORE_SMOKY_QUARTZ;

    public static void registerOrePlacedFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered ore placed features");
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    static {
        ORE_SMOKY_QUARTZ = ADPlacedFeatures.register("ore_smoky_quartz", ADOreConfiguredFeatures.ORE_SMOKY_QUARTZ,
                modifiersWithCount(16, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));
    }
}
