package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ADPieBlock extends CakeBlock {

    protected static final VoxelShape[] SHAPE_BY_BITE = new VoxelShape[] {
            Block.box(1.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D), Block.box(3.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D),
            Block.box(5.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D), Block.box(7.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D),
            Block.box(9.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D), Block.box(11.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D),
            Block.box(13.0D, 0.0D, 1.0D, 15.0D, 6.0D, 15.0D) };
    private int nutrition;
    private float saturationMod;

    public ADPieBlock(Properties properties, int nutrition, float saturationMod) {
        super(properties);
        this.nutrition = nutrition;
        this.saturationMod = saturationMod;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_BITE[state.getValue(BITES)];
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult result) {
        if (level.isClientSide) {
            ItemStack itemstack = player.getItemInHand(hand);
            if (this.eat(level, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemstack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return this.eat(level, pos, state, player);
    }

    private InteractionResult eat(Level level, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(this.nutrition, this.saturationMod);
            int i = state.getValue(BITES);

            if (i < 6) {
                level.setBlock(pos, state.setValue(BITES, Integer.valueOf(i + 1)), 3);
            } else {
                level.removeBlock(pos, false);
            }

            return InteractionResult.SUCCESS;
        }
    }
}
