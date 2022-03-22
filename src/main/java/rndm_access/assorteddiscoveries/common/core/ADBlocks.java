package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.*;
import rndm_access.assorteddiscoveries.common.item.ADRopeLadderBlockItem;
import rndm_access.assorteddiscoveries.common.worldgen.features.ADTreeConfiguredFeatures;

import java.util.function.ToIntFunction;

public class ADBlocks {
    public static final Block BAT_PLUSH;
    public static final Block BLAZE_PLUSH;
    public static final Block CAVE_SPIDER_PLUSH;
    public static final Block CHICKEN_PLUSH;
    public static final Block COW_PLUSH;
    public static final Block CREEPER_PLUSH;
    public static final Block ENDERMAN_PLUSH;
    public static final Block GHAST_PLUSH;
    public static final Block GUARDIAN_PLUSH;
    public static final Block WHITE_HORSE_PLUSH;
    public static final Block GRAY_HORSE_PLUSH;
    public static final Block LIGHT_GRAY_HORSE_PLUSH;
    public static final Block BROWN_HORSE_PLUSH;
    public static final Block BLACK_HORSE_PLUSH;
    public static final Block MAGMA_CUBE_PLUSH;
    public static final Block RED_MOOSHROOM_PLUSH;
    public static final Block BROWN_MOOSHROOM_PLUSH;
    public static final Block OCELOT_PLUSH;
    public static final Block TABBY_CAT_PLUSH;
    public static final Block TUXEDO_CAT_PLUSH;
    public static final Block RED_CAT_PLUSH;
    public static final Block SIAMESE_CAT_PLUSH;
    public static final Block BRITISH_SHORTHAIR_CAT_PLUSH;
    public static final Block CALICO_CAT_PLUSH;
    public static final Block PERSIAN_CAT_PLUSH;
    public static final Block RAGDOLL_CAT_PLUSH;
    public static final Block WHITE_CAT_PLUSH;
    public static final Block JELLIE_CAT_PLUSH;
    public static final Block BLACK_CAT_PLUSH;
    public static final Block PIG_PLUSH;
    public static final Block BROWN_RABBIT_PLUSH;
    public static final Block WHITE_RABBIT_PLUSH;
    public static final Block BLACK_RABBIT_PLUSH;
    public static final Block WHITE_SPLOTCHED_RABBIT_PLUSH;
    public static final Block GOLD_RABBIT_PLUSH;
    public static final Block TOAST_RABBIT_PLUSH;
    public static final Block SALT_RABBIT_PLUSH;
    public static final Block WHITE_SHEEP_PLUSH;
    public static final Block ORANGE_SHEEP_PLUSH;
    public static final Block MAGENTA_SHEEP_PLUSH;
    public static final Block LIGHT_BLUE_SHEEP_PLUSH;
    public static final Block YELLOW_SHEEP_PLUSH;
    public static final Block LIME_SHEEP_PLUSH;
    public static final Block PINK_SHEEP_PLUSH;
    public static final Block GRAY_SHEEP_PLUSH;
    public static final Block LIGHT_GRAY_SHEEP_PLUSH;
    public static final Block CYAN_SHEEP_PLUSH;
    public static final Block PURPLE_SHEEP_PLUSH;
    public static final Block BLUE_SHEEP_PLUSH;
    public static final Block BROWN_SHEEP_PLUSH;
    public static final Block GREEN_SHEEP_PLUSH;
    public static final Block RED_SHEEP_PLUSH;
    public static final Block BLACK_SHEEP_PLUSH;
    public static final Block SKELETON_PLUSH;
    public static final Block SLIME_PLUSH;
    public static final Block SPIDER_PLUSH;
    public static final Block SQUID_PLUSH;
    public static final Block BEE_PLUSH;
    public static final Block PLAINS_VILLAGER_PLUSH;
    public static final Block DESERT_VILLAGER_PLUSH;
    public static final Block JUNGLE_VILLAGER_PLUSH;
    public static final Block SAVANNA_VILLAGER_PLUSH;
    public static final Block SNOW_VILLAGER_PLUSH;
    public static final Block SWAMP_VILLAGER_PLUSH;
    public static final Block TAIGA_VILLAGER_PLUSH;
    public static final Block CRIMSON_VILLAGER_PLUSH;
    public static final Block WARPED_VILLAGER_PLUSH;
    public static final Block WANDERING_TRADER_PLUSH;
    public static final Block PLAINS_ZOMBIE_VILLAGER_PLUSH;
    public static final Block DESERT_ZOMBIE_VILLAGER_PLUSH;
    public static final Block JUNGLE_ZOMBIE_VILLAGER_PLUSH;
    public static final Block SAVANNA_ZOMBIE_VILLAGER_PLUSH;
    public static final Block SNOW_ZOMBIE_VILLAGER_PLUSH;
    public static final Block SWAMP_ZOMBIE_VILLAGER_PLUSH;
    public static final Block TAIGA_ZOMBIE_VILLAGER_PLUSH;
    public static final Block CRIMSON_ZOMBIE_VILLAGER_PLUSH;
    public static final Block WARPED_ZOMBIE_VILLAGER_PLUSH;
    public static final Block WITCH_PLUSH;
    public static final Block WOLF_PLUSH;
    public static final Block ZOMBIE_PLUSH;
    public static final Block CHARRED_REMNANT_PLUSH;
    public static final Block PIGLIN_PLUSH;
    public static final Block ZOMBIFIED_PIGLIN_PLUSH;
    public static final Block PUFFERFISH_PLUSH;
    public static final Block WITHER_PLUSH;
    public static final Block STRIDER_PLUSH;
    public static final Block SHIVERING_STRIDER_PLUSH;
    public static final Block PHANTOM_PLUSH;
    public static final Block HOGLIN_PLUSH;
    public static final Block ZOGLIN_PLUSH;
    public static final Block POLAR_BEAR_PLUSH;
    public static final Block NETHER_SMOKY_QUARTZ_ORE;
    public static final Block SMOKY_QUARTZ_BLOCK;
    public static final Block CHISELED_SMOKY_QUARTZ_BLOCK;
    public static final Block SMOKY_QUARTZ_BRICKS;
    public static final Block SMOKY_QUARTZ_BRICK_STAIRS;
    public static final Block SMOKY_QUARTZ_BRICK_SLAB;
    public static final Block SMOKY_QUARTZ_BRICK_WALL;
    public static final Block SMOKY_QUARTZ_PILLAR;
    public static final Block SMOKY_QUARTZ_STAIRS;
    public static final Block SMOKY_QUARTZ_SLAB;
    public static final Block SMOKY_QUARTZ_WALL;
    public static final Block SMOOTH_SMOKY_QUARTZ;
    public static final Block SMOOTH_SMOKY_QUARTZ_STAIRS;
    public static final Block SMOOTH_SMOKY_QUARTZ_SLAB;
    public static final Block SMOOTH_SMOKY_QUARTZ_WALL;
    public static final Block CRACKED_STONE_BRICK_STAIRS;
    public static final Block CRACKED_STONE_BRICK_SLAB;
    public static final Block CRACKED_STONE_BRICK_WALL;
    public static final Block QUARTZ_WALL;
    public static final Block SMOOTH_QUARTZ_WALL;
    public static final Block STONE_WALL;
    public static final Block RED_GLASS;
    public static final Block RED_GLASS_PANE;
    public static final Block BLUEBERRY_BUSH;
    public static final Block BOK_CHOY;
    public static final Block GARLIC;
    public static final Block GREEN_ONIONS;
    public static final Block OAK_PLANTER_BOX;
    public static final Block SPRUCE_PLANTER_BOX;
    public static final Block BIRCH_PLANTER_BOX;
    public static final Block JUNGLE_PLANTER_BOX;
    public static final Block ACACIA_PLANTER_BOX;
    public static final Block DARK_OAK_PLANTER_BOX;
    public static final Block CRIMSON_PLANTER_BOX;
    public static final Block WARPED_PLANTER_BOX;
    public static final Block OAK_WALL;
    public static final Block SPRUCE_WALL;
    public static final Block BIRCH_WALL;
    public static final Block JUNGLE_WALL;
    public static final Block ACACIA_WALL;
    public static final Block DARK_OAK_WALL;
    public static final Block CRIMSON_WALL;
    public static final Block WARPED_WALL;
    public static final Block STRIPPED_OAK_WALL;
    public static final Block STRIPPED_SPRUCE_WALL;
    public static final Block STRIPPED_BIRCH_WALL;
    public static final Block STRIPPED_JUNGLE_WALL;
    public static final Block STRIPPED_ACACIA_WALL;
    public static final Block STRIPPED_DARK_OAK_WALL;
    public static final Block STRIPPED_CRIMSON_WALL;
    public static final Block STRIPPED_WARPED_WALL;
    public static final Block OAK_ROPE_LADDER;
    public static final Block SPRUCE_ROPE_LADDER;
    public static final Block BIRCH_ROPE_LADDER;
    public static final Block JUNGLE_ROPE_LADDER;
    public static final Block ACACIA_ROPE_LADDER;
    public static final Block DARK_OAK_ROPE_LADDER;
    public static final Block CRIMSON_ROPE_LADDER;
    public static final Block WARPED_ROPE_LADDER;
    public static final Block IRON_LADDER;
    public static final Block DIRT_SLAB;
    public static final Block GRASS_SLAB;
    public static final Block DIRT_PATH_SLAB;
    public static final Block COARSE_DIRT_SLAB;
    public static final Block SNOW_BRICKS;
    public static final Block SNOW_BRICK_STAIRS;
    public static final Block SNOW_BRICK_SLAB;
    public static final Block SNOW_BRICK_WALL;
    public static final Block PURPLE_MUSHROOM;
    public static final Block PURPLE_MUSHROOM_BLOCK;
    public static final Block WOODCUTTER;
    public static final Block WHITE_CAMPFIRE;
    public static final Block ORANGE_CAMPFIRE;
    public static final Block MAGENTA_CAMPFIRE;
    public static final Block LIGHT_BLUE_CAMPFIRE;
    public static final Block YELLOW_CAMPFIRE;
    public static final Block LIME_CAMPFIRE;
    public static final Block PINK_CAMPFIRE;
    public static final Block GRAY_CAMPFIRE;
    public static final Block LIGHT_GRAY_CAMPFIRE;
    public static final Block CYAN_CAMPFIRE;
    public static final Block PURPLE_CAMPFIRE;
    public static final Block BLUE_CAMPFIRE;
    public static final Block BROWN_CAMPFIRE;
    public static final Block GREEN_CAMPFIRE;
    public static final Block RED_CAMPFIRE;
    public static final Block BLACK_CAMPFIRE;
    public static final Block WHITE_LANTERN;
    public static final Block ORANGE_LANTERN;
    public static final Block MAGENTA_LANTERN;
    public static final Block LIGHT_BLUE_LANTERN;
    public static final Block YELLOW_LANTERN;
    public static final Block LIME_LANTERN;
    public static final Block PINK_LANTERN;
    public static final Block GRAY_LANTERN;
    public static final Block LIGHT_GRAY_LANTERN;
    public static final Block CYAN_LANTERN;
    public static final Block PURPLE_LANTERN;
    public static final Block BLUE_LANTERN;
    public static final Block BROWN_LANTERN;
    public static final Block GREEN_LANTERN;
    public static final Block RED_LANTERN;
    public static final Block BLACK_LANTERN;
    public static final Block WHITE_WALL_TORCH;
    public static final Block ORANGE_WALL_TORCH;
    public static final Block MAGENTA_WALL_TORCH;
    public static final Block LIGHT_BLUE_WALL_TORCH;
    public static final Block YELLOW_WALL_TORCH;
    public static final Block LIME_WALL_TORCH;
    public static final Block PINK_WALL_TORCH;
    public static final Block GRAY_WALL_TORCH;
    public static final Block LIGHT_GRAY_WALL_TORCH;
    public static final Block CYAN_WALL_TORCH;
    public static final Block PURPLE_WALL_TORCH;
    public static final Block BLUE_WALL_TORCH;
    public static final Block BROWN_WALL_TORCH;
    public static final Block GREEN_WALL_TORCH;
    public static final Block RED_WALL_TORCH;
    public static final Block BLACK_WALL_TORCH;
    public static final Block WHITE_TORCH;
    public static final Block ORANGE_TORCH;
    public static final Block MAGENTA_TORCH;
    public static final Block LIGHT_BLUE_TORCH;
    public static final Block YELLOW_TORCH;
    public static final Block LIME_TORCH;
    public static final Block PINK_TORCH;
    public static final Block GRAY_TORCH;
    public static final Block LIGHT_GRAY_TORCH;
    public static final Block CYAN_TORCH;
    public static final Block PURPLE_TORCH;
    public static final Block BLUE_TORCH;
    public static final Block BROWN_TORCH;
    public static final Block GREEN_TORCH;
    public static final Block RED_TORCH;
    public static final Block BLACK_TORCH;
    public static final Block WITCHS_CRADLE;
    public static final Block FRESH_BAMBOO_FENCE;
    public static final Block FRESH_BAMBOO_FENCE_GATE;
    public static final Block DRIED_BAMBOO_FENCE;
    public static final Block DRIED_BAMBOO_FENCE_GATE;
    public static final Block BAUXITE;
    public static final Block BAUXITE_SLAB;
    public static final Block BAUXITE_STAIRS;
    public static final Block BAUXITE_WALL;
    public static final Block POLISHED_BAUXITE;
    public static final Block POLISHED_BAUXITE_SLAB;
    public static final Block POLISHED_BAUXITE_STAIRS;
    public static final Block POLISHED_BAUXITE_WALL;
    public static final Block BAUXITE_BRICKS;
    public static final Block BAUXITE_BRICK_STAIRS;
    public static final Block BAUXITE_BRICK_SLAB;
    public static final Block BAUXITE_BRICK_WALL;
    public static final Block SNOW_SLAB;
    public static final Block SNOW_STAIRS;
    public static final Block SNOW_WALL;
    public static final Block TWISTED_NETHER_BRICKS;
    public static final Block TWISTED_NETHER_BRICK_STAIRS;
    public static final Block TWISTED_NETHER_BRICK_SLAB;
    public static final Block TWISTED_NETHER_BRICK_WALL;
    public static final Block TWISTED_NETHERRACK;
    public static final Block TWISTED_NETHERRACK_STAIRS;
    public static final Block TWISTED_NETHERRACK_SLAB;
    public static final Block TWISTED_NETHERRACK_WALL;
    public static final Block WEEPING_NETHER_BRICKS;
    public static final Block WEEPING_NETHER_BRICK_STAIRS;
    public static final Block WEEPING_NETHER_BRICK_SLAB;
    public static final Block WEEPING_NETHER_BRICK_WALL;
    public static final Block WEEPING_NETHERRACK;
    public static final Block WEEPING_NETHERRACK_STAIRS;
    public static final Block WEEPING_NETHERRACK_SLAB;
    public static final Block WEEPING_NETHERRACK_WALL;
    public static final Block SNAPDRAGON;
    public static final Block POTTED_SNAPDRAGON;
    public static final Block POTTED_PURPLE_MUSHROOM;
    public static final Block ENDER_GRASS;
    public static final Block ICICLE;
    public static final Block CATTAIL;
    public static final Block CHOCOLATE_CAKE;
    public static final Block RED_VELVET_CAKE;
    public static final Block STONE_TILES;
    public static final Block STONE_TILE_SLAB;
    public static final Block STONE_TILE_STAIRS;
    public static final Block STONE_TILE_WALL;
    public static final Block MOSSY_STONE_TILES;
    public static final Block MOSSY_STONE_TILE_SLAB;
    public static final Block MOSSY_STONE_TILE_STAIRS;
    public static final Block MOSSY_STONE_TILE_WALL;
    public static final Block CRACKED_STONE_TILES;
    public static final Block CRACKED_STONE_TILE_SLAB;
    public static final Block CRACKED_STONE_TILE_STAIRS;
    public static final Block CRACKED_STONE_TILE_WALL;
    public static final Block SWEET_BERRY_PIE;
    public static final Block BLUEBERRY_PIE;
    public static final Block BLACKSTONE_TILES;
    public static final Block BLACKSTONE_TILE_STAIRS;
    public static final Block BLACKSTONE_TILE_SLAB;
    public static final Block BLACKSTONE_TILE_WALL;
    public static final Block TWISTED_BLACKSTONE_TILES;
    public static final Block TWISTED_BLACKSTONE_TILE_STAIRS;
    public static final Block TWISTED_BLACKSTONE_TILE_SLAB;
    public static final Block TWISTED_BLACKSTONE_TILE_WALL;
    public static final Block WEEPING_BLACKSTONE_TILES;
    public static final Block WEEPING_BLACKSTONE_TILE_STAIRS;
    public static final Block WEEPING_BLACKSTONE_TILE_SLAB;
    public static final Block WEEPING_BLACKSTONE_TILE_WALL;
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICKS;
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS;
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB;
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_WALL;
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICKS;
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS;
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB;
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_WALL;
    public static final Block TWISTED_BLACKSTONE;
    public static final Block TWISTED_BLACKSTONE_STAIRS;
    public static final Block TWISTED_BLACKSTONE_SLAB;
    public static final Block TWISTED_BLACKSTONE_WALL;
    public static final Block WEEPING_BLACKSTONE;
    public static final Block WEEPING_BLACKSTONE_STAIRS;
    public static final Block WEEPING_BLACKSTONE_SLAB;
    public static final Block WEEPING_BLACKSTONE_WALL;
    public static final Block QUARTZ_TILES;
    public static final Block QUARTZ_TILE_STAIRS;
    public static final Block QUARTZ_TILE_SLAB;
    public static final Block QUARTZ_TILE_WALL;
    public static final Block POLISHED_CALCITE;
    public static final Block POLISHED_CALCITE_STAIRS;
    public static final Block POLISHED_CALCITE_SLAB;
    public static final Block POLISHED_CALCITE_WALL;
    public static final Block CALCITE_BRICKS;
    public static final Block CALCITE_BRICK_STAIRS;
    public static final Block CALCITE_BRICK_SLAB;
    public static final Block CALCITE_BRICK_WALL;
    public static final Block CRACKED_CALCITE_BRICKS;
    public static final Block CRACKED_CALCITE_BRICK_STAIRS;
    public static final Block CRACKED_CALCITE_BRICK_SLAB;
    public static final Block CRACKED_CALCITE_BRICK_WALL;
    public static final Block CHISELED_CALCITE_BRICKS;
    public static final Block POLISHED_TUFF;
    public static final Block POLISHED_TUFF_STAIRS;
    public static final Block POLISHED_TUFF_SLAB;
    public static final Block POLISHED_TUFF_WALL;
    public static final Block TUFF_BRICKS;
    public static final Block TUFF_BRICK_STAIRS;
    public static final Block TUFF_BRICK_SLAB;
    public static final Block TUFF_BRICK_WALL;
    public static final Block MOSSY_TUFF_BRICKS;
    public static final Block MOSSY_TUFF_BRICK_STAIRS;
    public static final Block MOSSY_TUFF_BRICK_SLAB;
    public static final Block MOSSY_TUFF_BRICK_WALL;
    public static final Block CRACKED_TUFF_BRICKS;
    public static final Block CRACKED_TUFF_BRICK_STAIRS;
    public static final Block CRACKED_TUFF_BRICK_SLAB;
    public static final Block CRACKED_TUFF_BRICK_WALL;
    public static final Block CHISELED_TUFF_BRICKS;
    public static final Block POLISHED_DRIPSTONE_BLOCK;
    public static final Block POLISHED_DRIPSTONE_STAIRS;
    public static final Block POLISHED_DRIPSTONE_SLAB;
    public static final Block POLISHED_DRIPSTONE_WALL;
    public static final Block DRIPSTONE_BRICKS;
    public static final Block DRIPSTONE_BRICK_STAIRS;
    public static final Block DRIPSTONE_BRICK_SLAB;
    public static final Block DRIPSTONE_BRICK_WALL;
    public static final Block MOSSY_DRIPSTONE_BRICKS;
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS;
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB;
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL;
    public static final Block CRACKED_DRIPSTONE_BRICKS;
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS;
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB;
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL;
    public static final Block CHISELED_DRIPSTONE_BRICKS;
    public static final Block SPECTRAL_ONYX;
    public static final Block SPECTRAL_ONYX_STAIRS;
    public static final Block SPECTRAL_ONYX_SLAB;
    public static final Block SPECTRAL_ONYX_WALL;
    public static final Block COBBLED_SPECTRAL_ONYX;
    public static final Block COBBLED_SPECTRAL_ONYX_STAIRS;
    public static final Block COBBLED_SPECTRAL_ONYX_SLAB;
    public static final Block COBBLED_SPECTRAL_ONYX_WALL;
    public static final Block SPECTRAL_ONYX_BRICKS;
    public static final Block SPECTRAL_ONYX_BRICK_STAIRS;
    public static final Block SPECTRAL_ONYX_BRICK_SLAB;
    public static final Block SPECTRAL_ONYX_BRICK_WALL;
    public static final Block BLOOD_KELP;
    public static final Block BLOOD_KELP_PLANT;
    public static final Block CRIMSON_BOOKSHELF;
    public static final Block WARPED_BOOKSHELF;

