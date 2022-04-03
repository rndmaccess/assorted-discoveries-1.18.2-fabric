package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADCabinFeature;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADNetherCabinFeature;

public class ADStructureFeatures {
    public static final StructureFeature<StructurePoolFeatureConfig> CABIN;
    public static final StructureFeature<StructurePoolFeatureConfig> NETHER_CABIN;

    private static <T extends FeatureConfig> StructureFeature<T> registerStructure(String id, StructureFeature<T> structureFeature) {
        return Registry.register(Registry.STRUCTURE_FEATURE, new Identifier(Reference.MOD_ID, id), structureFeature);
    }

    static {
        CABIN = registerStructure("cabin", new ADCabinFeature(StructurePoolFeatureConfig.CODEC));
        NETHER_CABIN = registerStructure("nether_cabin", new ADNetherCabinFeature(StructurePoolFeatureConfig.CODEC));
    }
}
