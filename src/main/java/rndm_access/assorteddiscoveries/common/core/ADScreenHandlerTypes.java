package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.screen.ADWoodcutterScreenHandler;

public class ADScreenHandlerTypes {
    public static final ScreenHandlerType<ADWoodcutterScreenHandler> WOODCUTTER;

    public static void registerScreenHandlerTypes() {
        AssortedDiscoveries.LOGGER.info("Registered screen handler types.");
    }

    static {
        WOODCUTTER = ScreenHandlerRegistry.registerSimple(ADReference.makeId("woodcutter"), ADWoodcutterScreenHandler::new);
    }
}
