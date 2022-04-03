package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.*;

public class ADItems {
    public static final Item BOK_CHOY = new Item(makeSettings(ADFoodComponents.BOK_CHOY));
    public static final Item BOK_CHOY_SEEDS = new AliasedBlockItem(ADBlocks.BOK_CHOY, makeSettings());
    public static final Item GARLIC = new AliasedBlockItem(ADBlocks.GARLIC, makeSettings(ADFoodComponents.GARLIC));
    public static final Item GREEN_ONION = new AliasedBlockItem(
            ADBlocks.GREEN_ONIONS, makeSettings(ADFoodComponents.GREEN_ONION));
    public static final Item BLUEBERRIES = new AliasedBlockItem(
            ADBlocks.BLUEBERRY_BUSH, makeSettings(ADFoodComponents.BLUEBERRIES));
    public static final Item SWEET_BERRY_JUICE = new ADDrinkItem(makeSettings(ADFoodComponents.SWEET_BERRY_JUICE, 16));
    public static final Item BLUEBERRY_JUICE = new ADDrinkItem(makeSettings(ADFoodComponents.BLUEBERRY_JUICE, 16));
    public static final Item NOODLES = item();
    public static final Item NOODLE_SOUP = new ADFoodContainerItem(makeSettings(ADFoodComponents.NOODLE_SOUP, 1));
    public static final Item PUDDING = new ADFoodContainerItem(makeSettings(ADFoodComponents.PUDDING, 1));
    public static final Item BERRY_PUDDING = new ADFoodContainerItem(makeSettings(ADFoodComponents.BERRY_PUDDING, 1));
    public static final Item SMOKY_QUARTZ = item();
    public static final Item CARAMEL_APPLE = new ADFoodContainerItem(
            makeSettings(ADFoodComponents.CARAMEL_APPLE, 1), Items.STICK);
    public static final Item CARAMEL = item();
    public static final Item SPRUCE_CONE = new Item(makeSettings(ADFoodComponents.SPRUCE_CONE));
    public static final Item FORESTS_BOUNTY = new ADFoodContainerItem(makeSettings(ADFoodComponents.FORESTS_BOUNTY, 1));
    public static final Item WITCHS_CRADLE_BRANCH = new AliasedBlockItem(
            ADBlocks.WITCHS_CRADLE, makeSettings(ADFoodComponents.WITCHS_CRADLE_BRANCH));
    public static final Item WITCHS_CRADLE_SOUP = new ADFoodContainerItem(makeSettings(ADFoodComponents.WITCHS_CRADLE_SOUP, 1));
    public static final Item GLASS_VIAL = new ADGlassVialItem(makeSettings());
    public static final Item BLOOD_VIAL = new ADDrinkItem(
            makeSettings(ADFoodComponents.BLOOD_VILE, 1), ADItems.GLASS_VIAL);
    public static final Item MIXED_SEED_PACKET = new ADMixedSeedPacketItem(makeSettings());
    public static final Item CATTAIL = new AliasedBlockItem(ADBlocks.CATTAIL, makeSettings());
    public static final Item CHARRED_REMNANT_SPAWN_EGG = new SpawnEggItem(
            ADEntityTypes.CHARRED_REMNANT, 0x944619, 0xdec33c, makeSettings());
    public static final Item CHARRED_FLESH = item();
    public static final Item DRIED_BAMBOO = item();
    public static final Item FRIED_EGG = new Item(makeSettings(ADFoodComponents.FRIED_EGG, 16));
    public static final Item BLOOD_KELP_SEED_CLUSTER = new AliasedBlockItem(ADBlocks.BLOOD_KELP, makeSettings());

    private static Item item() {
        return new Item(makeSettings());
    }

    /**
     * A helper method that makes Settings for an item that is added to the vanilla
     * expansions tab.
     *
     * @return The Settings for this item.
     */
    private static Item.Settings makeSettings() {
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

    private static void registerItem(String id, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, id), item);
    }

    public static void registerItems() {
        registerItem("bok_choy", BOK_CHOY);
        registerItem("bok_choy_seeds", BOK_CHOY_SEEDS);
        registerItem("garlic", GARLIC);
        registerItem("green_onion", GREEN_ONION);
        registerItem("blueberries", BLUEBERRIES);
        registerItem("sweet_berry_juice", SWEET_BERRY_JUICE);
        registerItem("blueberry_juice", BLUEBERRY_JUICE);
        registerItem("noodles", NOODLES);
        registerItem("noodle_soup", NOODLE_SOUP);
        registerItem("pudding", PUDDING);
        registerItem("berry_pudding", BERRY_PUDDING);
        registerItem("smoky_quartz", SMOKY_QUARTZ);
        registerItem("caramel_apple", CARAMEL_APPLE);
        registerItem("caramel", CARAMEL);
        registerItem("spruce_cone", SPRUCE_CONE);
        registerItem("forests_bounty", FORESTS_BOUNTY);
        registerItem("witchs_cradle_branch", WITCHS_CRADLE_BRANCH);
        registerItem("witchs_cradle_soup", WITCHS_CRADLE_SOUP);
        registerItem("glass_vial", GLASS_VIAL);
        registerItem("blood_vial", BLOOD_VIAL);
        registerItem("mixed_seed_packet", MIXED_SEED_PACKET);
        registerItem("cattail", CATTAIL);
        registerItem("charred_remnant_spawn_egg", CHARRED_REMNANT_SPAWN_EGG);
        registerItem("charred_flesh", CHARRED_FLESH);
        registerItem("dried_bamboo", DRIED_BAMBOO);
        registerItem("fried_egg", FRIED_EGG);
        registerItem("blood_kelp_seed_cluster", BLOOD_KELP_SEED_CLUSTER);

        AssortedDiscoveries.LOGGER.info("Registered Items");
    }
}
