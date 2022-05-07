package rndm_access.assorteddiscoveries.common.worldgen.structure;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;

public class ADNetherCabinData {
    public static final StructurePool CRIMSON_FOREST_CABIN_START;
    public static final StructurePool WARPED_FOREST_CABIN_START;

    static {
        CRIMSON_FOREST_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("nether_cabin/crimson_forest/crimson_forest_cabin"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("nether_cabin/crimson_forest/crimson_forest_cabin").toString(),
                        ADStructureProcessorLists.WEEPING_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
        WARPED_FOREST_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("nether_cabin/warped_forest/warped_forest_cabin"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("nether_cabin/warped_forest/warped_forest_cabin").toString(),
                        ADStructureProcessorLists.TWISTED_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
    }
}
