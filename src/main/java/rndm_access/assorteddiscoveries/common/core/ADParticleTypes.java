package rndm_access.assorteddiscoveries.common.core;

import com.sun.jdi.event.StepEvent;
import com.sun.jdi.request.StepRequest;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.PathNodeNavigator;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADParticleTypes {
    public static final DefaultParticleType WHITE_SPARK;
    public static final DefaultParticleType ORANGE_SPARK;
    public static final DefaultParticleType MAGENTA_SPARK;
    public static final DefaultParticleType LIGHT_BLUE_SPARK;
    public static final DefaultParticleType YELLOW_SPARK;
    public static final DefaultParticleType LIME_SPARK;
    public static final DefaultParticleType PINK_SPARK;
    public static final DefaultParticleType GRAY_SPARK;
    public static final DefaultParticleType LIGHT_GRAY_SPARK;
    public static final DefaultParticleType CYAN_SPARK;
    public static final DefaultParticleType PURPLE_SPARK;
    public static final DefaultParticleType BLUE_SPARK;
    public static final DefaultParticleType BROWN_SPARK;
    public static final DefaultParticleType GREEN_SPARK;
    public static final DefaultParticleType RED_SPARK;
    public static final DefaultParticleType BLACK_SPARK;
    public static final DefaultParticleType WHITE_FLAME;
    public static final DefaultParticleType ORANGE_FLAME;
    public static final DefaultParticleType MAGENTA_FLAME;
    public static final DefaultParticleType LIGHT_BLUE_FLAME;
    public static final DefaultParticleType YELLOW_FLAME;
    public static final DefaultParticleType LIME_FLAME;
    public static final DefaultParticleType PINK_FLAME;
    public static final DefaultParticleType GRAY_FLAME;
    public static final DefaultParticleType LIGHT_GRAY_FLAME;
    public static final DefaultParticleType CYAN_FLAME;
    public static final DefaultParticleType PURPLE_FLAME;
    public static final DefaultParticleType BLUE_FLAME;
    public static final DefaultParticleType BROWN_FLAME;
    public static final DefaultParticleType GREEN_FLAME;
    public static final DefaultParticleType RED_FLAME;
    public static final DefaultParticleType BLACK_FLAME;
    public static final DefaultParticleType BLOOD_KELP_SPORE;
    public static final DefaultParticleType WITCHS_CRADLE_SPORE;

    private static DefaultParticleType register(String path) {
        return Registry.register(Registry.PARTICLE_TYPE, ADReference.makeId(path), FabricParticleTypes.simple());
    }

    /**
     * Called during mod initialization to register every particle type.
     */
    public static void registerParticleTypes() {
        AssortedDiscoveries.LOGGER.info("Registered Particle Types");
    }

    static {
        WHITE_SPARK = register("white_spark");
        ORANGE_SPARK = register("orange_spark");
        MAGENTA_SPARK = register("magenta_spark");
        LIGHT_BLUE_SPARK = register("light_blue_spark");
        YELLOW_SPARK = register("yellow_spark");
        LIME_SPARK = register("lime_spark");
        PINK_SPARK = register("pink_spark");
        GRAY_SPARK = register("gray_spark");
        LIGHT_GRAY_SPARK = register("light_gray_spark");
        CYAN_SPARK = register("cyan_spark");
        PURPLE_SPARK = register("purple_spark");
        BLUE_SPARK = register("blue_spark");
        BROWN_SPARK = register("brown_spark");
        GREEN_SPARK = register("green_spark");
        RED_SPARK = register("red_spark");
        BLACK_SPARK = register("black_spark");
        WHITE_FLAME = register("white_flame");
        ORANGE_FLAME = register("orange_flame");
        MAGENTA_FLAME = register("magenta_flame");
        LIGHT_BLUE_FLAME = register("light_blue_flame");
        YELLOW_FLAME = register("yellow_flame");
        LIME_FLAME = register("lime_flame");
        PINK_FLAME = register("pink_flame");
        GRAY_FLAME = register("gray_flame");
        LIGHT_GRAY_FLAME = register("light_gray_flame");
        CYAN_FLAME = register("cyan_flame");
        PURPLE_FLAME = register("purple_flame");
        BLUE_FLAME = register("blue_flame");
        BROWN_FLAME = register("brown_flame");
        GREEN_FLAME = register("green_flame");
        RED_FLAME = register("red_flame");
        BLACK_FLAME = register("black_flame");
        BLOOD_KELP_SPORE = register("blood_kelp_spore");
        WITCHS_CRADLE_SPORE = register("witchs_cradle_spore");
    }
}