package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;
import rndm_access.assorteddiscoveries.common.util.ADVoxelShapeHelper;

public class ADPlanterBoxBlock extends Block {
    public static final BooleanProperty NORTH;
    public static final BooleanProperty SOUTH;
    public static final BooleanProperty WEST;
    public static final BooleanProperty EAST;

    private static final VoxelShape INSIDE_SINGLE_SHAPE;
    private static final VoxelShape SINGLE_BOX_SHAPE;

    private static final VoxelShape INSIDE_MIDDLE_SHAPE;
    private static final VoxelShape MIDDLE_BOX_SHAPE;

    private static final VoxelShape INSIDE_NORTH_SHAPE;
    private static final VoxelShape NORTH_BOX_SHAPE;
    private static final VoxelShape SOUTH_BOX_SHAPE;
    private static final VoxelShape WEST_BOX_SHAPE;
    private static final VoxelShape EAST_BOX_SHAPE;

    private static final VoxelShape INSIDE_NORTH_SOUTH_SHAPE;
    private static final VoxelShape NORTH_SOUTH_BOX_SHAPE;
    private static final VoxelShape EAST_WEST_BOX_SHAPE;

    private static final VoxelShape INSIDE_NORTH_EAST_SHAPE;
    private static final VoxelShape NORTH_EAST_BOX_SHAPE;

    private static final VoxelShape SOUTH_WEST_BOX_SHAPE;
    private static final VoxelShape NORTH_WEST_BOX_SHAPE;
    private static final VoxelShape SOUTH_EAST_BOX_SHAPE;

    private static final VoxelShape INSIDE_NORTH_WEST_EAST_SHAPE;
    private static final VoxelShape NORTH_WEST_EAST_BOX_SHAPE;

    private static final VoxelShape SOUTH_WEST_EAST_BOX_SHAPE;
    private static final VoxelShape NORTH_SOUTH_WEST_BOX_SHAPE;
    private static final VoxelShape NORTH_SOUTH_EAST_BOX_SHAPE;

    public ADPlanterBoxBlock(AbstractBlock.Settings settings) {
        super(settings);

        this.setDefaultState(this.getDefaultState().with(NORTH, false).with(SOUTH, false)
                .with(WEST, false).with(EAST, false));
    }

