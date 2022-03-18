package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.core.ADEntityTypeTags;
import rndm_access.assorteddiscoveries.core.ADItems;

public class ADWitchsCradleBlock extends ADAbstractBerryBushBlock {
    private static final VoxelShape SMALL_SHAPE;

    public ADWitchsCradleBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Item berryItem() {
        return ADItems.WITCHS_CRADLE_BRANCH;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity.getType().isIn(ADEntityTypeTags.WITCHS_CRADLE_SLOWS_AND_DAMAGES)) { // Slime, Bee
            entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));

            if (!world.isClient && state.get(AGE) > 0 && (entity.lastRenderX != entity.getX() || entity.lastRenderZ != entity.getZ())) {
                double d = Math.abs(entity.getX() - entity.lastRenderX);
                double e = Math.abs(entity.getZ() - entity.lastRenderZ);

                if (d >= 0.003000000026077032D || e >= 0.003000000026077032D) {
                    entity.damage(DamageSource.SWEET_BERRY_BUSH, 1.0F);
                }
            }
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(AGE).equals(0)) {
            return SMALL_SHAPE;
        } else {
            return super.getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context);
        }
    }

    static {
        SMALL_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 9.0D, 14.0D);
    }
}
