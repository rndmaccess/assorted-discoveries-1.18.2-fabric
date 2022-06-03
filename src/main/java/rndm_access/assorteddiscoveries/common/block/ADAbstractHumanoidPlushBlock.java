package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public abstract class ADAbstractHumanoidPlushBlock extends ADAbstractDirectionalPlushBlock {
    protected ADAbstractHumanoidPlushBlock(Settings settings) {
        super(settings);
    }

    /**
     * Use the methods provided by this class to get specific parts of the plush outline shape.
     */
    @Deprecated
    @Override
    public VoxelShape getNorthOutlineShape() {
        return VoxelShapes.union(
                this.getNorthNoseOutlineShape(),
                this.getNorthLegOutlineShape(),
                this.getNorthHeadOutlineShape(),
                this.getNorthTorsoOutlineShape(),
                this.getNorthEyeOutlineShape(),
                this.getNorthClothingOutlineShape(),
                this.getNorthArmOutlineShape(),
                this.getNorthEarOutlineShape());
    }

    protected abstract VoxelShape getNorthNoseOutlineShape();
    protected abstract VoxelShape getNorthLegOutlineShape();
    protected abstract VoxelShape getNorthHeadOutlineShape();
    protected abstract VoxelShape getNorthTorsoOutlineShape();
    protected abstract VoxelShape getNorthEyeOutlineShape();
    protected abstract VoxelShape getNorthClothingOutlineShape();
    protected abstract VoxelShape getNorthArmOutlineShape();
    protected abstract VoxelShape getNorthEarOutlineShape();
}
