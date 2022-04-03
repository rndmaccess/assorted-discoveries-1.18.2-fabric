package rndm_access.assorteddiscoveries.common.core;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.entity.ADDyedCampfireBlockEntity;

public class ADBlockEntityTypes {
    public static final BlockEntityType<ADDyedCampfireBlockEntity> DYED_CAMPFIRE = FabricBlockEntityTypeBuilder.create(ADDyedCampfireBlockEntity::new,
            ADBlocks.WHITE_CAMPFIRE, ADBlocks.ORANGE_CAMPFIRE, ADBlocks.MAGENTA_CAMPFIRE,
            ADBlocks.LIGHT_BLUE_CAMPFIRE, ADBlocks.YELLOW_CAMPFIRE,
            ADBlocks.LIME_CAMPFIRE, ADBlocks.PINK_CAMPFIRE, ADBlocks.GRAY_CAMPFIRE,
            ADBlocks.LIGHT_GRAY_CAMPFIRE, ADBlocks.CYAN_CAMPFIRE,
            ADBlocks.PURPLE_CAMPFIRE, ADBlocks.BLUE_CAMPFIRE, ADBlocks.BROWN_CAMPFIRE,
            ADBlocks.GREEN_CAMPFIRE, ADBlocks.RED_CAMPFIRE, ADBlocks.BLACK_CAMPFIRE).build();

    private static <T extends BlockEntity> void registerBlockEntityType(String id, BlockEntityType<T> type) {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Reference.MOD_ID, id), type);
    }


    public static void registerBlockEntityTypes() {
        registerBlockEntityType("dyed_campfire", DYED_CAMPFIRE);

        AssortedDiscoveries.LOGGER.info("Registered block entity types");
    }
}
