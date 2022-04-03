package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerTypeHelper;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

import java.lang.reflect.InvocationTargetException;

public class ADVillagerTypes {
    public static final VillagerType CRIMSON;
    public static final VillagerType WARPED;

    private static VillagerType registerVillagerType(String id, RegistryKey<Biome> biome) {
        VillagerType type = VillagerTypeHelper.register(new Identifier(Reference.MOD_ID, id));

        VillagerTypeHelper.addVillagerTypeToBiome(biome, type);
        return type;
    }

    static {
        CRIMSON = registerVillagerType("crimson", BiomeKeys.CRIMSON_FOREST);
        WARPED = registerVillagerType("warped", BiomeKeys.WARPED_FOREST);

        AssortedDiscoveries.LOGGER.info("Registered villager types.");
    }
}















