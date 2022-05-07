package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.AssortedDiscoveries;

public class ADBlockTags {
    public static final TagKey<Block> END_BONE_MEALABLE_BLOCKS;
    public static final TagKey<Block> END_BONE_MEALABLE_PLANTS;
    public static final TagKey<Block> OVERWORLD_PLANTER_BOXES;
    public static final TagKey<Block> NETHER_PLANTER_BOXES;
    public static final TagKey<Block> OVERWORLD_BOXABLE;
    public static final TagKey<Block> NETHER_BOXABLE;
    public static final TagKey<Block> CATTAIL_PLANTABLE_ON;
    public static final TagKey<Block> SNAPDRAGON_PLANTABLE_ON;
    public static final TagKey<Block> ENDER_GRASS_PLANTABLE_ON;
    public static final TagKey<Block> BAMBOO_FENCES;

    /**
     * @param path The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static TagKey<Block> bind(String path) {
        return TagKey.of(Registry.BLOCK_KEY, ADReference.makeId(path));
    }

    static {
        END_BONE_MEALABLE_BLOCKS = bind("end_bone_mealable_blocks");
        END_BONE_MEALABLE_PLANTS = bind("end_bone_mealable_plants");
        OVERWORLD_PLANTER_BOXES = bind("overworld_planter_boxes");
        NETHER_PLANTER_BOXES = bind("nether_planter_boxes");
        OVERWORLD_BOXABLE = bind("overworld_boxable");
        NETHER_BOXABLE = bind("nether_boxable");
        CATTAIL_PLANTABLE_ON = bind("cattail_plantable_on");
        SNAPDRAGON_PLANTABLE_ON = bind("snapdragon_plantable_on");
        ENDER_GRASS_PLANTABLE_ON = bind("ender_grass_plantable_on");
        BAMBOO_FENCES = bind("bamboo_fences");
    }
}
