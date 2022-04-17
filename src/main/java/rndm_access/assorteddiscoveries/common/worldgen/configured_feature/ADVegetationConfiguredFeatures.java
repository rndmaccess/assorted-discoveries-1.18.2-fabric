package rndm_access.assorteddiscoveries.common.worldgen.configured_feature;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.List;

public class ADVegetationConfiguredFeatures {
    /*
    public static final ConfiguredFeature<?, ?> PATCH_BLUEBERRY_BUSH = ADFeatureUtils.register("patch_blueberry_bush",
            Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(
                    Feature.SIMPLE_BLOCK.configure(makeBushConfig(ADBlocks.BLUEBERRY_BUSH)),
                    List.of(Blocks.GRASS_BLOCK))));
    public static final ConfiguredFeature<?, ?> PATCH_WITCHS_CRADLE = ADFeatureUtils.register("patch_witchs_cradle",
            Feature.RANDOM_PATCH.configured(FeatureUtils.simplePatchConfiguration(
                    Feature.SIMPLE_BLOCK.configure(makeBushConfig(ADBlocks.WITCHS_CRADLE)),
                    List.of(Blocks.GRASS_BLOCK))));
    public static final ConfiguredFeature<RandomPatchConfiguration, ?> SNAPDRAGON_AND_GRASS_DEFAULT = FeatureUtils
            .register("snapdragon_and_grass_default",
                    Feature.FLOWER.configure(grassPatch(new WeightedStateProvider(SimpleWeightedRandomList
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
     */
}