    private static ADBambooFenceBlock bambooFenceBlock(MapColor color) {
        return new ADBambooFenceBlock(AbstractBlock.Settings.of(Material.WOOD, color).strength(1.0F)
                .breakInstantly().nonOpaque().sounds(BlockSoundGroup.BAMBOO));
    }

    private static WallTorchBlock wallTorchBlock(ParticleEffect flameParticle) {
        return new ADWallTorchBlock(AbstractBlock.Settings.copy(Blocks.WALL_TORCH), flameParticle);
    }

    private static TorchBlock torchBlock(ParticleEffect flameParticle) {
        return new ADTorchBlock(AbstractBlock.Settings.copy(Blocks.TORCH), flameParticle);
    }

    private static LanternBlock lanternBlock() {
        return new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN));
    }

    /*
     * private static Block bookshelfBlock(MaterialColor color) { return new
     * Block(BlockBehaviour.Properties.of(Material.WOOD,
     * color).strength(1.5F).sound(SoundType.WOOD)); }
     */

    private static Block netherBookshelfBlock(MapColor color) {
        return new Block(AbstractBlock.Settings.of(Material.NETHER_WOOD, color).strength(1.5F).sounds(BlockSoundGroup.WOOD));
    }

    private static ADNetherPlanterBoxBlock netherPlanterBoxBlock(MapColor color) {
        return new ADNetherPlanterBoxBlock(AbstractBlock.Settings.of(Material.WOOD, color).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    }

    private static ADOverworldPlanterBoxBlock overworldPlanterBoxBlock(MapColor color) {
        return new ADOverworldPlanterBoxBlock(AbstractBlock.Settings.of(Material.WOOD, color).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    }

    private static ADDyedCampfireBlock dyedCampfireBlock(ParticleEffect sparkParticle) {
        return new ADDyedCampfireBlock(AbstractBlock.Settings.copy(Blocks.CAMPFIRE), sparkParticle);
    }

    private static Block registerBlockWithoutItem(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, id), block);
    }

    /**
     * Registers a block with a normal block item.
     */
    private static Block registerBlock(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, id),
                new BlockItem(block, itemBlockSettings()));
    }

    /**
     * Registers a rope ladder block with a rope ladder item.
     */
    private static Block registerRopeLadderBlock(String id) {
        Block ladderBlock = new ADRopeLadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER));

        registerRopeLadderItem(id, ladderBlock);
        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, id), ladderBlock);
    }

    private static Item registerRopeLadderItem(String id, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, id),
                new ADRopeLadderBlockItem(block, itemBlockSettings()));
    }

    /**
     * Register a standing torch and a standing/wall item block for it.
     */
    private static Block registerTorchBlock(String id, Block wallTorch, Block standingTorch) {
        registerTorchItem(id, wallTorch, standingTorch);

        return Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, id), standingTorch);
    }

    private static Item registerTorchItem(String id, Block wallTorch, Block standingTorch) {
        return Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, id),
                new WallStandingBlockItem(standingTorch, wallTorch, itemBlockSettings()));
    }

    /**
     * The settings for all block items in assorted discoveries.
     */
    private static Item.Settings itemBlockSettings() {
        return new Item.Settings().group(AssortedDiscoveries.MOD_GROUP);
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    /**
     * Called during mod initialization.
     */
    public static void registerBlocks() {
        AssortedDiscoveries.LOGGER.info("Registering blocks");
    }

    // Initialize every block.
    static {
        BAT_PLUSH = registerBlock("bat_plush", new ADBatPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BLAZE_PLUSH = registerBlock("blaze_plush", new ADBlazePlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.YELLOW).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CAVE_SPIDER_PLUSH = registerBlock("cave_spider_plush", new ADCaveSpiderPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.CYAN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CHICKEN_PLUSH = registerBlock("chicken_plush", new ADChickenPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.WHITE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        COW_PLUSH = registerBlock("cow_plush", new ADCowPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.BROWN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CREEPER_PLUSH = registerBlock("creeper_plush", new ADCreeperPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.LIME).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        ENDERMAN_PLUSH = registerBlock("enderman_plush", new ADEndermanPlushBlock(
                    AbstractBlock.Settings.of(Material.WOOL, MapColor.BLACK).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        GHAST_PLUSH = registerBlock("ghast_plush", new ADGhastPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GUARDIAN_PLUSH = registerBlock("guardian_plush", new ADGuardianPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH)));
        WHITE_HORSE_PLUSH = registerBlock("white_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GRAY_HORSE_PLUSH = registerBlock("gray_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH)));
        LIGHT_GRAY_HORSE_PLUSH = registerBlock("light_gray_horse_plush", new ADHorsePlushBlock(
                            AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_HORSE_PLUSH = registerBlock("brown_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        BLACK_HORSE_PLUSH = registerBlock("black_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        MAGMA_CUBE_PLUSH = registerBlock("magma_cube_plush", new ADMagmaCubePlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.RED).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        RED_MOOSHROOM_PLUSH = registerBlock("red_mooshroom_plush", new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH)));
        BROWN_MOOSHROOM_PLUSH = registerBlock("brown_mooshroom_plush", new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        OCELOT_PLUSH = registerBlock("ocelot_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        TABBY_CAT_PLUSH = registerBlock("tabby_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        TUXEDO_CAT_PLUSH = registerBlock("tuxedo_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        RED_CAT_PLUSH = registerBlock("red_cat_plush", new ADCatPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.ORANGE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        SIAMESE_CAT_PLUSH = registerBlock("siamese_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BRITISH_SHORTHAIR_CAT_PLUSH = registerBlock("british_shorthair_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        CALICO_CAT_PLUSH = registerBlock("calico_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        PERSIAN_CAT_PLUSH = registerBlock("persian_cat_plush", new ADPersianCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        RAGDOLL_CAT_PLUSH = registerBlock("ragdoll_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        WHITE_CAT_PLUSH = registerBlock("white_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        JELLIE_CAT_PLUSH = registerBlock("jellie_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BLACK_CAT_PLUSH = registerBlock("black_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        PIG_PLUSH = registerBlock("pig_plush", new ADPigPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.PINK).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_RABBIT_PLUSH = registerBlock("brown_rabbit_plush", new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WHITE_RABBIT_PLUSH = registerBlock("white_rabbit_plush", new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BLACK_RABBIT_PLUSH = registerBlock("black_rabbit_plush", new ADRabbitPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
        WHITE_SPLOTCHED_RABBIT_PLUSH = registerBlock("white_splotched_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GOLD_RABBIT_PLUSH = registerBlock("gold_rabbit_plush", new ADRabbitPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        TOAST_RABBIT_PLUSH = registerBlock("toast_rabbit_plush",
            new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        SALT_RABBIT_PLUSH = registerBlock("salt_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WHITE_SHEEP_PLUSH = registerBlock("white_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        ORANGE_SHEEP_PLUSH = registerBlock("orange_sheep_plush",
            new ADSheepPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        MAGENTA_SHEEP_PLUSH = registerBlock("magenta_sheep_plush", new ADSheepPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.MAGENTA).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        LIGHT_BLUE_SHEEP_PLUSH = registerBlock("light_blue_sheep_plush", new ADSheepPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        YELLOW_SHEEP_PLUSH = registerBlock("yellow_sheep_plush", new ADSheepPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        LIME_SHEEP_PLUSH = registerBlock("lime_sheep_plush", new ADSheepPlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH)));
        PINK_SHEEP_PLUSH = registerBlock("pink_sheep_plush", new ADSheepPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH));
        GRAY_SHEEP_PLUSH = registerBlock("gray_sheep_plush", new ADSheepPlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH)));
        LIGHT_GRAY_SHEEP_PLUSH = registerBlock("light_gray_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        CYAN_SHEEP_PLUSH = registerBlock("cyan_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH)));
        PURPLE_SHEEP_PLUSH = registerBlock("purple_sheep_plush", new ADSheepPlushBlock(
                    AbstractBlock.Settings.of(Material.WOOL, MapColor.PURPLE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BLUE_SHEEP_PLUSH = registerBlock("blue_sheep_plush", new ADSheepPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_SHEEP_PLUSH = registerBlock("brown_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        GREEN_SHEEP_PLUSH = registerBlock("green_sheep_plush", new ADSheepPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.GREEN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        RED_SHEEP_PLUSH = registerBlock("red_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH));
        BLACK_SHEEP_PLUSH = registerBlock("black_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        SKELETON_PLUSH = registerBlock("skeleton_plush",
            new ADSkeletonPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        SLIME_PLUSH = registerBlock("slime_plush",
                new ADSlimePlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH));
        SPIDER_PLUSH = registerBlock("spider_plush",
                new ADSpiderPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
        SQUID_PLUSH = registerBlock("squid_plush",
                new ADSquidPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH));
        BEE_PLUSH = registerBlock("bee_plush",
                new ADBeePlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        PLAINS_VILLAGER_PLUSH = registerBlock("plains_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        DESERT_VILLAGER_PLUSH = registerBlock("desert_villager_plush",
                new ADDesertVillagerPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH));
        JUNGLE_VILLAGER_PLUSH = registerBlock("jungle_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        SAVANNA_VILLAGER_PLUSH = registerBlock("savanna_villager_plush",
                new ADSavannaVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
        SNOW_VILLAGER_PLUSH = registerBlock("snow_villager_plush",
                new ADSnowVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SWAMP_VILLAGER_PLUSH = registerBlock("swamp_villager_plush",
                new ADSwampVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        TAIGA_VILLAGER_PLUSH = registerBlock("taiga_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        CRIMSON_VILLAGER_PLUSH = registerBlock("crimson_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WARPED_VILLAGER_PLUSH = registerBlock("warped_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WANDERING_TRADER_PLUSH = registerBlock("wandering_trader_plush",
                new ADWanderingTraderPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH)));
        PLAINS_ZOMBIE_VILLAGER_PLUSH = registerBlock("plains_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        DESERT_ZOMBIE_VILLAGER_PLUSH = registerBlock("desert_zombie_villager_plush",
                new ADDesertZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        JUNGLE_ZOMBIE_VILLAGER_PLUSH = registerBlock("jungle_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        SAVANNA_ZOMBIE_VILLAGER_PLUSH = registerBlock("savanna_zombie_villager_plush",
                new ADSavannaZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SNOW_ZOMBIE_VILLAGER_PLUSH = registerBlock("snow_zombie_villager_plush",
                new ADSnowZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SWAMP_ZOMBIE_VILLAGER_PLUSH = registerBlock("swamp_zombie_villager_plush",
                new ADSwampZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        TAIGA_ZOMBIE_VILLAGER_PLUSH = registerBlock("taiga_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        CRIMSON_ZOMBIE_VILLAGER_PLUSH = registerBlock("crimson_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WARPED_ZOMBIE_VILLAGER_PLUSH = registerBlock("warped_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WITCH_PLUSH = registerBlock("witch_plush",
                new ADWitchPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        WOLF_PLUSH = registerBlock("wolf_plush", new ADWolfPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        ZOMBIE_PLUSH = registerBlock("zombie_plush",
                new ADZombiePlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH));
        CHARRED_REMNANT_PLUSH = registerBlock("charred_remnant_plush",
                new ADZombiePlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        PIGLIN_PLUSH = registerBlock("piglin_plush",
                new ADPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH))); // Tweak the settings to match the color better
        ZOMBIFIED_PIGLIN_PLUSH = registerBlock("zombified_piglin_plush",
                new ADZombifiedPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        PUFFERFISH_PLUSH = registerBlock("pufferfish_plush",
                new ADPufferfishPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WITHER_PLUSH = registerBlock("wither_plush",
                new ADWitherPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
        STRIDER_PLUSH = registerBlock("strider_plush",
                new ADStriderPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH)));
        SHIVERING_STRIDER_PLUSH = registerBlock("shivering_strider_plush",
                new ADStriderPlushBlock(AbstractBlock.Settings.copy(PURPLE_SHEEP_PLUSH)));
        PHANTOM_PLUSH = registerBlock("phantom_plush",
                new ADPhantomPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH));
        HOGLIN_PLUSH = registerBlock("hoglin_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        ZOGLIN_PLUSH = registerBlock("zoglin_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        POLAR_BEAR_PLUSH = registerBlock("polar_bear_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        NETHER_SMOKY_QUARTZ_ORE = registerBlock("nether_smoky_quartz_ore",
                new OreBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
        SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block", new Block(
                AbstractBlock.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(0.8F)));
        CHISELED_SMOKY_QUARTZ_BLOCK = registerBlock("chiseled_smoky_quartz_block",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICKS = registerBlock("smoky_quartz_bricks",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_STAIRS = registerBlock("smoky_quartz_brick_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_SLAB = registerBlock("smoky_quartz_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_WALL = registerBlock("smoky_quartz_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_PILLAR = registerBlock("smoky_quartz_pillar",
                new PillarBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_STAIRS = registerBlock("smoky_quartz_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_SLAB = registerBlock("smoky_quartz_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_WALL = registerBlock("smoky_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ = registerBlock("smooth_smoky_quartz",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_STAIRS = registerBlock("smooth_smoky_quartz_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_SLAB = registerBlock("smooth_smoky_quartz_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_WALL = registerBlock("smooth_smoky_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
                new ADStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        QUARTZ_WALL = registerBlock("quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
        SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
        STONE_WALL = registerBlock("stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
        RED_GLASS = registerBlock("red_glass", new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));
        RED_GLASS_PANE = registerBlock("red_glass_pane", new ADPaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE)));
        BLUEBERRY_BUSH = registerBlockWithoutItem("blueberry_bush",
                new ADBlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
        BOK_CHOY = registerBlockWithoutItem("bok_choy",
                new ADBokChoyCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
        GARLIC = registerBlockWithoutItem("garlic",
                new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), ADItems.GARLIC));
        GREEN_ONIONS = registerBlockWithoutItem("green_onions",
                new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), ADItems.GREEN_ONION));
        OAK_PLANTER_BOX = registerBlock("oak_planter_box", overworldPlanterBoxBlock(MapColor.OAK_TAN));
        SPRUCE_PLANTER_BOX = registerBlock("spruce_planter_box", overworldPlanterBoxBlock(MapColor.SPRUCE_BROWN));
        BIRCH_PLANTER_BOX = registerBlock("birch_planter_box", overworldPlanterBoxBlock(MapColor.PALE_YELLOW));
        JUNGLE_PLANTER_BOX = registerBlock("jungle_planter_box", overworldPlanterBoxBlock(MapColor.DIRT_BROWN));
        ACACIA_PLANTER_BOX = registerBlock("acacia_planter_box", overworldPlanterBoxBlock(MapColor.ORANGE));
        DARK_OAK_PLANTER_BOX = registerBlock("dark_oak_planter_box", overworldPlanterBoxBlock(MapColor.BROWN));
        CRIMSON_PLANTER_BOX = registerBlock("crimson_planter_box", netherPlanterBoxBlock(MapColor.DULL_PINK));
        WARPED_PLANTER_BOX = registerBlock("warped_planter_box", netherPlanterBoxBlock(MapColor.DARK_AQUA));
        OAK_WALL = registerBlock("oak_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        SPRUCE_WALL = registerBlock("spruce_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
        BIRCH_WALL = registerBlock("birch_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
        JUNGLE_WALL = registerBlock("jungle_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
        ACACIA_WALL = registerBlock("acacia_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
        DARK_OAK_WALL = registerBlock("dark_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
        CRIMSON_WALL = registerBlock("crimson_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
        WARPED_WALL = registerBlock("warped_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
        STRIPPED_OAK_WALL = registerBlock("stripped_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        STRIPPED_SPRUCE_WALL = registerBlock("stripped_spruce_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
        STRIPPED_BIRCH_WALL = registerBlock("stripped_birch_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
        STRIPPED_JUNGLE_WALL = registerBlock("stripped_jungle_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
        STRIPPED_ACACIA_WALL = registerBlock("stripped_acacia_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
        STRIPPED_DARK_OAK_WALL = registerBlock("stripped_dark_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
        STRIPPED_CRIMSON_WALL = registerBlock("stripped_crimson_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
        STRIPPED_WARPED_WALL = registerBlock("stripped_warped_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
        OAK_ROPE_LADDER = registerRopeLadderBlock("oak_rope_ladder");
        SPRUCE_ROPE_LADDER = registerRopeLadderBlock("spruce_rope_ladder");
        BIRCH_ROPE_LADDER = registerRopeLadderBlock("birch_rope_ladder");
        JUNGLE_ROPE_LADDER = registerRopeLadderBlock("jungle_rope_ladder");
        ACACIA_ROPE_LADDER = registerRopeLadderBlock("acacia_rope_ladder");
        DARK_OAK_ROPE_LADDER = registerRopeLadderBlock("dark_oak_rope_ladder");
        CRIMSON_ROPE_LADDER = registerRopeLadderBlock("crimson_rope_ladder");
        WARPED_ROPE_LADDER = registerRopeLadderBlock("warped_rope_ladder");
        IRON_LADDER = registerBlock("iron_ladder", new ADLadderBlock(
                AbstractBlock.Settings.of(Material.METAL).strength(0.4F, 5.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
        DIRT_SLAB = registerBlock("dirt_slab",
                new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT).ticksRandomly()));
        GRASS_SLAB = registerBlock("grass_slab",
                new ADGrassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));
        DIRT_PATH_SLAB = registerBlock("dirt_path_slab",
                new ADDirtPathSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
        COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
                new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
        SNOW_BRICKS = registerBlock("snow_bricks", new Block(
                    AbstractBlock.Settings.of(Material.SNOW_BLOCK).strength(0.6F).requiresTool().sounds(BlockSoundGroup.SNOW)));
        SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
                new ADSnowyStairBlock(ADBlocks.SNOW_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SNOW_BRICKS)));
        SNOW_BRICK_SLAB = registerBlock("snow_brick_slab", new ADSnowySlabBlock(AbstractBlock.Settings.copy(SNOW_BRICKS)));
        SNOW_BRICK_WALL = registerBlock("snow_brick_wall", new WallBlock(AbstractBlock.Settings.copy(SNOW_BRICKS)));
        PURPLE_MUSHROOM = registerBlock("purple_mushroom", new MushroomPlantBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM), () -> {
            return ADTreeConfiguredFeatures.HUGE_PURPLE_MUSHROOM;
        }));
        PURPLE_MUSHROOM_BLOCK = registerBlock("purple_mushroom_block",
                new ADHugePurpleMushroomBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
        WOODCUTTER = registerBlock("woodcutter", new ADWoodcutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER)));
        WHITE_CAMPFIRE = registerBlock("white_campfire", dyedCampfireBlock(ADParticleTypes.WHITE_SPARK));
        ORANGE_CAMPFIRE = registerBlock("orange_campfire", dyedCampfireBlock(ADParticleTypes.ORANGE_SPARK));
        MAGENTA_CAMPFIRE = registerBlock("magenta_campfire", dyedCampfireBlock(ADParticleTypes.MAGENTA_SPARK));
        LIGHT_BLUE_CAMPFIRE = registerBlock("light_blue_campfire", dyedCampfireBlock(ADParticleTypes.LIGHT_BLUE_SPARK));
        YELLOW_CAMPFIRE = registerBlock("yellow_campfire", dyedCampfireBlock(ADParticleTypes.YELLOW_SPARK));
        LIME_CAMPFIRE = registerBlock("lime_campfire", dyedCampfireBlock(ADParticleTypes.LIME_SPARK));
        PINK_CAMPFIRE = registerBlock("pink_campfire", dyedCampfireBlock(ADParticleTypes.PINK_SPARK));
        GRAY_CAMPFIRE = registerBlock("gray_campfire", dyedCampfireBlock(ADParticleTypes.GRAY_SPARK));
        LIGHT_GRAY_CAMPFIRE = registerBlock("light_gray_campfire", dyedCampfireBlock(ADParticleTypes.LIGHT_GRAY_SPARK));
        CYAN_CAMPFIRE = registerBlock("cyan_campfire", dyedCampfireBlock(ADParticleTypes.CYAN_SPARK));
        PURPLE_CAMPFIRE = registerBlock("purple_campfire", dyedCampfireBlock(ADParticleTypes.PURPLE_SPARK));
        BLUE_CAMPFIRE = registerBlock("blue_campfire", dyedCampfireBlock(ADParticleTypes.BLUE_SPARK));
        BROWN_CAMPFIRE = registerBlock("brown_campfire", dyedCampfireBlock(ADParticleTypes.BROWN_SPARK));
        GREEN_CAMPFIRE = registerBlock("green_campfire", dyedCampfireBlock(ADParticleTypes.GREEN_SPARK));
        RED_CAMPFIRE = registerBlock("red_campfire", dyedCampfireBlock(ADParticleTypes.RED_SPARK));
        BLACK_CAMPFIRE = registerBlock("black_campfire", dyedCampfireBlock(ADParticleTypes.BLACK_SPARK));
        WHITE_LANTERN = registerBlock("white_lantern", lanternBlock());
        ORANGE_LANTERN = registerBlock("orange_lantern", lanternBlock());
        MAGENTA_LANTERN = registerBlock("magenta_lantern", lanternBlock());
        LIGHT_BLUE_LANTERN = registerBlock("light_blue_lantern", lanternBlock());
        YELLOW_LANTERN = registerBlock("yellow_lantern", lanternBlock());
        LIME_LANTERN = registerBlock("lime_lantern", lanternBlock());
        PINK_LANTERN = registerBlock("pink_lantern", lanternBlock());
        GRAY_LANTERN = registerBlock("gray_lantern", lanternBlock());
        LIGHT_GRAY_LANTERN = registerBlock("light_gray_lantern", lanternBlock());
        CYAN_LANTERN = registerBlock("cyan_lantern", lanternBlock());
        PURPLE_LANTERN = registerBlock("purple_lantern", lanternBlock());
        BLUE_LANTERN = registerBlock("blue_lantern", lanternBlock());
        BROWN_LANTERN = registerBlock("brown_lantern", lanternBlock());
        GREEN_LANTERN = registerBlock("green_lantern", lanternBlock());
        RED_LANTERN = registerBlock("red_lantern", lanternBlock());
        BLACK_LANTERN = registerBlock("black_lantern", lanternBlock());
        WHITE_WALL_TORCH = registerBlockWithoutItem("white_wall_torch", wallTorchBlock(ADParticleTypes.WHITE_FLAME));
        ORANGE_WALL_TORCH = registerBlockWithoutItem("orange_wall_torch", wallTorchBlock(ADParticleTypes.ORANGE_FLAME));
        MAGENTA_WALL_TORCH = registerBlockWithoutItem("magenta_wall_torch", wallTorchBlock(ADParticleTypes.MAGENTA_FLAME));
        LIGHT_BLUE_WALL_TORCH = registerBlockWithoutItem("light_blue_wall_torch", wallTorchBlock(ADParticleTypes.LIGHT_BLUE_FLAME));
        YELLOW_WALL_TORCH = registerBlockWithoutItem("yellow_wall_torch", wallTorchBlock(ADParticleTypes.YELLOW_FLAME));
        LIME_WALL_TORCH = registerBlockWithoutItem("lime_wall_torch", wallTorchBlock(ADParticleTypes.LIME_FLAME));
        PINK_WALL_TORCH = registerBlockWithoutItem("pink_wall_torch", wallTorchBlock(ADParticleTypes.PINK_FLAME));
        GRAY_WALL_TORCH = registerBlockWithoutItem("gray_wall_torch", wallTorchBlock(ADParticleTypes.GRAY_FLAME));
        LIGHT_GRAY_WALL_TORCH = registerBlockWithoutItem("light_gray_wall_torch", wallTorchBlock(ADParticleTypes.LIGHT_GRAY_FLAME));
        CYAN_WALL_TORCH = registerBlockWithoutItem("cyan_wall_torch", wallTorchBlock(ADParticleTypes.CYAN_FLAME));
        PURPLE_WALL_TORCH = registerBlockWithoutItem("purple_wall_torch", wallTorchBlock(ADParticleTypes.PURPLE_FLAME));
        BLUE_WALL_TORCH = registerBlockWithoutItem("blue_wall_torch", wallTorchBlock(ADParticleTypes.BLUE_FLAME));
        BROWN_WALL_TORCH = registerBlockWithoutItem("brown_wall_torch", wallTorchBlock(ADParticleTypes.BROWN_FLAME));
        GREEN_WALL_TORCH = registerBlockWithoutItem("green_wall_torch", wallTorchBlock(ADParticleTypes.GREEN_FLAME));
        RED_WALL_TORCH = registerBlockWithoutItem("red_wall_torch", wallTorchBlock(ADParticleTypes.RED_FLAME));
        BLACK_WALL_TORCH = registerBlockWithoutItem("black_wall_torch", wallTorchBlock(ADParticleTypes.BLACK_FLAME));
        WHITE_TORCH = registerTorchBlock("white_torch", WHITE_WALL_TORCH, torchBlock(ADParticleTypes.WHITE_FLAME));
        ORANGE_TORCH = registerTorchBlock("orange_torch", ORANGE_WALL_TORCH, torchBlock(ADParticleTypes.ORANGE_FLAME));
        MAGENTA_TORCH = registerTorchBlock("magenta_torch", MAGENTA_WALL_TORCH, torchBlock(ADParticleTypes.MAGENTA_FLAME));
        LIGHT_BLUE_TORCH = registerTorchBlock("light_blue_torch", LIGHT_BLUE_WALL_TORCH, torchBlock(ADParticleTypes.LIGHT_BLUE_FLAME));
        YELLOW_TORCH = registerTorchBlock("yellow_torch", YELLOW_WALL_TORCH, torchBlock(ADParticleTypes.YELLOW_FLAME));
        LIME_TORCH = registerTorchBlock("lime_torch", LIME_WALL_TORCH, torchBlock(ADParticleTypes.LIME_FLAME));
        PINK_TORCH = registerTorchBlock("pink_torch", PINK_WALL_TORCH, torchBlock(ADParticleTypes.PINK_FLAME));
        GRAY_TORCH = registerTorchBlock("gray_torch", GRAY_WALL_TORCH, torchBlock(ADParticleTypes.GRAY_FLAME));
        LIGHT_GRAY_TORCH = registerTorchBlock("light_gray_torch", LIGHT_GRAY_WALL_TORCH, torchBlock(ADParticleTypes.LIGHT_GRAY_FLAME));
        CYAN_TORCH = registerTorchBlock("cyan_torch", CYAN_WALL_TORCH, torchBlock(ADParticleTypes.CYAN_FLAME));
        PURPLE_TORCH = registerTorchBlock("purple_torch", PURPLE_WALL_TORCH, torchBlock(ADParticleTypes.PURPLE_FLAME));
        BLUE_TORCH = registerTorchBlock("blue_torch", BLUE_WALL_TORCH, torchBlock(ADParticleTypes.BLUE_FLAME));
        BROWN_TORCH = registerTorchBlock("brown_torch", BROWN_WALL_TORCH, torchBlock(ADParticleTypes.BROWN_FLAME));
        GREEN_TORCH = registerTorchBlock("green_torch", GREEN_WALL_TORCH, torchBlock(ADParticleTypes.GREEN_FLAME));
        RED_TORCH = registerTorchBlock("red_torch", RED_WALL_TORCH, torchBlock(ADParticleTypes.RED_FLAME));
        BLACK_TORCH = registerTorchBlock("black_torch", BLACK_WALL_TORCH, torchBlock(ADParticleTypes.BLACK_FLAME));
        WITCHS_CRADLE = registerBlockWithoutItem("witchs_cradle",
                new ADWitchsCradleBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));
        FRESH_BAMBOO_FENCE = registerBlock("fresh_bamboo_fence", bambooFenceBlock(MapColor.DARK_GREEN));
        FRESH_BAMBOO_FENCE_GATE = registerBlock("fresh_bamboo_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(FRESH_BAMBOO_FENCE)));
        DRIED_BAMBOO_FENCE = registerBlock("dried_bamboo_fence", bambooFenceBlock(MapColor.PALE_YELLOW));
        DRIED_BAMBOO_FENCE_GATE = registerBlock("dried_bamboo_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(DRIED_BAMBOO_FENCE)));
        BAUXITE = registerBlock("bauxite",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.3F)));
        BAUXITE_SLAB = registerBlock("bauxite_slab", new SlabBlock(AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_STAIRS = registerBlock("bauxite_stairs",
                new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_WALL = registerBlock("bauxite_wall", new WallBlock(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE = registerBlock("polished_bauxite", new Block(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_SLAB = registerBlock("polished_bauxite_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_STAIRS = registerBlock("polished_bauxite_stairs",
                new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_WALL = registerBlock("polished_bauxite_wall",
                new WallBlock(AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_BRICKS = registerBlock("bauxite_bricks",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.4F)));
        BAUXITE_BRICK_STAIRS = registerBlock("bauxite_brick_stairs",
                new ADStairsBlock(BAUXITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        BAUXITE_BRICK_SLAB = registerBlock("bauxite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        BAUXITE_BRICK_WALL = registerBlock("bauxite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        SNOW_SLAB = registerBlock("snow_slab",
                new ADSnowySlabBlock(AbstractBlock.Settings.of(Material.SNOW_BLOCK).requiresTool().strength(0.2F).sounds(BlockSoundGroup.SNOW)));
        SNOW_STAIRS = registerBlock("snow_stairs",
                new ADSnowyStairBlock(Blocks.SNOW_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SNOW_SLAB)));
        SNOW_WALL = registerBlock("snow_wall", new WallBlock(AbstractBlock.Settings.copy(SNOW_SLAB)));
        TWISTED_NETHER_BRICKS = registerBlock("twisted_nether_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_STAIRS = registerBlock("twisted_nether_brick_stairs",
                new ADStairsBlock(TWISTED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_SLAB = registerBlock("twisted_nether_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_WALL = registerBlock("twisted_nether_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHERRACK = registerBlock("twisted_netherrack",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
        TWISTED_NETHERRACK_STAIRS = registerBlock("twisted_netherrack_stairs",
                new ADStairsBlock(TWISTED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        TWISTED_NETHERRACK_SLAB = registerBlock("twisted_netherrack_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        TWISTED_NETHERRACK_WALL = registerBlock("twisted_netherrack_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        WEEPING_NETHER_BRICKS = registerBlock("weeping_nether_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_STAIRS = registerBlock("weeping_nether_brick_stairs",
                new ADStairsBlock(WEEPING_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_SLAB = registerBlock("weeping_nether_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_WALL = registerBlock("weeping_nether_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHERRACK = registerBlock("weeping_netherrack",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
        WEEPING_NETHERRACK_STAIRS = registerBlock("weeping_netherrack_stairs",
                new ADStairsBlock(WEEPING_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        WEEPING_NETHERRACK_SLAB = registerBlock("weeping_netherrack_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        WEEPING_NETHERRACK_WALL = registerBlock("weeping_netherrack_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        SNAPDRAGON = registerBlock("snapdragon",
                new ADSnapdragonBlock(StatusEffects.LUCK, 8, AbstractBlock.Settings.copy(Blocks.POPPY).luminance((state) -> 7)));
        POTTED_SNAPDRAGON = registerBlockWithoutItem("potted_snapdragon",
                new ADPottedSnapdragonBlock(ADBlocks.SNAPDRAGON, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).luminance((state) -> 7)));
        POTTED_PURPLE_MUSHROOM = registerBlockWithoutItem("potted_purple_mushroom",
                new FlowerPotBlock(ADBlocks.PURPLE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
        ENDER_GRASS = registerBlock("ender_grass",
                new ADEnderGrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS).luminance((state) -> 7)));
        ICICLE = registerBlock("icicle",
                new ADIcicleBlock(AbstractBlock.Settings.of(Material.ICE).requiresTool().strength(0.2F).noCollision().sounds(BlockSoundGroup.GLASS));
        CATTAIL = registerBlockWithoutItem("cattail",
                new ADCattailBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().nonOpaque().sounds(BlockSoundGroup.WET_GRASS)));
        CHOCOLATE_CAKE = registerBlock("chocolate_cake",
                new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
        RED_VELVET_CAKE = registerBlock("red_velvet_cake",
                new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE));
        STONE_TILES = registerBlock("stone_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        STONE_TILE_SLAB = registerBlock("stone_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
                new ADStairsBlock(STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE)));
        STONE_TILE_WALL = registerBlock("stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
                new Block(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
                new ADStairsBlock(MOSSY_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
                new Block(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_SLAB = registerBlock("cracked_stone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_STAIRS = registerBlock("cracked_stone_tile_stairs",
                new ADStairsBlock(CRACKED_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_WALL = registerBlock("cracked_stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        SWEET_BERRY_PIE = registerBlock("sweet_berry_pie",
                new ADPieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F));
        BLUEBERRY_PIE = registerBlock("blueberry_pie",
                new ADPieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F));
        BLACKSTONE_TILES = registerBlock("blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        BLACKSTONE_TILE_STAIRS = registerBlock("blackstone_tile_stairs",
                new ADStairsBlock(BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        BLACKSTONE_TILE_SLAB = registerBlock("blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        BLACKSTONE_TILE_WALL = registerBlock("blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILES = registerBlock("twisted_blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(BLACKSTONE_TILES).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        TWISTED_BLACKSTONE_TILE_STAIRS = registerBlock("twisted_blackstone_tile_stairs",
                new ADStairsBlock(TWISTED_BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILE_SLAB = registerBlock("twisted_blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILE_WALL = registerBlock("twisted_blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILES = registerBlock("weeping_blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(BLACKSTONE_TILES).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        WEEPING_BLACKSTONE_TILE_STAIRS = registerBlock("weeping_blackstone_tile_stairs",
                new ADStairsBlock(WEEPING_BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILE_SLAB = registerBlock("weeping_blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILE_WALL = registerBlock("weeping_blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES)));
        TWISTED_POLISHED_BLACKSTONE_BRICKS = registerBlock("twisted_polished_blackstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("twisted_polished_blackstone_brick_stairs",
                new ADStairsBlock(TWISTED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("twisted_polished_blackstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("twisted_polished_blackstone_brick_wall",
                        new WallBlock(AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICKS = registerBlock("weeping_polished_blackstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("weeping_polished_blackstone_brick_stairs",
                new ADStairsBlock(WEEPING_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("weeping_polished_blackstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("weeping_polished_blackstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_BLACKSTONE = registerBlock("twisted_blackstone",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        TWISTED_BLACKSTONE_STAIRS = registerBlock("twisted_blackstone_stairs",
                new ADStairsBlock(TWISTED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_BLACKSTONE)));
        TWISTED_BLACKSTONE_SLAB = registerBlock("twisted_blackstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE)));
        TWISTED_BLACKSTONE_WALL = registerBlock("twisted_blackstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE)));
        WEEPING_BLACKSTONE = registerBlock("weeping_blackstone",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        WEEPING_BLACKSTONE_STAIRS = registerBlock("weeping_blackstone_stairs",
                new ADStairsBlock(WEEPING_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_BLACKSTONE)));
        WEEPING_BLACKSTONE_SLAB = registerBlock("weeping_blackstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE)));
        WEEPING_BLACKSTONE_WALL = registerBlock("weeping_blackstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE)));
        QUARTZ_TILES = registerBlock("quartz_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
                new ADStairsBlock(QUARTZ_TILES.getDefaultState(), AbstractBlock.Settings.copy(QUARTZ_TILES)));
        QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(QUARTZ_TILES)));
        QUARTZ_TILE_WALL = registerBlock("quartz_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(QUARTZ_TILES)));
        POLISHED_CALCITE = registerBlock("polished_calcite",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
                new ADStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICKS = registerBlock("calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
                new ADStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CRACKED_CALCITE_BRICK_STAIRS = registerBlock("cracked_calcite_brick_stairs",
                new ADStairsBlock(CRACKED_CALCITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CRACKED_CALCITE_BRICK_SLAB = registerBlock("cracked_calcite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CRACKED_CALCITE_BRICK_WALL = registerBlock("cracked_calcite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_TUFF = registerBlock("polished_tuff",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICKS = registerBlock("tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_STAIRS = registerBlock("mossy_tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_SLAB = registerBlock("mossy_tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_WALL = registerBlock("mossy_tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_STAIRS = registerBlock("cracked_tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_SLAB = registerBlock("cracked_tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_WALL = registerBlock("cracked_tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_DRIPSTONE_BLOCK = registerBlock("polished_dripstone_block",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICKS = registerBlock("mossy_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_STAIRS = registerBlock("mossy_dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_SLAB = registerBlock("mossy_dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_WALL = registerBlock("mossy_dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_STAIRS = registerBlock("cracked_dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_SLAB = registerBlock("cracked_dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_WALL = registerBlock("cracked_dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        SPECTRAL_ONYX = registerBlock("spectral_onyx",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        SPECTRAL_ONYX_STAIRS = registerBlock("spectral_onyx_stairs",
                new ADStairsBlock(ADBlocks.SPECTRAL_ONYX.getDefaultState(),
                        AbstractBlock.Settings.copy(ADBlocks.SPECTRAL_ONYX)));
        SPECTRAL_ONYX_SLAB = registerBlock("spectral_onyx_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX)));
        SPECTRAL_ONYX_WALL = registerBlock("spectral_onyx_wall",
                new WallBlock(AbstractBlock.Settings.copy(ADBlocks.SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX = registerBlock("cobbled_spectral_onyx",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        COBBLED_SPECTRAL_ONYX_STAIRS = registerBlock("cobbled_spectral_onyx_stairs",
                new ADStairsBlock(COBBLED_SPECTRAL_ONYX.getDefaultState(),
                        AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX_SLAB = registerBlock("cobbled_spectral_onyx_slab",
                new SlabBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX_WALL = registerBlock("cobbled_spectral_onyx_wall",
                new WallBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        SPECTRAL_ONYX_BRICKS = registerBlock("spectral_onyx_bricks",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        SPECTRAL_ONYX_BRICK_STAIRS = registerBlock("spectral_onyx_brick_stairs",
                new ADStairsBlock(SPECTRAL_ONYX_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        SPECTRAL_ONYX_BRICK_SLAB = registerBlock("spectral_onyx_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        SPECTRAL_ONYX_BRICK_WALL = registerBlock("spectral_onyx_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        BLOOD_KELP = registerBlockWithoutItem("blood_kelp",
                new ADBloodKelpBlock(AbstractBlock.Settings.copy(Blocks.KELP)));
        BLOOD_KELP_PLANT = registerBlockWithoutItem("blood_kelp_plant",
                new ADBloodKelpPlantBlock(AbstractBlock.Settings.copy(Blocks.KELP_PLANT).luminance(createLightLevelFromLitBlockState(10))));
        CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", netherBookshelfBlock(MapColor.DULL_PINK));
        WARPED_BOOKSHELF = registerBlock("warped_bookshelf", netherBookshelfBlock(MapColor.DARK_AQUA));
    }
}