    /**
     * Creates the bounding box for this block.
     */
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        boolean north = state.get(NORTH);
        boolean south = state.get(SOUTH);
        boolean west = state.get(WEST);
        boolean east = state.get(EAST);

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

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        return getPlanterBoxState(this.getDefaultState(), world, pos);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return getPlanterBoxState(state, world, pos);
    }

    private BlockState getPlanterBoxState(BlockState state, WorldAccess world, BlockPos pos) {
        return state.with(NORTH, world.getBlockState(pos.north()).isOf(this))
                .with(SOUTH, world.getBlockState(pos.south()).isOf(this))
                .with(WEST, world.getBlockState(pos.west()).isOf(this))
                .with(EAST, world.getBlockState(pos.east()).isOf(this));
    }

    /**
     * When a structure is rotated with this block in it. This method decides what
     * state each block should be in.
     */
    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        BlockState rotatedState = this.getDefaultState();
        boolean north = state.get(NORTH);
        boolean south = state.get(SOUTH);
        boolean west = state.get(WEST);
        boolean east = state.get(EAST);
        boolean hasNone = north && south && west && east;
        boolean hasAll = !north && !south && !west && !east;

        // If the block is surrounded by edges or has no edges. Then we don't have
        // to rotate it.
        if (!(hasAll || hasNone)) {
            switch (rotation) {
            case CLOCKWISE_180:
                if (south) {
                    rotatedState = rotatedState.with(NORTH, true);
                }
                if (north) {
                    rotatedState = rotatedState.with(SOUTH, true);
                }
                if (east) {
                    rotatedState = rotatedState.with(WEST, true);
                }
                if (west) {
                    rotatedState = rotatedState.with(EAST, true);
                }
                return rotatedState;
            case CLOCKWISE_90:
                if (south) {
                    rotatedState = rotatedState.with(WEST, true);
                }
                if (north) {
                    rotatedState = rotatedState.with(EAST, true);
                }
                if (east) {
                    rotatedState = rotatedState.with(SOUTH, true);
                }
                if (west) {
                    rotatedState = rotatedState.with(NORTH, true);
                }
                return rotatedState;
            case COUNTERCLOCKWISE_90:
                if (south) {
                    rotatedState = rotatedState.with(EAST, true);
                }
                if (north) {
                    rotatedState = rotatedState.with(WEST, true);
                }
                if (east) {
                    rotatedState = rotatedState.with(NORTH, true);
                }
                if (west) {
                    rotatedState = rotatedState.with(SOUTH, true);
                }
                return rotatedState;
            default:
                return state;
            }
        }
        return state;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, SOUTH, WEST, EAST);
    }

    static {
        NORTH = Properties.NORTH;
        SOUTH = Properties.SOUTH;
        WEST = Properties.WEST;
        EAST = Properties.EAST;

        INSIDE_SINGLE_SHAPE = Block.createCuboidShape(3.0, 15.0, 3.0, 13.0, 16.0, 13.0);
        SINGLE_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_SINGLE_SHAPE);

        INSIDE_MIDDLE_SHAPE = Block.createCuboidShape(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
        MIDDLE_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_MIDDLE_SHAPE);

        INSIDE_NORTH_SHAPE = Block.createCuboidShape(3.0, 15.0, 0.0, 13.0, 16.0, 13.0);
        NORTH_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_NORTH_SHAPE);
        SOUTH_BOX_SHAPE = ADVoxelShapeHelper.rotateSouth(NORTH_BOX_SHAPE);
        WEST_BOX_SHAPE = ADVoxelShapeHelper.rotateWest(NORTH_BOX_SHAPE);
        EAST_BOX_SHAPE = ADVoxelShapeHelper.rotateEast(NORTH_BOX_SHAPE);

        INSIDE_NORTH_SOUTH_SHAPE = Block.createCuboidShape(3.0, 15.0, 0.0, 13.0, 16.0, 16.0);
        NORTH_SOUTH_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_NORTH_SOUTH_SHAPE);
        EAST_WEST_BOX_SHAPE = ADVoxelShapeHelper.rotateEast(NORTH_SOUTH_BOX_SHAPE);

        INSIDE_NORTH_EAST_SHAPE = Block.createCuboidShape(3.0, 15.0, 0.0, 16.0, 16.0, 13.0);
        NORTH_EAST_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_NORTH_EAST_SHAPE);

        SOUTH_WEST_BOX_SHAPE = ADVoxelShapeHelper.rotateSouth(NORTH_EAST_BOX_SHAPE);
        NORTH_WEST_BOX_SHAPE = ADVoxelShapeHelper.rotateWest(NORTH_EAST_BOX_SHAPE);
        SOUTH_EAST_BOX_SHAPE = ADVoxelShapeHelper.rotateEast(NORTH_EAST_BOX_SHAPE);

        INSIDE_NORTH_WEST_EAST_SHAPE = Block.createCuboidShape(0.0, 15.0, 0.0, 16.0, 16.0, 13.0);
        NORTH_WEST_EAST_BOX_SHAPE = ADVoxelShapeHelper.cutBox(VoxelShapes.fullCube(), INSIDE_NORTH_WEST_EAST_SHAPE);

        SOUTH_WEST_EAST_BOX_SHAPE = ADVoxelShapeHelper.rotateSouth(NORTH_WEST_EAST_BOX_SHAPE);
        NORTH_SOUTH_WEST_BOX_SHAPE = ADVoxelShapeHelper.rotateWest(NORTH_WEST_EAST_BOX_SHAPE);
        NORTH_SOUTH_EAST_BOX_SHAPE = ADVoxelShapeHelper.rotateEast(NORTH_WEST_EAST_BOX_SHAPE);
    }
}
