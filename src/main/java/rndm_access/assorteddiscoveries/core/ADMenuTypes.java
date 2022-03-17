package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.menu.ADWoodcutterMenu;

public class ADMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<MenuType<ADWoodcutterMenu>> WOODCUTTER = MENU_TYPES.register("woodcutter",
            () -> {
                return new MenuType<>(ADWoodcutterMenu::new);
            });
}
