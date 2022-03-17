package rndm_access.assorteddiscoveries.core;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ADVillagerTypes {
    public static final Constructor<VillagerType> CONSTRUCTOR = ObfuscationReflectionHelper
            .findConstructor(VillagerType.class, String.class);

    public static final VillagerType CRIMSON = register("crimson");
    public static final VillagerType WARPED = register("warped");

    /**
     * A helper method for automatically registering and adding every new villager
     * type to the byBiome map, which is used when spawning villagers in different
     * biomes.
     *
     * @param name The name of the new villager type.
     * @return A new registered villager type.
     */
    private static VillagerType register(String name) {
        ResourceLocation modLoc = AssortedDiscoveries.makeModLocation(name);
        try {
            return Registry.register(Registry.VILLAGER_TYPE, modLoc, CONSTRUCTOR.newInstance(modLoc.toString()));
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        return VillagerType.PLAINS;
    }
}
