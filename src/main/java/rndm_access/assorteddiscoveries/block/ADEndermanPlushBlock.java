package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADEndermanPlushBlock extends ADPlushBlock {
    protected static final VoxelShape NORTH_HEAD_SHAPE = Block.box(5.5D, 12.0D, 7.0D, 10.5D, 16.0D, 12.0D);
    protected static final VoxelShape NORTH_TORSO_SHAPE = Block.box(6.0D, 7.5D, 7.5D, 10.0D, 12.0D, 11.5D);
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE = Block.box(8.5D, 14.5D, 6.5D, 10.0D, 15.0D, 7.0D);
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE = Block.box(6.0D, 14.5D, 6.5D, 7.5D, 15.0D, 7.0D);
    protected static final VoxelShape NORTH_RIGHT_LEG_SHAPE = Block.box(8.5D, 0.0D, 9.0D, 9.5D, 7.5D, 10.0D);
    protected static final VoxelShape NORTH_LEFT_LEG_SHAPE = Block.box(6.5D, 0.0D, 9.0D, 7.5D, 7.5D, 10.0D);
    protected static final VoxelShape NORTH_RIGHT_ARM1_SHAPE = Block.box(10.0D, 9.5D, 7.0D, 11.0D, 11.5D, 8.0D);
    protected static final VoxelShape NORTH_RIGHT_ARM2_SHAPE = Block.box(9.0D, 7.5D, 7.0D, 10.0D, 10.5D, 8.0D);
    protected static final VoxelShape NORTH_MIDDLE_ARM_SHAPE = Block.box(7.0D, 4.5D, 7.0D, 9.0D, 8.5D, 8.0D);
    protected static final VoxelShape NORTH_LEFT_ARM1_SHAPE = Block.box(5.0D, 9.5D, 7.0D, 6.0D, 11.5D, 8.0D);
    protected static final VoxelShape NORTH_LEFT_ARM2_SHAPE = Block.box(6.0D, 7.5D, 7.0D, 7.0D, 10.5D, 8.0D);
    protected static final VoxelShape NORTH_GRASS_BLOCK_SHAPE = Block.box(6.5D, 5.0D, 4.0D, 9.5D, 8.0D, 7.0D);
    protected static final VoxelShape NORTH_BODY_SHAPE = Shapes.or(NORTH_HEAD_SHAPE, NORTH_TORSO_SHAPE);
    protected static final VoxelShape NORTH_EYES_SHAPE = Shapes.or(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
    protected static final VoxelShape NORTH_LEGS_SHAPE = Shapes.or(NORTH_RIGHT_LEG_SHAPE, NORTH_LEFT_LEG_SHAPE);
    protected static final VoxelShape NORTH_ARMS_SHAPE = Shapes.or(NORTH_RIGHT_ARM1_SHAPE, NORTH_RIGHT_ARM2_SHAPE,
            NORTH_MIDDLE_ARM_SHAPE, NORTH_LEFT_ARM1_SHAPE, NORTH_LEFT_ARM2_SHAPE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(NORTH_BODY_SHAPE, NORTH_EYES_SHAPE, NORTH_LEGS_SHAPE,
            NORTH_ARMS_SHAPE, NORTH_GRASS_BLOCK_SHAPE);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADEndermanPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
