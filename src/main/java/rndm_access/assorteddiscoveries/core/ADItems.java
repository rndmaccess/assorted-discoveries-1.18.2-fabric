package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.item.*;

public class ADItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<Item> BOK_CHOY = ITEMS.register("bok_choy", () -> {
        return new Item(makeProperties(ADFoods.BOK_CHOY));
    });
    public static final RegistryObject<Item> BOK_CHOY_SEEDS = ITEMS.register("bok_choy_seeds", () -> {
        return new ItemNameBlockItem(ADBlocks.BOK_CHOY.get(), makeProperties());
    });
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic", () -> {
        return new ItemNameBlockItem(ADBlocks.GARLIC.get(), makeProperties(ADFoods.GARLIC));
    });
    public static final RegistryObject<Item> GREEN_ONION = ITEMS.register("green_onion", () -> {
        return new ItemNameBlockItem(ADBlocks.GREEN_ONIONS.get(), makeProperties(ADFoods.GREEN_ONION));
    });
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> {
        return new ItemNameBlockItem(ADBlocks.BLUEBERRY_BUSH.get(), makeProperties(ADFoods.BLUEBERRIES));
    });
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> {
        return new ADDrinkItem(makeProperties(ADFoods.SWEET_BERRY_JUICE, 16));
    });
    public static final RegistryObject<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", () -> {
        return new ADDrinkItem(makeProperties(ADFoods.BLUEBERRY_JUICE, 16));
    });
    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles", () -> {
        return item();
    });
    public static final RegistryObject<Item> NOODLE_SOUP = ITEMS.register("noodle_soup", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.NOODLE_SOUP, 1));
    });
    public static final RegistryObject<Item> PUDDING = ITEMS.register("pudding", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.PUDDING, 1));
    });
    public static final RegistryObject<Item> BERRY_PUDDING = ITEMS.register("berry_pudding", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.BERRY_PUDDING, 1));
    });
    public static final RegistryObject<Item> SMOKY_QUARTZ = ITEMS.register("smoky_quartz", () -> {
        return item();
    });
    public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.CARAMEL_APPLE, 1), () -> {
            return Items.STICK;
        });
    });
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () -> {
        return item();
    });
    public static final RegistryObject<Item> SPRUCE_CONE = ITEMS.register("spruce_cone", () -> {
        return new Item(makeProperties(ADFoods.SPRUCE_CONE));
    });
    public static final RegistryObject<Item> FORESTS_BOUNTY = ITEMS.register("forests_bounty", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.FORESTS_BOUNTY, 1));
    });
    public static final RegistryObject<Item> WITCHS_CRADLE_BRANCH = ITEMS.register("witchs_cradle_branch", () -> {
        return new ItemNameBlockItem(ADBlocks.WITCHS_CRADLE.get(), makeProperties(ADFoods.WITCHS_CRADLE_BRANCH));
    });
    public static final RegistryObject<Item> WITCHS_CRADLE_SOUP = ITEMS.register("witchs_cradle_soup", () -> {
        return new ADFoodContainerItem(makeProperties(ADFoods.WITCHS_CRADLE_SOUP, 1));
    });
    public static final RegistryObject<Item> GLASS_VIAL = ITEMS.register("glass_vial", () -> {
        return new ADGlassVialItem(makeProperties());
    });
    public static final RegistryObject<Item> BLOOD_VIAL = ITEMS.register("blood_vial", () -> {
        return new ADDrinkItem(makeProperties(ADFoods.BLOOD_VILE, 1), ADItems.GLASS_VIAL.get());
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
        return new Item(makeProperties(ADFoods.FRIED_EGG, 16));
    });
    public static final RegistryObject<Item> WHITE_TORCH = ITEMS.register("white_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.WHITE_TORCH.get(), ADBlocks.WHITE_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> ORANGE_TORCH = ITEMS.register("orange_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.ORANGE_TORCH.get(), ADBlocks.ORANGE_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> MAGENTA_TORCH = ITEMS.register("magenta_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.MAGENTA_TORCH.get(), ADBlocks.MAGENTA_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TORCH = ITEMS.register("light_blue_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.LIGHT_BLUE_TORCH.get(), ADBlocks.LIGHT_BLUE_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> YELLOW_TORCH = ITEMS.register("yellow_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.YELLOW_TORCH.get(), ADBlocks.YELLOW_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> LIME_TORCH = ITEMS.register("lime_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.LIME_TORCH.get(), ADBlocks.LIME_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> PINK_TORCH = ITEMS.register("pink_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.PINK_TORCH.get(), ADBlocks.PINK_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> GRAY_TORCH = ITEMS.register("gray_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.GRAY_TORCH.get(), ADBlocks.GRAY_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TORCH = ITEMS.register("light_gray_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.LIGHT_GRAY_TORCH.get(), ADBlocks.LIGHT_GRAY_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> CYAN_TORCH = ITEMS.register("cyan_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.CYAN_TORCH.get(), ADBlocks.CYAN_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> PURPLE_TORCH = ITEMS.register("purple_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.PURPLE_TORCH.get(), ADBlocks.PURPLE_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> BLUE_TORCH = ITEMS.register("blue_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.BLUE_TORCH.get(), ADBlocks.BLUE_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> BROWN_TORCH = ITEMS.register("brown_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.BROWN_TORCH.get(), ADBlocks.BROWN_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> GREEN_TORCH = ITEMS.register("green_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.GREEN_TORCH.get(), ADBlocks.GREEN_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> RED_TORCH = ITEMS.register("red_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.RED_TORCH.get(), ADBlocks.RED_WALL_TORCH.get(), makeProperties());
    });
    public static final RegistryObject<Item> BLACK_TORCH = ITEMS.register("black_torch", () -> {
        return new StandingAndWallBlockItem(ADBlocks.BLACK_TORCH.get(), ADBlocks.BLACK_WALL_TORCH.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> PURPLE_MUSHROOM = ITEMS.register("purple_mushroom", () -> {
        return new ADPottableBlockItem(ADBlocks.POTTED_PURPLE_MUSHROOM.get(), ADBlocks.PURPLE_MUSHROOM.get(),
                makeProperties());
    });
    public static final RegistryObject<Item> SNAPDRAGON = ITEMS.register("snapdragon", () -> {
        return new ADPottableBlockItem(ADBlocks.POTTED_SNAPDRAGON.get(), ADBlocks.SNAPDRAGON.get(), makeProperties());
    });
    public static final RegistryObject<Item> OAK_ROPE_LADDER = ITEMS.register("oak_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.OAK_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> SPRUCE_ROPE_LADDER = ITEMS.register("spruce_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.SPRUCE_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> BIRCH_ROPE_LADDER = ITEMS.register("birch_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.BIRCH_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> JUNGLE_ROPE_LADDER = ITEMS.register("jungle_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.JUNGLE_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> ACACIA_ROPE_LADDER = ITEMS.register("acacia_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.ACACIA_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> DARK_OAK_ROPE_LADDER = ITEMS.register("dark_oak_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.DARK_OAK_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> WARPED_ROPE_LADDER = ITEMS.register("warped_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.WARPED_ROPE_LADDER.get(), makeProperties());
    });
    public static final RegistryObject<Item> CRIMSON_ROPE_LADDER = ITEMS.register("crimson_rope_ladder", () -> {
        return new ADRopeLadderBlockItem(ADBlocks.CRIMSON_ROPE_LADDER.get(), makeProperties());
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
