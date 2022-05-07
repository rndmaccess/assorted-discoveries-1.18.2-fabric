package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;

public class ADPaintingTypes {
    public static final PaintingMotive STARRY_NIGHT = new PaintingMotive(32, 32);

    private static void registerPaintingMotive(String path, PaintingMotive motive) {
        Registry.register(Registry.PAINTING_MOTIVE, ADReference.makeId(path), motive);
    }

    public static void registerPaintingMotives() {
        registerPaintingMotive("starry_night", STARRY_NIGHT);
    }
}
