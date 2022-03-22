package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.*;

public class ADItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<Item> BOK_CHOY = ITEMS.register("bok_choy", () -> {
        return new Item(makeProperties(ADFoodComponents.BOK_CHOY));
    });
    public static final RegistryObject<Item> BOK_CHOY_SEEDS = ITEMS.register("bok_choy_seeds", () -> {
        return new ItemNameBlockItem(ADBlocks.BOK_CHOY.get(), makeProperties());
    });
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic", () -> {
        return new ItemNameBlockItem(ADBlocks.GARLIC.get(), makeProperties(ADFoodComponents.GARLIC));
    });
    public static final RegistryObject<Item> GREEN_ONION = ITEMS.register("green_onion", () -> {
        return new ItemNameBlockItem(ADBlocks.GREEN_ONIONS.get(), makeProperties(ADFoodComponents.GREEN_ONION));
    });
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> {
        return new ItemNameBlockItem(ADBlocks.BLUEBERRY_BUSH.get(), makeProperties(ADFoodComponents.BLUEBERRIES));
    });
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> {
        return new ADDrinkItem(makeProperties(ADFoodComponents.SWEET_BERRY_JUICE, 16));
    });
    public static final RegistryObject<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", () -> {
        return new ADDrinkItem(makeProperties(ADFoodComponents.BLUEBERRY_JUICE, 16));
    });
    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles", () -> {
        return item();
    });
    public static final RegistryObject<Item> NOODLE_SOUP = ITEMS.register("noodle_soup", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.NOODLE_SOUP, 1));
    });
    public static final RegistryObject<Item> PUDDING = ITEMS.register("pudding", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.PUDDING, 1));
    });
    public static final RegistryObject<Item> BERRY_PUDDING = ITEMS.register("berry_pudding", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.BERRY_PUDDING, 1));
    });
    public static final RegistryObject<Item> SMOKY_QUARTZ = ITEMS.register("smoky_quartz", () -> {
        return item();
    });
    public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.CARAMEL_APPLE, 1), () -> {
            return Items.STICK;
        });
    });
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () -> {
        return item();
    });
    public static final RegistryObject<Item> SPRUCE_CONE = ITEMS.register("spruce_cone", () -> {
        return new Item(makeProperties(ADFoodComponents.SPRUCE_CONE));
    });
    public static final RegistryObject<Item> FORESTS_BOUNTY = ITEMS.register("forests_bounty", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.FORESTS_BOUNTY, 1));
    });
    public static final RegistryObject<Item> WITCHS_CRADLE_BRANCH = ITEMS.register("witchs_cradle_branch", () -> {
        return new ItemNameBlockItem(ADBlocks.WITCHS_CRADLE.get(), makeProperties(ADFoodComponents.WITCHS_CRADLE_BRANCH));
    });
    public static final RegistryObject<Item> WITCHS_CRADLE_SOUP = ITEMS.register("witchs_cradle_soup", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoodComponents.WITCHS_CRADLE_SOUP, 1));
    });
    public static final RegistryObject<Item> GLASS_VIAL = ITEMS.register("glass_vial", () -> {
        return new ADGlassVialItem(makeProperties());
    });
    public static final RegistryObject<Item> BLOOD_VIAL = ITEMS.register("blood_vial", () -> {
        return new ADDrinkItem(makeProperties(ADFoodComponents.BLOOD_VILE, 1), ADItems.GLASS_VIAL.get());
    });
    public static final RegistryObject<Item> MIXED_SEED_PACKET = ITEMS.register("mixed_seed_packet", () -> {
        return new ADMixedSeedPacketItem(makeProperties());
    });
    public static final RegistryObject<Item> CATTAIL = ITEMS.register("cattail", () -> {
        return new ItemNameBlockItem(ADBlocks.CATTAIL.get(), makeProperties());
    });
    public static final RegistryObject<Item> CHARRED_REMNANT_SPAWN_EGG = ITEMS.register("charred_remnant_spawn_egg",
            () -> {
                return new ForgeSpawnEggItem(() -> {
                    return ADEntityTypes.CHARRED_REMNANT.get();
                }, 0x944619, 0xdec33c, makeProperties());
            });
    public static final RegistryObject<Item> CHARRED_FLESH = ITEMS.register("charred_flesh", () -> {
        return item();
    });
    public static final RegistryObject<Item> DRIED_BAMBOO = ITEMS.register("dried_bamboo", () -> {
        return item();
    });
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> {
        return new Item(makeProperties(ADFoodComponents.FRIED_EGG, 16));
    });
    public static final RegistryObject<Item> BLOOD_KELP_SEED_CLUSTER = ITEMS.register("blood_kelp_seed_cluster", () -> {
        return new ItemNameBlockItem(ADBlocks.BLOOD_KELP.get(), makeProperties());
    });

    private static Item item() {
        return new Item(makeProperties());
    }

    /**
     * A helper method that makes properties for a item that is added to the vanilla
     * expansions tab.
     *
     * @return The properties for this item.
     */
    public static Item.Properties makeProperties() {
        return new Item.Properties().tab(AssortedDiscoveries.ASSORTED_DISCOVERIES_TAB);
    }

    /**
     * A helper method that makes properties for a item with a custom max stack size
     * and is added to the vanilla expansions tab.
     *
     * @param maxStackSizeIn The max stack size for this item.
     * @return The properties for this item.
     */
    @SuppressWarnings("unused")
    private static Item.Properties makeProperties(int maxStackSizeIn) {
        return new Item.Properties().tab(AssortedDiscoveries.ASSORTED_DISCOVERIES_TAB).stacksTo(maxStackSizeIn);
    }

    /**
     * A helper method that makes properties for a food item that is added to the
     * vanilla expansions tab.
     *
     * @param foodIn The stats of this food item.
     * @return The properties for this item.
     */
    private static Item.Properties makeProperties(FoodProperties foodIn) {
        return new Item.Properties().tab(AssortedDiscoveries.ASSORTED_DISCOVERIES_TAB).food(foodIn);
    }

    /**
     * A helper method that makes properties for a food item with a custom max stack
     * size and is added to the vanilla expansions tab.
     *
     * @param foodIn         The stats for this food item.
     * @param maxStackSizeIn The max stack size for this item.
     * @return The properties for this item.
     */
    private static Item.Properties makeProperties(FoodProperties foodIn, int maxStackSizeIn) {
        return new Item.Properties().tab(AssortedDiscoveries.ASSORTED_DISCOVERIES_TAB).food(foodIn)
                .stacksTo(maxStackSizeIn);
    }
}
