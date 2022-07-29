package rndm_access.assorteddiscoveries.common;

import dev.architectury.registry.fuel.FuelRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.core.*;

public class AssortedDiscoveries implements ModInitializer {
	public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(ADReference.makeId("mod_group"),
			() -> new ItemStack(ADItems.CALCITE_BRICKS));
	public static final Logger LOGGER = LoggerFactory.getLogger(ADReference.MOD_ID);
	private static final Identifier SPRUCE_LEAVES_LOOT_TABLE = Blocks.SPRUCE_LEAVES.getLootTableId();

	@Override
	public void onInitialize() {
		// General Registries
		ADBlocks.registerBlocks();
		ADItems.registerItems();
		ADBlockEntityTypes.registerBlockEntityTypes();
		ADParticleTypes.registerParticleTypes();
		ADScreenHandlerTypes.registerScreenHandlerTypes();
		ADRecipeTypes.registerRecipeTypes();
		ADRecipeSerializers.registerSerializers();
		ADPaintingTypes.registerPaintingMotives();
		ADSoundEvents.registerSoundEvents();
		AssortedDiscoveries.registerFuel();
		AssortedDiscoveries.modifyLootTables();

		// Entity Registries
		ADVillagerTypes.registerVillagerTypes();
		ADPointOfInterestTypes.registerPointOfInterestTypes();
		ADVillagerProfessions.registerVillagerProfessions();
		ADVillagerOffers.registerVillagerTradeOffers();

		// World Generation Registries
		ADFeature.registerFeatures();
		ADStructureFeatures.registerStructureFeatures();
		ADConfiguredFeatures.registerConfiguredFeatures();
		AssortedDiscoveries.addFeaturesToBiomes();
	}

	private static void addFeaturesToBiomes() {
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_CATTAIL),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_CATTAIL);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.ORE_SMOKY_QUARTZ),
				GenerationStep.Feature.UNDERGROUND_ORES, ADPlacedFeatureKeys.ORE_SMOKY_QUARTZ);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_HUGE_PURPLE_MUSHROOM),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_HUGE_PURPLE_MUSHROOM);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_BLUEBERRY_BUSH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_BLUEBERRY_COMMON);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_BLUEBERRY_BUSH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_BLUEBERRY_RARE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_WITCHS_CRADLE),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_WITCHS_CRADLE_COMMON);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_WITCHS_CRADLE),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_WITCHS_CRADLE_RARE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.PATCH_ENDER_PLANTS),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.PATCH_ENDER_PLANTS);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.BLOOD_KELP),
				GenerationStep.Feature.VEGETAL_DECORATION, ADPlacedFeatureKeys.BLOOD_KELP);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.ORE_BAUXITE),
				GenerationStep.Feature.UNDERGROUND_ORES, ADPlacedFeatureKeys.ORE_BAUXITE_LOWER);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.ORE_BAUXITE),
				GenerationStep.Feature.UNDERGROUND_ORES, ADPlacedFeatureKeys.ORE_BAUXITE_UPPER);
	}

	private static void registerFuel() {
		FuelRegistry.register(4000, ADItems.DRIED_BLOOD_KELP_BLOCK);
	}

	private static void modifyLootTables() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(source.isBuiltin() && SPRUCE_LEAVES_LOOT_TABLE.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.rolls(ConstantLootNumberProvider.create(1))
						.conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.02F, 0.023F, 0.025F, 0.035F, 0.1F))
						.with(ItemEntry.builder(ADItems.SPRUCE_CONE))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)));

				tableBuilder.pool(poolBuilder);
			}
		});
	}
}
