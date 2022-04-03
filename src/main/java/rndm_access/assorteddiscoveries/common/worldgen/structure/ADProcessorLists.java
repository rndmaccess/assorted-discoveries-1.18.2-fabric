package rndm_access.assorteddiscoveries.common.worldgen.structure;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADProcessorLists {
    public static final StructureProcessorList WEEPING_70_PERCENT = register("weeping_70_percent",
            ImmutableList.of(new RuleProcessor(ImmutableList.of(new ProcessorRule(
                    new RandomBlockMatchTest(Blocks.POLISHED_BLACKSTONE_BRICKS, 0.7F), AlwaysTrueTest.INSTANCE,
                    ADBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState())))));
    public static final StructureProcessorList TWISTED_70_PERCENT = register("twisted_70_percent",
            ImmutableList.of(new RuleProcessor(ImmutableList.of(new ProcessorRule(
                    new RandomBlockMatchTest(Blocks.POLISHED_BLACKSTONE_BRICKS, 0.7F), AlwaysTrueTest.INSTANCE,
                    ADBlocks.TWISTED_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState())))));

    private static StructureProcessorList register(String name, ImmutableList<StructureProcessor> processors) {
        ResourceLocation resourcelocation = AssortedDiscoveries.makeModLocation(name);
        StructureProcessorList structureprocessorlist = new StructureProcessorList(processors);
        return BuiltinRegistries.register(BuiltinRegistries.PROCESSOR_LIST, resourcelocation, structureprocessorlist);
    }
}
