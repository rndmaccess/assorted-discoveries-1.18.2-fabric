package rndm_access.assorteddiscoveries.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.particle.LavaEmberParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.client.particle.ADBloodKelpSporeParticle;
import rndm_access.assorteddiscoveries.common.core.ADParticleTypes;

public class AssortedDiscoveriesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerParticleSprites();
        registerParticleFactories();
    }

    private void registerParticleSprites() {
        registerParticleSprite("white_spark");
        registerParticleSprite("orange_spark");
        registerParticleSprite("magenta_spark");
        registerParticleSprite("light_blue_spark");
        registerParticleSprite("yellow_spark");
        registerParticleSprite("lime_spark");
        registerParticleSprite("pink_spark");
        registerParticleSprite("gray_spark");
        registerParticleSprite("light_gray_spark");
        registerParticleSprite("cyan_spark");
        registerParticleSprite("purple_spark");
        registerParticleSprite("blue_spark");
        registerParticleSprite("brown_spark");
        registerParticleSprite("green_spark");
        registerParticleSprite("red_spark");
        registerParticleSprite("black_spark");
        registerParticleSprite("white_flame");
        registerParticleSprite("orange_flame");
        registerParticleSprite("magenta_flame");
        registerParticleSprite("light_blue_flame");
        registerParticleSprite("yellow_flame");
        registerParticleSprite("lime_flame");
        registerParticleSprite("pink_flame");
        registerParticleSprite("gray_flame");
        registerParticleSprite("light_gray_flame");
        registerParticleSprite("cyan_flame");
        registerParticleSprite("purple_flame");
        registerParticleSprite("blue_flame");
        registerParticleSprite("brown_flame");
        registerParticleSprite("green_flame");
        registerParticleSprite("red_flame");
        registerParticleSprite("black_flame");
        registerParticleSprite("blood_kelp_spore");
    }

    private void registerParticleSprite(String id) {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier(Reference.MOD_ID, "particle/" + id));
        }));
    }

    private void registerParticleFactories() {
        ParticleFactoryRegistry factoryRegistry = ParticleFactoryRegistry.getInstance();

        factoryRegistry.register(ADParticleTypes.WHITE_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.ORANGE_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.MAGENTA_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIGHT_BLUE_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.YELLOW_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIME_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.PINK_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.GRAY_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIGHT_GRAY_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.CYAN_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.PURPLE_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BLUE_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BROWN_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.GREEN_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.RED_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BLACK_SPARK, LavaEmberParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.WHITE_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.ORANGE_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.MAGENTA_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIGHT_BLUE_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.YELLOW_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIME_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.PINK_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.GRAY_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.LIGHT_GRAY_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.CYAN_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.PURPLE_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BLUE_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BROWN_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.GREEN_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.RED_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BLACK_FLAME, FlameParticle.Factory::new);
        factoryRegistry.register(ADParticleTypes.BLOOD_KELP_SPORE, ADBloodKelpSporeParticle.Factory::new);
    }
}
