package rndm_access.assorteddiscoveries.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.core.*;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADOceanPlacedFeatures;
import rndm_access.assorteddiscoveries.common.worldgen.structure.ADStructureProcessorLists;

public class AssortedDiscoveries implements ModInitializer {
	public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(ADReference.makeId("mod_group"), () -> new ItemStack(ADBlocks.BAT_PLUSH));
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
		ADStructureProcessorLists.registerProcessorLists();
		ADStructureFeatures.registerStructureFeatures();
		ADConfiguredStructureFeatures.registerConfiguredStructureFeatures();
		addFeaturesToBiomes();
	}

	private static void addFeaturesToBiomes() {
		BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP),
				GenerationStep.Feature.TOP_LAYER_MODIFICATION, ADOceanPlacedFeatures.CATTAIL_SWAMP);
	}
}
