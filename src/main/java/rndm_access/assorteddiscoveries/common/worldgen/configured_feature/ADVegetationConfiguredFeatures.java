package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.List;

public class ADVegetationConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> PATCH_BLUEBERRY_BUSH = ADFeatureUtils.register("patch_blueberry_bush",
            Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(
                    Feature.SIMPLE_BLOCK.configured(makeBushConfig(ADBlocks.BLUEBERRY_BUSH.get())),
                    List.of(Blocks.GRASS_BLOCK))));
    public static final ConfiguredFeature<?, ?> PATCH_WITCHS_CRADLE = ADFeatureUtils.register("patch_witchs_cradle",
            Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(
                    Feature.SIMPLE_BLOCK.configured(makeBushConfig(ADBlocks.WITCHS_CRADLE.get())),
                    List.of(Blocks.GRASS_BLOCK))));
    public static final ConfiguredFeature<RandomPatchConfiguration, ?> SNAPDRAGON_AND_GRASS_DEFAULT = FeatureUtils
            .register("snapdragon_and_grass_default",
                    Feature.FLOWER.configured(grassPatch(new WeightedStateProvider(SimpleWeightedRandomList
                            .<BlockState>builder().add(ADBlocks.ENDER_GRASS.get().defaultBlockState(), 2)
                            .add(ADBlocks.SNAPDRAGON.get().defaultBlockState(), 1)), 64)));

    private static SimpleBlockConfiguration makeBushConfig(Block block) {
        return new SimpleBlockConfiguration(BlockStateProvider
                .simple(block.defaultBlockState().setValue(ADBerryBushBlock.AGE, Integer.valueOf(3))));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries,
                Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(stateProvider)).onlyWhenEmpty());
    }
}
