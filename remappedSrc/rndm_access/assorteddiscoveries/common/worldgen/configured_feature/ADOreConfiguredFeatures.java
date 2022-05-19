package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADOreConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<?, ?>> ORE_SMOKY_QUARTZ;

    public static void registerOreConfiguredFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered ore configured features");
    }

    static {
        ORE_SMOKY_QUARTZ = ADConfiguredFeatures.register("ore_smoky_quartz",
                Feature.ORE,
                new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, ADBlocks.NETHER_SMOKY_QUARTZ_ORE.getDefaultState(), 14));
    }
}
