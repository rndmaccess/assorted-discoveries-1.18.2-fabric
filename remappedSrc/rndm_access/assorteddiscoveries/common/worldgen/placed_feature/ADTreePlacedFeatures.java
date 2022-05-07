package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADTreeConfiguredFeatures;

import java.util.List;

public class ADTreePlacedFeatures {
    public static final RegistryKey<PlacedFeature> HUGE_PURPLE_MUSHROOM_VEGETATION;

    private static List<PlacementModifier> getPurpleMushroomPlacement(int chance, PlacementModifier modifier) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();
        if (modifier != null) {
            builder.add(modifier);
        }

        if (chance != 0) {
            builder.add(RarityFilterPlacementModifier.of(chance));
        }

        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    static {
        HUGE_PURPLE_MUSHROOM_VEGETATION = ADPlacedFeatures.register("huge_purple_mushroom_vegetation",
                ADTreeConfiguredFeatures.HUGE_PURPLE_MUSHROOM.withPlacement(getPurpleMushroomPlacement(20, CountPlacementModifier.of(3))));
    }
}
