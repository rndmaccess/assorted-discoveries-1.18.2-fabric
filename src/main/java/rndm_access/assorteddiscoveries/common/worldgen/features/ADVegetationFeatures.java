package rndm_access.assorteddiscoveries.common.worldgen.features;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import rndm_access.assorteddiscoveries.common.block.ADBerryBushBlock;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.List;

public class ADVegetationFeatures {
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
