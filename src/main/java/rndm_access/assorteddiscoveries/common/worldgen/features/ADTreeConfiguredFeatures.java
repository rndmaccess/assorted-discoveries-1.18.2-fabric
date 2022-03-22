package rndm_access.assorteddiscoveries.common.worldgen.features;

import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADTreeConfiguredFeatures {
    public static final ConfiguredFeature<HugeMushroomFeatureConfig, ?> HUGE_PURPLE_MUSHROOM;

    static {
        HUGE_PURPLE_MUSHROOM = ADConfiguredFeatures.register("huge_purple_mushroom",
                Feature.HUGE_RED_MUSHROOM.configure(new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(ADBlocks.PURPLE_MUSHROOM_BLOCK
                                .getDefaultState().with(MushroomBlock.DOWN, false)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState()
                                .with(MushroomBlock.UP, false).with(MushroomBlock.DOWN, false)), 2)));
    }
}
