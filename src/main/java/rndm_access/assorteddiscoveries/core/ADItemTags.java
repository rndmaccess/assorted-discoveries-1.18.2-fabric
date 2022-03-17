package rndm_access.assorteddiscoveries.core;

import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeTagHandler;
import net.minecraftforge.registries.ForgeRegistries;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADItemTags {
    public static final Tag<Item> PACKET_SEEDS = bind("packet_seeds");
    public static final Tag<Item> BRUTE_RELICS = bind("brute_relics");
    public static final Tag<Item> GUARDIAN_TOTEMS = bind("guardian_relics");
    public static final Tag<Item> FORTUNATE_RELICS = bind("fortunate_relics");
    public static final Tag<Item> MINER_RELICS = bind("miner_relics");
    public static final Tag<Item> PHANTOM_TOTEMS = bind("phantom_totems");

    /**
     * @param name The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static Tag<Item> bind(String name) {
        return ForgeTagHandler.createOptionalTag(ForgeRegistries.ITEMS, AssortedDiscoveries.makeModLocation(name));
    }
}
