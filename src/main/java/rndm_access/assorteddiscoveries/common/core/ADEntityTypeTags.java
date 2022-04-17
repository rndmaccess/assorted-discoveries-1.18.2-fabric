package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADEntityTypeTags {
    public static final Tag<EntityType<?>> SNAPDRAGON_TELEPORT_EXCEPTIONS;
    public static final Tag<EntityType<?>> ANIMALS_THAT_GIVE_BLOOD;
    public static final Tag<EntityType<?>> BLUEBERRY_BUSH_SLOWS;
    public static final Tag<EntityType<?>> WITCHS_CRADLE_SLOWS_AND_DAMAGES;

    /**
     * @param path The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static Tag<EntityType<?>> bind(String path) {
        return TagFactory.ENTITY_TYPE.create(ADReference.makeId(path));
    }

    static {
        SNAPDRAGON_TELEPORT_EXCEPTIONS = bind("snapdragon_teleport_exceptions");
        ANIMALS_THAT_GIVE_BLOOD = bind("animals_that_give_blood");
        BLUEBERRY_BUSH_SLOWS = bind("blueberry_bush_slows");
        WITCHS_CRADLE_SLOWS_AND_DAMAGES = bind("witchs_cradle_slows_and_damages");
    }
}
