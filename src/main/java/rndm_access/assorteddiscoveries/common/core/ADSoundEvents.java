package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<SoundEvent> BLOCK_MUSHROOM_BOUNCE = register("block.mushroom_bounce");
    public static final RegistryObject<SoundEvent> UI_WOODCUTTER_TAKE_RESULT = register("ui.woodcutter.take_result");

    /**
     * @param name The name for the sound event.
     * @return new sound event.
     */
    private static RegistryObject<SoundEvent> register(String name) {
        ResourceLocation modLocation = AssortedDiscoveries.makeModLocation(name);
        SoundEvent sound = new SoundEvent(modLocation);

        return SOUNDS.register(name, () -> sound);
    }
}
