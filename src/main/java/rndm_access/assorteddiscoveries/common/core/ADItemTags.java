package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;

public class ADItemTags {
    public static final Tag<Item> PACKET_SEEDS;

    /**
     * @param id The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static Tag<Item> bind(String id) {
        return TagFactory.ITEM.create(new Identifier(ADReference.MOD_ID, id));
    }

    static {
        PACKET_SEEDS = bind("packet_seeds");
    }
}
