package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADSquidPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape BODY_SHAPE = Block.box(4.0D, 5.0D, 4.0D, 12.0D, 15.0D, 12.0D);
    protected static final VoxelShape MOUTH_SHAPE = Block.box(6.0D, 4.5D, 6.0D, 10.0D, 5.0D, 10.0D);
    protected static final VoxelShape LEG1_SHAPE = Block.box(10.5D, 0.0D, 10.5D, 11.5D, 5.0D, 11.5D);
    protected static final VoxelShape LEG2_SHAPE = Block.box(10.5D, 0.0D, 8.5D, 11.5D, 5.0D, 9.5D);
    protected static final VoxelShape LEG3_SHAPE = Block.box(10.5D, 0.0D, 6.5D, 11.5D, 5.0D, 7.5D);
    protected static final VoxelShape LEG4_SHAPE = Block.box(10.5D, 0.0D, 4.5D, 11.5D, 5.0D, 5.5D);
    protected static final VoxelShape LEG5_SHAPE = Block.box(8.5D, 0.0D, 4.5D, 9.5D, 5.0D, 5.5D);
    protected static final VoxelShape LEG6_SHAPE = Block.box(6.5D, 0.0D, 4.5D, 7.5D, 5.0D, 5.5D);
    protected static final VoxelShape LEG7_SHAPE = Block.box(4.5D, 0.0D, 4.5D, 5.5D, 5.0D, 5.5D);
    protected static final VoxelShape LEG8_SHAPE = Block.box(4.5D, 0.0D, 6.5D, 5.5D, 5.0D, 7.5D);
    protected static final VoxelShape LEG9_SHAPE = Block.box(4.5D, 0.0D, 8.5D, 5.5D, 5.0D, 9.5D);
    protected static final VoxelShape LEG10_SHAPE = Block.box(4.5D, 0.0D, 10.5D, 5.5D, 5.0D, 11.5D);
    protected static final VoxelShape LEG11_SHAPE = Block.box(6.5D, 0.0D, 10.5D, 7.5D, 5.0D, 11.5D);
    protected static final VoxelShape LEG12_SHAPE = Block.box(8.5D, 0.0D, 10.5D, 9.5D, 5.0D, 11.5D);
    protected static final VoxelShape TOOTH1_SHAPE = Block.box(9.0D, 4.0D, 9.0D, 10.0D, 4.5D, 10.0D);
    protected static final VoxelShape TOOTH2_SHAPE = Block.box(7.5D, 4.0D, 9.0D, 8.5D, 4.5D, 10.0D);
    protected static final VoxelShape TOOTH3_SHAPE = Block.box(6.0D, 4.0D, 9.0D, 7.0D, 4.5D, 10.0D);
    protected static final VoxelShape TOOTH4_SHAPE = Block.box(6.0D, 4.0D, 7.5D, 7.0D, 4.5D, 8.5D);
    protected static final VoxelShape TOOTH5_SHAPE = Block.box(6.0D, 4.0D, 6.0D, 7.0D, 4.5D, 7.0D);
    protected static final VoxelShape TOOTH6_SHAPE = Block.box(7.5D, 4.0D, 6.0D, 8.5D, 4.5D, 7.0D);
    protected static final VoxelShape TOOTH7_SHAPE = Block.box(9.0D, 4.0D, 6.0D, 10.0D, 4.5D, 7.0D);
    protected static final VoxelShape TOOTH8_SHAPE = Block.box(9.0D, 4.0D, 7.5D, 10.0D, 4.5D, 8.5D);
    protected static final VoxelShape NORTH_RIGHT_EYE_SHAPE = Block.box(9.5D, 10.0D, 3.5D, 11.5D, 12.0D, 4.0D);
    protected static final VoxelShape NORTH_LEFT_EYE_SHAPE = Block.box(4.5D, 10.0D, 3.5D, 6.5D, 12.0D, 4.0D);
    protected static final VoxelShape LEGS_SHAPE = Shapes.or(LEG1_SHAPE, LEG2_SHAPE, LEG3_SHAPE, LEG4_SHAPE, LEG5_SHAPE,
            LEG6_SHAPE, LEG7_SHAPE, LEG8_SHAPE, LEG9_SHAPE, LEG10_SHAPE, LEG11_SHAPE, LEG12_SHAPE);
    protected static final VoxelShape TEETH_SHAPE = Shapes.or(TOOTH1_SHAPE, TOOTH2_SHAPE, TOOTH3_SHAPE, TOOTH4_SHAPE,
            TOOTH5_SHAPE, TOOTH6_SHAPE, TOOTH7_SHAPE, TOOTH8_SHAPE);
    protected static final VoxelShape NORTH_EYES_SHAPE = Shapes.or(NORTH_RIGHT_EYE_SHAPE, NORTH_LEFT_EYE_SHAPE);
    protected static final VoxelShape NORTH_SHAPE = Shapes.or(BODY_SHAPE, MOUTH_SHAPE, LEGS_SHAPE, TEETH_SHAPE,
            NORTH_EYES_SHAPE);
    protected static final VoxelShape SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);

    public ADSquidPlushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return getDirectionalShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
