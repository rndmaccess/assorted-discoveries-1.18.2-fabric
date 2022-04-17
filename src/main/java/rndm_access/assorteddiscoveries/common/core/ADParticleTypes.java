package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADParticleTypes {
    public static final DefaultParticleType WHITE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType ORANGE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType MAGENTA_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType LIGHT_BLUE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType YELLOW_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType LIME_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType PINK_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType GRAY_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType LIGHT_GRAY_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType CYAN_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType PURPLE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType BLUE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType BROWN_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType GREEN_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType BLACK_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType WHITE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType ORANGE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType MAGENTA_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType LIGHT_BLUE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType YELLOW_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType LIME_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType PINK_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType GRAY_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType LIGHT_GRAY_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType CYAN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType PURPLE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BLUE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BROWN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BLACK_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BLOOD_KELP_SPORE = FabricParticleTypes.simple();

    /**
     * @param name The name of this particles
     * @return The particle added.
     */
    private static <T extends ParticleEffect> void registerParticleType(String name, ParticleType<T> particle) {
        Registry.register(Registry.PARTICLE_TYPE, ADReference.makeId(name), particle);
    }

    /**
     * Called during mod initialization to register every particle type.
     */
    public static void registerParticleTypes() {
        registerParticleType("white_spark", WHITE_SPARK);
        registerParticleType("orange_spark", ORANGE_SPARK);
        registerParticleType("magenta_spark", MAGENTA_SPARK);
        registerParticleType("light_blue_spark", LIGHT_BLUE_SPARK);
        registerParticleType("yellow_spark", YELLOW_SPARK);
        registerParticleType("lime_spark", LIME_SPARK);
        registerParticleType("pink_spark", PINK_SPARK);
        registerParticleType("gray_spark", GRAY_SPARK);
        registerParticleType("light_gray_spark", LIGHT_GRAY_SPARK);
        registerParticleType("cyan_spark", CYAN_SPARK);
        registerParticleType("purple_spark", PURPLE_SPARK);
        registerParticleType("blue_spark", BLUE_SPARK);
        registerParticleType("brown_spark", BROWN_SPARK);
        registerParticleType("green_spark", GREEN_SPARK);
        registerParticleType("red_spark", RED_SPARK);
        registerParticleType("black_spark", BLACK_SPARK);
        registerParticleType("white_flame", WHITE_FLAME);
        registerParticleType("orange_flame", ORANGE_FLAME);
        registerParticleType("magenta_flame", MAGENTA_FLAME);
        registerParticleType("light_blue_flame", LIGHT_BLUE_FLAME);
        registerParticleType("yellow_flame", YELLOW_FLAME);
        registerParticleType("lime_flame", LIME_FLAME);
        registerParticleType("pink_flame", PINK_FLAME);
        registerParticleType("gray_flame", GRAY_FLAME);
        registerParticleType("light_gray_flame", LIGHT_GRAY_FLAME);
        registerParticleType("cyan_flame", CYAN_FLAME);
        registerParticleType("purple_flame", PURPLE_FLAME);
        registerParticleType("blue_flame", BLUE_FLAME);
        registerParticleType("brown_flame", BROWN_FLAME);
        registerParticleType("green_flame", GREEN_FLAME);
        registerParticleType("red_flame", RED_FLAME);
        registerParticleType("black_flame", BLACK_FLAME);
        registerParticleType("blood_kelp_spore", BLOOD_KELP_SPORE);

        AssortedDiscoveries.LOGGER.info("Registered Particle Types");
    }
}