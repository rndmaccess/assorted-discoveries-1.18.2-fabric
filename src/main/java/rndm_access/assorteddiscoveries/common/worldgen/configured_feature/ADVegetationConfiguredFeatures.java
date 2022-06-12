package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.List;

public class ADVegetationConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> PATCH_WITCHS_CRADLE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> SNAPDRAGON_AND_GRASS_DEFAULT;

    public static void registerVegetationConfiguredFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered vegetation configured features");
    }

    private static RandomPatchFeatureConfig makeBushConfig(Block block) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(block.getDefaultState()
                        .with(SweetBerryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK));
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    private static RandomPatchFeatureConfig createSnapdragonAndEnderGrassConfig() {
        DataPool<BlockState> snapdragonOrEnderGrass = DataPool.<BlockState>builder()
                .add(ADBlocks.ENDER_GRASS.getDefaultState(), 2)
                .add(ADBlocks.SNAPDRAGON.getDefaultState(), 1).build();

        return createRandomPatchFeatureConfig(new WeightedBlockStateProvider(snapdragonOrEnderGrass), 64);
    }

    static {
        PATCH_BLUEBERRY_BUSH = ADConfiguredFeatures.register("patch_blueberry_bush",
                Feature.RANDOM_PATCH, makeBushConfig(ADBlocks.BLUEBERRY_BUSH));
        PATCH_WITCHS_CRADLE = ADConfiguredFeatures.register("patch_witchs_cradle",
                Feature.RANDOM_PATCH, makeBushConfig(ADBlocks.WITCHS_CRADLE));
        SNAPDRAGON_AND_GRASS_DEFAULT = ADConfiguredFeatures.register("snapdragon_and_grass_default", Feature.FLOWER,
                createSnapdragonAndEnderGrassConfig());
    }
}
