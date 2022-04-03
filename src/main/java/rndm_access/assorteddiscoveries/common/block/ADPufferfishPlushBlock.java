package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.common.block.state.ADProperties;
import rndm_access.assorteddiscoveries.common.util.ADShapeUtil;

public class ADPufferfishPlushBlock extends ADPlushBlock {
    public static final IntProperty PUFFED;

    protected static final VoxelShape SMALL_NORTH_BODY_SHAPE;
    protected static final VoxelShape SMALL_NORTH_MOUTH_SHAPE;
    protected static final VoxelShape SMALL_NORTH_RIGHT_FIN_SHAPE;
    protected static final VoxelShape SMALL_NORTH_LEFT_FIN_SHAPE;
    protected static final VoxelShape SMALL_NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape SMALL_NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape SMALL_NORTH_TAIL_MIDDLE_SHAPE;
    protected static final VoxelShape SMALL_NORTH_TAIL_RIGHT_SHAPE;
    protected static final VoxelShape SMALL_NORTH_TAIL_LEFT_SHAPE;
    protected static final VoxelShape SMALL_NORTH_FINS_SHAPE;
    protected static final VoxelShape SMALL_NORTH_EYES_SHAPE;
    protected static final VoxelShape SMALL_NORTH_TAIL_SHAPE;
    protected static final VoxelShape SMALL_NORTH_SHAPE;
    protected static final VoxelShape SMALL_SOUTH_SHAPE;
    protected static final VoxelShape SMALL_WEST_SHAPE;
    protected static final VoxelShape SMALL_EAST_SHAPE;

    protected static final VoxelShape MEDIUM_NORTH_BODY_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_RIGHT_FIN_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_LEFT_FIN_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_MOUTH_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_FINS_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_EYES_SHAPE;
    protected static final VoxelShape MEDIUM_NORTH_SHAPE;
    protected static final VoxelShape MEDIUM_SOUTH_SHAPE;
    protected static final VoxelShape MEDIUM_WEST_SHAPE;
    protected static final VoxelShape MEDIUM_EAST_SHAPE;

    protected static final VoxelShape LARGE_NORTH_BODY_SHAPE;
    protected static final VoxelShape LARGE_NORTH_RIGHT_FIN_SHAPE;
    protected static final VoxelShape LARGE_NORTH_LEFT_FIN_SHAPE;
    protected static final VoxelShape LARGE_NORTH_MOUTH_SHAPE;
    protected static final VoxelShape LARGE_NORTH_RIGHT_EYE_SHAPE;
    protected static final VoxelShape LARGE_NORTH_LEFT_EYE_SHAPE;
    protected static final VoxelShape LARGE_NORTH_FINS_SHAPE;
    protected static final VoxelShape LARGE_NORTH_EYES_SHAPE;
    protected static final VoxelShape LARGE_NORTH_SHAPE;
    protected static final VoxelShape LARGE_SOUTH_SHAPE;
    protected static final VoxelShape LARGE_WEST_SHAPE;
    protected static final VoxelShape LARGE_EAST_SHAPE;

    public ADPufferfishPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int puffed_level = state.get(PUFFED);

