package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.screen.ADWoodcutterScreenHandler;

public class ADMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<MenuType<ADWoodcutterScreenHandler>> WOODCUTTER = MENU_TYPES.register("woodcutter",
            () -> {
                return new MenuType<>(ADWoodcutterScreenHandler::new);
            });
}
