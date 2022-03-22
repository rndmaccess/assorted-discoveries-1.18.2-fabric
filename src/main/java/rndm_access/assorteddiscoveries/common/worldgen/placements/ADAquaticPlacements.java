package rndm_access.assorteddiscoveries.common.worldgen.placements;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import rndm_access.assorteddiscoveries.common.data.worldgen.features.ADAquaticFeatures;

import java.util.List;

public class ADAquaticPlacements {
    public static final PlacedFeature CATTAIL_SWAMP = ADFeatureUtils.register("cattail_swamp",
            ADAquaticFeatures.CATTAIL_SWAMP.placed(seagrassPlacement(64)));

    public static List<PlacementModifier> seagrassPlacement(int count) {
        return List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, CountPlacement.of(count),
                BiomeFilter.biome());
    }
}
