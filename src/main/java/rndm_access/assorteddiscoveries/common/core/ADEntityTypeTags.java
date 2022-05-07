package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.entity.EntityType;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;

public class ADEntityTypeTags {
    public static final TagKey<EntityType<?>> SNAPDRAGON_TELEPORT_EXCEPTIONS;
    public static final TagKey<EntityType<?>> ANIMALS_THAT_GIVE_BLOOD;
    public static final TagKey<EntityType<?>> BLUEBERRY_BUSH_SLOWS;
    public static final TagKey<EntityType<?>> WITCHS_CRADLE_SLOWS_AND_DAMAGES;

    /**
     * @param path The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static TagKey<EntityType<?>> bind(String path) {
        return TagKey.of(Registry.ENTITY_TYPE_KEY, ADReference.makeId(path));
    }

    static {
        SNAPDRAGON_TELEPORT_EXCEPTIONS = bind("snapdragon_teleport_exceptions");
        ANIMALS_THAT_GIVE_BLOOD = bind("animals_that_give_blood");
        BLUEBERRY_BUSH_SLOWS = bind("blueberry_bush_slows");
        WITCHS_CRADLE_SLOWS_AND_DAMAGES = bind("witchs_cradle_slows_and_damages");
    }
}
