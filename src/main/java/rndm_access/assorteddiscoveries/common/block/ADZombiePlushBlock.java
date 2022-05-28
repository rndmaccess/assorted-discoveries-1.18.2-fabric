package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.util.ADPlushOutlineShapeBuilder;

public class ADZombiePlushBlock extends ADDirectionalPlushBlock {
    private static final VoxelShape NORTH_SHAPE;

    public ADZombiePlushBlock(AbstractBlock.Settings settings) {
        super(settings, NORTH_SHAPE);
    }

    static {
        NORTH_SHAPE = new ADPlushOutlineShapeBuilder().addHumanoidTorsoShape().addHumanoidLegShapes()
                .addHumanoidEyeShapes().addHumanoidHeadShape().addZombieArmShapes().build();
    }
}
