package rndm_access.assorteddiscoveries.core;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.sound.SoundEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.block.*;

public class ADBlocks {
    public static final Block BAT_PLUSH = new ADBatPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BLAZE_PLUSH = new ADBlazePlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.YELLOW).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CAVE_SPIDER_PLUSH =
        new ADCaveSpiderPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.CYAN).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CHICKEN_PLUSH = new ADChickenPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.WHITE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block COW_PLUSH = new ADCowPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.BROWN).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CREEPER_PLUSH = new ADCreeperPlushBlock(
                AbstractBlock.Settings.of(Material.WOOL, MapColor.LIME).strength(0.2F).sounds(BlockSoundGroup.WOOL));



    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (state) -> {
            return state.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
        };
    }

    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos, EntityType<?> entityType) {
        return false;
    }

    private static ADBambooFenceBlock createBambooFence(MapColor color) {
        return new ADBambooFenceBlock(AbstractBlock.Settings.of(Material.WOOD, color).strength(1.0F).breakInstantly().nonOpaque().sounds(BlockSoundGroup.BAMBOO));
    }

    /*
     * private static Block bookshelf(MaterialColor color) { return new
     * Block(BlockBehaviour.Properties.of(Material.WOOD,
     * color).strength(1.5F).sound(SoundType.WOOD)); }
     */

    private static Block createNetherBookshelf(MaterialColor color) {
        return new Block(
                BlockBehaviour.Properties.of(Material.NETHER_WOOD, color).strength(1.5F).sound(SoundType.WOOD));
    }

    private static ADNetherPlanterBoxBlock createNetherPlanterBox(MaterialColor color) {
        return new ADNetherPlanterBoxBlock(Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD));
    }

    private static ADOverworldPlanterBoxBlock createOverworldPlanterBox(MaterialColor color) {
        return new ADOverworldPlanterBoxBlock(Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD));
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(AssortedDiscoveries.MOD_ID, id), block);
    }

    /**
     * Called during mod initialization.
     */
    public static void registerBlocks() {
        register("blaze_plush", BAT_PLUSH);
        register("blaze_plush", BLAZE_PLUSH);
        register("cave_spider_plush", CAVE_SPIDER_PLUSH);
        register("chicken_plush", CHICKEN_PLUSH);
        register("cow_plush", COW_PLUSH);
        register("creeper_plush", CREEPER_PLUSH);
    }

    /*




    public static final Block ENDERMAN_PLUSH = BLOCKS.register("enderman_plush", () -> {
        return new ADEndermanPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block GHAST_PLUSH = BLOCKS.register("ghast_plush", () -> {
        return new ADGhastPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block GUARDIAN_PLUSH = BLOCKS.register("guardian_plush", () -> {
        return new ADGuardianPlushBlock(Properties.copy(CAVE_SPIDER_PLUSH.get()));
    });
    public static final Block WHITE_HORSE_PLUSH = BLOCKS.register("white_horse_plush", () -> {
        return new ADHorsePlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block GRAY_HORSE_PLUSH = BLOCKS.register("gray_horse_plush", () -> {
        return new ADHorsePlushBlock(Properties.copy(BAT_PLUSH.get()));
    });
    public static final Block LIGHT_GRAY_HORSE_PLUSH = BLOCKS.register("light_gray_horse_plush", () -> {
        return new ADHorsePlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block BROWN_HORSE_PLUSH = BLOCKS.register("brown_horse_plush", () -> {
        return new ADHorsePlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block BLACK_HORSE_PLUSH = BLOCKS.register("black_horse_plush", () -> {
        return new ADHorsePlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block MAGMA_CUBE_PLUSH = BLOCKS.register("magma_cube_plush", () -> {
        return new ADMagmaCubePlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_RED).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block RED_MOOSHROOM_PLUSH = BLOCKS.register("red_mooshroom_plush", () -> {
        return new ADMooshroomPlushBlock(Properties.copy(MAGMA_CUBE_PLUSH.get()));
    });
    public static final Block BROWN_MOOSHROOM_PLUSH = BLOCKS.register("brown_mooshroom_plush", () -> {
        return new ADMooshroomPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block OCELOT_PLUSH = BLOCKS.register("ocelot_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block TABBY_CAT_PLUSH = BLOCKS.register("tabby_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block TUXEDO_CAT_PLUSH = BLOCKS.register("tuxedo_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block RED_CAT_PLUSH = BLOCKS.register("red_cat_plush", () -> {
        return new ADCatPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block SIAMESE_CAT_PLUSH = BLOCKS.register("siamese_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block BRITISH_SHORTHAIR_CAT_PLUSH = BLOCKS
            .register("british_shorthair_cat_plush", () -> {
                return new ADCatPlushBlock(Properties.copy(LIGHT_GRAY_HORSE_PLUSH.get()));
            });
    public static final Block CALICO_CAT_PLUSH = BLOCKS.register("calico_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block PERSIAN_CAT_PLUSH = BLOCKS.register("persian_cat_plush", () -> {
        return new ADPersianCatPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block RAGDOLL_CAT_PLUSH = BLOCKS.register("ragdoll_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block WHITE_CAT_PLUSH = BLOCKS.register("white_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block JELLIE_CAT_PLUSH = BLOCKS.register("jellie_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block BLACK_CAT_PLUSH = BLOCKS.register("black_cat_plush", () -> {
        return new ADCatPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block PIG_PLUSH = BLOCKS.register("pig_plush", () -> {
        return new ADPigPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_PINK).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block BROWN_RABBIT_PLUSH = BLOCKS.register("brown_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block WHITE_RABBIT_PLUSH = BLOCKS.register("white_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block BLACK_RABBIT_PLUSH = BLOCKS.register("black_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block WHITE_SPLOTCHED_RABBIT_PLUSH = BLOCKS
            .register("white_splotched_rabbit_plush", () -> {
                return new ADRabbitPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
            });
    public static final Block GOLD_RABBIT_PLUSH = BLOCKS.register("gold_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block TOAST_RABBIT_PLUSH = BLOCKS.register("toast_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block SALT_RABBIT_PLUSH = BLOCKS.register("salt_rabbit_plush", () -> {
        return new ADRabbitPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block WHITE_SHEEP_PLUSH = BLOCKS.register("white_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block ORANGE_SHEEP_PLUSH = BLOCKS.register("orange_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(RED_CAT_PLUSH.get()));
    });
    public static final Block MAGENTA_SHEEP_PLUSH = BLOCKS.register("magenta_sheep_plush", () -> {
        return new ADSheepPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block LIGHT_BLUE_SHEEP_PLUSH = BLOCKS.register("light_blue_sheep_plush", () -> {
        return new ADSheepPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block YELLOW_SHEEP_PLUSH = BLOCKS.register("yellow_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block LIME_SHEEP_PLUSH = BLOCKS.register("lime_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(CREEPER_PLUSH.get()));
    });
    public static final Block PINK_SHEEP_PLUSH = BLOCKS.register("pink_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(PIG_PLUSH.get()));
    });
    public static final Block GRAY_SHEEP_PLUSH = BLOCKS.register("gray_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(BAT_PLUSH.get()));
    });
    public static final Block LIGHT_GRAY_SHEEP_PLUSH = BLOCKS.register("light_gray_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(LIGHT_GRAY_HORSE_PLUSH.get()));
    });
    public static final Block CYAN_SHEEP_PLUSH = BLOCKS.register("cyan_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(CAVE_SPIDER_PLUSH.get()));
    });
    public static final Block PURPLE_SHEEP_PLUSH = BLOCKS.register("purple_sheep_plush", () -> {
        return new ADSheepPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block BLUE_SHEEP_PLUSH = BLOCKS.register("blue_sheep_plush", () -> {
        return new ADSheepPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block BROWN_SHEEP_PLUSH = BLOCKS.register("brown_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block GREEN_SHEEP_PLUSH = BLOCKS.register("green_sheep_plush", () -> {
        return new ADSheepPlushBlock(
                Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN).strength(0.2F).sound(SoundType.WOOL));
    });
    public static final Block RED_SHEEP_PLUSH = BLOCKS.register("red_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(MAGMA_CUBE_PLUSH.get()));
    });
    public static final Block BLACK_SHEEP_PLUSH = BLOCKS.register("black_sheep_plush", () -> {
        return new ADSheepPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block SKELETON_PLUSH = BLOCKS.register("skeleton_plush", () -> {
        return new ADSkeletonPlushBlock(Properties.copy(LIGHT_GRAY_HORSE_PLUSH.get()));
    });
    public static final Block SLIME_PLUSH = BLOCKS.register("slime_plush", () -> {
        return new ADSlimePlushBlock(Properties.copy(CREEPER_PLUSH.get()));
    });
    public static final Block SPIDER_PLUSH = BLOCKS.register("spider_plush", () -> {
        return new ADSpiderPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block SQUID_PLUSH = BLOCKS.register("squid_plush", () -> {
        return new ADSquidPlushBlock(Properties.copy(BLUE_SHEEP_PLUSH.get()));
    });
    public static final Block BEE_PLUSH = BLOCKS.register("bee_plush", () -> {
        return new ADBeePlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block PLAINS_VILLAGER_PLUSH = BLOCKS.register("plains_villager_plush", () -> {
        return new ADBaseVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block DESERT_VILLAGER_PLUSH = BLOCKS.register("desert_villager_plush", () -> {
        return new ADDesertVillagerPlushBlock(Properties.copy(RED_CAT_PLUSH.get()));
    });
    public static final Block JUNGLE_VILLAGER_PLUSH = BLOCKS.register("jungle_villager_plush", () -> {
        return new ADBaseVillagerPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block SAVANNA_VILLAGER_PLUSH = BLOCKS.register("savanna_villager_plush", () -> {
        return new ADSavannaVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block SNOW_VILLAGER_PLUSH = BLOCKS.register("snow_villager_plush", () -> {
        return new ADSnowVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block SWAMP_VILLAGER_PLUSH = BLOCKS.register("swamp_villager_plush", () -> {
        return new ADSwampVillagerPlushBlock(Properties.copy(GREEN_SHEEP_PLUSH.get()));
    });
    public static final Block TAIGA_VILLAGER_PLUSH = BLOCKS.register("taiga_villager_plush", () -> {
        return new ADBaseVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block CRIMSON_VILLAGER_PLUSH = BLOCKS.register("crimson_villager_plush", () -> {
        return new ADBaseVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block WARPED_VILLAGER_PLUSH = BLOCKS.register("warped_villager_plush", () -> {
        return new ADBaseVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
    });
    public static final Block WANDERING_TRADER_PLUSH = BLOCKS.register("wandering_trader_plush", () -> {
        return new ADWanderingTraderPlushBlock(Properties.copy(BLUE_SHEEP_PLUSH.get()));
    });
    public static final Block PLAINS_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("plains_zombie_villager_plush", () -> {
                return new ADBaseZombieVillagerPlushBlock(Properties.copy(GREEN_SHEEP_PLUSH.get()));
            });
    public static final Block DESERT_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("desert_zombie_villager_plush", () -> {
                return new ADDesertZombieVillagerPlushBlock(Properties.copy(GREEN_SHEEP_PLUSH.get()));
            });
    public static final Block JUNGLE_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("jungle_zombie_villager_plush", () -> {
                return new ADBaseZombieVillagerPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
            });
    public static final Block SAVANNA_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("savanna_zombie_villager_plush", () -> {
                return new ADSavannaZombieVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
            });
    public static final Block SNOW_ZOMBIE_VILLAGER_PLUSH = BLOCKS.register("snow_zombie_villager_plush",
            () -> {
                return new ADSnowZombieVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
            });
    public static final Block SWAMP_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("swamp_zombie_villager_plush", () -> {
                return new ADSwampZombieVillagerPlushBlock(Properties.copy(COW_PLUSH.get()));
            });
    public static final Block TAIGA_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("taiga_zombie_villager_plush", () -> {
                return new ADBaseZombieVillagerPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
            });
    public static final Block CRIMSON_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("crimson_zombie_villager_plush", () -> {
                return new ADBaseZombieVillagerPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
            });
    public static final Block WARPED_ZOMBIE_VILLAGER_PLUSH = BLOCKS
            .register("warped_zombie_villager_plush", () -> {
                return new ADBaseZombieVillagerPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
            });
    public static final Block WITCH_PLUSH = BLOCKS.register("witch_plush", () -> {
        return new ADWitchPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block WOLF_PLUSH = BLOCKS.register("wolf_plush", () -> {
        return new ADWolfPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block ZOMBIE_PLUSH = BLOCKS.register("zombie_plush", () -> {
        return new ADZombiePlushBlock(Properties.copy(GREEN_SHEEP_PLUSH.get()));
    });
    public static final Block CHARRED_REMNANT_PLUSH = BLOCKS.register("charred_remnant_plush", () -> {
        return new ADZombiePlushBlock(Properties.copy(RED_CAT_PLUSH.get()));
    });
    public static final Block PIGLIN_PLUSH = BLOCKS.register("piglin_plush", () -> {
        return new ADPiglinPlushBlock(Properties.copy(RED_CAT_PLUSH.get()));
    });
    public static final Block ZOMBIFIED_PIGLIN_PLUSH = BLOCKS.register("zombified_piglin_plush", () -> {
        return new ADZombifiedPiglinPlushBlock(Properties.copy(PIG_PLUSH.get()));
    });
    public static final Block PUFFERFISH_PLUSH = BLOCKS.register("pufferfish_plush", () -> {
        return new ADPufferfishPlushBlock(Properties.copy(BLAZE_PLUSH.get()));
    });
    public static final Block WITHER_PLUSH = BLOCKS.register("wither_plush", () -> {
        return new ADWitherPlushBlock(Properties.copy(ENDERMAN_PLUSH.get()));
    });
    public static final Block STRIDER_PLUSH = BLOCKS.register("strider_plush", () -> {
        return new ADStriderPlushBlock(Properties.copy(MAGMA_CUBE_PLUSH.get()));
    });
    public static final Block SHIVERING_STRIDER_PLUSH = BLOCKS.register("shivering_strider_plush",
            () -> {
                return new ADStriderPlushBlock(Properties.copy(PURPLE_SHEEP_PLUSH.get()));
            });
    public static final Block PHANTOM_PLUSH = BLOCKS.register("phantom_plush", () -> {
        return new ADPhantomPlushBlock(Properties.copy(BLUE_SHEEP_PLUSH.get()));
    });
    public static final Block HOGLIN_PLUSH = BLOCKS.register("hoglin_plush", () -> {
        return new ADHoglinPlushBlock(Properties.copy(RED_CAT_PLUSH.get()));
    });
    public static final Block ZOGLIN_PLUSH = BLOCKS.register("zoglin_plush", () -> {
        return new ADHoglinPlushBlock(Properties.copy(PIG_PLUSH.get()));
    });
    public static final Block POLAR_BEAR_PLUSH = BLOCKS.register("polar_bear_plush", () -> {
        return new ADHoglinPlushBlock(Properties.copy(CHICKEN_PLUSH.get()));
    });
    public static final Block NETHER_SMOKY_QUARTZ_ORE = BLOCKS.register("nether_smoky_quartz_ore",
            () -> {
                return new OreBlock(Properties.of(Material.STONE, MaterialColor.NETHER).sound(SoundType.NETHER_ORE)
                        .requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 5));
            });
    public static final Block SMOKY_QUARTZ_BLOCK = BLOCKS.register("smoky_quartz_block", () -> {
        return new Block(
                Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F));
    });
    public static final Block CHISELED_SMOKY_QUARTZ_BLOCK = BLOCKS
            .register("chiseled_smoky_quartz_block", () -> {
                return new Block(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOKY_QUARTZ_BRICKS = BLOCKS.register("smoky_quartz_bricks", () -> {
        return new Block(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOKY_QUARTZ_BRICK_STAIRS = BLOCKS.register("smoky_quartz_brick_stairs",
            () -> {
                return new StairBlock(() -> {
                    return ADBlocks.SMOKY_QUARTZ_BLOCK.get().defaultBlockState();
                }, Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOKY_QUARTZ_BRICK_SLAB = BLOCKS.register("smoky_quartz_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOKY_QUARTZ_BRICK_WALL = BLOCKS.register("smoky_quartz_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOKY_QUARTZ_PILLAR = BLOCKS.register("smoky_quartz_pillar", () -> {
        return new RotatedPillarBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOKY_QUARTZ_STAIRS = BLOCKS.register("smoky_quartz_stairs", () -> {
        return new StairBlock(() -> {
            return ADBlocks.SMOKY_QUARTZ_BLOCK.get().defaultBlockState();
        }, Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOKY_QUARTZ_SLAB = BLOCKS.register("smoky_quartz_slab", () -> {
        return new SlabBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOKY_QUARTZ_WALL = BLOCKS.register("smoky_quartz_wall", () -> {
        return new WallBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOOTH_SMOKY_QUARTZ = BLOCKS.register("smooth_smoky_quartz", () -> {
        return new Block(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
    });
    public static final Block SMOOTH_SMOKY_QUARTZ_STAIRS = BLOCKS.register("smooth_smoky_quartz_stairs",
            () -> {
                return new StairBlock(() -> {
                    return ADBlocks.SMOKY_QUARTZ_BLOCK.get().defaultBlockState();
                }, Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOOTH_SMOKY_QUARTZ_SLAB = BLOCKS.register("smooth_smoky_quartz_slab",
            () -> {
                return new SlabBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block SMOOTH_SMOKY_QUARTZ_WALL = BLOCKS.register("smooth_smoky_quartz_wall",
            () -> {
                return new WallBlock(Properties.copy(SMOKY_QUARTZ_BLOCK.get()));
            });
    public static final Block CRACKED_STONE_BRICK_STAIRS = BLOCKS.register("cracked_stone_brick_stairs",
            () -> {
                return new StairBlock(() -> Blocks.CRACKED_STONE_BRICKS.defaultBlockState(),
                        Properties.copy(Blocks.CRACKED_STONE_BRICKS));
            });
    public static final Block CRACKED_STONE_BRICK_SLAB = BLOCKS.register("cracked_stone_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(Blocks.CRACKED_STONE_BRICKS));
            });
    public static final Block CRACKED_STONE_BRICK_WALL = BLOCKS.register("cracked_stone_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(Blocks.CRACKED_STONE_BRICKS));
            });
    public static final Block QUARTZ_WALL = BLOCKS.register("quartz_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.QUARTZ_BLOCK));
    });
    public static final Block SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.SMOOTH_QUARTZ));
    });
    public static final Block STONE_WALL = BLOCKS.register("stone_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.STONE));
    });
    public static final Block RED_GLASS = BLOCKS.register("red_glass", () -> {
        return new GlassBlock(Properties.of(Material.GLASS).strength(0.3F).noOcclusion().sound(SoundType.GLASS)
                .isValidSpawn(ADBlocks::never));
    });
    public static final Block RED_GLASS_PANE = BLOCKS.register("red_glass_pane", () -> {
        return new IronBarsBlock(Properties.copy(RED_GLASS.get()));
    });
    public static final Block BLUEBERRY_BUSH = SPECIAL_BLOCKS.register("blueberry_bush", () -> {
        return new ADBerryBushBlock(Properties.copy(Blocks.WHEAT));
    });
    public static final Block BOK_CHOY = SPECIAL_BLOCKS.register("bok_choy", () -> {
        return new ADBokChoyCropBlock(Properties.copy(Blocks.WHEAT));
    });
    public static final Block GARLIC = SPECIAL_BLOCKS.register("garlic", () -> {
        return new ADOnionBlock(Properties.copy(Blocks.WHEAT), () -> {
            return ADItems.GARLIC.get();
        });
    });
    public static final Block GREEN_ONIONS = SPECIAL_BLOCKS.register("green_onions", () -> {
        return new ADOnionBlock(Properties.copy(Blocks.WHEAT), () -> {
            return ADItems.GREEN_ONION.get();
        });
    });
    public static final Block OAK_PLANTER_BOX = BLOCKS.register("oak_planter_box", () -> {
        return overworldPlanterBox(Blocks.OAK_PLANKS.defaultMaterialColor());
    });
    public static final Block SPRUCE_PLANTER_BOX = BLOCKS.register("spruce_planter_box", () -> {
        return overworldPlanterBox(Blocks.SPRUCE_PLANKS.defaultMaterialColor());
    });
    public static final Block BIRCH_PLANTER_BOX = BLOCKS.register("birch_planter_box", () -> {
        return overworldPlanterBox(Blocks.BIRCH_PLANKS.defaultMaterialColor());
    });
    public static final Block JUNGLE_PLANTER_BOX = BLOCKS.register("jungle_planter_box", () -> {
        return overworldPlanterBox(Blocks.JUNGLE_PLANKS.defaultMaterialColor());
    });
    public static final Block ACACIA_PLANTER_BOX = BLOCKS.register("acacia_planter_box", () -> {
        return overworldPlanterBox(Blocks.ACACIA_PLANKS.defaultMaterialColor());
    });
    public static final Block DARK_OAK_PLANTER_BOX = BLOCKS.register("dark_oak_planter_box", () -> {
        return overworldPlanterBox(Blocks.DARK_OAK_PLANKS.defaultMaterialColor());
    });
    public static final Block WARPED_PLANTER_BOX = BLOCKS.register("warped_planter_box", () -> {
        return netherPlanterBox(Blocks.WARPED_PLANKS.defaultMaterialColor());
    });
    public static final Block CRIMSON_PLANTER_BOX = BLOCKS.register("crimson_planter_box", () -> {
        return netherPlanterBox(Blocks.CRIMSON_PLANKS.defaultMaterialColor());
    });
    public static final Block OAK_WALL = BLOCKS.register("oak_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.OAK_PLANKS));
    });
    public static final Block SPRUCE_WALL = BLOCKS.register("spruce_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.SPRUCE_PLANKS));
    });
    public static final Block BIRCH_WALL = BLOCKS.register("birch_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.BIRCH_PLANKS));
    });
    public static final Block JUNGLE_WALL = BLOCKS.register("jungle_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.JUNGLE_PLANKS));
    });
    public static final Block ACACIA_WALL = BLOCKS.register("acacia_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.ACACIA_PLANKS));
    });
    public static final Block DARK_OAK_WALL = BLOCKS.register("dark_oak_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.DARK_OAK_PLANKS));
    });
    public static final Block WARPED_WALL = BLOCKS.register("warped_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.WARPED_PLANKS));
    });
    public static final Block CRIMSON_WALL = BLOCKS.register("crimson_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.CRIMSON_PLANKS));
    });
    public static final Block STRIPPED_OAK_WALL = BLOCKS.register("stripped_oak_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.OAK_PLANKS));
    });
    public static final Block STRIPPED_SPRUCE_WALL = BLOCKS.register("stripped_spruce_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.SPRUCE_PLANKS));
    });
    public static final Block STRIPPED_BIRCH_WALL = BLOCKS.register("stripped_birch_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.BIRCH_PLANKS));
    });
    public static final Block STRIPPED_JUNGLE_WALL = BLOCKS.register("stripped_jungle_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.JUNGLE_PLANKS));
    });
    public static final Block STRIPPED_ACACIA_WALL = BLOCKS.register("stripped_acacia_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.ACACIA_PLANKS));
    });
    public static final Block STRIPPED_DARK_OAK_WALL = BLOCKS.register("stripped_dark_oak_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.DARK_OAK_PLANKS));
    });
    public static final Block STRIPPED_WARPED_WALL = BLOCKS.register("stripped_warped_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.WARPED_PLANKS));
    });
    public static final Block STRIPPED_CRIMSON_WALL = BLOCKS.register("stripped_crimson_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.CRIMSON_PLANKS));
    });
    public static final Block OAK_ROPE_LADDER = SPECIAL_BLOCKS.register("oak_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block SPRUCE_ROPE_LADDER = SPECIAL_BLOCKS.register("spruce_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block BIRCH_ROPE_LADDER = SPECIAL_BLOCKS.register("birch_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block JUNGLE_ROPE_LADDER = SPECIAL_BLOCKS.register("jungle_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block ACACIA_ROPE_LADDER = SPECIAL_BLOCKS.register("acacia_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block DARK_OAK_ROPE_LADDER = SPECIAL_BLOCKS.register("dark_oak_rope_ladder",
            () -> {
                return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
            });
    public static final Block WARPED_ROPE_LADDER = SPECIAL_BLOCKS.register("warped_rope_ladder", () -> {
        return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
    });
    public static final Block CRIMSON_ROPE_LADDER = SPECIAL_BLOCKS.register("crimson_rope_ladder",
            () -> {
                return new ADRopeLadderBlock(Properties.copy(Blocks.LADDER));
            });
    public static final Block IRON_LADDER = BLOCKS.register("iron_ladder", () -> {
        return new LadderBlock(
                Properties.of(Material.HEAVY_METAL).strength(0.4F, 5.0F).sound(SoundType.METAL).noOcclusion());
    });
    public static final Block DIRT_SLAB = BLOCKS.register("dirt_slab", () -> {
        return new ADDirtSlabBlock(Properties.copy(Blocks.DIRT).randomTicks());
    });
    public static final Block GRASS_SLAB = BLOCKS.register("grass_slab", () -> {
        return new ADGrassSlabBlock(Properties.copy(Blocks.GRASS_BLOCK));
    });
    public static final Block DIRT_PATH_SLAB = BLOCKS.register("dirt_path_slab", () -> {
        return new ADDirtPathSlabBlock(Properties.copy(Blocks.DIRT_PATH));
    });
    public static final Block COARSE_DIRT_SLAB = BLOCKS.register("coarse_dirt_slab", () -> {
        return new ADDirtSlabBlock(Properties.copy(Blocks.COARSE_DIRT));
    });
    public static final Block SNOW_BRICKS = BLOCKS.register("snow_bricks", () -> {
        return new Block(
                Properties.of(Material.SNOW).strength(0.6F).requiresCorrectToolForDrops().sound(SoundType.SNOW));
    });
    public static final Block SNOW_BRICK_STAIRS = BLOCKS.register("snow_brick_stairs", () -> {
        return new ADSnowyStairBlock(() -> {
            return ADBlocks.SNOW_BRICKS.get().defaultBlockState();
        }, Properties.copy(SNOW_BRICKS.get()));
    });
    public static final Block SNOW_BRICK_SLAB = BLOCKS.register("snow_brick_slab", () -> {
        return new ADSnowySlabBlock(Properties.copy(SNOW_BRICKS.get()));
    });
    public static final Block SNOW_BRICK_WALL = BLOCKS.register("snow_brick_wall", () -> {
        return new WallBlock(Properties.copy(SNOW_BRICKS.get()));
    });
    public static final Block PURPLE_MUSHROOM = SPECIAL_BLOCKS.register("purple_mushroom", () -> {
        return new MushroomBlock(Properties.copy(Blocks.RED_MUSHROOM), () -> {
            return ADTreeFeatures.HUGE_PURPLE_MUSHROOM;
        });
    });
    public static final Block PURPLE_MUSHROOM_BLOCK = BLOCKS.register("purple_mushroom_block", () -> {
        return new ADHugePurpleMushroomBlock(Properties.copy(Blocks.RED_MUSHROOM_BLOCK));
    });
    public static final Block WOODCUTTER = BLOCKS.register("woodcutter", () -> {
        return new ADWoodcutterBlock(Properties.copy(Blocks.STONECUTTER));
    });
    public static final Block WHITE_CAMPFIRE = BLOCKS.register("white_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.WHITE_SPARK.get();
        });
    });
    public static final Block ORANGE_CAMPFIRE = BLOCKS.register("orange_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.ORANGE_SPARK.get();
        });
    });
    public static final Block MAGENTA_CAMPFIRE = BLOCKS.register("magenta_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.MAGENTA_SPARK.get();
        });
    });
    public static final Block LIGHT_BLUE_CAMPFIRE = BLOCKS.register("light_blue_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.LIGHT_BLUE_SPARK.get();
        });
    });
    public static final Block YELLOW_CAMPFIRE = BLOCKS.register("yellow_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.YELLOW_SPARK.get();
        });
    });
    public static final Block LIME_CAMPFIRE = BLOCKS.register("lime_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.LIME_SPARK.get();
        });
    });
    public static final Block PINK_CAMPFIRE = BLOCKS.register("pink_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.PINK_SPARK.get();
        });
    });
    public static final Block GRAY_CAMPFIRE = BLOCKS.register("gray_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.GRAY_SPARK.get();
        });
    });
    public static final Block LIGHT_GRAY_CAMPFIRE = BLOCKS.register("light_gray_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.LIGHT_GRAY_SPARK.get();
        });
    });
    public static final Block CYAN_CAMPFIRE = BLOCKS.register("cyan_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.CYAN_SPARK.get();
        });
    });
    public static final Block PURPLE_CAMPFIRE = BLOCKS.register("purple_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.PURPLE_SPARK.get();
        });
    });
    public static final Block BLUE_CAMPFIRE = BLOCKS.register("blue_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.BLUE_SPARK.get();
        });
    });
    public static final Block BROWN_CAMPFIRE = BLOCKS.register("brown_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.BROWN_SPARK.get();
        });
    });
    public static final Block GREEN_CAMPFIRE = BLOCKS.register("green_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.GREEN_SPARK.get();
        });
    });
    public static final Block RED_CAMPFIRE = BLOCKS.register("red_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.RED_SPARK.get();
        });
    });
    public static final Block BLACK_CAMPFIRE = BLOCKS.register("black_campfire", () -> {
        return new ADDyedCampfireBlock(Properties.copy(Blocks.CAMPFIRE), () -> {
            return ADParticleTypes.BLACK_SPARK.get();
        });
    });
    public static final Block WHITE_LANTERN = BLOCKS.register("white_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block ORANGE_LANTERN = BLOCKS.register("orange_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block MAGENTA_LANTERN = BLOCKS.register("magenta_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block LIGHT_BLUE_LANTERN = BLOCKS.register("light_blue_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block YELLOW_LANTERN = BLOCKS.register("yellow_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block LIME_LANTERN = BLOCKS.register("lime_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block PINK_LANTERN = BLOCKS.register("pink_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block GRAY_LANTERN = BLOCKS.register("gray_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block LIGHT_GRAY_LANTERN = BLOCKS.register("light_gray_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block CYAN_LANTERN = BLOCKS.register("cyan_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block PURPLE_LANTERN = BLOCKS.register("purple_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block BLUE_LANTERN = BLOCKS.register("blue_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block BROWN_LANTERN = BLOCKS.register("brown_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block GREEN_LANTERN = BLOCKS.register("green_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block RED_LANTERN = BLOCKS.register("red_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block BLACK_LANTERN = BLOCKS.register("black_lantern", () -> {
        return new LanternBlock(Properties.copy(Blocks.LANTERN));
    });
    public static final Block WHITE_TORCH = SPECIAL_BLOCKS.register("white_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.WHITE_FLAME.get();
        });
    });
    public static final Block ORANGE_TORCH = SPECIAL_BLOCKS.register("orange_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.ORANGE_FLAME.get();
        });
    });
    public static final Block MAGENTA_TORCH = SPECIAL_BLOCKS.register("magenta_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.MAGENTA_FLAME.get();
        });
    });
    public static final Block LIGHT_BLUE_TORCH = SPECIAL_BLOCKS.register("light_blue_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.LIGHT_BLUE_FLAME.get();
        });
    });
    public static final Block YELLOW_TORCH = SPECIAL_BLOCKS.register("yellow_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.YELLOW_FLAME.get();
        });
    });
    public static final Block LIME_TORCH = SPECIAL_BLOCKS.register("lime_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.LIME_FLAME.get();
        });
    });
    public static final Block PINK_TORCH = SPECIAL_BLOCKS.register("pink_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.PINK_FLAME.get();
        });
    });
    public static final Block GRAY_TORCH = SPECIAL_BLOCKS.register("gray_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.GRAY_FLAME.get();
        });
    });
    public static final Block LIGHT_GRAY_TORCH = SPECIAL_BLOCKS.register("light_gray_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.LIGHT_GRAY_FLAME.get();
        });
    });
    public static final Block CYAN_TORCH = SPECIAL_BLOCKS.register("cyan_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.CYAN_FLAME.get();
        });
    });
    public static final Block PURPLE_TORCH = SPECIAL_BLOCKS.register("purple_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.PURPLE_FLAME.get();
        });
    });
    public static final Block BLUE_TORCH = SPECIAL_BLOCKS.register("blue_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.BLUE_FLAME.get();
        });
    });
    public static final Block BROWN_TORCH = SPECIAL_BLOCKS.register("brown_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.BROWN_FLAME.get();
        });
    });
    public static final Block GREEN_TORCH = SPECIAL_BLOCKS.register("green_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.GREEN_FLAME.get();
        });
    });
    public static final Block RED_TORCH = SPECIAL_BLOCKS.register("red_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.RED_FLAME.get();
        });
    });
    public static final Block BLACK_TORCH = SPECIAL_BLOCKS.register("black_torch", () -> {
        return new ADTorchBlock(Properties.copy(Blocks.TORCH), () -> {
            return ADParticleTypes.BLACK_FLAME.get();
        });
    });
    public static final Block WHITE_WALL_TORCH = SPECIAL_BLOCKS.register("white_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.WHITE_TORCH.get();
        }), () -> {
            return ADParticleTypes.WHITE_FLAME.get();
        });
    });
    public static final Block ORANGE_WALL_TORCH = SPECIAL_BLOCKS.register("orange_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.ORANGE_TORCH.get();
        }), () -> {
            return ADParticleTypes.ORANGE_FLAME.get();
        });
    });
    public static final Block MAGENTA_WALL_TORCH = SPECIAL_BLOCKS.register("magenta_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.MAGENTA_TORCH.get();
        }), () -> {
            return ADParticleTypes.MAGENTA_FLAME.get();
        });
    });
    public static final Block LIGHT_BLUE_WALL_TORCH = SPECIAL_BLOCKS.register("light_blue_wall_torch",
            () -> {
                return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
                    return ADBlocks.LIGHT_BLUE_TORCH.get();
                }), () -> {
                    return ADParticleTypes.LIGHT_BLUE_FLAME.get();
                });
            });
    public static final Block YELLOW_WALL_TORCH = SPECIAL_BLOCKS.register("yellow_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.YELLOW_TORCH.get();
        }), () -> {
            return ADParticleTypes.YELLOW_FLAME.get();
        });
    });
    public static final Block LIME_WALL_TORCH = SPECIAL_BLOCKS.register("lime_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.LIME_TORCH.get();
        }), () -> {
            return ADParticleTypes.LIME_FLAME.get();
        });
    });
    public static final Block PINK_WALL_TORCH = SPECIAL_BLOCKS.register("pink_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.PINK_TORCH.get();
        }), () -> {
            return ADParticleTypes.PINK_FLAME.get();
        });
    });
    public static final Block GRAY_WALL_TORCH = SPECIAL_BLOCKS.register("gray_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.GRAY_TORCH.get();
        }), () -> {
            return ADParticleTypes.GRAY_FLAME.get();
        });
    });
    public static final Block LIGHT_GRAY_WALL_TORCH = SPECIAL_BLOCKS.register("light_gray_wall_torch",
            () -> {
                return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
                    return ADBlocks.LIGHT_GRAY_TORCH.get();
                }), () -> {
                    return ADParticleTypes.LIGHT_GRAY_FLAME.get();
                });
            });
    public static final Block CYAN_WALL_TORCH = SPECIAL_BLOCKS.register("cyan_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.CYAN_TORCH.get();
        }), () -> {
            return ADParticleTypes.CYAN_FLAME.get();
        });
    });
    public static final Block PURPLE_WALL_TORCH = SPECIAL_BLOCKS.register("purple_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.PURPLE_TORCH.get();
        }), () -> {
            return ADParticleTypes.PURPLE_FLAME.get();
        });
    });
    public static final Block BLUE_WALL_TORCH = SPECIAL_BLOCKS.register("blue_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.BLUE_TORCH.get();
        }), () -> {
            return ADParticleTypes.BLUE_FLAME.get();
        });
    });
    public static final Block BROWN_WALL_TORCH = SPECIAL_BLOCKS.register("brown_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.BROWN_TORCH.get();
        }), () -> {
            return ADParticleTypes.BROWN_FLAME.get();
        });
    });
    public static final Block GREEN_WALL_TORCH = SPECIAL_BLOCKS.register("green_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.GREEN_TORCH.get();
        }), () -> {
            return ADParticleTypes.GREEN_FLAME.get();
        });
    });
    public static final Block RED_WALL_TORCH = SPECIAL_BLOCKS.register("red_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.RED_TORCH.get();
        }), () -> {
            return ADParticleTypes.RED_FLAME.get();
        });
    });
    public static final Block BLACK_WALL_TORCH = SPECIAL_BLOCKS.register("black_wall_torch", () -> {
        return new ADWallTorchBlock(Properties.copy(Blocks.TORCH).lootFrom(() -> {
            return ADBlocks.BLACK_TORCH.get();
        }), () -> {
            return ADParticleTypes.BLACK_FLAME.get();
        });
    });
    public static final Block WITCHS_CRADLE = SPECIAL_BLOCKS.register("witchs_cradle", () -> {
        return new ADBerryBushBlock(Properties.copy(Blocks.SWEET_BERRY_BUSH));
    });
    public static final Block FRESH_BAMBOO_FENCE = BLOCKS.register("fresh_bamboo_fence", () -> {
        return bambooFence(MaterialColor.PLANT);
    });
    public static final Block FRESH_BAMBOO_FENCE_GATE = BLOCKS.register("fresh_bamboo_fence_gate",
            () -> {
                return new FenceGateBlock(Properties.copy(FRESH_BAMBOO_FENCE.get()));
            });
    public static final Block DRIED_BAMBOO_FENCE = BLOCKS.register("dried_bamboo_fence", () -> {
        return bambooFence(MaterialColor.SAND);
    });
    public static final Block DRIED_BAMBOO_FENCE_GATE = BLOCKS.register("dried_bamboo_fence_gate",
            () -> {
                return new FenceGateBlock(Properties.copy(DRIED_BAMBOO_FENCE.get()));
            });
    public static final Block BAUXITE = BLOCKS.register("bauxite", () -> {
        return new Block(Properties.of(Material.STONE, MaterialColor.PODZOL).strength(0.3F));
    });
    public static final Block BAUXITE_SLAB = BLOCKS.register("bauxite_slab", () -> {
        return new SlabBlock(Properties.copy(BAUXITE.get()));
    });
    public static final Block BAUXITE_STAIRS = BLOCKS.register("bauxite_stairs", () -> {
        return new StairBlock(() -> BAUXITE.get().defaultBlockState(), Properties.copy(BAUXITE.get()));
    });
    public static final Block BAUXITE_WALL = BLOCKS.register("bauxite_wall", () -> {
        return new WallBlock(Properties.copy(BAUXITE.get()));
    });
    public static final Block POLISHED_BAUXITE = BLOCKS.register("polished_bauxite", () -> {
        return new Block(Properties.copy(BAUXITE.get()));
    });
    public static final Block POLISHED_BAUXITE_SLAB = BLOCKS.register("polished_bauxite_slab", () -> {
        return new SlabBlock(Properties.copy(BAUXITE.get()));
    });
    public static final Block POLISHED_BAUXITE_STAIRS = BLOCKS.register("polished_bauxite_stairs",
            () -> {
                return new StairBlock(() -> BAUXITE.get().defaultBlockState(), Properties.copy(BAUXITE.get()));
            });
    public static final Block POLISHED_BAUXITE_WALL = BLOCKS.register("polished_bauxite_wall", () -> {
        return new WallBlock(Properties.copy(BAUXITE.get()));
    });
    public static final Block BAUXITE_BRICKS = BLOCKS.register("bauxite_bricks", () -> {
        return new Block(Properties.of(Material.STONE, MaterialColor.PODZOL).strength(0.4F));
    });
    public static final Block BAUXITE_BRICK_STAIRS = BLOCKS.register("bauxite_brick_stairs", () -> {
        return new StairBlock(() -> BAUXITE_BRICKS.get().defaultBlockState(), Properties.copy(BAUXITE_BRICKS.get()));
    });
    public static final Block BAUXITE_BRICK_SLAB = BLOCKS.register("bauxite_brick_slab", () -> {
        return new SlabBlock(Properties.copy(BAUXITE_BRICKS.get()));
    });
    public static final Block BAUXITE_BRICK_WALL = BLOCKS.register("bauxite_brick_wall", () -> {
        return new WallBlock(Properties.copy(BAUXITE_BRICKS.get()));
    });
    public static final Block SNOW_SLAB = BLOCKS.register("snow_slab", () -> {
        return new ADSnowySlabBlock(
                Properties.of(Material.SNOW).requiresCorrectToolForDrops().strength(0.2F).sound(SoundType.SNOW));
    });
    public static final Block SNOW_STAIRS = BLOCKS.register("snow_stairs", () -> {
        return new ADSnowyStairBlock(() -> Blocks.SNOW_BLOCK.defaultBlockState(), Properties.copy(SNOW_SLAB.get()));
    });
    public static final Block SNOW_WALL = BLOCKS.register("snow_wall", () -> {
        return new WallBlock(Properties.copy(SNOW_SLAB.get()));
    });
    public static final Block TWISTED_NETHER_BRICKS = BLOCKS.register("twisted_nether_bricks", () -> {
        return new Block(Properties.copy(Blocks.NETHER_BRICKS));
    });
    public static final Block TWISTED_NETHER_BRICK_STAIRS = BLOCKS
            .register("twisted_nether_brick_stairs", () -> {
                return new StairBlock(() -> TWISTED_NETHER_BRICKS.get().defaultBlockState(),
                        Properties.copy(TWISTED_NETHER_BRICKS.get()));
            });
    public static final Block TWISTED_NETHER_BRICK_SLAB = BLOCKS.register("twisted_nether_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(TWISTED_NETHER_BRICKS.get()));
            });
    public static final Block TWISTED_NETHER_BRICK_WALL = BLOCKS.register("twisted_nether_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(TWISTED_NETHER_BRICKS.get()));
            });
    public static final Block TWISTED_NETHERRACK = BLOCKS.register("twisted_netherrack", () -> {
        return new Block(Properties.copy(Blocks.NETHERRACK));
    });
    public static final Block TWISTED_NETHERRACK_STAIRS = BLOCKS.register("twisted_netherrack_stairs",
            () -> {
                return new StairBlock(() -> TWISTED_NETHERRACK.get().defaultBlockState(),
                        Properties.copy(TWISTED_NETHERRACK.get()));
            });
    public static final Block TWISTED_NETHERRACK_SLAB = BLOCKS.register("twisted_netherrack_slab",
            () -> {
                return new SlabBlock(Properties.copy(TWISTED_NETHERRACK.get()));
            });
    public static final Block TWISTED_NETHERRACK_WALL = BLOCKS.register("twisted_netherrack_wall",
            () -> {
                return new WallBlock(Properties.copy(TWISTED_NETHERRACK.get()));
            });
    public static final Block WEEPING_NETHER_BRICKS = BLOCKS.register("weeping_nether_bricks", () -> {
        return new Block(Properties.copy(Blocks.NETHER_BRICKS));
    });
    public static final Block WEEPING_NETHER_BRICK_STAIRS = BLOCKS
            .register("weeping_nether_brick_stairs", () -> {
                return new StairBlock(() -> {
                    return WEEPING_NETHER_BRICKS.get().defaultBlockState();
                }, Properties.copy(WEEPING_NETHER_BRICKS.get()));
            });
    public static final Block WEEPING_NETHER_BRICK_SLAB = BLOCKS.register("weeping_nether_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(WEEPING_NETHER_BRICKS.get()));
            });
    public static final Block WEEPING_NETHER_BRICK_WALL = BLOCKS.register("weeping_nether_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(WEEPING_NETHER_BRICKS.get()));
            });
    public static final Block WEEPING_NETHERRACK = BLOCKS.register("weeping_netherrack", () -> {
        return new Block(Properties.copy(Blocks.NETHERRACK));
    });
    public static final Block WEEPING_NETHERRACK_STAIRS = BLOCKS.register("weeping_netherrack_stairs",
            () -> {
                return new StairBlock(() -> WEEPING_NETHERRACK.get().defaultBlockState(),
                        Properties.copy(WEEPING_NETHERRACK.get()));
            });
    public static final Block WEEPING_NETHERRACK_SLAB = BLOCKS.register("weeping_netherrack_slab",
            () -> {
                return new SlabBlock(Properties.copy(WEEPING_NETHERRACK.get()));
            });
    public static final Block WEEPING_NETHERRACK_WALL = BLOCKS.register("weeping_netherrack_wall",
            () -> {
                return new WallBlock(Properties.copy(WEEPING_NETHERRACK.get()));
            });
    public static final Block SNAPDRAGON = SPECIAL_BLOCKS.register("snapdragon", () -> {
        return new ADSnapdragonBlock(MobEffects.LUCK, 8, Properties.copy(Blocks.POPPY).lightLevel((state) -> {
            return 7;
        }));
    });
    public static final Block POTTED_SNAPDRAGON = SPECIAL_BLOCKS.register("potted_snapdragon", () -> {
        return new ADPottedSnapdragonBlock(() -> {
            return (FlowerPotBlock) Blocks.FLOWER_POT;
        }, () -> {
            return ADBlocks.SNAPDRAGON.get();
        }, Properties.copy(Blocks.POTTED_POPPY).lightLevel((state) -> {
            return 7;
        }));
    });
    public static final Block POTTED_PURPLE_MUSHROOM = SPECIAL_BLOCKS.register("potted_purple_mushroom",
            () -> {
                return new FlowerPotBlock(() -> {
                    return (FlowerPotBlock) Blocks.FLOWER_POT;
                }, () -> {
                    return ADBlocks.PURPLE_MUSHROOM.get();
                }, Properties.copy(Blocks.POTTED_POPPY));
            });
    public static final Block ENDER_GRASS = BLOCKS.register("ender_grass", () -> {
        return new ADEnderGrassBlock(Block.Properties.copy(Blocks.GRASS).lightLevel((state) -> {
            return 7;
        }));
    });
    public static final Block ICICLE = BLOCKS.register("icicle", () -> {
        return new ADIcicleBlock(Properties.of(Material.ICE).requiresCorrectToolForDrops().strength(0.2F).noCollission()
                .sound(SoundType.GLASS));
    });
    public static final Block CATTAIL = SPECIAL_BLOCKS.register("cattail", () -> {
        return new ADCattailBlock(
                Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.WET_GRASS));
    });
    public static final Block CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake", () -> {
        return new CakeBlock(Properties.copy(Blocks.CAKE));
    });
    public static final Block RED_VELVET_CAKE = BLOCKS.register("red_velvet_cake", () -> {
        return new CakeBlock(Properties.copy(Blocks.CAKE));
    });
    public static final Block STONE_TILES = BLOCKS.register("stone_tiles", () -> {
        return new Block(Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES));
    });
    public static final Block STONE_TILE_SLAB = BLOCKS.register("stone_tile_slab", () -> {
        return new SlabBlock(Properties.copy(STONE_TILES.get()));
    });
    public static final Block STONE_TILE_STAIRS = BLOCKS.register("stone_tile_stairs", () -> {
        return new StairBlock(() -> STONE_TILES.get().defaultBlockState(), Properties.copy(Blocks.STONE));
    });
    public static final Block STONE_TILE_WALL = BLOCKS.register("stone_tile_wall", () -> {
        return new WallBlock(Properties.copy(STONE_TILES.get()));
    });
    public static final Block MOSSY_STONE_TILES = BLOCKS.register("mossy_stone_tiles", () -> {
        return new Block(Properties.copy(STONE_TILES.get()));
    });
    public static final Block MOSSY_STONE_TILE_SLAB = BLOCKS.register("mossy_stone_tile_slab", () -> {
        return new SlabBlock(Properties.copy(STONE_TILES.get()));
    });
    public static final Block MOSSY_STONE_TILE_STAIRS = BLOCKS.register("mossy_stone_tile_stairs",
            () -> {
                return new StairBlock(() -> MOSSY_STONE_TILES.get().defaultBlockState(),
                        Properties.copy(STONE_TILES.get()));
            });
    public static final Block MOSSY_STONE_TILE_WALL = BLOCKS.register("mossy_stone_tile_wall", () -> {
        return new WallBlock(Properties.copy(STONE_TILES.get()));
    });
    public static final Block CRACKED_STONE_TILES = BLOCKS.register("cracked_stone_tiles", () -> {
        return new Block(Properties.copy(STONE_TILES.get()));
    });
    public static final Block CRACKED_STONE_TILE_SLAB = BLOCKS.register("cracked_stone_tile_slab",
            () -> {
                return new SlabBlock(Properties.copy(STONE_TILES.get()));
            });
    public static final Block CRACKED_STONE_TILE_STAIRS = BLOCKS.register("cracked_stone_tile_stairs",
            () -> {
                return new StairBlock(() -> CRACKED_STONE_TILES.get().defaultBlockState(),
                        Properties.copy(STONE_TILES.get()));
            });
    public static final Block CRACKED_STONE_TILE_WALL = BLOCKS.register("cracked_stone_tile_wall",
            () -> {
                return new WallBlock(Properties.copy(STONE_TILES.get()));
            });
    public static final Block SWEET_BERRY_PIE = BLOCKS.register("sweet_berry_pie", () -> {
        return new ADPieBlock(Properties.copy(Blocks.CAKE), 3, 0.6F);
    });
    public static final Block BLUEBERRY_PIE = BLOCKS.register("blueberry_pie", () -> {
        return new ADPieBlock(Properties.copy(Blocks.CAKE), 3, 0.6F);
    });
    public static final Block BLACKSTONE_TILES = BLOCKS.register("blackstone_tiles", () -> {
        return new Block(Properties.copy(Blocks.BLACKSTONE).sound(SoundType.DEEPSLATE_TILES));
    });
    public static final Block BLACKSTONE_TILE_STAIRS = BLOCKS.register("blackstone_tile_stairs", () -> {
        return new StairBlock(() -> BLACKSTONE_TILES.get().defaultBlockState(),
                Properties.copy(BLACKSTONE_TILES.get()));
    });
    public static final Block BLACKSTONE_TILE_SLAB = BLOCKS.register("blackstone_tile_slab", () -> {
        return new SlabBlock(Properties.copy(BLACKSTONE_TILES.get()));
    });
    public static final Block BLACKSTONE_TILE_WALL = BLOCKS.register("blackstone_tile_wall", () -> {
        return new WallBlock(Properties.copy(BLACKSTONE_TILES.get()));
    });
    public static final Block TWISTED_BLACKSTONE_TILES = BLOCKS.register("twisted_blackstone_tiles",
            () -> {
                return new Block(Properties.copy(BLACKSTONE_TILES.get()));
            });
    public static final Block TWISTED_BLACKSTONE_TILE_STAIRS = BLOCKS
            .register("twisted_blackstone_tile_stairs", () -> {
                return new StairBlock(() -> TWISTED_BLACKSTONE_TILES.get().defaultBlockState(),
                        Properties.copy(TWISTED_BLACKSTONE_TILES.get()));
            });
    public static final Block TWISTED_BLACKSTONE_TILE_SLAB = BLOCKS
            .register("twisted_blackstone_tile_slab", () -> {
                return new SlabBlock(Properties.copy(TWISTED_BLACKSTONE_TILES.get()));
            });
    public static final Block TWISTED_BLACKSTONE_TILE_WALL = BLOCKS
            .register("twisted_blackstone_tile_wall", () -> {
                return new WallBlock(Properties.copy(TWISTED_BLACKSTONE_TILES.get()));
            });
    public static final Block WEEPING_BLACKSTONE_TILES = BLOCKS.register("weeping_blackstone_tiles",
            () -> {
                return new Block(Properties.copy(BLACKSTONE_TILES.get()));
            });
    public static final Block WEEPING_BLACKSTONE_TILE_STAIRS = BLOCKS
            .register("weeping_blackstone_tile_stairs", () -> {
                return new StairBlock(() -> WEEPING_BLACKSTONE_TILES.get().defaultBlockState(),
                        Properties.copy(WEEPING_BLACKSTONE_TILES.get()));
            });
    public static final Block WEEPING_BLACKSTONE_TILE_SLAB = BLOCKS
            .register("weeping_blackstone_tile_slab", () -> {
                return new SlabBlock(Properties.copy(WEEPING_BLACKSTONE_TILES.get()));
            });
    public static final Block WEEPING_BLACKSTONE_TILE_WALL = BLOCKS
            .register("weeping_blackstone_tile_wall", () -> {
                return new WallBlock(Properties.copy(WEEPING_BLACKSTONE_TILES.get()));
            });
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICKS = BLOCKS
            .register("twisted_polished_blackstone_bricks", () -> {
                return new Block(Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
            });
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS
            .register("twisted_polished_blackstone_brick_stairs", () -> {
                return new StairBlock(() -> TWISTED_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                        Properties.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS
            .register("twisted_polished_blackstone_brick_slab", () -> {
                return new SlabBlock(Properties.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS
            .register("twisted_polished_blackstone_brick_wall", () -> {
                return new WallBlock(Properties.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICKS = BLOCKS
            .register("weeping_polished_blackstone_bricks", () -> {
                return new Block(Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
            });
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS
            .register("weeping_polished_blackstone_brick_stairs", () -> {
                return new StairBlock(() -> WEEPING_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                        Properties.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS
            .register("weeping_polished_blackstone_brick_slab", () -> {
                return new SlabBlock(Properties.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS
            .register("weeping_polished_blackstone_brick_wall", () -> {
                return new WallBlock(Properties.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS.get()));
            });
    public static final Block TWISTED_BLACKSTONE = BLOCKS.register("twisted_blackstone", () -> {
        return new Block(Properties.copy(Blocks.BLACKSTONE));
    });
    public static final Block TWISTED_BLACKSTONE_STAIRS = BLOCKS.register("twisted_blackstone_stairs",
            () -> {
                return new StairBlock(() -> TWISTED_BLACKSTONE.get().defaultBlockState(),
                        Properties.copy(TWISTED_BLACKSTONE.get()));
            });
    public static final Block TWISTED_BLACKSTONE_SLAB = BLOCKS.register("twisted_blackstone_slab",
            () -> {
                return new SlabBlock(Properties.copy(TWISTED_BLACKSTONE.get()));
            });
    public static final Block TWISTED_BLACKSTONE_WALL = BLOCKS.register("twisted_blackstone_wall",
            () -> {
                return new WallBlock(Properties.copy(TWISTED_BLACKSTONE.get()));
            });
    public static final Block WEEPING_BLACKSTONE = BLOCKS.register("weeping_blackstone", () -> {
        return new Block(Properties.copy(Blocks.BLACKSTONE));
    });
    public static final Block WEEPING_BLACKSTONE_STAIRS = BLOCKS.register("weeping_blackstone_stairs",
            () -> {
                return new StairBlock(() -> WEEPING_BLACKSTONE.get().defaultBlockState(),
                        Properties.copy(WEEPING_BLACKSTONE.get()));
            });
    public static final Block WEEPING_BLACKSTONE_SLAB = BLOCKS.register("weeping_blackstone_slab",
            () -> {
                return new SlabBlock(Properties.copy(WEEPING_BLACKSTONE.get()));
            });
    public static final Block WEEPING_BLACKSTONE_WALL = BLOCKS.register("weeping_blackstone_wall",
            () -> {
                return new WallBlock(Properties.copy(WEEPING_BLACKSTONE.get()));
            });
    public static final Block QUARTZ_TILES = BLOCKS.register("quartz_tiles", () -> {
        return new Block(Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.DEEPSLATE_TILES));
    });
    public static final Block QUARTZ_TILE_STAIRS = BLOCKS.register("quartz_tile_stairs", () -> {
        return new StairBlock(() -> QUARTZ_TILES.get().defaultBlockState(), Properties.copy(QUARTZ_TILES.get()));
    });
    public static final Block QUARTZ_TILE_SLAB = BLOCKS.register("quartz_tile_slab", () -> {
        return new SlabBlock(Properties.copy(QUARTZ_TILES.get()));
    });
    public static final Block QUARTZ_TILE_WALL = BLOCKS.register("quartz_tile_wall", () -> {
        return new WallBlock(Properties.copy(QUARTZ_TILES.get()));
    });
    public static final Block POLISHED_CALCITE = BLOCKS.register("polished_calcite", () -> {
        return new Block(Properties.copy(Blocks.CALCITE));
    });
    public static final Block POLISHED_CALCITE_STAIRS = BLOCKS.register("polished_calcite_stairs",
            () -> {
                return new StairBlock(() -> Blocks.CALCITE.defaultBlockState(), Properties.copy(Blocks.CALCITE));
            });
    public static final Block POLISHED_CALCITE_SLAB = BLOCKS.register("polished_calcite_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.CALCITE));
    });
    public static final Block POLISHED_CALCITE_WALL = BLOCKS.register("polished_calcite_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.CALCITE));
    });
    public static final Block CALCITE_BRICKS = BLOCKS.register("calcite_bricks", () -> {
        return new Block(Properties.copy(Blocks.CALCITE));
    });
    public static final Block CALCITE_BRICK_STAIRS = BLOCKS.register("calcite_brick_stairs", () -> {
        return new StairBlock(() -> Blocks.CALCITE.defaultBlockState(), Properties.copy(Blocks.CALCITE));
    });
    public static final Block CALCITE_BRICK_SLAB = BLOCKS.register("calcite_brick_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.CALCITE));
    });
    public static final Block CALCITE_BRICK_WALL = BLOCKS.register("calcite_brick_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.CALCITE));
    });
    public static final Block CRACKED_CALCITE_BRICKS = BLOCKS.register("cracked_calcite_bricks", () -> {
        return new Block(Properties.copy(Blocks.CALCITE));
    });
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = BLOCKS
            .register("cracked_calcite_brick_stairs", () -> {
                return new StairBlock(() -> Blocks.CALCITE.defaultBlockState(), Properties.copy(Blocks.CALCITE));
            });
    public static final Block CRACKED_CALCITE_BRICK_SLAB = BLOCKS.register("cracked_calcite_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(Blocks.CALCITE));
            });
    public static final Block CRACKED_CALCITE_BRICK_WALL = BLOCKS.register("cracked_calcite_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(Blocks.CALCITE));
            });
    public static final Block CHISELED_CALCITE_BRICKS = BLOCKS.register("chiseled_calcite_bricks",
            () -> {
                return new Block(Properties.copy(Blocks.CALCITE));
            });
    public static final Block POLISHED_TUFF = BLOCKS.register("polished_tuff", () -> {
        return new Block(Properties.copy(Blocks.TUFF));
    });
    public static final Block POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", () -> {
        return new StairBlock(() -> Blocks.TUFF.defaultBlockState(), Properties.copy(Blocks.TUFF));
    });
    public static final Block POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block POLISHED_TUFF_WALL = BLOCKS.register("polished_tuff_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block TUFF_BRICKS = BLOCKS.register("tuff_bricks", () -> {
        return new Block(Properties.copy(Blocks.TUFF));
    });
    public static final Block TUFF_BRICK_STAIRS = BLOCKS.register("tuff_brick_stairs", () -> {
        return new StairBlock(() -> Blocks.TUFF.defaultBlockState(), Properties.copy(Blocks.TUFF));
    });
    public static final Block TUFF_BRICK_SLAB = BLOCKS.register("tuff_brick_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block TUFF_BRICK_WALL = BLOCKS.register("tuff_brick_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block MOSSY_TUFF_BRICKS = BLOCKS.register("mossy_tuff_bricks", () -> {
        return new Block(Properties.copy(Blocks.TUFF));
    });
    public static final Block MOSSY_TUFF_BRICK_STAIRS = BLOCKS.register("mossy_tuff_brick_stairs",
            () -> {
                return new StairBlock(() -> Blocks.TUFF.defaultBlockState(), Properties.copy(Blocks.TUFF));
            });
    public static final Block MOSSY_TUFF_BRICK_SLAB = BLOCKS.register("mossy_tuff_brick_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block MOSSY_TUFF_BRICK_WALL = BLOCKS.register("mossy_tuff_brick_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.TUFF));
    });
    public static final Block CRACKED_TUFF_BRICKS = BLOCKS.register("cracked_tuff_bricks", () -> {
        return new Block(Properties.copy(Blocks.TUFF));
    });
    public static final Block CRACKED_TUFF_BRICK_STAIRS = BLOCKS.register("cracked_tuff_brick_stairs",
            () -> {
                return new StairBlock(() -> Blocks.TUFF.defaultBlockState(), Properties.copy(Blocks.TUFF));
            });
    public static final Block CRACKED_TUFF_BRICK_SLAB = BLOCKS.register("cracked_tuff_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(Blocks.TUFF));
            });
    public static final Block CRACKED_TUFF_BRICK_WALL = BLOCKS.register("cracked_tuff_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(Blocks.TUFF));
            });
    public static final Block CHISELED_TUFF_BRICKS = BLOCKS.register("chiseled_tuff_bricks", () -> {
        return new Block(Properties.copy(Blocks.TUFF));
    });
    public static final Block POLISHED_DRIPSTONE_BLOCK = BLOCKS.register("polished_dripstone_block",
            () -> {
                return new Block(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block POLISHED_DRIPSTONE_STAIRS = BLOCKS.register("polished_dripstone_stairs",
            () -> {
                return new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                        Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block POLISHED_DRIPSTONE_SLAB = BLOCKS.register("polished_dripstone_slab",
            () -> {
                return new SlabBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block POLISHED_DRIPSTONE_WALL = BLOCKS.register("polished_dripstone_wall",
            () -> {
                return new WallBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block DRIPSTONE_BRICKS = BLOCKS.register("dripstone_bricks", () -> {
        return new Block(Properties.copy(Blocks.DRIPSTONE_BLOCK));
    });
    public static final Block DRIPSTONE_BRICK_STAIRS = BLOCKS.register("dripstone_brick_stairs", () -> {
        return new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                Properties.copy(Blocks.DRIPSTONE_BLOCK));
    });
    public static final Block DRIPSTONE_BRICK_SLAB = BLOCKS.register("dripstone_brick_slab", () -> {
        return new SlabBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
    });
    public static final Block DRIPSTONE_BRICK_WALL = BLOCKS.register("dripstone_brick_wall", () -> {
        return new WallBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
    });
    public static final Block MOSSY_DRIPSTONE_BRICKS = BLOCKS.register("mossy_dripstone_bricks", () -> {
        return new Block(Properties.copy(Blocks.DRIPSTONE_BLOCK));
    });
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = BLOCKS
            .register("mossy_dripstone_brick_stairs", () -> {
                return new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                        Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = BLOCKS.register("mossy_dripstone_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = BLOCKS.register("mossy_dripstone_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block CRACKED_DRIPSTONE_BRICKS = BLOCKS.register("cracked_dripstone_bricks",
            () -> {
                return new Block(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = BLOCKS
            .register("cracked_dripstone_brick_stairs", () -> {
                return new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                        Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = BLOCKS
            .register("cracked_dripstone_brick_slab", () -> {
                return new SlabBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL = BLOCKS
            .register("cracked_dripstone_brick_wall", () -> {
                return new WallBlock(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block CHISELED_DRIPSTONE_BRICKS = BLOCKS.register("chiseled_dripstone_bricks",
            () -> {
                return new Block(Properties.copy(Blocks.DRIPSTONE_BLOCK));
            });
    public static final Block SPECTRAL_ONYX = BLOCKS.register("spectral_onyx", () -> {
        return new Block(
                Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F));
    });
    public static final Block SPECTRAL_ONYX_STAIRS = BLOCKS.register("spectral_onyx_stairs", () -> {
        return new StairBlock(() -> ADBlocks.SPECTRAL_ONYX.get().defaultBlockState(),
                Properties.copy(ADBlocks.SPECTRAL_ONYX.get()));
    });
    public static final Block SPECTRAL_ONYX_SLAB = BLOCKS.register("spectral_onyx_slab", () -> {
        return new SlabBlock(Properties.copy(ADBlocks.SPECTRAL_ONYX.get()));
    });
    public static final Block SPECTRAL_ONYX_WALL = BLOCKS.register("spectral_onyx_wall", () -> {
        return new WallBlock(Properties.copy(ADBlocks.SPECTRAL_ONYX.get()));
    });
    public static final Block COBBLED_SPECTRAL_ONYX = BLOCKS.register("cobbled_spectral_onyx", () -> {
        return new Block(
                Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F));
    });
    public static final Block COBBLED_SPECTRAL_ONYX_STAIRS = BLOCKS
            .register("cobbled_spectral_onyx_stairs", () -> {
                return new StairBlock(() -> ADBlocks.COBBLED_SPECTRAL_ONYX.get().defaultBlockState(),
                        Properties.copy(ADBlocks.COBBLED_SPECTRAL_ONYX.get()));
            });
    public static final Block COBBLED_SPECTRAL_ONYX_SLAB = BLOCKS.register("cobbled_spectral_onyx_slab",
            () -> {
                return new SlabBlock(Properties.copy(ADBlocks.COBBLED_SPECTRAL_ONYX.get()));
            });
    public static final Block COBBLED_SPECTRAL_ONYX_WALL = BLOCKS.register("cobbled_spectral_onyx_wall",
            () -> {
                return new WallBlock(Properties.copy(ADBlocks.COBBLED_SPECTRAL_ONYX.get()));
            });
    public static final Block SPECTRAL_ONYX_BRICKS = BLOCKS.register("spectral_onyx_bricks", () -> {
        return new Block(
                Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(0.4F));
    });
    public static final Block SPECTRAL_ONYX_BRICK_STAIRS = BLOCKS.register("spectral_onyx_brick_stairs",
            () -> {
                return new StairBlock(() -> ADBlocks.SPECTRAL_ONYX_BRICKS.get().defaultBlockState(),
                        Properties.copy(ADBlocks.SPECTRAL_ONYX_BRICKS.get()));
            });
    public static final Block SPECTRAL_ONYX_BRICK_SLAB = BLOCKS.register("spectral_onyx_brick_slab",
            () -> {
                return new SlabBlock(Properties.copy(ADBlocks.SPECTRAL_ONYX_BRICKS.get()));
            });
    public static final Block SPECTRAL_ONYX_BRICK_WALL = BLOCKS.register("spectral_onyx_brick_wall",
            () -> {
                return new WallBlock(Properties.copy(ADBlocks.SPECTRAL_ONYX_BRICKS.get()));
            });
    public static final Block BLOOD_KELP = SPECIAL_BLOCKS.register("blood_kelp", () -> {
        return new ADBloodKelpBlock(Properties.copy(Blocks.KELP));
    });
    public static final Block BLOOD_KELP_PLANT = SPECIAL_BLOCKS.register("blood_kelp_plant", () -> {
        return new ADBloodKelpPlantBlock(Properties.copy(Blocks.KELP_PLANT).lightLevel(litBlockEmission(10)));
    });
    public static final Block CRIMSON_BOOKSHELF = BLOCKS.register("crimson_bookshelf", () -> {
        return netherBookshelf(MaterialColor.CRIMSON_STEM);
    });
    public static final Block WARPED_BOOKSHELF = BLOCKS.register("warped_bookshelf", () -> {
        return netherBookshelf(MaterialColor.WARPED_STEM);
    });


    */
}
