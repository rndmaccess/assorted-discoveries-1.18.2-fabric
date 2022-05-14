package rndm_access.assorteddiscoveries.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
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
		ADEntityTypes.registerEntities();
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
		RegistryKey<PlacedFeature> cattailPatch = placedFeatureRegistryKey("cattail_patch");
		RegistryKey<PlacedFeature> oreSmokyQuartz = placedFeatureRegistryKey("ore_smoky_quartz");
		RegistryKey<PlacedFeature> hugePurpleMushroom = placedFeatureRegistryKey("huge_purple_mushroom_vegetation");
		RegistryKey<PlacedFeature> patchBlueberryCommon = placedFeatureRegistryKey("patch_blueberry_common");
		RegistryKey<PlacedFeature> patchBlueberryRare = placedFeatureRegistryKey("patch_blueberry_rare");
		RegistryKey<PlacedFeature> patchWitchsCradleCommon = placedFeatureRegistryKey("patch_witchs_cradle_common");
		RegistryKey<PlacedFeature> patchWitchsCradleRare = placedFeatureRegistryKey("patch_witchs_cradle_rare");
		RegistryKey<PlacedFeature> snapdragonAndEnderGrass = placedFeatureRegistryKey("snapdragon_and_ender_grass");

		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.CATTAIL_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, cattailPatch);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.ORE_SMOKY_QUARTZ),
				GenerationStep.Feature.UNDERGROUND_ORES, oreSmokyQuartz);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.HUGE_PURPLE_MUSHROOM),
				GenerationStep.Feature.VEGETAL_DECORATION, hugePurpleMushroom);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.BLUEBERRY_BUSH_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, patchBlueberryCommon);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.BLUEBERRY_BUSH_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, patchBlueberryRare);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.WITCHS_CRADLE_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, patchWitchsCradleCommon);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.WITCHS_CRADLE_PATCH),
				GenerationStep.Feature.VEGETAL_DECORATION, patchWitchsCradleRare);
		BiomeModifications.addFeature(BiomeSelectors.tag(ADBiomeTags.SNAPDRAGON_AND_ENDER_GRASS),
				GenerationStep.Feature.VEGETAL_DECORATION, snapdragonAndEnderGrass);
	}

	private static RegistryKey<PlacedFeature> placedFeatureRegistryKey(String path) {
		return RegistryKey.of(Registry.PLACED_FEATURE_KEY, ADReference.makeId(path));
	}
}
