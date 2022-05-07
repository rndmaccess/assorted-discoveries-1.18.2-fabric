package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;

public class ADItemTags {
    public static final TagKey<Item> PACKET_SEEDS;

    /**
     * @param path The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static TagKey<Item> bind(String path) {
        return TagKey.of(Registry.ITEM_KEY, ADReference.makeId(path));
    }

    static {
        PACKET_SEEDS = bind("packet_seeds");
    }
}