        if (puffed_level < 2) {
            world.playSound(null, pos, SoundEvents.ENTITY_PUFFER_FISH_BLOW_UP, SoundCategory.BLOCKS, 1.0F,
                    0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, state.with(PUFFED, puffed_level + 1), 3);
        } else {
            world.playSound(null, pos, SoundEvents.ENTITY_PUFFER_FISH_BLOW_OUT, SoundCategory.BLOCKS, 1.0F,
                    0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, state.with(PUFFED, 0), 3);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return getPuffedShapes(state, SMALL_NORTH_SHAPE, MEDIUM_NORTH_SHAPE, LARGE_NORTH_SHAPE);
            case SOUTH:
                return getPuffedShapes(state, SMALL_SOUTH_SHAPE, MEDIUM_SOUTH_SHAPE, LARGE_SOUTH_SHAPE);
            case WEST:
                return getPuffedShapes(state, SMALL_WEST_SHAPE, MEDIUM_WEST_SHAPE, LARGE_WEST_SHAPE);
            default:
                return getPuffedShapes(state, SMALL_EAST_SHAPE, MEDIUM_EAST_SHAPE, LARGE_EAST_SHAPE);
        }
    }

    /**
     * @param state      The current state that this block is in.
     * @param smallShape When the puff level is 0.
     * @param mediumShape When the puff level is 1.
     * @param largeShape When the puff level is 2.
     * @return The appropriate shape for the current state.
     */
    private static VoxelShape getPuffedShapes(BlockState state, VoxelShape smallShape, VoxelShape mediumShape, VoxelShape largeShape) {
        switch (state.get(PUFFED)) {
        case 0:
            return smallShape;
        case 1:
            return mediumShape;
        default:
            return largeShape;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PUFFED);
    }

    static {
        PUFFED = ADProperties.PUFFED;
        SMALL_NORTH_BODY_SHAPE = Block.createCuboidShape(5.0D, 0.0D, 3.0D, 11.0D, 4.0D, 11.0D);
        SMALL_NORTH_MOUTH_SHAPE = Block.createCuboidShape(7.0D, 2.0D, 2.5D, 9.0D, 3.0D, 3.0D);
        SMALL_NORTH_RIGHT_FIN_SHAPE = Block.createCuboidShape(4.0D, 1.0D, 3.0D, 5.0D, 2.0D, 8.0D);
        SMALL_NORTH_LEFT_FIN_SHAPE = Block.createCuboidShape(11.0D, 1.0D, 3.0D, 12.0D, 2.0D, 8.0D);
        SMALL_NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 4.0D, 3.0D, 6.5D, 5.5D, 4.5D);
        SMALL_NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.5D, 4.0D, 3.0D, 11.0D, 5.5D, 4.5D);
        SMALL_NORTH_TAIL_MIDDLE_SHAPE = Block.createCuboidShape(6.0D, 1.0D, 11.0D, 10.0D, 2.0D, 13.0D);
        SMALL_NORTH_TAIL_RIGHT_SHAPE = Block.createCuboidShape(6.0D, 1.0D, 13.0D, 7.0D, 2.0D, 14.0D);
        SMALL_NORTH_TAIL_LEFT_SHAPE = Block.createCuboidShape(9.0D, 1.0D, 13.0D, 10.0D, 2.0D, 14.0D);
        SMALL_NORTH_FINS_SHAPE = VoxelShapes.union(SMALL_NORTH_RIGHT_FIN_SHAPE, SMALL_NORTH_LEFT_FIN_SHAPE);
        SMALL_NORTH_EYES_SHAPE = VoxelShapes.union(SMALL_NORTH_RIGHT_EYE_SHAPE, SMALL_NORTH_LEFT_EYE_SHAPE);
        SMALL_NORTH_TAIL_SHAPE = VoxelShapes.union(SMALL_NORTH_TAIL_MIDDLE_SHAPE, SMALL_NORTH_TAIL_RIGHT_SHAPE,
                SMALL_NORTH_TAIL_LEFT_SHAPE);
        SMALL_NORTH_SHAPE = VoxelShapes.union(SMALL_NORTH_BODY_SHAPE,
                SMALL_NORTH_MOUTH_SHAPE, SMALL_NORTH_FINS_SHAPE, SMALL_NORTH_EYES_SHAPE,
                SMALL_NORTH_TAIL_SHAPE);
        SMALL_SOUTH_SHAPE = ADShapeUtil.rotate180Y(SMALL_NORTH_SHAPE);
        SMALL_WEST_SHAPE = ADShapeUtil.rotate270Y(SMALL_NORTH_SHAPE);
        SMALL_EAST_SHAPE = ADShapeUtil.rotate90Y(SMALL_NORTH_SHAPE);

        MEDIUM_NORTH_BODY_SHAPE = Block.createCuboidShape(4.0D, 0.0D, 3.0D, 12.0D, 8.0D, 11.0D);
        MEDIUM_NORTH_RIGHT_FIN_SHAPE = Block.createCuboidShape(2.0D, 5.0D, 4.0D, 4.0D, 6.0D, 9.0D);
        MEDIUM_NORTH_LEFT_FIN_SHAPE = Block.createCuboidShape(12.0D, 5.0D, 4.0D, 14.0D, 6.0D, 9.0D);
        MEDIUM_NORTH_MOUTH_SHAPE = Block.createCuboidShape(7.5D, 2.0D, 2.5D, 8.5D, 3.0D, 3.0D);
        MEDIUM_NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(5.0D, 4.0D, 2.5D, 6.5D, 5.5D, 3.0D);
        MEDIUM_NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.5D, 4.0D, 2.5D, 11.0D, 5.5D, 3.0D);
        MEDIUM_NORTH_FINS_SHAPE = VoxelShapes.union(MEDIUM_NORTH_RIGHT_FIN_SHAPE, MEDIUM_NORTH_LEFT_FIN_SHAPE);
        MEDIUM_NORTH_EYES_SHAPE = VoxelShapes.union(MEDIUM_NORTH_RIGHT_EYE_SHAPE, MEDIUM_NORTH_LEFT_EYE_SHAPE);
        MEDIUM_NORTH_SHAPE = VoxelShapes.union(MEDIUM_NORTH_BODY_SHAPE, MEDIUM_NORTH_MOUTH_SHAPE,
                MEDIUM_NORTH_FINS_SHAPE, MEDIUM_NORTH_EYES_SHAPE);
        MEDIUM_SOUTH_SHAPE = ADShapeUtil.rotate180Y(MEDIUM_NORTH_SHAPE);
        MEDIUM_WEST_SHAPE = ADShapeUtil.rotate270Y(MEDIUM_NORTH_SHAPE);
        MEDIUM_EAST_SHAPE = ADShapeUtil.rotate90Y(MEDIUM_NORTH_SHAPE);

        LARGE_NORTH_BODY_SHAPE = Block.createCuboidShape(3.0D, 0.0D, 2.0D, 13.0D, 9.0D, 12.0D);
        LARGE_NORTH_RIGHT_FIN_SHAPE = Block.createCuboidShape(1.0D, 6.0D, 4.0D, 3.0D, 7.0D, 9.0D);
        LARGE_NORTH_LEFT_FIN_SHAPE = Block.createCuboidShape(13.0D, 6.0D, 4.0D, 15.0D, 7.0D, 9.0D);
        LARGE_NORTH_MOUTH_SHAPE = Block.createCuboidShape(6.5D, 3.0D, 1.5D, 9.5D, 4.0D, 2.0D);
        LARGE_NORTH_RIGHT_EYE_SHAPE = Block.createCuboidShape(4.0D, 5.0D, 1.5D, 7.0D, 6.5D, 2.0D);
        LARGE_NORTH_LEFT_EYE_SHAPE = Block.createCuboidShape(9.0D, 5.0D, 1.5D, 12.0D, 6.5D, 2.0D);
        LARGE_NORTH_FINS_SHAPE = VoxelShapes.union(LARGE_NORTH_RIGHT_FIN_SHAPE, LARGE_NORTH_LEFT_FIN_SHAPE);
        LARGE_NORTH_EYES_SHAPE = VoxelShapes.union(LARGE_NORTH_RIGHT_EYE_SHAPE, LARGE_NORTH_LEFT_EYE_SHAPE);
        LARGE_NORTH_SHAPE = VoxelShapes.union(LARGE_NORTH_BODY_SHAPE, LARGE_NORTH_MOUTH_SHAPE,
                LARGE_NORTH_FINS_SHAPE, LARGE_NORTH_EYES_SHAPE);
        LARGE_SOUTH_SHAPE = ADShapeUtil.rotate180Y(LARGE_NORTH_SHAPE);
        LARGE_WEST_SHAPE = ADShapeUtil.rotate270Y(LARGE_NORTH_SHAPE);
        LARGE_EAST_SHAPE = ADShapeUtil.rotate90Y(LARGE_NORTH_SHAPE);
    }
}
