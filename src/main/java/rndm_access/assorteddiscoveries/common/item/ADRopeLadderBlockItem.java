package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ADRopeLadderBlockItem extends BlockItem {
    public ADRopeLadderBlockItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemPlacementContext getPlacementContext(ItemPlacementContext context) {
        BlockPos.Mutable mutablePos = context.getBlockPos().offset(context.getSide().getOpposite()).mutableCopy();
        BlockState state = context.getWorld().getBlockState(mutablePos);
        Direction down = Direction.DOWN;

        while (state.isOf(this.getBlock())) {
            mutablePos.move(down);
            state = context.getWorld().getBlockState(mutablePos);

            if (state.canReplace(context)) {
                return ItemPlacementContext.offset(context, mutablePos, down);
            }
        }
        return context;
    }
}
