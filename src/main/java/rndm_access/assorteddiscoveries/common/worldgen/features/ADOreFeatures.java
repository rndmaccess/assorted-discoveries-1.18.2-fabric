package rndm_access.assorteddiscoveries.common.worldgen.features;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import rndm_access.assorteddiscoveries.common.config.ADServerConfig;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADOreFeatures {
    public static final ConfiguredFeature<?, ?> ORE_SMOKY_QUARTZ = ADFeatureUtils.register("ore_smoky_quartz",
            Feature.ORE.configured(new OreConfiguration(OreFeatures.NETHERRACK, States.NETHER_SMOKY_QUARTZ_ORE,
                    ADServerConfig.netherSmokyQuartzOreVeinSize.get())));

    static class States {
        protected static final BlockState NETHER_SMOKY_QUARTZ_ORE = ADBlocks.NETHER_SMOKY_QUARTZ_ORE.get()
                .defaultBlockState();
    }
}
