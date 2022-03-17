package rndm_access.assorteddiscoveries.block;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StonecutterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import rndm_access.assorteddiscoveries.AssortedDiscoveries;
import rndm_access.assorteddiscoveries.common.block.menu.ADWoodcutterMenu;

public class ADWoodcutterBlock extends StonecutterBlock {
    private static final TranslatableComponent CONTAINER_TITLE = new TranslatableComponent(
            "container." + AssortedDiscoveries.MOD_ID + ".woodcutter");

    public ADWoodcutterBlock(Properties properties) {
        super(properties);
    }

    @Override
    @Nullable
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((windowId, playerInventory, p_220283_4_) -> {
            return new ADWoodcutterMenu(windowId, playerInventory, ContainerLevelAccess.create(level, pos));
        }, CONTAINER_TITLE);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult result) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }
}
