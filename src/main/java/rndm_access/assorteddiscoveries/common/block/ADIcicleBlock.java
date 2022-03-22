package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ADIcicleBlock extends FallingBlock {
    private static final VoxelShape ICICLE_SHAPE = Block.box(4.0, 1.0, 4.0, 12.0, 16.0, 12.0);

    public ADIcicleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return ICICLE_SHAPE;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        // This prevents the icicle from falling instantly when its placed.
        if (!canStay(level, pos)) {
            super.onPlace(state, level, pos, oldState, isMoving);
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        // Used to keep the player from placing icicle's without supporting blocks.
        return canStay(level, pos) ? this.defaultBlockState() : null;
    }

    private boolean canStay(LevelReader levelReader, BlockPos pos) {
        Direction direction = Direction.DOWN;
        BlockPos blockpos = pos.relative(direction.getOpposite());
        BlockState blockstate = levelReader.getBlockState(blockpos);
        return blockstate.isFaceSturdy(levelReader, blockpos, direction);
    }

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState,
            LevelAccessor levelAccessor, BlockPos currentPos, BlockPos facingPos) {
        if (canStay(levelAccessor, currentPos)) {
            return stateIn;
        } else {
            // The icicle can't fall but isn't supported so harvest it.
            if (levelAccessor.getBlockState(currentPos.below()) != Blocks.AIR.defaultBlockState()) {
                return Blocks.AIR.defaultBlockState();
            } else {
                return super.updateShape(stateIn, facing, facingState, levelAccessor, currentPos, facingPos);
            }
        }
    }

    /**
     * Called when a falling block hits the ground.
     */
    @Override
    public void onLand(Level level, BlockPos pos, BlockState fallingState, BlockState hitState,
            FallingBlockEntity fallingBlock) {
        Player player = level.getNearestPlayer(pos.getX(), pos.getY(), pos.getZ(), 1.1, false);
        float blocksFallen = fallingBlock.time / 3.0F;
        float fallMult = blocksFallen / 10.0F; // When the block has fallen more than 10 blocks the damage grows.

        // Damages the player when underneath the icicle.
        if (player != null) {
            player.hurt(DamageSource.GENERIC, blocksFallen * fallMult);
        }
        level.destroyBlock(pos, false);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        entity.hurt(DamageSource.GENERIC, 0.5F);
    }
}
