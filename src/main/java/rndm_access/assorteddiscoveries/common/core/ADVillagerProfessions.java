package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADVillagerProfessions {

    public static final VillagerProfession LUMBERJACK;

    private static VillagerProfession register(String name, VillagerProfession profession) {
        return Registry.register(Registry.VILLAGER_PROFESSION, ADReference.makeId(name), profession);
    }

    /**
     * Called during mod initialization to register every villager profession.
     */
    public static void registerVillagerProfessions() {
        AssortedDiscoveries.LOGGER.info("Registered Villager Professions");
    }

    static {
        LUMBERJACK = register("lumberjack",
                VillagerProfessionBuilder.create().workstation(ADPoiTypes.LUMBERJACK).id(ADReference.makeId("lumberjack"))
                        .workSound(ADSoundEvents.UI_WOODCUTTER_TAKE_RESULT).build());
    }
}