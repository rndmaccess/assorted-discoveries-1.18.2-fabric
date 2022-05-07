package rndm_access.assorteddiscoveries.common.core;

import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;

public class ADBlockTags {
    public static final Tag<Block> END_BONE_MEALABLE_BLOCKS;
    public static final Tag<Block> END_BONE_MEALABLE_PLANTS;
    public static final Tag<Block> OVERWORLD_PLANTER_BOXES;
    public static final Tag<Block> NETHER_PLANTER_BOXES;
    public static final Tag<Block> OVERWORLD_BOXABLE;
    public static final Tag<Block> NETHER_BOXABLE;
    public static final Tag<Block> CATTAIL_PLANTABLE_ON;
    public static final Tag<Block> SNAPDRAGON_PLANTABLE_ON;
    public static final Tag<Block> ENDER_GRASS_PLANTABLE_ON;
    public static final Tag<Block> BAMBOO_FENCES;

    /**
     * @param name The name of the tag.
     * @return The tag from the location or an empty tag if none exists.
     */
    private static Tag<Block> bind(String name) {
        return TagFactory.BLOCK.create(new Identifier(ADReference.MOD_ID, name));
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
