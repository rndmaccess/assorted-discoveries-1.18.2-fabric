package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADBiomeGeneration {

    public static void generateBiomes() {
        addBiome(ADBiomes.PHOSPHORESCENT_BASIN, BiomeManager.BiomeType.WARM, 10, BiomeDictionary.Type.OCEAN);
    }

    private static void addBiome(ResourceKey<Biome> biome, BiomeManager.BiomeType type, int weight,
            BiomeDictionary.Type... types) {

        BiomeDictionary.addTypes(biome, types);
        // BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, weight));
        BiomeManager.addAdditionalOverworldBiomes(biome);

        AssortedDiscoveries.LOGGER.debug("Added biomes.");
    }
}
