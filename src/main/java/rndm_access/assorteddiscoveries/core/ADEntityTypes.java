package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.entity.hostile.ADCharredRemnant;

public class ADEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<EntityType<ADCharredRemnant>> CHARRED_REMNANT = register("charred_remnant",
            EntityType.Builder.of(ADCharredRemnant::new, MobCategory.MONSTER).fireImmune().sized(0.6F, 1.95F)
                    .clientTrackingRange(8));

    /**
     * Add this entity to the registry list.
     *
     * @param <C>           The type for the entity.
     * @param name          The name of the entity.
     * @param entityBuilder The builder for this entity.
     * @return The new entity.
     */
    private static <T extends Mob> RegistryObject<EntityType<T>> register(String name,
            EntityType.Builder<T> mobBuilder) {
        EntityType<T> mobType = mobBuilder.build(AssortedDiscoveries.makeModLocation(name).toString());

        return ENTITIES.register(name, () -> {
            return mobType;
        });
    }
}
