package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.entity.ADDyedCampfireBlockEntity;

public class ADBlockEntityTypes {
    public static final BlockEntityType<ADDyedCampfireBlockEntity> DYED_CAMPFIRE;

    private static <T extends BlockEntity> BlockEntityType<T> register(String path, BlockEntityType<T> type) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, ADReference.makeId(path), type);
    }

    /**
     * Called during mod initialization to register every block entity type.
     */
    public static void registerBlockEntityTypes() {
        AssortedDiscoveries.LOGGER.info("Registered block entity types");
    }

    static {
        DYED_CAMPFIRE = register("dyed_campfire", FabricBlockEntityTypeBuilder.create(ADDyedCampfireBlockEntity::new,
                ADBlocks.WHITE_CAMPFIRE, ADBlocks.ORANGE_CAMPFIRE, ADBlocks.MAGENTA_CAMPFIRE,
                ADBlocks.LIGHT_BLUE_CAMPFIRE, ADBlocks.YELLOW_CAMPFIRE,
                ADBlocks.LIME_CAMPFIRE, ADBlocks.PINK_CAMPFIRE, ADBlocks.GRAY_CAMPFIRE,
                ADBlocks.LIGHT_GRAY_CAMPFIRE, ADBlocks.CYAN_CAMPFIRE,
                ADBlocks.PURPLE_CAMPFIRE, ADBlocks.BLUE_CAMPFIRE, ADBlocks.BROWN_CAMPFIRE,
                ADBlocks.GREEN_CAMPFIRE, ADBlocks.RED_CAMPFIRE, ADBlocks.BLACK_CAMPFIRE).build());
    }
}
