package rndm_access.assorteddiscoveries.common.worldgen.structure;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.structures.StructurePoolElement;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADStructurePoolStarts {
    public static final StructureTemplatePool TAIGA_CABIN_START = Pools
            .register(new StructureTemplatePool(AssortedDiscoveries.makeModLocation("cabin/taiga/taiga_start"),
                    new ResourceLocation("empty"),
                    ImmutableList.of(Pair.of(StructurePoolElement.single(
                            AssortedDiscoveries.makeModStringLocation("cabin/taiga/taiga_cabin"),
                            ProcessorLists.MOSSIFY_70_PERCENT), 1)),
                    StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool ICY_TAIGA_CABIN_START = Pools.register(new StructureTemplatePool(
            AssortedDiscoveries.makeModLocation("cabin/taiga/icy_taiga_start"), new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.single(
                    AssortedDiscoveries.makeModStringLocation("cabin/icy_taiga/icy_taiga_cabin"),
                    ProcessorLists.MOSSIFY_70_PERCENT), 1)),
            StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool FOREST_CABIN_START = Pools
            .register(new StructureTemplatePool(AssortedDiscoveries.makeModLocation("cabin/forest/forest_start"),
                    new ResourceLocation("empty"),
                    ImmutableList.of(Pair.of(StructurePoolElement.single(
                            AssortedDiscoveries.makeModStringLocation("cabin/forest/forest_cabin"),
                            ProcessorLists.MOSSIFY_70_PERCENT), 1)),
                    StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool BIRCH_FOREST_CABIN_START = Pools.register(new StructureTemplatePool(
            AssortedDiscoveries.makeModLocation("cabin/birch_forest/forest_start"), new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.single(
                    AssortedDiscoveries.makeModStringLocation("cabin/birch_forest/birch_forest_cabin"),
                    ProcessorLists.MOSSIFY_70_PERCENT), 1)),
            StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool DARK_FOREST_CABIN_START = Pools.register(new StructureTemplatePool(
            AssortedDiscoveries.makeModLocation("cabin/forest/dark_forest_start"), new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.single(
                    AssortedDiscoveries.makeModStringLocation("cabin/dark_forest/dark_forest_cabin"),
                    ProcessorLists.MOSSIFY_70_PERCENT), 1)),
            StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool CRIMSON_FOREST_CABIN_START = Pools.register(new StructureTemplatePool(
            AssortedDiscoveries.makeModLocation("nether_cabin/crimson_forest/crimson_forest_cabin"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.single(
                    AssortedDiscoveries.makeModStringLocation("nether_cabin/crimson_forest/crimson_forest_cabin"),
                    ADProcessorLists.WEEPING_70_PERCENT), 1)),
            StructureTemplatePool.Projection.RIGID));
    public static final StructureTemplatePool WARPED_FOREST_CABIN_START = Pools.register(new StructureTemplatePool(
            AssortedDiscoveries.makeModLocation("nether_cabin/warped_forest/warped_forest_cabin"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.single(
                    AssortedDiscoveries.makeModStringLocation("nether_cabin/warped_forest/warped_forest_cabin"),
                    ADProcessorLists.TWISTED_70_PERCENT), 1)),
            StructureTemplatePool.Projection.RIGID));
}
