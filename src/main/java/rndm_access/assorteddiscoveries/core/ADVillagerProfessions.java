package rndm_access.assorteddiscoveries.core;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADVillagerProfessions {
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister
            .create(ForgeRegistries.PROFESSIONS, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<VillagerProfession> LUMBERJACK = VILLAGER_PROFESSIONS.register("lumberjack",
            () -> {
                return new VillagerProfession(AssortedDiscoveries.makeModLocation("lumberjack").toString(),
                        ADPoiTypes.LUMBERJACK.get(), ImmutableSet.of(), ImmutableSet.of(),
                        ADSoundEvents.UI_WOODCUTTER_TAKE_RESULT.get());
            });
}