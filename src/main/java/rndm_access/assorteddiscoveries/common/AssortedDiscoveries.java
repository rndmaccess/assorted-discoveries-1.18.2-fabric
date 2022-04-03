package rndm_access.assorteddiscoveries.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.core.*;
import rndm_access.assorteddiscoveries.common.worldgen.placed_feature.ADOceanPlacedFeatures;

public class AssortedDiscoveries implements ModInitializer {
	public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(new Identifier(Reference.MOD_ID, "mod_group"), () -> new ItemStack(ADBlocks.BAT_PLUSH));
	public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);

	@Override
	public void onInitialize() {
		ADParticleTypes.registerParticles();
		ADBlocks.registerBlocks();
		ADItems.registerItems();
		ADBlockEntityTypes.registerBlockEntityTypes();

		addFeaturesToBiomes();

		LOGGER.info("Hello Fabric world!");
	}

	private static void addFeaturesToBiomes() {
		BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP),
				GenerationStep.Feature.TOP_LAYER_MODIFICATION, ADOceanPlacedFeatures.CATTAIL_SWAMP);
	}
}
