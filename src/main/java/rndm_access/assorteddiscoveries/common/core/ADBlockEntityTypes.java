package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.entity.ADDyedCampfireBlockEntity;

public class ADBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<BlockEntityType<ADDyedCampfireBlockEntity>> DYED_CAMPFIRE = TILE_ENTITIES
            .register("dyed_campfire", () -> {
                return BlockEntityType.Builder.of(ADDyedCampfireBlockEntity::new, ADBlocks.WHITE_CAMPFIRE.get(),
                        ADBlocks.ORANGE_CAMPFIRE.get(), ADBlocks.MAGENTA_CAMPFIRE.get(),
                        ADBlocks.LIGHT_BLUE_CAMPFIRE.get(), ADBlocks.YELLOW_CAMPFIRE.get(),
                        ADBlocks.LIME_CAMPFIRE.get(), ADBlocks.PINK_CAMPFIRE.get(), ADBlocks.GRAY_CAMPFIRE.get(),
                        ADBlocks.LIGHT_GRAY_CAMPFIRE.get(), ADBlocks.CYAN_CAMPFIRE.get(),
                        ADBlocks.PURPLE_CAMPFIRE.get(), ADBlocks.BLUE_CAMPFIRE.get(), ADBlocks.BROWN_CAMPFIRE.get(),
                        ADBlocks.GREEN_CAMPFIRE.get(), ADBlocks.RED_CAMPFIRE.get(), ADBlocks.BLACK_CAMPFIRE.get())
                        .build(null);
            });
}
