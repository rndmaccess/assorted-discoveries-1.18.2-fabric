package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;

public class ADBlockTags {
    public static final TagKey<Block> END_BONE_MEALABLE_BLOCKS;
    public static final TagKey<Block> CATTAIL_PLANTABLE_ON;
    public static final TagKey<Block> SNAPDRAGON_PLANTABLE_ON;
    public static final TagKey<Block> ENDER_GRASS_PLANTABLE_ON;
    public static final TagKey<Block> BAMBOO_FENCES;
    public static final TagKey<Block> PLANTER_BOXES;
    public static final TagKey<Block> NETHER_PLANTER_BOXES;
    public static final TagKey<Block> DIRT_SLABS;

    /**
     * @param path The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static TagKey<Block> of(String path) {
        return TagKey.of(Registry.BLOCK_KEY, ADReference.makeId(path));
    }

    static {
        END_BONE_MEALABLE_BLOCKS = of("end_bone_mealable_blocks");
        CATTAIL_PLANTABLE_ON = of("cattail_plantable_on");
        SNAPDRAGON_PLANTABLE_ON = of("snapdragon_plantable_on");
        ENDER_GRASS_PLANTABLE_ON = of("ender_grass_plantable_on");
        BAMBOO_FENCES = of("bamboo_fences");
        PLANTER_BOXES = of("planter_boxes");
        NETHER_PLANTER_BOXES = of("nether_planter_boxes");
        DIRT_SLABS = of("dirt_slabs");
    }
}
