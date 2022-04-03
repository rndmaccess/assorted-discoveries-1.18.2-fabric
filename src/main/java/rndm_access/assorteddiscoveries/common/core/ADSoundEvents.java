package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.Reference;

public class ADSoundEvents {
    public static final SoundEvent BLOCK_MUSHROOM_BOUNCE;
    public static final SoundEvent UI_WOODCUTTER_TAKE_RESULT;

    /**
     * @param name The name for the sound event.
     * @return new sound event.
     */
    private static SoundEvent registerSound(String id) {
        Identifier name = new Identifier(Reference.MOD_ID, id);

        return Registry.register(Registry.SOUND_EVENT, name, new SoundEvent(name));
    }

    static {
        BLOCK_MUSHROOM_BOUNCE = registerSound("block.mushroom_bounce");
        UI_WOODCUTTER_TAKE_RESULT = registerSound("ui.woodcutter.take_result");
    }
}
