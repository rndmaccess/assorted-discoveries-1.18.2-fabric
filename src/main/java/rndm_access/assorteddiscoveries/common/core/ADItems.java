package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.*;

public class ADItems {
    public static final Item BOK_CHOY;
    public static final Item BOK_CHOY_SEEDS;
    public static final Item GARLIC;
    public static final Item GREEN_ONION;
    public static final Item BLUEBERRIES;
    public static final Item SWEET_BERRY_JUICE;
    public static final Item BLUEBERRY_JUICE;
    public static final Item NOODLES;
    public static final Item NOODLE_SOUP;
    public static final Item PUDDING;
    public static final Item BERRY_PUDDING;
    public static final Item SMOKY_QUARTZ;
    public static final Item CARAMEL_APPLE;
    public static final Item CARAMEL;
    public static final Item SPRUCE_CONE;
    public static final Item FORESTS_BOUNTY;
    public static final Item WITCHS_CRADLE_BRANCH;
    public static final Item WITCHS_CRADLE_SOUP;
    public static final Item GLASS_VIAL;
    public static final Item BLOOD_VIAL;
    public static final Item MIXED_SEED_PACKET;
    public static final Item CATTAIL;
    public static final Item CHARRED_REMNANT_SPAWN_EGG;
    public static final Item CHARRED_FLESH;
    public static final Item DRIED_BAMBOO;
    public static final Item FRIED_EGG;
    public static final Item BLOOD_KELP_SEED_CLUSTER;

    private static Item item() {
        return new Item(makeSettings());
    }

    /**
     * A helper method that makes Settings for an item that is added to the vanilla
     * expansions tab.
     *
     * @return The Settings for this item.
     */
    public static Item.Settings makeSettings() {
        return new Item.Settings().group(AssortedDiscoveries.MOD_GROUP);
    }

    /**
     * A helper method that makes Settings for a food item that is added to the
     * vanilla expansions tab.
     *
     * @param food The stats of this food item.
     * @return The Settings for this item.
     */
    private static Item.Settings makeSettings(FoodComponent food) {
        return new Item.Settings().group(AssortedDiscoveries.MOD_GROUP).food(food);
    }

    /**
     * A helper method that makes Settings for a food item with a custom max stack
     * size and is added to the vanilla expansions tab.
     *
     * @param food     The stats for this food item.
     * @param maxCount The max stack size for this item.
     * @return The Settings for this item.
     */
    private static Item.Settings makeSettings(FoodComponent food, int maxCount) {
        return new Item.Settings().group(AssortedDiscoveries.MOD_GROUP).food(food).maxCount(maxCount);
    }

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, id), item);
    }

    static {
        BOK_CHOY = registerItem("bok_choy", new Item(makeSettings(ADFoodComponents.BOK_CHOY)));
        BOK_CHOY_SEEDS = registerItem("bok_choy_seeds",
                new AliasedBlockItem(ADBlocks.BOK_CHOY, makeSettings()));
        GARLIC = registerItem("garlic",
                new AliasedBlockItem(ADBlocks.GARLIC, makeSettings(ADFoodComponents.GARLIC)));
        GREEN_ONION = registerItem("green_onion",
                new AliasedBlockItem(ADBlocks.GREEN_ONIONS, makeSettings(ADFoodComponents.GREEN_ONION)));
        BLUEBERRIES = registerItem("blueberries",
                new AliasedBlockItem(ADBlocks.BLUEBERRY_BUSH, makeSettings(ADFoodComponents.BLUEBERRIES)));
        SWEET_BERRY_JUICE = registerItem("sweet_berry_juice",
                new ADDrinkItem(makeSettings(ADFoodComponents.SWEET_BERRY_JUICE, 16)));
        BLUEBERRY_JUICE = registerItem("blueberry_juice",
                new ADDrinkItem(makeSettings(ADFoodComponents.BLUEBERRY_JUICE, 16)));
        NOODLES = registerItem("noodles", item());
        NOODLE_SOUP = registerItem("noodle_soup", new ADFoodContainerItem(makeSettings(ADFoodComponents.NOODLE_SOUP, 1)));
        PUDDING = registerItem("pudding", new ADFoodContainerItem(makeSettings(ADFoodComponents.PUDDING, 1)));
        BERRY_PUDDING = registerItem("berry_pudding", new ADFoodContainerItem(makeSettings(ADFoodComponents.BERRY_PUDDING, 1)));
        SMOKY_QUARTZ = registerItem("smoky_quartz", item());
        CARAMEL_APPLE = registerItem("caramel_apple", new ADFoodContainerItem(makeSettings(ADFoodComponents.CARAMEL_APPLE, 1), Items.STICK));
        CARAMEL = registerItem("caramel", item());
        SPRUCE_CONE = registerItem("spruce_cone", new Item(makeSettings(ADFoodComponents.SPRUCE_CONE)));
        FORESTS_BOUNTY = registerItem("forests_bounty", new ADFoodContainerItem(makeSettings(ADFoodComponents.FORESTS_BOUNTY, 1)));
        WITCHS_CRADLE_BRANCH = registerItem("witchs_cradle_branch", new AliasedBlockItem(ADBlocks.WITCHS_CRADLE, makeSettings(ADFoodComponents.WITCHS_CRADLE_BRANCH)));
        WITCHS_CRADLE_SOUP = registerItem("witchs_cradle_soup", new ADFoodContainerItem(makeSettings(ADFoodComponents.WITCHS_CRADLE_SOUP, 1)));
        GLASS_VIAL = registerItem("glass_vial", new ADGlassVialItem(makeSettings()));
        BLOOD_VIAL = registerItem("blood_vial", new ADDrinkItem(makeSettings(ADFoodComponents.BLOOD_VILE, 1), ADItems.GLASS_VIAL));
        MIXED_SEED_PACKET = registerItem("mixed_seed_packet", new ADMixedSeedPacketItem(makeSettings()));
        CATTAIL = registerItem("cattail", new AliasedBlockItem(ADBlocks.CATTAIL, makeSettings()));
        CHARRED_REMNANT_SPAWN_EGG = registerItem("charred_remnant_spawn_egg",
                new SpawnEggItem(ADEntityTypes.CHARRED_REMNANT, 0x944619, 0xdec33c, makeSettings()));
        CHARRED_FLESH = registerItem("charred_flesh", item());
        DRIED_BAMBOO = registerItem("dried_bamboo", item());
        FRIED_EGG = registerItem("fried_egg", new Item(makeSettings(ADFoodComponents.FRIED_EGG, 16)));
        BLOOD_KELP_SEED_CLUSTER = registerItem("blood_kelp_seed_cluster",
                new AliasedBlockItem(ADBlocks.BLOOD_KELP, makeSettings()));
    }
}
