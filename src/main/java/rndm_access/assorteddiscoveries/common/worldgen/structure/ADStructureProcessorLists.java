package rndm_access.assorteddiscoveries.common.worldgen.structure;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.structure.processor.*;
import net.minecraft.structure.rule.AlwaysTrueRuleTest;
import net.minecraft.structure.rule.RandomBlockMatchRuleTest;
import net.minecraft.util.registry.BuiltinRegistries;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

public class ADStructureProcessorLists {
    public static final StructureProcessorList WEEPING_70_PERCENT = new StructureProcessorList(ImmutableList.of(
            new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(
                    new RandomBlockMatchRuleTest(Blocks.POLISHED_BLACKSTONE_BRICKS, 0.7F),
                    AlwaysTrueRuleTest.INSTANCE, ADBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS.getDefaultState())))));
    public static final StructureProcessorList TWISTED_70_PERCENT = new StructureProcessorList(ImmutableList.of(
            new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(
                    new RandomBlockMatchRuleTest(Blocks.POLISHED_BLACKSTONE_BRICKS, 0.7F),
                    AlwaysTrueRuleTest.INSTANCE, ADBlocks.TWISTED_POLISHED_BLACKSTONE_BRICKS.getDefaultState())))));

    private static void register(String path, StructureProcessorList processorList) {
        BuiltinRegistries.add(BuiltinRegistries.STRUCTURE_PROCESSOR_LIST, ADReference.makeId(path), processorList);
    }

    /**
     * Called during initialization to register every structure processor list.
     */
    public static void registerProcessorLists() {
        register("weeping_70_percent", WEEPING_70_PERCENT);
        register("twisted_70_percent", TWISTED_70_PERCENT);

        AssortedDiscoveries.LOGGER.info("Registered processor lists.");
    }
}
