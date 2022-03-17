package rndm_access.assorteddiscoveries.core;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister
            .create(ForgeRegistries.PARTICLE_TYPES, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<SimpleParticleType> WHITE_SPARK = register("white_spark", false);
    public static final RegistryObject<SimpleParticleType> ORANGE_SPARK = register("orange_spark", false);
    public static final RegistryObject<SimpleParticleType> MAGENTA_SPARK = register("magenta_spark", false);
    public static final RegistryObject<SimpleParticleType> LIGHT_BLUE_SPARK = register("light_blue_spark", false);
    public static final RegistryObject<SimpleParticleType> YELLOW_SPARK = register("yellow_spark", false);
    public static final RegistryObject<SimpleParticleType> LIME_SPARK = register("lime_spark", false);
    public static final RegistryObject<SimpleParticleType> PINK_SPARK = register("pink_spark", false);
    public static final RegistryObject<SimpleParticleType> GRAY_SPARK = register("gray_spark", false);
    public static final RegistryObject<SimpleParticleType> LIGHT_GRAY_SPARK = register("light_gray_spark", false);
    public static final RegistryObject<SimpleParticleType> CYAN_SPARK = register("cyan_spark", false);
    public static final RegistryObject<SimpleParticleType> PURPLE_SPARK = register("purple_spark", false);
    public static final RegistryObject<SimpleParticleType> BLUE_SPARK = register("blue_spark", false);
    public static final RegistryObject<SimpleParticleType> BROWN_SPARK = register("brown_spark", false);
    public static final RegistryObject<SimpleParticleType> GREEN_SPARK = register("green_spark", false);
    public static final RegistryObject<SimpleParticleType> RED_SPARK = register("red_spark", false);
    public static final RegistryObject<SimpleParticleType> BLACK_SPARK = register("black_spark", false);
    public static final RegistryObject<SimpleParticleType> WHITE_FLAME = register("white_flame", false);
    public static final RegistryObject<SimpleParticleType> ORANGE_FLAME = register("orange_flame", false);
    public static final RegistryObject<SimpleParticleType> MAGENTA_FLAME = register("magenta_flame", false);
    public static final RegistryObject<SimpleParticleType> LIGHT_BLUE_FLAME = register("light_blue_flame", false);
    public static final RegistryObject<SimpleParticleType> YELLOW_FLAME = register("yellow_flame", false);
    public static final RegistryObject<SimpleParticleType> LIME_FLAME = register("lime_flame", false);
    public static final RegistryObject<SimpleParticleType> PINK_FLAME = register("pink_flame", false);
    public static final RegistryObject<SimpleParticleType> GRAY_FLAME = register("gray_flame", false);
    public static final RegistryObject<SimpleParticleType> LIGHT_GRAY_FLAME = register("light_gray_flame", false);
    public static final RegistryObject<SimpleParticleType> CYAN_FLAME = register("cyan_flame", false);
    public static final RegistryObject<SimpleParticleType> PURPLE_FLAME = register("purple_flame", false);
    public static final RegistryObject<SimpleParticleType> BLUE_FLAME = register("blue_flame", false);
    public static final RegistryObject<SimpleParticleType> BROWN_FLAME = register("brown_flame", false);
    public static final RegistryObject<SimpleParticleType> GREEN_FLAME = register("green_flame", false);
    public static final RegistryObject<SimpleParticleType> RED_FLAME = register("red_flame", false);
    public static final RegistryObject<SimpleParticleType> BLACK_FLAME = register("black_flame", false);
    public static final RegistryObject<SimpleParticleType> BLOOD_KELP_SPORE = register("blood_kelp_spore", false);

    /**
     * @param name       The name of this particle.
     * @param alwaysShow
     * @return The particle added.
     */
    private static RegistryObject<SimpleParticleType> register(String name, boolean alwaysShow) {
        SimpleParticleType particle = new SimpleParticleType(alwaysShow);

        return PARTICLES.register(name, () -> {
            return particle;
        });
    }
}