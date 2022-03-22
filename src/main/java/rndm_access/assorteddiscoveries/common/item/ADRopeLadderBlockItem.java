package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ADRopeLadderBlockItem extends BlockItem {

    public ADRopeLadderBlockItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemPlacementContext getPlacementContext(ItemPlacementContext context) {
        BlockPos.Mutable mutablePos = context.getBlockPos().offset(context.getPlayerLookDirection()
                .getOpposite()).mutableCopy();
        BlockState state = context.getWorld().getBlockState(mutablePos);
        Direction down = Direction.DOWN;

        while (state.isOf(this.getBlock())) {
            mutablePos.move(down);
            state = context.getWorld().getBlockState(mutablePos);

            if (state.canReplace(context)) {
                return ItemPlacementContext.offset(context, mutablePos, down);
            }
        }
        return getPlacementContext(context);
    }
}
