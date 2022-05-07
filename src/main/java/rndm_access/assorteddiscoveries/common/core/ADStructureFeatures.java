package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADCabinFeature;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADNetherCabinFeature;

public class ADStructureFeatures {
    public static final StructureFeature<StructurePoolFeatureConfig> CABIN;
    public static final StructureFeature<StructurePoolFeatureConfig> NETHER_CABIN;

    private static <T extends FeatureConfig> StructureFeature<T> register(String path, StructureFeature<T> structureFeature) {
        return Registry.register(Registry.STRUCTURE_FEATURE, ADReference.makeId(path), structureFeature);
    }

    /**
     * Called during initialization to register every structure feature.
     */
    public static void registerStructureFeatures() {
        AssortedDiscoveries.LOGGER.info("Registered structure features");
    }

    static {
        CABIN = register("cabin", new ADCabinFeature(StructurePoolFeatureConfig.CODEC));
        NETHER_CABIN = register("nether_cabin", new ADNetherCabinFeature(StructurePoolFeatureConfig.CODEC));
    }
}
