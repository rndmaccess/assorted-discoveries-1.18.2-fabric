package rndm_access.assorteddiscoveries.common.worldgen.placed_feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import rndm_access.assorteddiscoveries.ADReference;

import java.util.List;

public class ADPlacedFeatures {
    public static RegistryEntry<PlacedFeature> register(String path, RegistryEntry<? extends ConfiguredFeature<?, ?>> feature, List<PlacementModifier> modifiers) {
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, ADReference.makeId(path), new PlacedFeature(RegistryEntry.upcast(feature), List.copyOf(modifiers)));
    }
}
