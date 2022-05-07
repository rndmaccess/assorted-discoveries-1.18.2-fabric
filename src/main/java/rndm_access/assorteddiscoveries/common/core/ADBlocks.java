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
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.*;
import rndm_access.assorteddiscoveries.common.item.ADRopeLadderBlockItem;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADTreeConfiguredFeatures;

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

    private static ADRopeLadderBlock ropeLadderBlock() { return new ADRopeLadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER)); }

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

    private static Block register(String path, Block block) {
        return Registry.register(Registry.BLOCK, ADReference.makeId(path), block);
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> state.get(Properties.LIT) ? litLevel : 0;
    }

    /**
     * Called during mod initialization to register every block.
     */
    public static void registerBlocks() {
        AssortedDiscoveries.LOGGER.info("Registered blocks");
    }

    static {
        BAT_PLUSH = register("bat_plush", new ADBatPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BLAZE_PLUSH = register("blaze_plush", new ADBlazePlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.YELLOW).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CAVE_SPIDER_PLUSH = register("cave_spider_plush", new ADCaveSpiderPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.CYAN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CHICKEN_PLUSH = register("chicken_plush", new ADChickenPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.WHITE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        COW_PLUSH = register("cow_plush", new ADCowPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.BROWN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        CREEPER_PLUSH = register("creeper_plush", new ADCreeperPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.LIME).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        ENDERMAN_PLUSH = register("enderman_plush", new ADEndermanPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.BLACK).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        GHAST_PLUSH = register("ghast_plush", new ADGhastPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GUARDIAN_PLUSH = register("guardian_plush", new ADGuardianPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH)));
        WHITE_HORSE_PLUSH = register("white_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GRAY_HORSE_PLUSH = register("gray_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH)));
        LIGHT_GRAY_HORSE_PLUSH = register("light_gray_horse_plush", new ADHorsePlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_HORSE_PLUSH = register("brown_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        BLACK_HORSE_PLUSH = register("black_horse_plush", new ADHorsePlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        MAGMA_CUBE_PLUSH = register("magma_cube_plush", new ADMagmaCubePlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.RED).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        RED_MOOSHROOM_PLUSH = register("red_mooshroom_plush", new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH)));
        BROWN_MOOSHROOM_PLUSH = register("brown_mooshroom_plush", new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        OCELOT_PLUSH = register("ocelot_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        TABBY_CAT_PLUSH = register("tabby_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        TUXEDO_CAT_PLUSH = register("tuxedo_cat_plush", new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        RED_CAT_PLUSH = register("red_cat_plush", new ADCatPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.ORANGE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        SIAMESE_CAT_PLUSH = register("siamese_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BRITISH_SHORTHAIR_CAT_PLUSH = register("british_shorthair_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        CALICO_CAT_PLUSH = register("calico_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        PERSIAN_CAT_PLUSH = register("persian_cat_plush",
                new ADPersianCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        RAGDOLL_CAT_PLUSH = register("ragdoll_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        WHITE_CAT_PLUSH = register("white_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        JELLIE_CAT_PLUSH = register("jellie_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BLACK_CAT_PLUSH = register("black_cat_plush",
                new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        PIG_PLUSH = register("pig_plush", new ADPigPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.PINK).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_RABBIT_PLUSH = register("brown_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WHITE_RABBIT_PLUSH = register("white_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        BLACK_RABBIT_PLUSH = register("black_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        WHITE_SPLOTCHED_RABBIT_PLUSH = register("white_splotched_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        GOLD_RABBIT_PLUSH = register("gold_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        TOAST_RABBIT_PLUSH = register("toast_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        SALT_RABBIT_PLUSH = register("salt_rabbit_plush",
                new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WHITE_SHEEP_PLUSH = register("white_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        ORANGE_SHEEP_PLUSH = register("orange_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        MAGENTA_SHEEP_PLUSH = register("magenta_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.of(Material.WOOL, MapColor.MAGENTA).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        LIGHT_BLUE_SHEEP_PLUSH = register("light_blue_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        YELLOW_SHEEP_PLUSH = register("yellow_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        LIME_SHEEP_PLUSH = register("lime_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH)));
        PINK_SHEEP_PLUSH = register("pink_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        GRAY_SHEEP_PLUSH = register("gray_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH)));
        LIGHT_GRAY_SHEEP_PLUSH = register("light_gray_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        CYAN_SHEEP_PLUSH = register("cyan_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH)));
        PURPLE_SHEEP_PLUSH = register("purple_sheep_plush",
                new ADSheepPlushBlock(
                        AbstractBlock.Settings.of(Material.WOOL, MapColor.PURPLE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BLUE_SHEEP_PLUSH = register("blue_sheep_plush",
                new ADSheepPlushBlock(
                        AbstractBlock.Settings.of(Material.WOOL, MapColor.BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        BROWN_SHEEP_PLUSH = register("brown_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        GREEN_SHEEP_PLUSH = register("green_sheep_plush", new ADSheepPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.GREEN).strength(0.2F).sounds(BlockSoundGroup.WOOL)));
        RED_SHEEP_PLUSH = register("red_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH)));
        BLACK_SHEEP_PLUSH = register("black_sheep_plush",
                new ADSheepPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        SKELETON_PLUSH = register("skeleton_plush",
                new ADSkeletonPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH)));
        SLIME_PLUSH = register("slime_plush",
                new ADSlimePlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH)));
        SPIDER_PLUSH = register("spider_plush",
                new ADSpiderPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        SQUID_PLUSH = register("squid_plush",
                new ADSquidPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH)));
        BEE_PLUSH = register("bee_plush",
                new ADBeePlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        PLAINS_VILLAGER_PLUSH = register("plains_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        DESERT_VILLAGER_PLUSH = register("desert_villager_plush",
                new ADDesertVillagerPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        JUNGLE_VILLAGER_PLUSH = register("jungle_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        SAVANNA_VILLAGER_PLUSH = register("savanna_villager_plush",
                new ADSavannaVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SNOW_VILLAGER_PLUSH = register("snow_villager_plush",
                new ADSnowVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SWAMP_VILLAGER_PLUSH = register("swamp_villager_plush",
                new ADSwampVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        TAIGA_VILLAGER_PLUSH = register("taiga_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        CRIMSON_VILLAGER_PLUSH = register("crimson_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WARPED_VILLAGER_PLUSH = register("warped_villager_plush",
                new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        WANDERING_TRADER_PLUSH = register("wandering_trader_plush",
                new ADWanderingTraderPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH)));
        PLAINS_ZOMBIE_VILLAGER_PLUSH = register("plains_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        DESERT_ZOMBIE_VILLAGER_PLUSH = register("desert_zombie_villager_plush",
                new ADDesertZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        JUNGLE_ZOMBIE_VILLAGER_PLUSH = register("jungle_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        SAVANNA_ZOMBIE_VILLAGER_PLUSH = register("savanna_zombie_villager_plush",
                new ADSavannaZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SNOW_ZOMBIE_VILLAGER_PLUSH = register("snow_zombie_villager_plush",
                new ADSnowZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        SWAMP_ZOMBIE_VILLAGER_PLUSH = register("swamp_zombie_villager_plush",
                new ADSwampZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH)));
        TAIGA_ZOMBIE_VILLAGER_PLUSH = register("taiga_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        CRIMSON_ZOMBIE_VILLAGER_PLUSH = register("crimson_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WARPED_ZOMBIE_VILLAGER_PLUSH = register("warped_zombie_villager_plush",
                new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WITCH_PLUSH = register("witch_plush",
                new ADWitchPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        WOLF_PLUSH = register("wolf_plush",
                new ADWolfPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        ZOMBIE_PLUSH = register("zombie_plush",
                new ADZombiePlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH)));
        CHARRED_REMNANT_PLUSH = register("charred_remnant_plush",
                new ADZombiePlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        PIGLIN_PLUSH = register("piglin_plush",
                new ADPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        ZOMBIFIED_PIGLIN_PLUSH = register("zombified_piglin_plush",
                new ADZombifiedPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        PUFFERFISH_PLUSH = register("pufferfish_plush",
                new ADPufferfishPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH)));
        WITHER_PLUSH = register("wither_plush",
                new ADWitherPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH)));
        STRIDER_PLUSH = register("strider_plush",
                new ADStriderPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH)));
        SHIVERING_STRIDER_PLUSH = register("shivering_strider_plush",
                new ADStriderPlushBlock(AbstractBlock.Settings.copy(PURPLE_SHEEP_PLUSH)));
        PHANTOM_PLUSH = register("phantom_plush",
                new ADPhantomPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH)));
        HOGLIN_PLUSH = register("hoglin_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH)));
        ZOGLIN_PLUSH = register("zoglin_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH)));
        POLAR_BEAR_PLUSH = register("polar_bear_plush",
                new ADHoglinPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH)));
        NETHER_SMOKY_QUARTZ_ORE = register("nether_smoky_quartz_ore",
                new OreBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
        SMOKY_QUARTZ_BLOCK = register("smoky_quartz_block",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(0.8F)));
        CHISELED_SMOKY_QUARTZ_BLOCK = register("chiseled_smoky_quartz_block",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICKS = register("smoky_quartz_bricks",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_STAIRS = register("smoky_quartz_brick_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_SLAB = register("smoky_quartz_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_BRICK_WALL = register("smoky_quartz_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_PILLAR = register("smoky_quartz_pillar",
                new PillarBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_STAIRS = register("smoky_quartz_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_SLAB = register("smoky_quartz_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOKY_QUARTZ_WALL = register("smoky_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ = register("smooth_smoky_quartz",
                new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_STAIRS = register("smooth_smoky_quartz_stairs",
                new ADStairsBlock(SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_SLAB = register("smooth_smoky_quartz_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        SMOOTH_SMOKY_QUARTZ_WALL = register("smooth_smoky_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK)));
        CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs",
                new ADStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
        QUARTZ_WALL = register("quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
        SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
        STONE_WALL = register("stone_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
        RED_GLASS = register("red_glass",
                new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));
        RED_GLASS_PANE = register("red_glass_pane",
                new ADPaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE)));
        BLUEBERRY_BUSH = register("blueberry_bush",
                new ADBlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
        BOK_CHOY = register("bok_choy",
                new ADBokChoyCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
        GARLIC = register("garlic",
                new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), () -> ADItems.GARLIC));
        GREEN_ONIONS = register("green_onions",
                new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), () -> ADItems.GREEN_ONION));
        OAK_PLANTER_BOX = register("oak_planter_box",
                overworldPlanterBoxBlock(MapColor.OAK_TAN));
        SPRUCE_PLANTER_BOX = register("spruce_planter_box",
                overworldPlanterBoxBlock(MapColor.SPRUCE_BROWN));
        BIRCH_PLANTER_BOX = register("birch_planter_box",
                overworldPlanterBoxBlock(MapColor.PALE_YELLOW));
        JUNGLE_PLANTER_BOX = register("jungle_planter_box",
                overworldPlanterBoxBlock(MapColor.DIRT_BROWN));
        ACACIA_PLANTER_BOX = register("acacia_planter_box",
                overworldPlanterBoxBlock(MapColor.ORANGE));
        DARK_OAK_PLANTER_BOX = register("dark_oak_planter_box",
                overworldPlanterBoxBlock(MapColor.BROWN));
        CRIMSON_PLANTER_BOX = register("crimson_planter_box",
                netherPlanterBoxBlock(MapColor.DULL_PINK));
        WARPED_PLANTER_BOX = register("warped_planter_box",
                netherPlanterBoxBlock(MapColor.DARK_AQUA));
        OAK_WALL = register("oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        SPRUCE_WALL = register("spruce_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
        BIRCH_WALL = register("birch_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
        JUNGLE_WALL = register("jungle_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
        ACACIA_WALL = register("acacia_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
        DARK_OAK_WALL = register("dark_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
        CRIMSON_WALL = register("crimson_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
        WARPED_WALL = register("warped_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
        STRIPPED_OAK_WALL = register("stripped_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        STRIPPED_SPRUCE_WALL = register("stripped_spruce_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
        STRIPPED_BIRCH_WALL = register("stripped_birch_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
        STRIPPED_JUNGLE_WALL = register("stripped_jungle_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
        STRIPPED_ACACIA_WALL = register("stripped_acacia_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
        STRIPPED_DARK_OAK_WALL = register("stripped_dark_oak_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
        STRIPPED_CRIMSON_WALL = register("stripped_crimson_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
        STRIPPED_WARPED_WALL = register("stripped_warped_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));
        OAK_ROPE_LADDER = register("oak_rope_ladder", ropeLadderBlock());
        SPRUCE_ROPE_LADDER = register("spruce_rope_ladder", ropeLadderBlock());
        BIRCH_ROPE_LADDER = register("birch_rope_ladder", ropeLadderBlock());
        JUNGLE_ROPE_LADDER = register("jungle_rope_ladder", ropeLadderBlock());
        ACACIA_ROPE_LADDER = register("acacia_rope_ladder", ropeLadderBlock());
        DARK_OAK_ROPE_LADDER = register("dark_oak_rope_ladder", ropeLadderBlock());
        CRIMSON_ROPE_LADDER = register("crimson_rope_ladder", ropeLadderBlock());
        WARPED_ROPE_LADDER = register("warped_rope_ladder", ropeLadderBlock());
        IRON_LADDER = register("iron_ladder",
                new ADLadderBlock(AbstractBlock.Settings.of(Material.METAL).strength(0.4F, 5.0F)
                        .sounds(BlockSoundGroup.METAL).nonOpaque()));
        DIRT_SLAB = register("dirt_slab",
                new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT).ticksRandomly()));
        GRASS_SLAB = register("grass_slab",
                new ADGrassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));
        DIRT_PATH_SLAB = register("dirt_path_slab",
                new ADDirtPathSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
        COARSE_DIRT_SLAB = register("coarse_dirt_slab",
                new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
        SNOW_BRICKS = register("snow_bricks",
                new Block(AbstractBlock.Settings.of(Material.SNOW_BLOCK).strength(0.6F)
                        .requiresTool().sounds(BlockSoundGroup.SNOW)));
        SNOW_BRICK_STAIRS = register("snow_brick_stairs",
                new ADSnowyStairBlock(ADBlocks.SNOW_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SNOW_BRICKS)));
        SNOW_BRICK_SLAB = register("snow_brick_slab", new ADSnowySlabBlock(AbstractBlock.Settings.copy(SNOW_BRICKS)));
        SNOW_BRICK_WALL = register("snow_brick_wall", new WallBlock(AbstractBlock.Settings.copy(SNOW_BRICKS)));
        PURPLE_MUSHROOM = register("purple_mushroom",
                new MushroomPlantBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM),
                        () -> ADTreeConfiguredFeatures.HUGE_PURPLE_MUSHROOM));
        PURPLE_MUSHROOM_BLOCK = register("purple_mushroom_block",
                new ADPurpleMushroomBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
        WOODCUTTER = register("woodcutter",
                new ADWoodcutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER)));
        WHITE_CAMPFIRE = register("white_campfire",
                dyedCampfireBlock(ADParticleTypes.WHITE_SPARK));
        ORANGE_CAMPFIRE = register("orange_campfire",
                dyedCampfireBlock(ADParticleTypes.ORANGE_SPARK));
        MAGENTA_CAMPFIRE = register("magenta_campfire",
                dyedCampfireBlock(ADParticleTypes.MAGENTA_SPARK));
        LIGHT_BLUE_CAMPFIRE = register("light_blue_campfire",
                dyedCampfireBlock(ADParticleTypes.LIGHT_BLUE_SPARK));
        YELLOW_CAMPFIRE = register("yellow_campfire",
                dyedCampfireBlock(ADParticleTypes.YELLOW_SPARK));
        LIME_CAMPFIRE = register("lime_campfire",
                dyedCampfireBlock(ADParticleTypes.LIME_SPARK));
        PINK_CAMPFIRE = register("pink_campfire",
                dyedCampfireBlock(ADParticleTypes.PINK_SPARK));
        GRAY_CAMPFIRE = register("gray_campfire",
                dyedCampfireBlock(ADParticleTypes.GRAY_SPARK));
        LIGHT_GRAY_CAMPFIRE = register("light_gray_campfire",
                dyedCampfireBlock(ADParticleTypes.LIGHT_GRAY_SPARK));
        CYAN_CAMPFIRE = register("cyan_campfire",
                dyedCampfireBlock(ADParticleTypes.CYAN_SPARK));
        PURPLE_CAMPFIRE = register("purple_campfire",
                dyedCampfireBlock(ADParticleTypes.PURPLE_SPARK));
        BLUE_CAMPFIRE = register("blue_campfire",
                dyedCampfireBlock(ADParticleTypes.BLUE_SPARK));
        BROWN_CAMPFIRE = register("brown_campfire",
                dyedCampfireBlock(ADParticleTypes.BROWN_SPARK));
        GREEN_CAMPFIRE = register("green_campfire",
                dyedCampfireBlock(ADParticleTypes.GREEN_SPARK));
        RED_CAMPFIRE = register("red_campfire",
                dyedCampfireBlock(ADParticleTypes.RED_SPARK));
        BLACK_CAMPFIRE = register("black_campfire",
                dyedCampfireBlock(ADParticleTypes.BLACK_SPARK));
        WHITE_LANTERN = register("white_lantern", lanternBlock());
        ORANGE_LANTERN = register("orange_lantern", lanternBlock());
        MAGENTA_LANTERN = register("magenta_lantern", lanternBlock());
        LIGHT_BLUE_LANTERN = register("light_blue_lantern", lanternBlock());
        YELLOW_LANTERN = register("yellow_lantern", lanternBlock());
        LIME_LANTERN = register("lime_lantern", lanternBlock());
        PINK_LANTERN = register("pink_lantern", lanternBlock());
        GRAY_LANTERN = register("gray_lantern", lanternBlock());
        LIGHT_GRAY_LANTERN = register("light_gray_lantern", lanternBlock());
        CYAN_LANTERN = register("cyan_lantern", lanternBlock());
        PURPLE_LANTERN = register("purple_lantern", lanternBlock());
        BLUE_LANTERN = register("blue_lantern", lanternBlock());
        BROWN_LANTERN = register("brown_lantern", lanternBlock());
        GREEN_LANTERN = register("green_lantern", lanternBlock());
        RED_LANTERN = register("red_lantern", lanternBlock());
        BLACK_LANTERN = register("black_lantern", lanternBlock());
        WHITE_WALL_TORCH = register("white_wall_torch",
                wallTorchBlock(ADParticleTypes.WHITE_FLAME));
        ORANGE_WALL_TORCH = register("orange_wall_torch",
                wallTorchBlock(ADParticleTypes.ORANGE_FLAME));
        MAGENTA_WALL_TORCH = register("magenta_wall_torch",
                wallTorchBlock(ADParticleTypes.MAGENTA_FLAME));
        LIGHT_BLUE_WALL_TORCH = register("light_blue_wall_torch",
                wallTorchBlock(ADParticleTypes.LIGHT_BLUE_FLAME));
        YELLOW_WALL_TORCH = register("yellow_wall_torch",
                wallTorchBlock(ADParticleTypes.YELLOW_FLAME));
        LIME_WALL_TORCH = register("lime_wall_torch",
                wallTorchBlock(ADParticleTypes.LIME_FLAME));
        PINK_WALL_TORCH = register("pink_wall_torch",
                wallTorchBlock(ADParticleTypes.PINK_FLAME));
        GRAY_WALL_TORCH = register("gray_wall_torch",
                wallTorchBlock(ADParticleTypes.GRAY_FLAME));
        LIGHT_GRAY_WALL_TORCH = register("light_gray_wall_torch",
                wallTorchBlock(ADParticleTypes.LIGHT_GRAY_FLAME));
        CYAN_WALL_TORCH = register("cyan_wall_torch",
                wallTorchBlock(ADParticleTypes.CYAN_FLAME));
        PURPLE_WALL_TORCH = register("purple_wall_torch",
                wallTorchBlock(ADParticleTypes.PURPLE_FLAME));
        BLUE_WALL_TORCH = register("blue_wall_torch",
                wallTorchBlock(ADParticleTypes.BLUE_FLAME));
        BROWN_WALL_TORCH = register("brown_wall_torch",
                wallTorchBlock(ADParticleTypes.BROWN_FLAME));
        GREEN_WALL_TORCH = register("green_wall_torch",
                wallTorchBlock(ADParticleTypes.GREEN_FLAME));
        RED_WALL_TORCH = register("red_wall_torch",
                wallTorchBlock(ADParticleTypes.RED_FLAME));
        BLACK_WALL_TORCH = register("black_wall_torch",
                wallTorchBlock(ADParticleTypes.BLACK_FLAME));
        WHITE_TORCH = register("white_torch",
                torchBlock(ADParticleTypes.WHITE_FLAME));
        ORANGE_TORCH = register("orange_torch",
                torchBlock(ADParticleTypes.ORANGE_FLAME));
        MAGENTA_TORCH = register("magenta_torch",
                torchBlock(ADParticleTypes.MAGENTA_FLAME));
        LIGHT_BLUE_TORCH = register("light_blue_torch",
                torchBlock(ADParticleTypes.LIGHT_BLUE_FLAME));
        YELLOW_TORCH = register("yellow_torch",
                torchBlock(ADParticleTypes.YELLOW_FLAME));
        LIME_TORCH = register("lime_torch",
                torchBlock(ADParticleTypes.LIME_FLAME));
        PINK_TORCH = register("pink_torch",
                torchBlock(ADParticleTypes.PINK_FLAME));
        GRAY_TORCH = register("gray_torch",
                torchBlock(ADParticleTypes.GRAY_FLAME));
        LIGHT_GRAY_TORCH = register("light_gray_torch",
                torchBlock(ADParticleTypes.LIGHT_GRAY_FLAME));
        CYAN_TORCH = register("cyan_torch",
                torchBlock(ADParticleTypes.CYAN_FLAME));
        PURPLE_TORCH = register("purple_torch",
                torchBlock(ADParticleTypes.PURPLE_FLAME));
        BLUE_TORCH = register("blue_torch",
                torchBlock(ADParticleTypes.BLUE_FLAME));
        BROWN_TORCH = register("brown_torch",
                torchBlock(ADParticleTypes.BROWN_FLAME));
        GREEN_TORCH = register("green_torch",
                torchBlock(ADParticleTypes.GREEN_FLAME));
        RED_TORCH = register("red_torch",
                torchBlock(ADParticleTypes.RED_FLAME));
        BLACK_TORCH = register("black_torch",
                torchBlock(ADParticleTypes.BLACK_FLAME));
        WITCHS_CRADLE = register("witchs_cradle",
                new ADWitchsCradleBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));
        FRESH_BAMBOO_FENCE = register("fresh_bamboo_fence",
                bambooFenceBlock(MapColor.DARK_GREEN));
        FRESH_BAMBOO_FENCE_GATE = register("fresh_bamboo_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(FRESH_BAMBOO_FENCE)));
        DRIED_BAMBOO_FENCE = register("dried_bamboo_fence",
                bambooFenceBlock(MapColor.PALE_YELLOW));
        DRIED_BAMBOO_FENCE_GATE = register("dried_bamboo_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(DRIED_BAMBOO_FENCE)));
        BAUXITE = register("bauxite",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.3F)));
        BAUXITE_SLAB = register("bauxite_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_STAIRS = register("bauxite_stairs",
                new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_WALL = register("bauxite_wall",
                new WallBlock(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE = register("polished_bauxite",
                new Block(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_SLAB = register("polished_bauxite_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_STAIRS = register("polished_bauxite_stairs",
                new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE)));
        POLISHED_BAUXITE_WALL = register("polished_bauxite_wall",
                new WallBlock(AbstractBlock.Settings.copy(BAUXITE)));
        BAUXITE_BRICKS = register("bauxite_bricks",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.4F)));
        BAUXITE_BRICK_STAIRS = register("bauxite_brick_stairs",
                new ADStairsBlock(BAUXITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        BAUXITE_BRICK_SLAB = register("bauxite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        BAUXITE_BRICK_WALL = register("bauxite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS)));
        SNOW_SLAB = register("snow_slab",
                new ADSnowySlabBlock(AbstractBlock.Settings.of(Material.SNOW_BLOCK).requiresTool()
                        .strength(0.2F).sounds(BlockSoundGroup.SNOW)));
        SNOW_STAIRS = register("snow_stairs",
                new ADSnowyStairBlock(Blocks.SNOW_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SNOW_SLAB)));
        SNOW_WALL = register("snow_wall",
                new WallBlock(AbstractBlock.Settings.copy(SNOW_SLAB)));
        TWISTED_NETHER_BRICKS = register("twisted_nether_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_STAIRS = register("twisted_nether_brick_stairs",
                new ADStairsBlock(TWISTED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_SLAB = register("twisted_nether_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHER_BRICK_WALL = register("twisted_nether_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS)));
        TWISTED_NETHERRACK = register("twisted_netherrack",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
        TWISTED_NETHERRACK_STAIRS = register("twisted_netherrack_stairs",
                new ADStairsBlock(TWISTED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        TWISTED_NETHERRACK_SLAB = register("twisted_netherrack_slab",
                new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        TWISTED_NETHERRACK_WALL = register("twisted_netherrack_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK)));
        WEEPING_NETHER_BRICKS = register("weeping_nether_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_STAIRS = register("weeping_nether_brick_stairs",
                new ADStairsBlock(WEEPING_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_SLAB = register("weeping_nether_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHER_BRICK_WALL = register("weeping_nether_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS)));
        WEEPING_NETHERRACK = register("weeping_netherrack",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
        WEEPING_NETHERRACK_STAIRS = register("weeping_netherrack_stairs",
                new ADStairsBlock(WEEPING_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        WEEPING_NETHERRACK_SLAB = register("weeping_netherrack_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        WEEPING_NETHERRACK_WALL = register("weeping_netherrack_wall",
                new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK)));
        SNAPDRAGON = register("snapdragon",
                new ADSnapdragonBlock(StatusEffects.LUCK, 8, AbstractBlock.Settings.copy(Blocks.POPPY)
                        .luminance((state) -> 7)));
        POTTED_SNAPDRAGON = register("potted_snapdragon",
                new ADPottedSnapdragonBlock(ADBlocks.SNAPDRAGON, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)
                        .luminance((state) -> 7)));
        POTTED_PURPLE_MUSHROOM = register("potted_purple_mushroom",
                new FlowerPotBlock(ADBlocks.PURPLE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
        ENDER_GRASS = register("ender_grass",
                new ADEnderGrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS).luminance((state) -> 7)));
        ICICLE = register("icicle",
                new ADIcicleBlock(AbstractBlock.Settings.of(Material.ICE).requiresTool().strength(0.2F)
                        .noCollision().sounds(BlockSoundGroup.GLASS)));
        CATTAIL = register("cattail",
                new ADCattailBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision()
                        .nonOpaque().sounds(BlockSoundGroup.WET_GRASS)));
        CHOCOLATE_CAKE = register("chocolate_cake",
                new ADCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
        RED_VELVET_CAKE = register("red_velvet_cake",
                new ADCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
        STONE_TILES = register("stone_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        STONE_TILE_SLAB = register("stone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        STONE_TILE_STAIRS = register("stone_tile_stairs",
                new ADStairsBlock(STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES)));
        STONE_TILE_WALL = register("stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILES = register("mossy_stone_tiles",
                new Block(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_SLAB = register("mossy_stone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_STAIRS = register("mossy_stone_tile_stairs",
                new ADStairsBlock(MOSSY_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES)));
        MOSSY_STONE_TILE_WALL = register("mossy_stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILES = register("cracked_stone_tiles",
                new Block(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_SLAB = register("cracked_stone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_STAIRS = register("cracked_stone_tile_stairs",
                new ADStairsBlock(CRACKED_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES)));
        CRACKED_STONE_TILE_WALL = register("cracked_stone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(STONE_TILES)));
        SWEET_BERRY_PIE = register("sweet_berry_pie",
                new ADPieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F));
        BLUEBERRY_PIE = register("blueberry_pie",
                new ADPieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F));
        BLACKSTONE_TILES = register("blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        BLACKSTONE_TILE_STAIRS = register("blackstone_tile_stairs",
                new ADStairsBlock(BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        BLACKSTONE_TILE_SLAB = register("blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        BLACKSTONE_TILE_WALL = register("blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILES = register("twisted_blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILE_STAIRS = register("twisted_blackstone_tile_stairs",
                new ADStairsBlock(BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILE_SLAB = register("twisted_blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_BLACKSTONE_TILE_WALL = register("twisted_blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILES = register("weeping_blackstone_tiles",
                new Block(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILE_STAIRS = register("weeping_blackstone_tile_stairs",
                new ADStairsBlock(BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILE_SLAB = register("weeping_blackstone_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        WEEPING_BLACKSTONE_TILE_WALL = register("weeping_blackstone_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES)));
        TWISTED_POLISHED_BLACKSTONE_BRICKS = register("twisted_polished_blackstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisted_polished_blackstone_brick_stairs",
                new ADStairsBlock(Blocks.POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisted_polished_blackstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_POLISHED_BLACKSTONE_BRICK_WALL = register("twisted_polished_blackstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs",
                new ADStairsBlock(Blocks.POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                        AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
        TWISTED_BLACKSTONE = register("twisted_blackstone",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        TWISTED_BLACKSTONE_STAIRS = register("twisted_blackstone_stairs",
                new ADStairsBlock(Blocks.BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        TWISTED_BLACKSTONE_SLAB = register("twisted_blackstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        TWISTED_BLACKSTONE_WALL = register("twisted_blackstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE)));
        WEEPING_BLACKSTONE = register("weeping_blackstone",
                new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        WEEPING_BLACKSTONE_STAIRS = register("weeping_blackstone_stairs",
                new ADStairsBlock(Blocks.BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        WEEPING_BLACKSTONE_SLAB = register("weeping_blackstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        WEEPING_BLACKSTONE_WALL = register("weeping_blackstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
        QUARTZ_TILES = register("quartz_tiles",
                new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
        QUARTZ_TILE_STAIRS = register("quartz_tile_stairs",
                new ADStairsBlock(QUARTZ_TILES.getDefaultState(), AbstractBlock.Settings.copy(QUARTZ_TILES)));
        QUARTZ_TILE_SLAB = register("quartz_tile_slab",
                new SlabBlock(AbstractBlock.Settings.copy(QUARTZ_TILES)));
        QUARTZ_TILE_WALL = register("quartz_tile_wall",
                new WallBlock(AbstractBlock.Settings.copy(QUARTZ_TILES)));
        POLISHED_CALCITE = register("polished_calcite",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs",
                new ADStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_SLAB = register("polished_calcite_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_CALCITE_WALL = register("polished_calcite_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICKS = register("calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_STAIRS = register("calcite_brick_stairs",
                new ADStairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_SLAB = register("calcite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CALCITE_BRICK_WALL = register("calcite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CRACKED_CALCITE_BRICKS = register("cracked_calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        CRACKED_CALCITE_BRICK_STAIRS = register("cracked_calcite_brick_stairs",
                new ADStairsBlock(CRACKED_CALCITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CRACKED_CALCITE_BRICK_SLAB = register("cracked_calcite_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CRACKED_CALCITE_BRICK_WALL = register("cracked_calcite_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS)));
        CHISELED_CALCITE_BRICKS = register("chiseled_calcite_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
        POLISHED_TUFF = register("polished_tuff",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_STAIRS = register("polished_tuff_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_SLAB = register("polished_tuff_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_TUFF_WALL = register("polished_tuff_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICKS = register("tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_STAIRS = register("tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_SLAB = register("tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        TUFF_BRICK_WALL = register("tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICKS = register("mossy_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_STAIRS = register("mossy_tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_SLAB = register("mossy_tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        MOSSY_TUFF_BRICK_WALL = register("mossy_tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICKS = register("cracked_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_STAIRS = register("cracked_tuff_brick_stairs",
                new ADStairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_SLAB = register("cracked_tuff_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CRACKED_TUFF_BRICK_WALL = register("cracked_tuff_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF)));
        CHISELED_TUFF_BRICKS = register("chiseled_tuff_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.TUFF)));
        POLISHED_DRIPSTONE_BLOCK = register("polished_dripstone_block",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        POLISHED_DRIPSTONE_WALL = register("polished_dripstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICKS = register("dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_STAIRS = register("dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_SLAB = register("dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_BRICK_WALL = register("dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICKS = register("mossy_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_STAIRS = register("mossy_dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_SLAB = register("mossy_dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        MOSSY_DRIPSTONE_BRICK_WALL = register("mossy_dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICKS = register("cracked_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_STAIRS = register("cracked_dripstone_brick_stairs",
                new ADStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_SLAB = register("cracked_dripstone_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CRACKED_DRIPSTONE_BRICK_WALL = register("cracked_dripstone_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        CHISELED_DRIPSTONE_BRICKS = register("chiseled_dripstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
        SPECTRAL_ONYX = register("spectral_onyx",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        SPECTRAL_ONYX_STAIRS = register("spectral_onyx_stairs",
                new ADStairsBlock(ADBlocks.SPECTRAL_ONYX.getDefaultState(), AbstractBlock.Settings.copy(SPECTRAL_ONYX)));
        SPECTRAL_ONYX_SLAB = register("spectral_onyx_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX)));
        SPECTRAL_ONYX_WALL = register("spectral_onyx_wall",
                new WallBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX = register("cobbled_spectral_onyx",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        COBBLED_SPECTRAL_ONYX_STAIRS = register("cobbled_spectral_onyx_stairs",
                new ADStairsBlock(COBBLED_SPECTRAL_ONYX.getDefaultState(), AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX_SLAB = register("cobbled_spectral_onyx_slab",
                new SlabBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        COBBLED_SPECTRAL_ONYX_WALL = register("cobbled_spectral_onyx_wall",
                new WallBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX)));
        SPECTRAL_ONYX_BRICKS = register("spectral_onyx_bricks",
                new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F)));
        SPECTRAL_ONYX_BRICK_STAIRS = register("spectral_onyx_brick_stairs",
                new ADStairsBlock(SPECTRAL_ONYX_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        SPECTRAL_ONYX_BRICK_SLAB = register("spectral_onyx_brick_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        SPECTRAL_ONYX_BRICK_WALL = register("spectral_onyx_brick_wall",
                new WallBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS)));
        BLOOD_KELP = register("blood_kelp",
                new ADBloodKelpBlock(AbstractBlock.Settings.copy(Blocks.KELP)));
        BLOOD_KELP_PLANT = register("blood_kelp_plant",
                new ADBloodKelpPlantBlock(AbstractBlock.Settings.copy(Blocks.KELP_PLANT)
                        .luminance(createLightLevelFromLitBlockState(10))));
        CRIMSON_BOOKSHELF = register("crimson_bookshelf", netherBookshelfBlock(MapColor.DULL_PINK));
        WARPED_BOOKSHELF = register("warped_bookshelf", netherBookshelfBlock(MapColor.DARK_AQUA));
    }
}
