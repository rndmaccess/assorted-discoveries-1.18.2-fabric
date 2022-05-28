package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADZombieVillagerPlushBlock extends ADDirectionalPlushBlock {
    protected static final VoxelShape NORTH_SHAPE;

    public ADZombieVillagerPlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    public ADZombieVillagerPlushBlock(AbstractBlock.Settings settings, VoxelShape northShape) {
        super(settings, northShape);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addVillagerFootShapes()
                .addVillagerHeadShape().addVillagerNoseShape().addVillagerTorsoShape()
                .addVillagerEyeShapes().addZombieVillagerArmShapes().build();
    }
}
