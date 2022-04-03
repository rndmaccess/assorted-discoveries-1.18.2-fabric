package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.worldgen.feature.ADCattailFeature;

public class ADFeature {

    public static final Feature<ProbabilityConfig> CATTAIL;

    private static <C extends FeatureConfig, F extends Feature<C>> F registerFeature(String id, F feature) {
        return Registry.register(Registry.FEATURE, new Identifier(Reference.MOD_ID, id), feature);
    }

    static {
        CATTAIL = registerFeature("cattail", new ADCattailFeature(ProbabilityConfig.CODEC));
    }
}
