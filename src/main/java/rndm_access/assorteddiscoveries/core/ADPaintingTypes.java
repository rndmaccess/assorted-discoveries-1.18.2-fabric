package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADPaintingTypes {
    public static final DeferredRegister<Motive> PAINTING_TYPES = DeferredRegister
            .create(ForgeRegistries.PAINTING_TYPES, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<Motive> STARRY_NIGHT = PAINTING_TYPES.register("starry_night", () -> {
        return new Motive(32, 32);
    });
}
