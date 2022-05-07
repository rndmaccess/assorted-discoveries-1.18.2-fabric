package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.entity.hostile.ADCharredRemnant;

public class ADEntityTypes {
    public static final EntityType<ADCharredRemnant> CHARRED_REMNANT;

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> type) {
        return Registry.register(Registry.ENTITY_TYPE, ADReference.makeId(name), type);
    }

    /**
     * Called during mod initialization to initialize every entity type and their attributes.
     */
    public static void registerEntities() {
        registerEntityAttributes();
        AssortedDiscoveries.LOGGER.info("Registered entities.");
    }

    private static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(ADEntityTypes.CHARRED_REMNANT, ZombieEntity.createZombieAttributes());
    }

    static {
        CHARRED_REMNANT = register("charred_remnant", FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ADCharredRemnant::new)
                .fireImmune().dimensions(EntityDimensions.fixed(0.6F, 1.95F)).trackRangeChunks(8).build());
    }
}
