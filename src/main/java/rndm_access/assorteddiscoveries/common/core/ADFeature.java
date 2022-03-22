package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.levelgen.feature.ADCattailFeature;

public class ADFeature {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<ADCattailFeature> CATTAIL = FEATURES.register("cattail", () -> {
        return new ADCattailFeature(ProbabilityFeatureConfiguration.CODEC);
    });
}
