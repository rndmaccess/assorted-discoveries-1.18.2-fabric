package rndm_access.assorteddiscoveries.common.mixin;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.Map;

@Mixin(ShovelItem.class)
public class ADShovelItemMixin {
    //private static final Map<Block, BlockState> PATH_STATES;

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> info) {
        PlayerEntity player = context.getPlayer();
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState state = world.getBlockState(pos.up());
        BlockState state2 = world.getBlockState(pos);
        Block block = state2.getBlock();

        //ADShovelItemMixin.PATH_STATES.containsKey(block)

        if(context.getSide() != Direction.DOWN && state.isAir()) {
            if(!world.isClient()) {
                world.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
                context.getStack().damage(1, player, (p) -> {
                    p.sendToolBreakStatus(context.getHand());
                });

                //world.setBlockState(pos, ADShovelItemMixin.PATH_STATES.get(state2.getBlock()).with(SlabBlock.TYPE, state2.get(SlabBlock.TYPE)));
            }
            info.setReturnValue(ActionResult.success(world.isClient()));
        }
    }

    static {
        /*
        PATH_STATES = Maps.newHashMap(new ImmutableMap.Builder()
                .put(ADBlocks.GRASS_SLAB, ADBlocks.DIRT_PATH_SLAB.getDefaultState())
                .put(ADBlocks.DIRT_SLAB, ADBlocks.DIRT_PATH_SLAB.getDefaultState())
                .put(ADBlocks.COARSE_DIRT_SLAB, ADBlocks.DIRT_PATH_SLAB.getDefaultState()).build());
         */
    }
}
