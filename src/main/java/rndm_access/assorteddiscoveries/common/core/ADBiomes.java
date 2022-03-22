package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADBiomes {
    public static final ResourceKey<Biome> PHOSPHORESCENT_BASIN = register("phosphorescent_basin");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, AssortedDiscoveries.makeModLocation(name));
    }
}
