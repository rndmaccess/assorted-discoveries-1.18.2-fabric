package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.levelgen.structure.ADCabinFeature;
import rndm_access.assorteddiscoveries.common.levelgen.structure.ADNetherCabinFeature;

public class ADStructureFeatures {
    public static final DeferredRegister<StructureFeature<?>> STRUCTURE_FEATURES = DeferredRegister
            .create(ForgeRegistries.STRUCTURE_FEATURES, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<StructureFeature<JigsawConfiguration>> CABIN = STRUCTURE_FEATURES
            .register("cabin", () -> {
                return new ADCabinFeature(JigsawConfiguration.CODEC);
            });
    public static final RegistryObject<StructureFeature<JigsawConfiguration>> NETHER_CABIN = STRUCTURE_FEATURES
            .register("nether_cabin", () -> {
                return new ADNetherCabinFeature(JigsawConfiguration.CODEC);
            });
}
