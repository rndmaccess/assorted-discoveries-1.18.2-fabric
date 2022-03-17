package rndm_access.assorteddiscoveries.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import rndm_access.assorteddiscoveries.util.ADBoxUtil;

public class ADCowPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_TORSO_SHAPE;
    protected static final VoxelShape NORTH_HEAD_SHAPE;
    protected static final VoxelShape NORTH_SNOUT_SHAPE;
    protected static final VoxelShape NORTH_UTTER_SHAPE;
    protected static final VoxelShape NORTH_BACK_LEFT_LEG_SHAPE;
    protected static final VoxelShape NORTH_BACK_RIGHT_LEG_SHAPE;
    protected static final VoxelShape NORTH_FRONT_RIGHT_LEG_SHAPE;
    protected static final VoxelShape NORTH_FRONT_LEFT_LEG_SHAPE;
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape NORTH_RIGHT_HORN_SHAPE;
    protected static final VoxelShape NORTH_LEFT_HORN_SHAPE;
    protected static final VoxelShape NORTH_LEGS_SHAPE;
    protected static final VoxelShape NORTH_EYES_SHAPE;
    protected static final VoxelShape NORTH_HORNS_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADCowPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getOutlineDirectionalShape(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }

    static {
        NORTH_TORSO_SHAPE = Block.createCuboidShape(3.5D, 2.0D, 6.0D, 12.5D, 8.0D, 14.5D);
        NORTH_HEAD_SHAPE = Block.createCuboidShape(4.0D, 5.5D, 3.0D, 12.0D, 13.0D, 10.5D);
        NORTH_SNOUT_SHAPE = Block.createCuboidShape(6.0D, 6.0D, 1.5D, 10.0D, 9.0D, 3.5D);
        NORTH_UTTER_SHAPE = Block.createCuboidShape(7.0D, 1.0D, 11.5D, 9.0D, 3.0D, 15.0D);
        NORTH_BACK_LEFT_LEG_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 12.5D, 12.5D, 2.0D, 14.5D);
        NORTH_BACK_RIGHT_LEG_SHAPE = Block.createCuboidShape(3.5D, 0.0D, 12.5D, 5.5D, 2.0D, 14.5D);
        NORTH_FRONT_RIGHT_LEG_SHAPE = Block.createCuboidShape(3.5D, 0.0D, 6.0D, 5.5D, 2.0D, 8.0D);
        NORTH_FRONT_LEFT_LEG_SHAPE = Block.createCuboidShape(10.5D, 0.0D, 6.0D, 12.5D, 2.0D, 8.0D);
        NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 9.5D, 2.5D, 11.0D, 11.5D, 3.0D);
        NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 9.5D, 2.5D, 7.0D, 11.5D, 3.0D);
        NORTH_RIGHT_HORN_SHAPE = Block.createCuboidShape(2.5D, 10.5D, 5.0D, 5.0D, 14.0D, 8.0D);
        NORTH_LEFT_HORN_SHAPE = Block.createCuboidShape(11.0D, 10.5D, 5.0D, 13.5D, 14.0D, 8.0D);
        NORTH_LEGS_SHAPE = VoxelShapes.union(NORTH_BACK_LEFT_LEG_SHAPE,
                NORTH_BACK_RIGHT_LEG_SHAPE, NORTH_FRONT_RIGHT_LEG_SHAPE, NORTH_FRONT_LEFT_LEG_SHAPE);
        NORTH_EYES_SHAPE = VoxelShapes.union(NORTH_LEFT_EYE_SHAPE, NORTH_RIGHT_EYE_SHAPE);
        NORTH_HORNS_SHAPE = VoxelShapes.union(NORTH_RIGHT_HORN_SHAPE, NORTH_LEFT_HORN_SHAPE);
        NORTH_SHAPE = VoxelShapes.union(NORTH_TORSO_SHAPE, NORTH_LEGS_SHAPE, NORTH_HEAD_SHAPE,
                NORTH_SNOUT_SHAPE, NORTH_EYES_SHAPE, NORTH_HORNS_SHAPE, NORTH_UTTER_SHAPE);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
