package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADPaintingTypes {
    public static final PaintingMotive STARRY_NIGHT;

    private static PaintingMotive register(String path, PaintingMotive motive) {
        return Registry.register(Registry.PAINTING_MOTIVE, ADReference.makeId(path), motive);
    }

    public static void registerPaintingMotives() {
        AssortedDiscoveries.LOGGER.info("Registered painting motives");
    }

    static {
        STARRY_NIGHT = register("starry_night", new PaintingMotive(32, 32));
    }
}
