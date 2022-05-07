package rndm_access.assorteddiscoveries.common.worldgen.structure;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADCabinData {
    public static final StructurePool TAIGA_CABIN_START;
    public static final StructurePool ICY_TAIGA_CABIN_START;
    public static final StructurePool FOREST_CABIN_START;
    public static final StructurePool BIRCH_FOREST_CABIN_START;
    public static final StructurePool DARK_FOREST_CABIN_START;

    static {
        TAIGA_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("cabin/taiga/taiga_start"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("cabin/taiga/taiga_cabin").toString(),
                        StructureProcessorLists.MOSSIFY_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
        ICY_TAIGA_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("cabin/taiga/icy_taiga_start"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("cabin/icy_taiga/icy_taiga_cabin").toString(),
                        StructureProcessorLists.MOSSIFY_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
        FOREST_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("cabin/forest/forest_start"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("cabin/forest/forest_cabin").toString(),
                        StructureProcessorLists.MOSSIFY_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
        BIRCH_FOREST_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("cabin/birch_forest/forest_start"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("cabin/birch_forest/birch_forest_cabin").toString(),
                        StructureProcessorLists.MOSSIFY_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
        DARK_FOREST_CABIN_START = StructurePools.register(new StructurePool(
                ADReference.makeId("cabin/forest/dark_forest_start"),
                new Identifier("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle(
                        ADReference.makeId("cabin/dark_forest/dark_forest_cabin").toString(),
                        StructureProcessorLists.MOSSIFY_70_PERCENT), 1)),
                StructurePool.Projection.RIGID));
    }
}
