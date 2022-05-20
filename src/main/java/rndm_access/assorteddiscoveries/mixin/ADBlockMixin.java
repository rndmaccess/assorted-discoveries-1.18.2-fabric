package rndm_access.assorteddiscoveries.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rndm_access.assorteddiscoveries.common.util.ADMixinUtil;

import java.util.Random;

@Mixin(Block.class)
public class ADBlockMixin {

    @Inject(method = "afterBreak", at = @At("HEAD"), cancellable = true)
    private void assorteddiscoveries_afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state,
                            BlockEntity blockEntity, ItemStack stack, CallbackInfo info) {
        int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, player.getMainHandStack());
        Random random = new Random();

        // Drop spruce cones when spruce leaves are broken.
        switch (fortuneLevel) {
            case 1:
                ADMixinUtil.dropSpruceCone(state, world, pos, random, 0.0125F);
            case 2:
                ADMixinUtil.dropSpruceCone(state, world, pos, random, 0.0166F);
            case 3:
                ADMixinUtil.dropSpruceCone(state, world, pos, random, 0.05F);
            default:
                ADMixinUtil.dropSpruceCone(state, world, pos, random, 0.01F);
        }
    }
}
