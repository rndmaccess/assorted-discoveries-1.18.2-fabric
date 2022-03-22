package rndm_access.assorteddiscoveries.common.worldgen.placements;

import net.minecraft.core.Direction;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

public class ADCavePlacements {
    public static final PlacedFeature BAUXITE_CAVES_FLOOR = ADFeatureUtils.register("bauxite_caves_floor",
            CaveFeatures.MOSS_PATCH.placed(CountPlacement.of(125), InSquarePlacement.spread(),
                    PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                    EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(),
                            BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                    RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
    public static final PlacedFeature BAUXITE_CAVES_CEILING = ADFeatureUtils.register("bauxite_caves_ceiling",
            CaveFeatures.MOSS_PATCH_CEILING.placed(CountPlacement.of(125), InSquarePlacement.spread(),
                    PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                    EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(),
                            BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                    RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
}
