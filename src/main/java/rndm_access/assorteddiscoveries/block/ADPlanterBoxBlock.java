package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADPlanterBoxBlock extends Block {
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;

    private static final VoxelShape INSIDE_SINGLE_SHAPE = Block.box(3.0, 15.0, 3.0, 13.0, 16.0, 13.0);
    private static final VoxelShape SINGLE_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(), INSIDE_SINGLE_SHAPE);

    private static final VoxelShape INSIDE_MIDDLE_SHAPE = Block.box(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape MIDDLE_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(), INSIDE_MIDDLE_SHAPE);

    private static final VoxelShape INSIDE_NORTH_SHAPE = Block.box(3.0, 15.0, 0.0, 13.0, 16.0, 13.0);
    private static final VoxelShape NORTH_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(), INSIDE_NORTH_SHAPE);
    private static final VoxelShape SOUTH_BOX_SHAPE = ADBoxUtil.rotate180Y(NORTH_BOX_SHAPE);
    private static final VoxelShape WEST_BOX_SHAPE = ADBoxUtil.rotate270Y(NORTH_BOX_SHAPE);
    private static final VoxelShape EAST_BOX_SHAPE = ADBoxUtil.rotate90Y(NORTH_BOX_SHAPE);

    private static final VoxelShape INSIDE_NORTH_SOUTH_SHAPE = Block.box(3.0, 15.0, 0.0, 13.0, 16.0, 16.0);
    private static final VoxelShape NORTH_SOUTH_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(), INSIDE_NORTH_SOUTH_SHAPE);
    private static final VoxelShape EAST_WEST_BOX_SHAPE = ADBoxUtil.rotate90Y(NORTH_SOUTH_BOX_SHAPE);

    private static final VoxelShape INSIDE_NORTH_EAST_SHAPE = Block.box(3.0, 15.0, 0.0, 16.0, 16.0, 13.0);
    private static final VoxelShape NORTH_EAST_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(), INSIDE_NORTH_EAST_SHAPE);

    private static final VoxelShape SOUTH_WEST_BOX_SHAPE = ADBoxUtil.rotate180Y(NORTH_EAST_BOX_SHAPE);
    private static final VoxelShape NORTH_WEST_BOX_SHAPE = ADBoxUtil.rotate270Y(NORTH_EAST_BOX_SHAPE);
    private static final VoxelShape SOUTH_EAST_BOX_SHAPE = ADBoxUtil.rotate90Y(NORTH_EAST_BOX_SHAPE);

    private static final VoxelShape INSIDE_NORTH_WEST_EAST_SHAPE = Block.box(0.0, 15.0, 0.0, 16.0, 16.0, 13.0);
    private static final VoxelShape NORTH_WEST_EAST_BOX_SHAPE = ADBoxUtil.cutBox(Shapes.block(),
            INSIDE_NORTH_WEST_EAST_SHAPE);

    private static final VoxelShape SOUTH_WEST_EAST_BOX_SHAPE = ADBoxUtil.rotate180Y(NORTH_WEST_EAST_BOX_SHAPE);
    private static final VoxelShape NORTH_SOUTH_WEST_BOX_SHAPE = ADBoxUtil.rotate270Y(NORTH_WEST_EAST_BOX_SHAPE);
    private static final VoxelShape NORTH_SOUTH_EAST_BOX_SHAPE = ADBoxUtil.rotate90Y(NORTH_WEST_EAST_BOX_SHAPE);

    public ADPlanterBoxBlock(Properties properties) {
        super(properties);

        this.registerDefaultState(this.defaultBlockState().setValue(NORTH, false).setValue(SOUTH, false)
                .setValue(WEST, false).setValue(EAST, false));
    }

    /**
     * Creates the bounding box for this block.
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        boolean north = state.getValue(NORTH);
        boolean south = state.getValue(SOUTH);
        boolean west = state.getValue(WEST);
        boolean east = state.getValue(EAST);

        if (north && south && west && east) {
            return MIDDLE_BOX_SHAPE;
        } else if (north) {
            if (east) {
                if (south) {
                    return NORTH_SOUTH_EAST_BOX_SHAPE;
                } else if (west) {
                    return NORTH_WEST_EAST_BOX_SHAPE;
                } else {
                    return NORTH_EAST_BOX_SHAPE;
                }
            } else if (west) {
                if (south) {
                    return NORTH_SOUTH_WEST_BOX_SHAPE;
                } else if (east) {
                    return NORTH_WEST_EAST_BOX_SHAPE;
                } else {
                    return NORTH_WEST_BOX_SHAPE;
                }
            } else if (south) {
                return NORTH_SOUTH_BOX_SHAPE;
            } else {
                return NORTH_BOX_SHAPE;
            }
        } else if (south) {
            if (east) {
                if (west) {
                    return SOUTH_WEST_EAST_BOX_SHAPE;
                } else {
                    return SOUTH_EAST_BOX_SHAPE;
                }
            } else if (west) {
                return SOUTH_WEST_BOX_SHAPE;
            } else {
                return SOUTH_BOX_SHAPE;
            }
        } else if (west) {
            if (east) {
                return EAST_WEST_BOX_SHAPE;
            } else {
                return WEST_BOX_SHAPE;
            }
        } else if (east) {
            return EAST_BOX_SHAPE;
        }
        return SINGLE_BOX_SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Level level = context.getLevel();

        return this.defaultBlockState().setValue(NORTH, level.getBlockState(blockpos.north()).getBlock() == this)
                .setValue(SOUTH, level.getBlockState(blockpos.south()).getBlock() == this)
                .setValue(WEST, level.getBlockState(blockpos.west()).getBlock() == this)
                .setValue(EAST, level.getBlockState(blockpos.east()).getBlock() == this);
    }

    /**
     * When a structure is rotated with this block in it. This method decides what
     * state each block should be in.
     */
    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        BlockState rotatedState = this.defaultBlockState();
        boolean north = state.getValue(NORTH);
        boolean south = state.getValue(SOUTH);
        boolean west = state.getValue(WEST);
        boolean east = state.getValue(EAST);
        boolean hasNone = north && south && west && east;
        boolean hasAll = !north && !south && !west && !east;

        // If the block is surrounded by edges or has no edges. Then we don't have
        // to rotate it.
        if (!(hasAll || hasNone)) {
            switch (rotation) {
            case CLOCKWISE_180:
                if (south) {
                    rotatedState = rotatedState.setValue(NORTH, true);
                }
                if (north) {
                    rotatedState = rotatedState.setValue(SOUTH, true);
                }
                if (east) {
                    rotatedState = rotatedState.setValue(WEST, true);
                }
                if (west) {
                    rotatedState = rotatedState.setValue(EAST, true);
                }
                return rotatedState;
            case CLOCKWISE_90:
                if (south) {
                    rotatedState = rotatedState.setValue(WEST, true);
                }
                if (north) {
                    rotatedState = rotatedState.setValue(EAST, true);
                }
                if (east) {
                    rotatedState = rotatedState.setValue(SOUTH, true);
                }
                if (west) {
                    rotatedState = rotatedState.setValue(NORTH, true);
                }
                return rotatedState;
            case COUNTERCLOCKWISE_90:
                if (south) {
                    rotatedState = rotatedState.setValue(EAST, true);
                }
                if (north) {
                    rotatedState = rotatedState.setValue(WEST, true);
                }
                if (east) {
                    rotatedState = rotatedState.setValue(NORTH, true);
                }
                if (west) {
                    rotatedState = rotatedState.setValue(SOUTH, true);
                }
                return rotatedState;
            default:
                return state;
            }
        }
        return state;
    }

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState,
            LevelAccessor levelAccessor, BlockPos currentPos, BlockPos facingPos) {
        return stateIn.setValue(NORTH, levelAccessor.getBlockState(currentPos.north()).getBlock() == this)
                .setValue(SOUTH, levelAccessor.getBlockState(currentPos.south()).getBlock() == this)
                .setValue(WEST, levelAccessor.getBlockState(currentPos.west()).getBlock() == this)
                .setValue(EAST, levelAccessor.getBlockState(currentPos.east()).getBlock() == this);
    }

    @Override
    public boolean isFertile(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return true;
    }

    /**
     * Creates a list of properties that this block can have.
     */
    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        builder.add(NORTH, SOUTH, WEST, EAST);
    }
}
