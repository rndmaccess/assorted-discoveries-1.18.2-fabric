package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.block.state.ADBlockStateProperties;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADPufferfishPlushBlock extends ADAbstractPlushBlock {
    public static final IntegerProperty PUFFED = ADBlockStateProperties.PUFFED_2;

    // Pufferfish 0 Bounding Boxes
    protected static final VoxelShape PUFFERFISH_0_NORTH_BODY_SHAPE = Block.box(5.0D, 0.0D, 3.0D, 11.0D, 4.0D, 11.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_MOUTH_SHAPE = Block.box(7.0D, 2.0D, 2.5D, 9.0D, 3.0D, 3.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_RIGHT_FIN_SHAPE = Block.box(4.0D, 1.0D, 3.0D, 5.0D, 2.0D,
            8.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_LEFT_FIN_SHAPE = Block.box(11.0D, 1.0D, 3.0D, 12.0D, 2.0D,
            8.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_RIGHT_EYE_SHAPE = Block.box(5.0D, 4.0D, 3.0D, 6.5D, 5.5D,
            4.5D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_LEFT_EYE_SHAPE = Block.box(9.5D, 4.0D, 3.0D, 11.0D, 5.5D,
            4.5D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_TAIL_MIDDLE_SHAPE = Block.box(6.0D, 1.0D, 11.0D, 10.0D, 2.0D,
            13.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_TAIL_RIGHT_SHAPE = Block.box(6.0D, 1.0D, 13.0D, 7.0D, 2.0D,
            14.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_TAIL_LEFT_SHAPE = Block.box(9.0D, 1.0D, 13.0D, 10.0D, 2.0D,
            14.0D);
    protected static final VoxelShape PUFFERFISH_0_NORTH_FINS_SHAPE = Shapes.or(PUFFERFISH_0_NORTH_RIGHT_FIN_SHAPE,
            PUFFERFISH_0_NORTH_LEFT_FIN_SHAPE);
    protected static final VoxelShape PUFFERFISH_0_NORTH_EYES_SHAPE = Shapes.or(PUFFERFISH_0_NORTH_RIGHT_EYE_SHAPE,
            PUFFERFISH_0_NORTH_LEFT_EYE_SHAPE);
    protected static final VoxelShape PUFFERFISH_0_NORTH_TAIL_SHAPE = Shapes.or(PUFFERFISH_0_NORTH_TAIL_MIDDLE_SHAPE,
            PUFFERFISH_0_NORTH_TAIL_RIGHT_SHAPE, PUFFERFISH_0_NORTH_TAIL_LEFT_SHAPE);
    protected static final VoxelShape PUFFERFISH_0_NORTH_SHAPE = Shapes.or(PUFFERFISH_0_NORTH_BODY_SHAPE,
            PUFFERFISH_0_NORTH_MOUTH_SHAPE, PUFFERFISH_0_NORTH_FINS_SHAPE, PUFFERFISH_0_NORTH_EYES_SHAPE,
            PUFFERFISH_0_NORTH_TAIL_SHAPE);

    protected static final VoxelShape PUFFERFISH_0_SOUTH_SHAPE = ADBoxUtil.rotate180Y(PUFFERFISH_0_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_0_WEST_SHAPE = ADBoxUtil.rotate270Y(PUFFERFISH_0_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_0_EAST_SHAPE = ADBoxUtil.rotate90Y(PUFFERFISH_0_NORTH_SHAPE);

    // Pufferfish 1 Bounding Boxes
    protected static final VoxelShape PUFFERFISH_1_NORTH_BODY_SHAPE = Block.box(4.0D, 0.0D, 3.0D, 12.0D, 8.0D, 11.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_RIGHT_FIN_SHAPE = Block.box(2.0D, 5.0D, 4.0D, 4.0D, 6.0D,
            9.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_LEFT_FIN_SHAPE = Block.box(12.0D, 5.0D, 4.0D, 14.0D, 6.0D,
            9.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_MOUTH_SHAPE = Block.box(7.5D, 2.0D, 2.5D, 8.5D, 3.0D, 3.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_RIGHT_EYE_SHAPE = Block.box(5.0D, 4.0D, 2.5D, 6.5D, 5.5D,
            3.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_LEFT_EYE_SHAPE = Block.box(9.5D, 4.0D, 2.5D, 11.0D, 5.5D,
            3.0D);
    protected static final VoxelShape PUFFERFISH_1_NORTH_FINS_SHAPE = Shapes.or(PUFFERFISH_1_NORTH_RIGHT_FIN_SHAPE,
            PUFFERFISH_1_NORTH_LEFT_FIN_SHAPE);
    protected static final VoxelShape PUFFERFISH_1_NORTH_EYES_SHAPE = Shapes.or(PUFFERFISH_1_NORTH_RIGHT_EYE_SHAPE,
            PUFFERFISH_1_NORTH_LEFT_EYE_SHAPE);
    protected static final VoxelShape PUFFERFISH_1_NORTH_SHAPE = Shapes.or(PUFFERFISH_1_NORTH_BODY_SHAPE,
            PUFFERFISH_1_NORTH_MOUTH_SHAPE, PUFFERFISH_1_NORTH_FINS_SHAPE, PUFFERFISH_1_NORTH_EYES_SHAPE);

    protected static final VoxelShape PUFFERFISH_1_SOUTH_SHAPE = ADBoxUtil.rotate180Y(PUFFERFISH_1_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_1_WEST_SHAPE = ADBoxUtil.rotate270Y(PUFFERFISH_1_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_1_EAST_SHAPE = ADBoxUtil.rotate90Y(PUFFERFISH_1_NORTH_SHAPE);

    // Pufferfish 2 Bounding Boxes
    protected static final VoxelShape PUFFERFISH_2_NORTH_BODY_SHAPE = Block.box(3.0D, 0.0D, 2.0D, 13.0D, 9.0D, 12.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_RIGHT_FIN_SHAPE = Block.box(1.0D, 6.0D, 4.0D, 3.0D, 7.0D,
            9.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_LEFT_FIN_SHAPE = Block.box(13.0D, 6.0D, 4.0D, 15.0D, 7.0D,
            9.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_MOUTH_SHAPE = Block.box(6.5D, 3.0D, 1.5D, 9.5D, 4.0D, 2.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_RIGHT_EYE_SHAPE = Block.box(4.0D, 5.0D, 1.5D, 7.0D, 6.5D,
            2.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_LEFT_EYE_SHAPE = Block.box(9.0D, 5.0D, 1.5D, 12.0D, 6.5D,
            2.0D);
    protected static final VoxelShape PUFFERFISH_2_NORTH_FINS_SHAPE = Shapes.or(PUFFERFISH_2_NORTH_RIGHT_FIN_SHAPE,
            PUFFERFISH_2_NORTH_LEFT_FIN_SHAPE);
    protected static final VoxelShape PUFFERFISH_2_NORTH_EYES_SHAPE = Shapes.or(PUFFERFISH_2_NORTH_RIGHT_EYE_SHAPE,
            PUFFERFISH_2_NORTH_LEFT_EYE_SHAPE);
    protected static final VoxelShape PUFFERFISH_2_NORTH_SHAPE = Shapes.or(PUFFERFISH_2_NORTH_BODY_SHAPE,
            PUFFERFISH_2_NORTH_MOUTH_SHAPE, PUFFERFISH_2_NORTH_FINS_SHAPE, PUFFERFISH_2_NORTH_EYES_SHAPE);

    protected static final VoxelShape PUFFERFISH_2_SOUTH_SHAPE = ADBoxUtil.rotate180Y(PUFFERFISH_2_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_2_WEST_SHAPE = ADBoxUtil.rotate270Y(PUFFERFISH_2_NORTH_SHAPE);
    protected static final VoxelShape PUFFERFISH_2_EAST_SHAPE = ADBoxUtil.rotate90Y(PUFFERFISH_2_NORTH_SHAPE);

    public ADPufferfishPlushBlock(Properties properties) {
        super(properties);
    }

    /**
     * Called when the player right-clicks a block.
     */
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult rayTrace) {
        int puffed_property = state.getValue(PUFFED);

        if (puffed_property < 2) {
            level.playSound(null, pos, SoundEvents.PUFFER_FISH_BLOW_UP, SoundSource.BLOCKS, 1.0F,
                    0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(PUFFED, Integer.valueOf(puffed_property + 1)), 3);
        } else {
            level.playSound(null, pos, SoundEvents.PUFFER_FISH_BLOW_OUT, SoundSource.BLOCKS, 1.0F,
                    0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(PUFFED, 0), 3);
        }
        return InteractionResult.SUCCESS;
    }

    /**
     * Creates the bounding box for this block.
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
        case NORTH:
            return getPuffedShapes(state, PUFFERFISH_0_NORTH_SHAPE, PUFFERFISH_1_NORTH_SHAPE, PUFFERFISH_2_NORTH_SHAPE);
        case SOUTH:
            return getPuffedShapes(state, PUFFERFISH_0_SOUTH_SHAPE, PUFFERFISH_1_SOUTH_SHAPE, PUFFERFISH_2_SOUTH_SHAPE);
        case WEST:
            return getPuffedShapes(state, PUFFERFISH_0_WEST_SHAPE, PUFFERFISH_1_WEST_SHAPE, PUFFERFISH_2_WEST_SHAPE);
        default:
            return getPuffedShapes(state, PUFFERFISH_0_EAST_SHAPE, PUFFERFISH_1_EAST_SHAPE, PUFFERFISH_2_EAST_SHAPE);
        }
    }

    /**
     * @param state      The current state that this block is in.
     * @param puffShape0 When the puff level is 0.
     * @param puffShape1 When the puff level is 1.
     * @param puffShape2 When the puff level is 2.
     * @return The appropriate shape for the current state.
     */
    private static VoxelShape getPuffedShapes(BlockState state, VoxelShape puffShape0, VoxelShape puffShape1,
            VoxelShape puffShape2) {
        switch (state.getValue(PUFFED)) {
        case 0:
            return puffShape0;
        case 1:
            return puffShape1;
        default:
            return puffShape2;
        }
    }

    /**
     * Creates a list of properties that this block can have.
     */
    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PUFFED);
    }
}
