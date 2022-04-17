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
    public static final Block BAT_PLUSH = new ADBatPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BLAZE_PLUSH = new ADBlazePlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.YELLOW).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CAVE_SPIDER_PLUSH = new ADCaveSpiderPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.CYAN).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CHICKEN_PLUSH = new ADChickenPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.WHITE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block COW_PLUSH = new ADCowPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.BROWN).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block CREEPER_PLUSH = new ADCreeperPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.LIME).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block ENDERMAN_PLUSH = new ADEndermanPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.BLACK).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block GHAST_PLUSH = new ADGhastPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block GUARDIAN_PLUSH = new ADGuardianPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH));
    public static final Block WHITE_HORSE_PLUSH = new ADHorsePlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block GRAY_HORSE_PLUSH = new ADHorsePlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH));
    public static final Block LIGHT_GRAY_HORSE_PLUSH = new ADHorsePlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_GRAY).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BROWN_HORSE_PLUSH = new ADHorsePlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block BLACK_HORSE_PLUSH = new ADHorsePlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block MAGMA_CUBE_PLUSH = new ADMagmaCubePlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.RED).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block RED_MOOSHROOM_PLUSH = new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH));
    public static final Block BROWN_MOOSHROOM_PLUSH = new ADMooshroomPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block OCELOT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block TABBY_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block TUXEDO_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block RED_CAT_PLUSH = new ADCatPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.ORANGE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block SIAMESE_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block BRITISH_SHORTHAIR_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH));
    public static final Block CALICO_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block PERSIAN_CAT_PLUSH = new ADPersianCatPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block RAGDOLL_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block WHITE_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block JELLIE_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block BLACK_CAT_PLUSH = new ADCatPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block PIG_PLUSH = new ADPigPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.PINK).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BROWN_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block WHITE_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block BLACK_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block WHITE_SPLOTCHED_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block GOLD_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block TOAST_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block SALT_RABBIT_PLUSH = new ADRabbitPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block WHITE_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block ORANGE_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH));
    public static final Block MAGENTA_SHEEP_PLUSH = new ADSheepPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.MAGENTA).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block LIGHT_BLUE_SHEEP_PLUSH = new ADSheepPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.LIGHT_BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block YELLOW_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block LIME_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH));
    public static final Block PINK_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH));
    public static final Block GRAY_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(BAT_PLUSH));
    public static final Block LIGHT_GRAY_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH));
    public static final Block CYAN_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(CAVE_SPIDER_PLUSH));
    public static final Block PURPLE_SHEEP_PLUSH = new ADSheepPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.PURPLE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BLUE_SHEEP_PLUSH = new ADSheepPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.BLUE).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block BROWN_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block GREEN_SHEEP_PLUSH = new ADSheepPlushBlock(
            AbstractBlock.Settings.of(Material.WOOL, MapColor.GREEN).strength(0.2F).sounds(BlockSoundGroup.WOOL));
    public static final Block RED_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH));
    public static final Block BLACK_SHEEP_PLUSH = new ADSheepPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block SKELETON_PLUSH = new ADSkeletonPlushBlock(AbstractBlock.Settings.copy(LIGHT_GRAY_HORSE_PLUSH));
    public static final Block SLIME_PLUSH = new ADSlimePlushBlock(AbstractBlock.Settings.copy(CREEPER_PLUSH));
    public static final Block SPIDER_PLUSH = new ADSpiderPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block SQUID_PLUSH = new ADSquidPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH));
    public static final Block BEE_PLUSH = new ADBeePlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block PLAINS_VILLAGER_PLUSH = new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block DESERT_VILLAGER_PLUSH = new ADDesertVillagerPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH));
    public static final Block JUNGLE_VILLAGER_PLUSH = new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block SAVANNA_VILLAGER_PLUSH = new ADSavannaVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block SNOW_VILLAGER_PLUSH = new ADSnowVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block SWAMP_VILLAGER_PLUSH = new ADSwampVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH));
    public static final Block TAIGA_VILLAGER_PLUSH = new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block CRIMSON_VILLAGER_PLUSH = new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block WARPED_VILLAGER_PLUSH = new ADBaseVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block WANDERING_TRADER_PLUSH = new ADWanderingTraderPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH));
    public static final Block PLAINS_ZOMBIE_VILLAGER_PLUSH = new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH));
    public static final Block DESERT_ZOMBIE_VILLAGER_PLUSH = new ADDesertZombieVillagerPlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH));
    public static final Block JUNGLE_ZOMBIE_VILLAGER_PLUSH = new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block SAVANNA_ZOMBIE_VILLAGER_PLUSH = new ADSavannaZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block SNOW_ZOMBIE_VILLAGER_PLUSH = new ADSnowZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block SWAMP_ZOMBIE_VILLAGER_PLUSH = new ADSwampZombieVillagerPlushBlock(AbstractBlock.Settings.copy(COW_PLUSH));
    public static final Block TAIGA_ZOMBIE_VILLAGER_PLUSH = new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block CRIMSON_ZOMBIE_VILLAGER_PLUSH = new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block WARPED_ZOMBIE_VILLAGER_PLUSH = new ADBaseZombieVillagerPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block WITCH_PLUSH = new ADWitchPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block WOLF_PLUSH = new ADWolfPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block ZOMBIE_PLUSH = new ADZombiePlushBlock(AbstractBlock.Settings.copy(GREEN_SHEEP_PLUSH));
    public static final Block CHARRED_REMNANT_PLUSH = new ADZombiePlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH));
    public static final Block PIGLIN_PLUSH = new ADPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH));
    public static final Block ZOMBIFIED_PIGLIN_PLUSH = new ADZombifiedPiglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH));
    public static final Block PUFFERFISH_PLUSH = new ADPufferfishPlushBlock(AbstractBlock.Settings.copy(BLAZE_PLUSH));
    public static final Block WITHER_PLUSH = new ADWitherPlushBlock(AbstractBlock.Settings.copy(ENDERMAN_PLUSH));
    public static final Block STRIDER_PLUSH = new ADStriderPlushBlock(AbstractBlock.Settings.copy(MAGMA_CUBE_PLUSH));
    public static final Block SHIVERING_STRIDER_PLUSH = new ADStriderPlushBlock(AbstractBlock.Settings.copy(PURPLE_SHEEP_PLUSH));
    public static final Block PHANTOM_PLUSH = new ADPhantomPlushBlock(AbstractBlock.Settings.copy(BLUE_SHEEP_PLUSH));
    public static final Block HOGLIN_PLUSH = new ADHoglinPlushBlock(AbstractBlock.Settings.copy(RED_CAT_PLUSH));
    public static final Block ZOGLIN_PLUSH = new ADHoglinPlushBlock(AbstractBlock.Settings.copy(PIG_PLUSH));
    public static final Block POLAR_BEAR_PLUSH = new ADHoglinPlushBlock(AbstractBlock.Settings.copy(CHICKEN_PLUSH));
    public static final Block NETHER_SMOKY_QUARTZ_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE));
    public static final Block SMOKY_QUARTZ_BLOCK = new Block(
            AbstractBlock.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(0.8F));
    public static final Block CHISELED_SMOKY_QUARTZ_BLOCK = new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICKS = new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICK_STAIRS = new ADStairsBlock(
            SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_PILLAR = new PillarBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_STAIRS = new ADStairsBlock(
            SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_SLAB = new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOKY_QUARTZ_WALL = new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOOTH_SMOKY_QUARTZ = new Block(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOOTH_SMOKY_QUARTZ_STAIRS = new ADStairsBlock(
            SMOKY_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOOTH_SMOKY_QUARTZ_SLAB = new SlabBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block SMOOTH_SMOKY_QUARTZ_WALL = new WallBlock(AbstractBlock.Settings.copy(SMOKY_QUARTZ_BLOCK));
    public static final Block CRACKED_STONE_BRICK_STAIRS = new ADStairsBlock(
            Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block CRACKED_STONE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block QUARTZ_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final Block SMOOTH_QUARTZ_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ));
    public static final Block STONE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block RED_GLASS = new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS));
    public static final Block RED_GLASS_PANE = new ADPaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE));
    public static final Block BLUEBERRY_BUSH = new ADBlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT));
    public static final Block BOK_CHOY = new ADBokChoyCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT));
    public static final Block GARLIC = new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), ADItems.GARLIC);
    public static final Block GREEN_ONIONS = new ADOnionBlock(AbstractBlock.Settings.copy(Blocks.WHEAT), ADItems.GREEN_ONION);
    public static final Block OAK_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.OAK_TAN);
    public static final Block SPRUCE_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.SPRUCE_BROWN);
    public static final Block BIRCH_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.PALE_YELLOW);
    public static final Block JUNGLE_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.DIRT_BROWN);
    public static final Block ACACIA_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.ORANGE);
    public static final Block DARK_OAK_PLANTER_BOX = overworldPlanterBoxBlock(MapColor.BROWN);
    public static final Block CRIMSON_PLANTER_BOX = netherPlanterBoxBlock(MapColor.DULL_PINK);
    public static final Block WARPED_PLANTER_BOX = netherPlanterBoxBlock(MapColor.DARK_AQUA);
    public static final Block OAK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block SPRUCE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block BIRCH_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block JUNGLE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block ACACIA_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block DARK_OAK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block CRIMSON_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final Block WARPED_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));
    public static final Block STRIPPED_OAK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block STRIPPED_SPRUCE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));
    public static final Block STRIPPED_BIRCH_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));
    public static final Block STRIPPED_JUNGLE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS));
    public static final Block STRIPPED_ACACIA_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS));
    public static final Block STRIPPED_DARK_OAK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS));
    public static final Block STRIPPED_CRIMSON_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS));
    public static final Block STRIPPED_WARPED_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));
    public static final Block OAK_ROPE_LADDER = ropeLadderBlock();
    public static final Block SPRUCE_ROPE_LADDER = ropeLadderBlock();
    public static final Block BIRCH_ROPE_LADDER = ropeLadderBlock();
    public static final Block JUNGLE_ROPE_LADDER = ropeLadderBlock();
    public static final Block ACACIA_ROPE_LADDER = ropeLadderBlock();
    public static final Block DARK_OAK_ROPE_LADDER = ropeLadderBlock();
    public static final Block CRIMSON_ROPE_LADDER = ropeLadderBlock();
    public static final Block WARPED_ROPE_LADDER = ropeLadderBlock();
    public static final Block IRON_LADDER = new ADLadderBlock(
            AbstractBlock.Settings.of(Material.METAL).strength(0.4F, 5.0F).sounds(BlockSoundGroup.METAL).nonOpaque());
    public static final Block DIRT_SLAB = new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT).ticksRandomly());
    public static final Block GRASS_SLAB = new ADGrassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK));
    public static final Block DIRT_PATH_SLAB = new ADDirtPathSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block COARSE_DIRT_SLAB = new ADDirtSlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    public static final Block SNOW_BRICKS = new Block(
            AbstractBlock.Settings.of(Material.SNOW_BLOCK).strength(0.6F).requiresTool().sounds(BlockSoundGroup.SNOW));
    public static final Block SNOW_BRICK_STAIRS = new ADSnowyStairBlock(
            ADBlocks.SNOW_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SNOW_BRICKS));
    public static final Block SNOW_BRICK_SLAB = new ADSnowySlabBlock(AbstractBlock.Settings.copy(SNOW_BRICKS));
    public static final Block SNOW_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(SNOW_BRICKS));
    public static final Block PURPLE_MUSHROOM = new MushroomPlantBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM),
            () -> ADTreeConfiguredFeatures.HUGE_PURPLE_MUSHROOM);
    public static final Block PURPLE_MUSHROOM_BLOCK = new ADPurpleMushroomBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK));
    public static final Block WOODCUTTER = new ADWoodcutterBlock(AbstractBlock.Settings.copy(Blocks.STONECUTTER));
    public static final Block WHITE_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.WHITE_SPARK);
    public static final Block ORANGE_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.ORANGE_SPARK);
    public static final Block MAGENTA_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.MAGENTA_SPARK);
    public static final Block LIGHT_BLUE_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.LIGHT_BLUE_SPARK);
    public static final Block YELLOW_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.YELLOW_SPARK);
    public static final Block LIME_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.LIME_SPARK);
    public static final Block PINK_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.PINK_SPARK);
    public static final Block GRAY_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.GRAY_SPARK);
    public static final Block LIGHT_GRAY_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.LIGHT_GRAY_SPARK);
    public static final Block CYAN_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.CYAN_SPARK);
    public static final Block PURPLE_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.PURPLE_SPARK);
    public static final Block BLUE_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.BLUE_SPARK);
    public static final Block BROWN_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.BROWN_SPARK);
    public static final Block GREEN_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.GREEN_SPARK);
    public static final Block RED_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.RED_SPARK);
    public static final Block BLACK_CAMPFIRE = dyedCampfireBlock(ADParticleTypes.BLACK_SPARK);
    public static final Block WHITE_LANTERN = lanternBlock();
    public static final Block ORANGE_LANTERN = lanternBlock();
    public static final Block MAGENTA_LANTERN = lanternBlock();
    public static final Block LIGHT_BLUE_LANTERN = lanternBlock();
    public static final Block YELLOW_LANTERN = lanternBlock();
    public static final Block LIME_LANTERN = lanternBlock();
    public static final Block PINK_LANTERN = lanternBlock();
    public static final Block GRAY_LANTERN = lanternBlock();
    public static final Block LIGHT_GRAY_LANTERN = lanternBlock();
    public static final Block CYAN_LANTERN = lanternBlock();
    public static final Block PURPLE_LANTERN = lanternBlock();
    public static final Block BLUE_LANTERN = lanternBlock();
    public static final Block BROWN_LANTERN = lanternBlock();
    public static final Block GREEN_LANTERN = lanternBlock();
    public static final Block RED_LANTERN = lanternBlock();
    public static final Block BLACK_LANTERN = lanternBlock();
    public static final Block WHITE_WALL_TORCH = wallTorchBlock(ADParticleTypes.WHITE_FLAME);
    public static final Block ORANGE_WALL_TORCH = wallTorchBlock(ADParticleTypes.ORANGE_FLAME);
    public static final Block MAGENTA_WALL_TORCH = wallTorchBlock(ADParticleTypes.MAGENTA_FLAME);
    public static final Block LIGHT_BLUE_WALL_TORCH = wallTorchBlock(ADParticleTypes.LIGHT_BLUE_FLAME);
    public static final Block YELLOW_WALL_TORCH = wallTorchBlock(ADParticleTypes.YELLOW_FLAME);
    public static final Block LIME_WALL_TORCH = wallTorchBlock(ADParticleTypes.LIME_FLAME);
    public static final Block PINK_WALL_TORCH = wallTorchBlock(ADParticleTypes.PINK_FLAME);
    public static final Block GRAY_WALL_TORCH = wallTorchBlock(ADParticleTypes.GRAY_FLAME);
    public static final Block LIGHT_GRAY_WALL_TORCH = wallTorchBlock(ADParticleTypes.LIGHT_GRAY_FLAME);
    public static final Block CYAN_WALL_TORCH = wallTorchBlock(ADParticleTypes.CYAN_FLAME);
    public static final Block PURPLE_WALL_TORCH = wallTorchBlock(ADParticleTypes.PURPLE_FLAME);
    public static final Block BLUE_WALL_TORCH = wallTorchBlock(ADParticleTypes.BLUE_FLAME);
    public static final Block BROWN_WALL_TORCH = wallTorchBlock(ADParticleTypes.BROWN_FLAME);
    public static final Block GREEN_WALL_TORCH = wallTorchBlock(ADParticleTypes.GREEN_FLAME);
    public static final Block RED_WALL_TORCH = wallTorchBlock(ADParticleTypes.RED_FLAME);
    public static final Block BLACK_WALL_TORCH = wallTorchBlock(ADParticleTypes.BLACK_FLAME);
    public static final Block WHITE_TORCH = torchBlock(ADParticleTypes.WHITE_FLAME);
    public static final Block ORANGE_TORCH = torchBlock(ADParticleTypes.ORANGE_FLAME);
    public static final Block MAGENTA_TORCH = torchBlock(ADParticleTypes.MAGENTA_FLAME);
    public static final Block LIGHT_BLUE_TORCH = torchBlock(ADParticleTypes.LIGHT_BLUE_FLAME);
    public static final Block YELLOW_TORCH = torchBlock(ADParticleTypes.YELLOW_FLAME);
    public static final Block LIME_TORCH = torchBlock(ADParticleTypes.LIME_FLAME);
    public static final Block PINK_TORCH = torchBlock(ADParticleTypes.PINK_FLAME);
    public static final Block GRAY_TORCH = torchBlock(ADParticleTypes.GRAY_FLAME);
    public static final Block LIGHT_GRAY_TORCH = torchBlock(ADParticleTypes.LIGHT_GRAY_FLAME);
    public static final Block CYAN_TORCH = torchBlock(ADParticleTypes.CYAN_FLAME);
    public static final Block PURPLE_TORCH = torchBlock(ADParticleTypes.PURPLE_FLAME);
    public static final Block BLUE_TORCH = torchBlock(ADParticleTypes.BLUE_FLAME);
    public static final Block BROWN_TORCH = torchBlock(ADParticleTypes.BROWN_FLAME);
    public static final Block GREEN_TORCH = torchBlock(ADParticleTypes.GREEN_FLAME);
    public static final Block RED_TORCH = torchBlock(ADParticleTypes.RED_FLAME);
    public static final Block BLACK_TORCH = torchBlock(ADParticleTypes.BLACK_FLAME);
    public static final Block WITCHS_CRADLE = new ADWitchsCradleBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH));
    public static final Block FRESH_BAMBOO_FENCE = bambooFenceBlock(MapColor.DARK_GREEN);
    public static final Block FRESH_BAMBOO_FENCE_GATE = new FenceGateBlock(AbstractBlock.Settings.copy(FRESH_BAMBOO_FENCE));
    public static final Block DRIED_BAMBOO_FENCE = bambooFenceBlock(MapColor.PALE_YELLOW);
    public static final Block DRIED_BAMBOO_FENCE_GATE = new FenceGateBlock(AbstractBlock.Settings.copy(DRIED_BAMBOO_FENCE));
    public static final Block BAUXITE = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.3F));
    public static final Block BAUXITE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(BAUXITE));
    public static final Block BAUXITE_STAIRS = new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE));
    public static final Block BAUXITE_WALL = new WallBlock(AbstractBlock.Settings.copy(BAUXITE));
    public static final Block POLISHED_BAUXITE = new Block(AbstractBlock.Settings.copy(BAUXITE));
    public static final Block POLISHED_BAUXITE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(BAUXITE));
    public static final Block POLISHED_BAUXITE_STAIRS = new ADStairsBlock(BAUXITE.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE));
    public static final Block POLISHED_BAUXITE_WALL = new WallBlock(AbstractBlock.Settings.copy(BAUXITE));
    public static final Block BAUXITE_BRICKS = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.SPRUCE_BROWN).strength(0.4F));
    public static final Block BAUXITE_BRICK_STAIRS = new ADStairsBlock(BAUXITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BAUXITE_BRICKS));
    public static final Block BAUXITE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS));
    public static final Block BAUXITE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(BAUXITE_BRICKS));
    public static final Block SNOW_SLAB = new ADSnowySlabBlock(
            AbstractBlock.Settings.of(Material.SNOW_BLOCK).requiresTool().strength(0.2F).sounds(BlockSoundGroup.SNOW));
    public static final Block SNOW_STAIRS = new ADSnowyStairBlock(
            Blocks.SNOW_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SNOW_SLAB));
    public static final Block SNOW_WALL = new WallBlock(AbstractBlock.Settings.copy(SNOW_SLAB));
    public static final Block TWISTED_NETHER_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block TWISTED_NETHER_BRICK_STAIRS = new ADStairsBlock(
            TWISTED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS));
    public static final Block TWISTED_NETHER_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS));
    public static final Block TWISTED_NETHER_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHER_BRICKS));
    public static final Block TWISTED_NETHERRACK = new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block TWISTED_NETHERRACK_STAIRS = new ADStairsBlock(
            TWISTED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_NETHERRACK));
    public static final Block TWISTED_NETHERRACK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK));
    public static final Block TWISTED_NETHERRACK_WALL = new WallBlock(AbstractBlock.Settings.copy(TWISTED_NETHERRACK));
    public static final Block WEEPING_NETHER_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block WEEPING_NETHER_BRICK_STAIRS = new ADStairsBlock(
            WEEPING_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS));
    public static final Block WEEPING_NETHER_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS));
    public static final Block WEEPING_NETHER_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHER_BRICKS));
    public static final Block WEEPING_NETHERRACK = new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block WEEPING_NETHERRACK_STAIRS = new ADStairsBlock(
            WEEPING_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_NETHERRACK));
    public static final Block WEEPING_NETHERRACK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK));
    public static final Block WEEPING_NETHERRACK_WALL = new WallBlock(AbstractBlock.Settings.copy(WEEPING_NETHERRACK));
    public static final Block SNAPDRAGON = new ADSnapdragonBlock(
            StatusEffects.LUCK, 8, AbstractBlock.Settings.copy(Blocks.POPPY).luminance((state) -> 7));
    public static final Block POTTED_SNAPDRAGON = new ADPottedSnapdragonBlock(
            ADBlocks.SNAPDRAGON, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY).luminance((state) -> 7));
    public static final Block POTTED_PURPLE_MUSHROOM = new FlowerPotBlock(
            ADBlocks.PURPLE_MUSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY));
    public static final Block ENDER_GRASS = new ADEnderGrassBlock(
            AbstractBlock.Settings.copy(Blocks.GRASS).luminance((state) -> 7));
    public static final Block ICICLE = new ADIcicleBlock(
            AbstractBlock.Settings.of(Material.ICE).requiresTool().strength(0.2F).noCollision().sounds(BlockSoundGroup.GLASS));
    public static final Block CATTAIL = new ADCattailBlock(
            AbstractBlock.Settings.of(Material.PLANT).noCollision().nonOpaque().sounds(BlockSoundGroup.WET_GRASS));
    public static final Block CHOCOLATE_CAKE = new ADCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE));
    public static final Block RED_VELVET_CAKE = new ADCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE));
    public static final Block STONE_TILES = new Block(
            AbstractBlock.Settings.copy(Blocks.STONE).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block STONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block STONE_TILE_STAIRS = new ADStairsBlock(
            STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block STONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block MOSSY_STONE_TILES = new Block(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block MOSSY_STONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block MOSSY_STONE_TILE_STAIRS = new ADStairsBlock(
            MOSSY_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block MOSSY_STONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block CRACKED_STONE_TILES = new Block(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block CRACKED_STONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block CRACKED_STONE_TILE_STAIRS = new ADStairsBlock(
            CRACKED_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block CRACKED_STONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(STONE_TILES));
    public static final Block SWEET_BERRY_PIE = new ADPieBlock(
            AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F);
    public static final Block BLUEBERRY_PIE = new ADPieBlock(
            AbstractBlock.Settings.copy(Blocks.CAKE), 3, 0.6F);
    public static final Block BLACKSTONE_TILES = new Block(
            AbstractBlock.Settings.copy(Blocks.BLACKSTONE).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block BLACKSTONE_TILE_STAIRS = new ADStairsBlock(
            BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(BLACKSTONE_TILES));
    public static final Block BLACKSTONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES));
    public static final Block BLACKSTONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(BLACKSTONE_TILES));
    public static final Block TWISTED_BLACKSTONE_TILES = new Block(
            AbstractBlock.Settings.copy(BLACKSTONE_TILES).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block TWISTED_BLACKSTONE_TILE_STAIRS = new ADStairsBlock(
            TWISTED_BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES));
    public static final Block TWISTED_BLACKSTONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES));
    public static final Block TWISTED_BLACKSTONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE_TILES));
    public static final Block WEEPING_BLACKSTONE_TILES = new Block(
            AbstractBlock.Settings.copy(BLACKSTONE_TILES).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block WEEPING_BLACKSTONE_TILE_STAIRS = new ADStairsBlock(
            WEEPING_BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES));
    public static final Block WEEPING_BLACKSTONE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES));
    public static final Block WEEPING_BLACKSTONE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE_TILES));
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS = new ADStairsBlock(
            TWISTED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB = new SlabBlock(
            AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block TWISTED_POLISHED_BLACKSTONE_BRICK_WALL = new WallBlock(
            AbstractBlock.Settings.copy(TWISTED_POLISHED_BLACKSTONE_BRICKS));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = new ADStairsBlock(
            WEEPING_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = new SlabBlock(
            AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS));
    public static final Block WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = new WallBlock(
            AbstractBlock.Settings.copy(WEEPING_POLISHED_BLACKSTONE_BRICKS));
    public static final Block TWISTED_BLACKSTONE = new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block TWISTED_BLACKSTONE_STAIRS = new ADStairsBlock(
            TWISTED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(TWISTED_BLACKSTONE));
    public static final Block TWISTED_BLACKSTONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE));
    public static final Block TWISTED_BLACKSTONE_WALL = new WallBlock(AbstractBlock.Settings.copy(TWISTED_BLACKSTONE));
    public static final Block WEEPING_BLACKSTONE = new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final Block WEEPING_BLACKSTONE_STAIRS = new ADStairsBlock(
            WEEPING_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(WEEPING_BLACKSTONE));
    public static final Block WEEPING_BLACKSTONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE));
    public static final Block WEEPING_BLACKSTONE_WALL = new WallBlock(AbstractBlock.Settings.copy(WEEPING_BLACKSTONE));
    public static final Block QUARTZ_TILES = new Block(
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block QUARTZ_TILE_STAIRS = new ADStairsBlock(
            QUARTZ_TILES.getDefaultState(), AbstractBlock.Settings.copy(QUARTZ_TILES));
    public static final Block QUARTZ_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(QUARTZ_TILES));
    public static final Block QUARTZ_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(QUARTZ_TILES));
    public static final Block POLISHED_CALCITE = new Block(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block POLISHED_CALCITE_STAIRS = new ADStairsBlock(
            Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block POLISHED_CALCITE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block POLISHED_CALCITE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_BRICK_STAIRS = new ADStairsBlock(
            Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CALCITE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CRACKED_CALCITE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block CRACKED_CALCITE_BRICK_STAIRS = new ADStairsBlock(
            CRACKED_CALCITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS));
    public static final Block CRACKED_CALCITE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS));
    public static final Block CRACKED_CALCITE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(CRACKED_CALCITE_BRICKS));
    public static final Block CHISELED_CALCITE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block POLISHED_TUFF = new Block(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block POLISHED_TUFF_STAIRS = new ADStairsBlock(
            Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block POLISHED_TUFF_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block POLISHED_TUFF_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_BRICK_STAIRS = new ADStairsBlock(
            Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block TUFF_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block MOSSY_TUFF_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = new ADStairsBlock(
            Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block MOSSY_TUFF_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block MOSSY_TUFF_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block CRACKED_TUFF_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block CRACKED_TUFF_BRICK_STAIRS = new ADStairsBlock(
            Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block CRACKED_TUFF_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block CRACKED_TUFF_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block CHISELED_TUFF_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.TUFF));
    public static final Block POLISHED_DRIPSTONE_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block POLISHED_DRIPSTONE_STAIRS = new ADStairsBlock(
            Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block POLISHED_DRIPSTONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block POLISHED_DRIPSTONE_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_BRICK_STAIRS = new ADStairsBlock(
            Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block DRIPSTONE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block MOSSY_DRIPSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block MOSSY_DRIPSTONE_BRICK_STAIRS = new ADStairsBlock(
            Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block MOSSY_DRIPSTONE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block MOSSY_DRIPSTONE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block CRACKED_DRIPSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block CRACKED_DRIPSTONE_BRICK_STAIRS = new ADStairsBlock(
            Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block CRACKED_DRIPSTONE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block CRACKED_DRIPSTONE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block CHISELED_DRIPSTONE_BRICKS = new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block SPECTRAL_ONYX = new Block(
            AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F));
    public static final Block SPECTRAL_ONYX_STAIRS = new ADStairsBlock(
            ADBlocks.SPECTRAL_ONYX.getDefaultState(), AbstractBlock.Settings.copy(ADBlocks.SPECTRAL_ONYX));
    public static final Block SPECTRAL_ONYX_SLAB = new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX));
    public static final Block SPECTRAL_ONYX_WALL = new WallBlock(AbstractBlock.Settings.copy(ADBlocks.SPECTRAL_ONYX));
    public static final Block COBBLED_SPECTRAL_ONYX = new Block(
            AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F));
    public static final Block COBBLED_SPECTRAL_ONYX_STAIRS = new ADStairsBlock(
            COBBLED_SPECTRAL_ONYX.getDefaultState(), AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX));
    public static final Block COBBLED_SPECTRAL_ONYX_SLAB = new SlabBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX));
    public static final Block COBBLED_SPECTRAL_ONYX_WALL = new WallBlock(AbstractBlock.Settings.copy(COBBLED_SPECTRAL_ONYX));
    public static final Block SPECTRAL_ONYX_BRICKS = new Block(
            AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(0.4F));
    public static final Block SPECTRAL_ONYX_BRICK_STAIRS =  new ADStairsBlock(
            SPECTRAL_ONYX_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS));
    public static final Block SPECTRAL_ONYX_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS));
    public static final Block SPECTRAL_ONYX_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(SPECTRAL_ONYX_BRICKS));
    public static final Block BLOOD_KELP = new ADBloodKelpBlock(AbstractBlock.Settings.copy(Blocks.KELP));
    public static final Block BLOOD_KELP_PLANT = new ADBloodKelpPlantBlock(
            AbstractBlock.Settings.copy(Blocks.KELP_PLANT).luminance(createLightLevelFromLitBlockState(10)));
    public static final Block CRIMSON_BOOKSHELF = netherBookshelfBlock(MapColor.DULL_PINK);
    public static final Block WARPED_BOOKSHELF = netherBookshelfBlock(MapColor.DARK_AQUA);

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

    private static void registerBlockWithoutItem(String id, Block block) {
        registerBlock(id, block);
    }

    /**
     * Registers a block with a normal block item.
     */
    private static void registerBlockAndItem(String id, Block block) {
        registerBlock(id, block);
        registerBlockItem(id, block);
    }

    private static void registerBlockItem(String id, Block block) {
        Registry.register(Registry.ITEM, new Identifier(ADReference.MOD_ID, id),
                new BlockItem(block, itemBlockSettings()));
    }

    /**
     * Registers a rope ladder block with a rope ladder item.
     */
    private static void registerRopeLadderBlock(String id, Block block) {
        registerBlock(id, block);
        registerRopeLadderItem(id, block);
    }

    private static void registerRopeLadderItem(String id, Block block) {
        Registry.register(Registry.ITEM, new Identifier(ADReference.MOD_ID, id),
                new ADRopeLadderBlockItem(block, itemBlockSettings()));
    }

    private static void registerBlock(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(ADReference.MOD_ID, id), block);
    }

    /**
     * Register a torch, wall torch, and an item to go along with them.
     */
    private static void registerTorchBlock(String standingId, String wallId, Block wallTorch, Block standingTorch) {
        registerBlock(wallId, wallTorch);
        registerBlock(standingId, standingTorch);
        registerTorchItem(standingId, wallTorch, standingTorch);
    }

    private static void registerTorchItem(String id, Block wallTorch, Block standingTorch) {
        Registry.register(Registry.ITEM, new Identifier(ADReference.MOD_ID, id),
                new WallStandingBlockItem(standingTorch, wallTorch, itemBlockSettings()));
    }

    /**
     * The settings for all block items in assorted discoveries.
     */
    private static Item.Settings itemBlockSettings() {
        return new Item.Settings().group(AssortedDiscoveries.MOD_GROUP);
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> state.get(Properties.LIT) ? litLevel : 0;
    }

    /**
     * Called during mod initialization to register every block.
     */
    public static void registerBlocks() {
        registerBlockAndItem("bat_plush", BAT_PLUSH);
        registerBlockAndItem("blaze_plush", BLAZE_PLUSH);
        registerBlockAndItem("cave_spider_plush", CAVE_SPIDER_PLUSH);
        registerBlockAndItem("chicken_plush", CHICKEN_PLUSH);
        registerBlockAndItem("cow_plush", COW_PLUSH);
        registerBlockAndItem("creeper_plush", CREEPER_PLUSH);
        registerBlockAndItem("enderman_plush", ENDERMAN_PLUSH);
        registerBlockAndItem("ghast_plush", GHAST_PLUSH);
        registerBlockAndItem("guardian_plush", GUARDIAN_PLUSH);
        registerBlockAndItem("white_horse_plush", WHITE_HORSE_PLUSH);
        registerBlockAndItem("gray_horse_plush", GRAY_HORSE_PLUSH);
        registerBlockAndItem("light_gray_horse_plush", LIGHT_GRAY_HORSE_PLUSH);
        registerBlockAndItem("brown_horse_plush", BROWN_HORSE_PLUSH);
        registerBlockAndItem("black_horse_plush", BLACK_HORSE_PLUSH);
        registerBlockAndItem("magma_cube_plush", MAGMA_CUBE_PLUSH);
        registerBlockAndItem("red_mooshroom_plush", RED_MOOSHROOM_PLUSH);
        registerBlockAndItem("brown_mooshroom_plush", BROWN_MOOSHROOM_PLUSH);
        registerBlockAndItem("ocelot_plush", OCELOT_PLUSH);
        registerBlockAndItem("tabby_cat_plush", TABBY_CAT_PLUSH);
        registerBlockAndItem("tuxedo_cat_plush", TUXEDO_CAT_PLUSH);
        registerBlockAndItem("red_cat_plush", RED_CAT_PLUSH);
        registerBlockAndItem("siamese_cat_plush", SIAMESE_CAT_PLUSH);
        registerBlockAndItem("british_shorthair_cat_plush", BRITISH_SHORTHAIR_CAT_PLUSH);
        registerBlockAndItem("calico_cat_plush", CALICO_CAT_PLUSH);
        registerBlockAndItem("persian_cat_plush", PERSIAN_CAT_PLUSH);
        registerBlockAndItem("ragdoll_cat_plush", RAGDOLL_CAT_PLUSH);
        registerBlockAndItem("white_cat_plush", WHITE_CAT_PLUSH);
        registerBlockAndItem("jellie_cat_plush", JELLIE_CAT_PLUSH);
        registerBlockAndItem("black_cat_plush", BLACK_CAT_PLUSH);
        registerBlockAndItem("pig_plush", PIG_PLUSH);
        registerBlockAndItem("brown_rabbit_plush", BROWN_RABBIT_PLUSH);
        registerBlockAndItem("white_rabbit_plush", WHITE_RABBIT_PLUSH);
        registerBlockAndItem("black_rabbit_plush", BLACK_RABBIT_PLUSH);
        registerBlockAndItem("white_splotched_rabbit_plush", WHITE_SPLOTCHED_RABBIT_PLUSH);
        registerBlockAndItem("gold_rabbit_plush", GOLD_RABBIT_PLUSH);
        registerBlockAndItem("toast_rabbit_plush", TOAST_RABBIT_PLUSH);
        registerBlockAndItem("salt_rabbit_plush", SALT_RABBIT_PLUSH);
        registerBlockAndItem("white_sheep_plush", WHITE_SHEEP_PLUSH);
        registerBlockAndItem("orange_sheep_plush", ORANGE_SHEEP_PLUSH);
        registerBlockAndItem("magenta_sheep_plush", MAGENTA_SHEEP_PLUSH);
        registerBlockAndItem("light_blue_sheep_plush", LIGHT_BLUE_SHEEP_PLUSH);
        registerBlockAndItem("yellow_sheep_plush", YELLOW_SHEEP_PLUSH);
        registerBlockAndItem("lime_sheep_plush", LIME_SHEEP_PLUSH);
        registerBlockAndItem("pink_sheep_plush", PINK_SHEEP_PLUSH);
        registerBlockAndItem("gray_sheep_plush", GRAY_SHEEP_PLUSH);
        registerBlockAndItem("light_gray_sheep_plush", LIGHT_GRAY_SHEEP_PLUSH);
        registerBlockAndItem("cyan_sheep_plush", CYAN_SHEEP_PLUSH);
        registerBlockAndItem("purple_sheep_plush", PURPLE_SHEEP_PLUSH);
        registerBlockAndItem("blue_sheep_plush", BLUE_SHEEP_PLUSH);
        registerBlockAndItem("brown_sheep_plush", BROWN_SHEEP_PLUSH);
        registerBlockAndItem("green_sheep_plush", GREEN_SHEEP_PLUSH);
        registerBlockAndItem("red_sheep_plush", RED_SHEEP_PLUSH);
        registerBlockAndItem("black_sheep_plush", BLACK_SHEEP_PLUSH);
        registerBlockAndItem("skeleton_plush", SKELETON_PLUSH);
        registerBlockAndItem("slime_plush", SLIME_PLUSH);
        registerBlockAndItem("spider_plush", SPIDER_PLUSH);
        registerBlockAndItem("squid_plush", SQUID_PLUSH);
        registerBlockAndItem("bee_plush", BEE_PLUSH);
        registerBlockAndItem("plains_villager_plush", PLAINS_VILLAGER_PLUSH);
        registerBlockAndItem("desert_villager_plush", DESERT_VILLAGER_PLUSH);
        registerBlockAndItem("jungle_villager_plush", JUNGLE_VILLAGER_PLUSH);
        registerBlockAndItem("savanna_villager_plush", SAVANNA_VILLAGER_PLUSH);
        registerBlockAndItem("snow_villager_plush", SNOW_VILLAGER_PLUSH);
        registerBlockAndItem("swamp_villager_plush", SWAMP_VILLAGER_PLUSH);
        registerBlockAndItem("taiga_villager_plush", TAIGA_VILLAGER_PLUSH);
        registerBlockAndItem("crimson_villager_plush", CRIMSON_VILLAGER_PLUSH);
        registerBlockAndItem("warped_villager_plush", WARPED_VILLAGER_PLUSH);
        registerBlockAndItem("wandering_trader_plush", WANDERING_TRADER_PLUSH);
        registerBlockAndItem("plains_zombie_villager_plush", PLAINS_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("desert_zombie_villager_plush", DESERT_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("jungle_zombie_villager_plush", JUNGLE_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("savanna_zombie_villager_plush", SAVANNA_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("snow_zombie_villager_plush", SNOW_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("swamp_zombie_villager_plush", SWAMP_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("taiga_zombie_villager_plush", TAIGA_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("crimson_zombie_villager_plush", CRIMSON_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("warped_zombie_villager_plush", WARPED_ZOMBIE_VILLAGER_PLUSH);
        registerBlockAndItem("witch_plush", WITCH_PLUSH);
        registerBlockAndItem("wolf_plush", WOLF_PLUSH);
        registerBlockAndItem("zombie_plush", ZOMBIE_PLUSH);
        registerBlockAndItem("charred_remnant_plush", CHARRED_REMNANT_PLUSH);
        registerBlockAndItem("piglin_plush", PIGLIN_PLUSH);
        registerBlockAndItem("zombified_piglin_plush", ZOMBIFIED_PIGLIN_PLUSH);
        registerBlockAndItem("pufferfish_plush", PUFFERFISH_PLUSH);
        registerBlockAndItem("wither_plush", WITHER_PLUSH);
        registerBlockAndItem("strider_plush", STRIDER_PLUSH);
        registerBlockAndItem("shivering_strider_plush", SHIVERING_STRIDER_PLUSH);
        registerBlockAndItem("phantom_plush", PHANTOM_PLUSH);
        registerBlockAndItem("hoglin_plush", HOGLIN_PLUSH);
        registerBlockAndItem("zoglin_plush", ZOGLIN_PLUSH);
        registerBlockAndItem("polar_bear_plush", POLAR_BEAR_PLUSH);
        registerBlockAndItem("nether_smoky_quartz_ore", NETHER_SMOKY_QUARTZ_ORE);
        registerBlockAndItem("smoky_quartz_block", SMOKY_QUARTZ_BLOCK);
        registerBlockAndItem("chiseled_smoky_quartz_block", CHISELED_SMOKY_QUARTZ_BLOCK);
        registerBlockAndItem("smoky_quartz_bricks", SMOKY_QUARTZ_BRICKS);
        registerBlockAndItem("smoky_quartz_brick_stairs", SMOKY_QUARTZ_BRICK_STAIRS);
        registerBlockAndItem("smoky_quartz_brick_slab", SMOKY_QUARTZ_BRICK_SLAB);
        registerBlockAndItem("smoky_quartz_brick_wall", SMOKY_QUARTZ_BRICK_WALL);
        registerBlockAndItem("smoky_quartz_pillar", SMOKY_QUARTZ_PILLAR);
        registerBlockAndItem("smoky_quartz_stairs", SMOKY_QUARTZ_STAIRS);
        registerBlockAndItem("smoky_quartz_slab", SMOKY_QUARTZ_SLAB);
        registerBlockAndItem("smoky_quartz_wall", SMOKY_QUARTZ_WALL);
        registerBlockAndItem("smooth_smoky_quartz", SMOOTH_SMOKY_QUARTZ);
        registerBlockAndItem("smooth_smoky_quartz_stairs", SMOOTH_SMOKY_QUARTZ_STAIRS);
        registerBlockAndItem("smooth_smoky_quartz_slab", SMOOTH_SMOKY_QUARTZ_SLAB);
        registerBlockAndItem("smooth_smoky_quartz_wall", SMOOTH_SMOKY_QUARTZ_WALL);
        registerBlockAndItem("cracked_stone_brick_stairs", CRACKED_STONE_BRICK_STAIRS);
        registerBlockAndItem("cracked_stone_brick_slab", CRACKED_STONE_BRICK_SLAB);
        registerBlockAndItem("cracked_stone_brick_wall", CRACKED_STONE_BRICK_WALL);
        registerBlockAndItem("quartz_wall", QUARTZ_WALL);
        registerBlockAndItem("smooth_quartz_wall", SMOOTH_QUARTZ_WALL);
        registerBlockAndItem("stone_wall", STONE_WALL);
        registerBlockAndItem("red_glass", RED_GLASS);
        registerBlockAndItem("red_glass_pane", RED_GLASS_PANE);
        registerBlockWithoutItem("blueberry_bush", BLUEBERRY_BUSH);
        registerBlockWithoutItem("bok_choy", BOK_CHOY);
        registerBlockWithoutItem("garlic", GARLIC);
        registerBlockWithoutItem("green_onions", GREEN_ONIONS);
        registerBlockAndItem("oak_planter_box", OAK_PLANTER_BOX);
        registerBlockAndItem("spruce_planter_box", SPRUCE_PLANTER_BOX);
        registerBlockAndItem("birch_planter_box", BIRCH_PLANTER_BOX);
        registerBlockAndItem("jungle_planter_box", JUNGLE_PLANTER_BOX);
        registerBlockAndItem("acacia_planter_box", ACACIA_PLANTER_BOX);
        registerBlockAndItem("dark_oak_planter_box", DARK_OAK_PLANTER_BOX);
        registerBlockAndItem("crimson_planter_box", CRIMSON_PLANTER_BOX);
        registerBlockAndItem("warped_planter_box", WARPED_PLANTER_BOX);
        registerBlockAndItem("oak_wall", OAK_WALL);
        registerBlockAndItem("spruce_wall", SPRUCE_WALL);
        registerBlockAndItem("birch_wall", BIRCH_WALL);
        registerBlockAndItem("jungle_wall", JUNGLE_WALL);
        registerBlockAndItem("acacia_wall", ACACIA_WALL);
        registerBlockAndItem("dark_oak_wall", DARK_OAK_WALL);
        registerBlockAndItem("crimson_wall", CRIMSON_WALL);
        registerBlockAndItem("warped_wall", WARPED_WALL);
        registerBlockAndItem("stripped_oak_wall", STRIPPED_OAK_WALL);
        registerBlockAndItem("stripped_spruce_wall", STRIPPED_SPRUCE_WALL);
        registerBlockAndItem("stripped_birch_wall", STRIPPED_BIRCH_WALL);
        registerBlockAndItem("stripped_jungle_wall", STRIPPED_JUNGLE_WALL);
        registerBlockAndItem("stripped_acacia_wall", STRIPPED_ACACIA_WALL);
        registerBlockAndItem("stripped_dark_oak_wall", STRIPPED_DARK_OAK_WALL);
        registerBlockAndItem("stripped_crimson_wall", STRIPPED_CRIMSON_WALL);
        registerBlockAndItem("stripped_warped_wall", STRIPPED_WARPED_WALL);
        registerRopeLadderBlock("oak_rope_ladder", OAK_ROPE_LADDER);
        registerRopeLadderBlock("spruce_rope_ladder", SPRUCE_ROPE_LADDER);
        registerRopeLadderBlock("birch_rope_ladder", BIRCH_ROPE_LADDER);
        registerRopeLadderBlock("jungle_rope_ladder", JUNGLE_ROPE_LADDER);
        registerRopeLadderBlock("acacia_rope_ladder", ACACIA_ROPE_LADDER);
        registerRopeLadderBlock("dark_oak_rope_ladder", DARK_OAK_ROPE_LADDER);
        registerRopeLadderBlock("crimson_rope_ladder", CRIMSON_ROPE_LADDER);
        registerRopeLadderBlock("warped_rope_ladder", WARPED_ROPE_LADDER);
        registerBlockAndItem("iron_ladder", IRON_LADDER);
        registerBlockAndItem("dirt_slab", DIRT_SLAB);
        registerBlockAndItem("grass_slab", GRASS_SLAB);
        registerBlockAndItem("dirt_path_slab", DIRT_PATH_SLAB);
        registerBlockAndItem("coarse_dirt_slab", COARSE_DIRT_SLAB);
        registerBlockAndItem("snow_bricks", SNOW_BRICKS);
        registerBlockAndItem("snow_brick_stairs", SNOW_BRICK_STAIRS);
        registerBlockAndItem("snow_brick_slab", SNOW_BRICK_SLAB);
        registerBlockAndItem("snow_brick_wall", SNOW_BRICK_WALL);
        registerBlockAndItem("purple_mushroom", PURPLE_MUSHROOM);
        registerBlockAndItem("purple_mushroom_block", PURPLE_MUSHROOM_BLOCK);
        registerBlockAndItem("woodcutter", WOODCUTTER);
        registerBlockAndItem("white_campfire", WHITE_CAMPFIRE);
        registerBlockAndItem("orange_campfire", ORANGE_CAMPFIRE);
        registerBlockAndItem("magenta_campfire", MAGENTA_CAMPFIRE);
        registerBlockAndItem("light_blue_campfire", LIGHT_BLUE_CAMPFIRE);
        registerBlockAndItem("yellow_campfire", YELLOW_CAMPFIRE);
        registerBlockAndItem("lime_campfire", LIME_CAMPFIRE);
        registerBlockAndItem("pink_campfire", PINK_CAMPFIRE);
        registerBlockAndItem("gray_campfire", GRAY_CAMPFIRE);
        registerBlockAndItem("light_gray_campfire", LIGHT_GRAY_CAMPFIRE);
        registerBlockAndItem("cyan_campfire", CYAN_CAMPFIRE);
        registerBlockAndItem("purple_campfire", PURPLE_CAMPFIRE);
        registerBlockAndItem("blue_campfire", BLUE_CAMPFIRE);
        registerBlockAndItem("brown_campfire", BROWN_CAMPFIRE);
        registerBlockAndItem("green_campfire", GREEN_CAMPFIRE);
        registerBlockAndItem("red_campfire", RED_CAMPFIRE);
        registerBlockAndItem("black_campfire", BLACK_CAMPFIRE);
        registerBlockAndItem("white_lantern", WHITE_LANTERN);
        registerBlockAndItem("orange_lantern", ORANGE_LANTERN);
        registerBlockAndItem("magenta_lantern", MAGENTA_LANTERN);
        registerBlockAndItem("light_blue_lantern", LIGHT_BLUE_LANTERN);
        registerBlockAndItem("yellow_lantern", YELLOW_LANTERN);
        registerBlockAndItem("lime_lantern", LIME_LANTERN);
        registerBlockAndItem("pink_lantern", PINK_LANTERN);
        registerBlockAndItem("gray_lantern", GRAY_LANTERN);
        registerBlockAndItem("light_gray_lantern", LIGHT_GRAY_LANTERN);
        registerBlockAndItem("cyan_lantern", CYAN_LANTERN);
        registerBlockAndItem("purple_lantern", PURPLE_LANTERN);
        registerBlockAndItem("blue_lantern", BLUE_LANTERN);
        registerBlockAndItem("brown_lantern", BROWN_LANTERN);
        registerBlockAndItem("green_lantern", GREEN_LANTERN);
        registerBlockAndItem("red_lantern", RED_LANTERN);
        registerBlockAndItem("black_lantern", BLACK_LANTERN);
        registerTorchBlock("white_torch", "white_wall_torch", WHITE_WALL_TORCH, WHITE_TORCH);
        registerTorchBlock("orange_torch", "orange_wall_torch", ORANGE_WALL_TORCH, ORANGE_TORCH);
        registerTorchBlock("magenta_torch", "magenta_wall_torch", MAGENTA_WALL_TORCH, MAGENTA_TORCH);
        registerTorchBlock("light_blue_torch", "light_blue_wall_torch", LIGHT_BLUE_WALL_TORCH, LIGHT_BLUE_TORCH);
        registerTorchBlock("yellow_torch", "yellow_wall_torch", YELLOW_WALL_TORCH, YELLOW_TORCH);
        registerTorchBlock("lime_torch", "lime_wall_torch", LIME_WALL_TORCH, LIME_TORCH);
        registerTorchBlock("pink_torch", "pink_wall_torch", PINK_WALL_TORCH, PINK_TORCH);
        registerTorchBlock("gray_torch", "gray_wall_torch", GRAY_WALL_TORCH, GRAY_TORCH);
        registerTorchBlock("light_gray_torch", "light_gray_wall_torch", LIGHT_GRAY_WALL_TORCH, LIGHT_GRAY_TORCH);
        registerTorchBlock("cyan_torch", "cyan_wall_torch", CYAN_WALL_TORCH, CYAN_TORCH);
        registerTorchBlock("purple_torch", "purple_wall_torch", PURPLE_WALL_TORCH, PURPLE_TORCH);
        registerTorchBlock("blue_torch", "blue_wall_torch", BLUE_WALL_TORCH, BLUE_TORCH);
        registerTorchBlock("brown_torch", "brown_wall_torch", BROWN_WALL_TORCH, BROWN_TORCH);
        registerTorchBlock("green_torch", "green_wall_torch", GREEN_WALL_TORCH, GREEN_TORCH);
        registerTorchBlock("red_torch", "red_wall_torch", RED_WALL_TORCH, RED_TORCH);
        registerTorchBlock("black_torch", "black_wall_torch", BLACK_WALL_TORCH, BLACK_TORCH);
        registerBlockWithoutItem("witchs_cradle", WITCHS_CRADLE);
        registerBlockAndItem("fresh_bamboo_fence", FRESH_BAMBOO_FENCE);
        registerBlockAndItem("fresh_bamboo_fence_gate", FRESH_BAMBOO_FENCE_GATE);
        registerBlockAndItem("dried_bamboo_fence", DRIED_BAMBOO_FENCE);
        registerBlockAndItem("dried_bamboo_fence_gate", DRIED_BAMBOO_FENCE_GATE);
        registerBlockAndItem("bauxite", BAUXITE);
        registerBlockAndItem("bauxite_slab", BAUXITE_SLAB);
        registerBlockAndItem("bauxite_stairs", BAUXITE_STAIRS);
        registerBlockAndItem("bauxite_wall", BAUXITE_WALL);
        registerBlockAndItem("polished_bauxite", POLISHED_BAUXITE);
        registerBlockAndItem("polished_bauxite_slab", POLISHED_BAUXITE_SLAB);
        registerBlockAndItem("polished_bauxite_stairs", POLISHED_BAUXITE_STAIRS);
        registerBlockAndItem("polished_bauxite_wall", POLISHED_BAUXITE_WALL);
        registerBlockAndItem("bauxite_bricks", BAUXITE_BRICKS);
        registerBlockAndItem("bauxite_brick_stairs", BAUXITE_BRICK_STAIRS);
        registerBlockAndItem("bauxite_brick_slab", BAUXITE_BRICK_SLAB);
        registerBlockAndItem("bauxite_brick_wall", BAUXITE_BRICK_WALL);
        registerBlockAndItem("snow_slab", SNOW_SLAB);
        registerBlockAndItem("snow_stairs", SNOW_STAIRS);
        registerBlockAndItem("snow_wall", SNOW_WALL);
        registerBlockAndItem("twisted_nether_bricks", TWISTED_NETHER_BRICKS);
        registerBlockAndItem("twisted_nether_brick_stairs", TWISTED_NETHER_BRICK_STAIRS);
        registerBlockAndItem("twisted_nether_brick_slab", TWISTED_NETHER_BRICK_SLAB);
        registerBlockAndItem("twisted_nether_brick_wall", TWISTED_NETHER_BRICK_WALL);
        registerBlockAndItem("twisted_netherrack", TWISTED_NETHERRACK);
        registerBlockAndItem("twisted_netherrack_stairs", TWISTED_NETHERRACK_STAIRS);
        registerBlockAndItem("twisted_netherrack_slab", TWISTED_NETHERRACK_SLAB);
        registerBlockAndItem("twisted_netherrack_wall", TWISTED_NETHERRACK_WALL);
        registerBlockAndItem("weeping_nether_bricks", WEEPING_NETHER_BRICKS);
        registerBlockAndItem("weeping_nether_brick_stairs", WEEPING_NETHER_BRICK_STAIRS);
        registerBlockAndItem("weeping_nether_brick_slab", WEEPING_NETHER_BRICK_SLAB);
        registerBlockAndItem("weeping_nether_brick_wall", WEEPING_NETHER_BRICK_WALL);
        registerBlockAndItem("weeping_netherrack", WEEPING_NETHERRACK);
        registerBlockAndItem("weeping_netherrack_stairs", WEEPING_NETHERRACK_STAIRS);
        registerBlockAndItem("weeping_netherrack_slab", WEEPING_NETHERRACK_SLAB);
        registerBlockAndItem("weeping_netherrack_wall", WEEPING_NETHERRACK_WALL);
        registerBlockAndItem("snapdragon", SNAPDRAGON);
        registerBlockWithoutItem("potted_snapdragon", POTTED_SNAPDRAGON);
        registerBlockWithoutItem("potted_purple_mushroom", POTTED_PURPLE_MUSHROOM);
        registerBlockAndItem("ender_grass", ENDER_GRASS);
        registerBlockAndItem("icicle", ICICLE);
        registerBlockWithoutItem("cattail", CATTAIL);
        registerBlockAndItem("chocolate_cake", CHOCOLATE_CAKE);
        registerBlockAndItem("red_velvet_cake", RED_VELVET_CAKE);
        registerBlockAndItem("stone_tiles", STONE_TILES);
        registerBlockAndItem("stone_tile_slab", STONE_TILE_SLAB);
        registerBlockAndItem("stone_tile_stairs", STONE_TILE_STAIRS);
        registerBlockAndItem("stone_tile_wall", STONE_TILE_WALL);
        registerBlockAndItem("mossy_stone_tiles", MOSSY_STONE_TILES);
        registerBlockAndItem("mossy_stone_tile_slab", MOSSY_STONE_TILE_SLAB);
        registerBlockAndItem("mossy_stone_tile_stairs", MOSSY_STONE_TILE_STAIRS);
        registerBlockAndItem("mossy_stone_tile_wall", MOSSY_STONE_TILE_WALL);
        registerBlockAndItem("cracked_stone_tiles", CRACKED_STONE_TILES);
        registerBlockAndItem("cracked_stone_tile_slab", CRACKED_STONE_TILE_SLAB);
        registerBlockAndItem("cracked_stone_tile_stairs", CRACKED_STONE_TILE_STAIRS);
        registerBlockAndItem("cracked_stone_tile_wall", CRACKED_STONE_TILE_WALL);
        registerBlockAndItem("sweet_berry_pie", SWEET_BERRY_PIE);
        registerBlockAndItem("blueberry_pie", BLUEBERRY_PIE);
        registerBlockAndItem("blackstone_tiles", BLACKSTONE_TILES);
        registerBlockAndItem("blackstone_tile_stairs", BLACKSTONE_TILE_STAIRS);
        registerBlockAndItem("blackstone_tile_slab", BLACKSTONE_TILE_SLAB);
        registerBlockAndItem("blackstone_tile_wall", BLACKSTONE_TILE_WALL);
        registerBlockAndItem("twisted_blackstone_tiles", TWISTED_BLACKSTONE_TILES);
        registerBlockAndItem("twisted_blackstone_tile_stairs", TWISTED_BLACKSTONE_TILE_STAIRS);
        registerBlockAndItem("twisted_blackstone_tile_slab", TWISTED_BLACKSTONE_TILE_SLAB);
        registerBlockAndItem("twisted_blackstone_tile_wall", TWISTED_BLACKSTONE_TILE_WALL);
        registerBlockAndItem("weeping_blackstone_tiles", WEEPING_BLACKSTONE_TILES);
        registerBlockAndItem("weeping_blackstone_tile_stairs", WEEPING_BLACKSTONE_TILE_STAIRS);
        registerBlockAndItem("weeping_blackstone_tile_slab", WEEPING_BLACKSTONE_TILE_SLAB);
        registerBlockAndItem("weeping_blackstone_tile_wall", WEEPING_BLACKSTONE_TILE_WALL);
        registerBlockAndItem("twisted_polished_blackstone_bricks", TWISTED_POLISHED_BLACKSTONE_BRICKS);
        registerBlockAndItem("twisted_polished_blackstone_brick_stairs", TWISTED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        registerBlockAndItem("twisted_polished_blackstone_brick_slab", TWISTED_POLISHED_BLACKSTONE_BRICK_SLAB);
        registerBlockAndItem("twisted_polished_blackstone_brick_wall", TWISTED_POLISHED_BLACKSTONE_BRICK_WALL);
        registerBlockAndItem("weeping_polished_blackstone_bricks", WEEPING_POLISHED_BLACKSTONE_BRICKS);
        registerBlockAndItem("weeping_polished_blackstone_brick_stairs", WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS);
        registerBlockAndItem("weeping_polished_blackstone_brick_slab", WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB);
        registerBlockAndItem("weeping_polished_blackstone_brick_wall", WEEPING_POLISHED_BLACKSTONE_BRICK_WALL);
        registerBlockAndItem("twisted_blackstone", TWISTED_BLACKSTONE);
        registerBlockAndItem("twisted_blackstone_stairs", TWISTED_BLACKSTONE_STAIRS);
        registerBlockAndItem("twisted_blackstone_slab", TWISTED_BLACKSTONE_SLAB);
        registerBlockAndItem("twisted_blackstone_wall", TWISTED_BLACKSTONE_WALL);
        registerBlockAndItem("weeping_blackstone", WEEPING_BLACKSTONE);
        registerBlockAndItem("weeping_blackstone_stairs", WEEPING_BLACKSTONE_STAIRS);
        registerBlockAndItem("weeping_blackstone_slab", WEEPING_BLACKSTONE_SLAB);
        registerBlockAndItem("weeping_blackstone_wall", WEEPING_BLACKSTONE_WALL);
        registerBlockAndItem("quartz_tiles", QUARTZ_TILES);
        registerBlockAndItem("quartz_tile_stairs", QUARTZ_TILE_STAIRS);
        registerBlockAndItem("quartz_tile_slab", QUARTZ_TILE_SLAB);
        registerBlockAndItem("quartz_tile_wall", QUARTZ_TILE_WALL);
        registerBlockAndItem("polished_calcite", POLISHED_CALCITE);
        registerBlockAndItem("polished_calcite_stairs", POLISHED_CALCITE_STAIRS);
        registerBlockAndItem("polished_calcite_slab", POLISHED_CALCITE_SLAB);
        registerBlockAndItem("polished_calcite_wall", POLISHED_CALCITE_WALL);
        registerBlockAndItem("calcite_bricks", CALCITE_BRICKS);
        registerBlockAndItem("calcite_brick_stairs", CALCITE_BRICK_STAIRS);
        registerBlockAndItem("calcite_brick_slab", CALCITE_BRICK_SLAB);
        registerBlockAndItem("calcite_brick_wall", CALCITE_BRICK_WALL);
        registerBlockAndItem("cracked_calcite_bricks", CRACKED_CALCITE_BRICKS);
        registerBlockAndItem("cracked_calcite_brick_stairs", CRACKED_CALCITE_BRICK_STAIRS);
        registerBlockAndItem("cracked_calcite_brick_slab", CRACKED_CALCITE_BRICK_SLAB);
        registerBlockAndItem("cracked_calcite_brick_wall", CRACKED_CALCITE_BRICK_WALL);
        registerBlockAndItem("chiseled_calcite_bricks", CHISELED_CALCITE_BRICKS);
        registerBlockAndItem("polished_tuff", POLISHED_TUFF);
        registerBlockAndItem("polished_tuff_stairs", POLISHED_TUFF_STAIRS);
        registerBlockAndItem("polished_tuff_slab", POLISHED_TUFF_SLAB);
        registerBlockAndItem("polished_tuff_wall", POLISHED_TUFF_WALL);
        registerBlockAndItem("tuff_bricks", TUFF_BRICKS);
        registerBlockAndItem("tuff_brick_stairs", TUFF_BRICK_STAIRS);
        registerBlockAndItem("tuff_brick_slab", TUFF_BRICK_SLAB);
        registerBlockAndItem("tuff_brick_wall", TUFF_BRICK_WALL);
        registerBlockAndItem("mossy_tuff_bricks", MOSSY_TUFF_BRICKS);
        registerBlockAndItem("mossy_tuff_brick_stairs", MOSSY_TUFF_BRICK_STAIRS);
        registerBlockAndItem("mossy_tuff_brick_slab", MOSSY_TUFF_BRICK_SLAB);
        registerBlockAndItem("mossy_tuff_brick_wall", MOSSY_TUFF_BRICK_WALL);
        registerBlockAndItem("cracked_tuff_bricks", CRACKED_TUFF_BRICKS);
        registerBlockAndItem("cracked_tuff_brick_stairs", CRACKED_TUFF_BRICK_STAIRS);
        registerBlockAndItem("cracked_tuff_brick_slab", CRACKED_TUFF_BRICK_SLAB);
        registerBlockAndItem("cracked_tuff_brick_wall", CRACKED_TUFF_BRICK_WALL);
        registerBlockAndItem("chiseled_tuff_bricks", CHISELED_TUFF_BRICKS);
        registerBlockAndItem("polished_dripstone_block", POLISHED_DRIPSTONE_BLOCK);
        registerBlockAndItem("polished_dripstone_stairs", POLISHED_DRIPSTONE_STAIRS);
        registerBlockAndItem("polished_dripstone_slab", POLISHED_DRIPSTONE_SLAB);
        registerBlockAndItem("polished_dripstone_wall", POLISHED_DRIPSTONE_WALL);
        registerBlockAndItem("dripstone_bricks", DRIPSTONE_BRICKS);
        registerBlockAndItem("dripstone_brick_stairs", DRIPSTONE_BRICK_STAIRS);
        registerBlockAndItem("dripstone_brick_slab", DRIPSTONE_BRICK_SLAB);
        registerBlockAndItem("dripstone_brick_wall", DRIPSTONE_BRICK_WALL);
        registerBlockAndItem("mossy_dripstone_bricks", MOSSY_DRIPSTONE_BRICKS);
        registerBlockAndItem("mossy_dripstone_brick_stairs", MOSSY_DRIPSTONE_BRICK_STAIRS);
        registerBlockAndItem("mossy_dripstone_brick_slab", MOSSY_DRIPSTONE_BRICK_SLAB);
        registerBlockAndItem("mossy_dripstone_brick_wall", MOSSY_DRIPSTONE_BRICK_WALL);
        registerBlockAndItem("cracked_dripstone_bricks", CRACKED_DRIPSTONE_BRICKS);
        registerBlockAndItem("cracked_dripstone_brick_stairs", CRACKED_DRIPSTONE_BRICK_STAIRS);
        registerBlockAndItem("cracked_dripstone_brick_slab", CRACKED_DRIPSTONE_BRICK_SLAB);
        registerBlockAndItem("cracked_dripstone_brick_wall", CRACKED_DRIPSTONE_BRICK_WALL);
        registerBlockAndItem("chiseled_dripstone_bricks", CHISELED_DRIPSTONE_BRICKS);
        registerBlockAndItem("spectral_onyx", SPECTRAL_ONYX);
        registerBlockAndItem("spectral_onyx_stairs", SPECTRAL_ONYX_STAIRS);
        registerBlockAndItem("spectral_onyx_slab", SPECTRAL_ONYX_SLAB);
        registerBlockAndItem("spectral_onyx_wall", SPECTRAL_ONYX_WALL);
        registerBlockAndItem("cobbled_spectral_onyx", COBBLED_SPECTRAL_ONYX);
        registerBlockAndItem("cobbled_spectral_onyx_stairs", COBBLED_SPECTRAL_ONYX_STAIRS);
        registerBlockAndItem("cobbled_spectral_onyx_slab", COBBLED_SPECTRAL_ONYX_SLAB);
        registerBlockAndItem("cobbled_spectral_onyx_wall", COBBLED_SPECTRAL_ONYX_WALL);
        registerBlockAndItem("spectral_onyx_bricks", SPECTRAL_ONYX_BRICKS);
        registerBlockAndItem("spectral_onyx_brick_stairs", SPECTRAL_ONYX_BRICK_STAIRS);
        registerBlockAndItem("spectral_onyx_brick_slab", SPECTRAL_ONYX_BRICK_SLAB);
        registerBlockAndItem("spectral_onyx_brick_wall", SPECTRAL_ONYX_BRICK_WALL);
        registerBlockWithoutItem("blood_kelp", BLOOD_KELP);
        registerBlockWithoutItem("blood_kelp_plant", BLOOD_KELP_PLANT);
        registerBlockAndItem("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBlockAndItem("warped_bookshelf", WARPED_BOOKSHELF);

        AssortedDiscoveries.LOGGER.info("Registered blocks");
    }
}
