package rndm_access.assorteddiscoveries.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.core.*;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOceanConfiguredFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADOreConfiguredFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADTreeConfiguredFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.configured_feature.ADVegetationConfiguredFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADOceanPlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADOrePlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADTreePlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADVegetationPlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key.ADOceanPlacedFeatureKeys;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key.ADOrePlacedFeatureKeys;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key.ADTreePlacedFeatureKeys;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature_key.ADVegetationPlacedFeatureKeys;

public class AssortedDiscoveries implements ModInitializer {
	public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(ADReference.makeId("mod_group"), () -> new ItemStack(ADItems.CATTAIL));
	public static final Logger LOGGER = LoggerFactory.getLogger(ADReference.MOD_ID);

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

		// Entity Registries
		ADVillagerTypes.registerVillagerTypes();
		ADPoiTypes.registerPointOfInterestTypes();
		ADVillagerProfessions.registerVillagerProfessions();
		ADVillagerOffers.registerVillagerTradeOffers();

		// World Generation Registries
		ADFeature.registerFeatures();
		ADStructureFeatures.registerStructureFeatures();
		ADOceanConfiguredFeatures.registerOceanConfiguredFeatures();
		ADOreConfiguredFeatures.registerOreConfiguredFeatures();
		ADTreeConfiguredFeatures.registerTreeConfiguredFeatures();
		ADVegetationConfiguredFeatures.registerVegetationConfiguredFeatures();
		ADOceanPlacedFeatures.registerOceanPlacedFeatures();
		ADOrePlacedFeatures.registerOrePlacedFeatures();
		ADTreePlacedFeatures.registerTreePlacedFeatures();
		ADVegetationPlacedFeatures.registerVegetationPlacedFeatures();
		addFeaturesToBiomes();
	}

	private static void addFeaturesToBiomes() {
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.CATTAIL_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADOceanPlacedFeatureKeys.CATTAIL_PATCH);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.ORE_SMOKY_QUARTZ),
				GenerationStep.Feature.UNDERGROUND_ORES, ADOrePlacedFeatureKeys.ORE_SMOKY_QUARTZ);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.HUGE_PURPLE_MUSHROOM),
				GenerationStep.Feature.VEGETAL_DECORATION, ADTreePlacedFeatureKeys.HUGE_PURPLE_MUSHROOM_VEGETATION);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.BLUEBERRY_BUSH_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADVegetationPlacedFeatureKeys.PATCH_BLUEBERRY_COMMON);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.BLUEBERRY_BUSH_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADVegetationPlacedFeatureKeys.PATCH_BLUEBERRY_RARE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.WITCHS_CRADLE_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADVegetationPlacedFeatureKeys.PATCH_WITCHS_CRADLE_COMMON);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.WITCHS_CRADLE_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, ADVegetationPlacedFeatureKeys.PATCH_WITCHS_CRADLE_RARE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.SNAPDRAGON_AND_ENDER_GRASS),
				GenerationStep.Feature.VEGETAL_DECORATION, ADVegetationPlacedFeatureKeys.SNAPDRAGON_AND_ENDER_GRASS);
	}
}
