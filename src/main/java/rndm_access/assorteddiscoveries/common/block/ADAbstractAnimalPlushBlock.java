package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public abstract class ADAbstractAnimalPlushBlock extends ADAbstractDirectionalPlushBlock {
    protected ADAbstractAnimalPlushBlock(Settings settings) {
        super(settings);
    }

    /**
     * Use the methods provided by this class to get specific parts of the plush outline shape.
     */
    @Deprecated
    @Override
    public VoxelShape getNorthOutlineShape() {
        return VoxelShapes.union(
                this.getNorthOutlineTorsoShape(),
                this.getNorthOutlineHeadShape(),
                this.getNorthOutlineLegShape(),
                this.getNorthOutlineEyeShape(),
                this.getNorthOutlineMouthShape(),
                this.getNorthOutlineEarShape(),
                this.getNorthOutlineTailShape(),
                this.getNorthOutlineArmShape());
    }

    protected abstract VoxelShape getNorthOutlineTorsoShape();
    protected abstract VoxelShape getNorthOutlineHeadShape();
    protected abstract VoxelShape getNorthOutlineLegShape();
    protected abstract VoxelShape getNorthOutlineEyeShape();
    protected abstract VoxelShape getNorthOutlineMouthShape();
    protected abstract VoxelShape getNorthOutlineEarShape();
    protected abstract VoxelShape getNorthOutlineTailShape();
    protected abstract VoxelShape getNorthOutlineArmShape();
}
