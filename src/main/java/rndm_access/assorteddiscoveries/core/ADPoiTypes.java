package rndm_access.assorteddiscoveries.core;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;

public class ADPoiTypes {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES,
            AssortedDiscoveries.MOD_ID);

    public static final RegistryObject<PoiType> LUMBERJACK = register("lumberjack", ADBlocks.WOODCUTTER, 1, 1);

    private static RegistryObject<PoiType> register(String name, RegistryObject<Block> blockObject, int maxTickets,
            int validRange) {
        String location = AssortedDiscoveries.makeModLocation(name).toString();

        return POI_TYPES.register(name, () -> {
            return new PoiType(location, PoiType.getBlockStates(blockObject.get()), maxTickets, validRange);
        });
    }
}