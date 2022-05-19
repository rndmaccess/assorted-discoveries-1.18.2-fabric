package rndm_access.assorteddiscoveries.common.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rndm_access.assorteddiscoveries.common.core.ADBlockTags;

@Mixin(CropBlock.class)
public class ADCropBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void canPlantOnTop(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {

        // Add the ability to plant crops in planter boxes.
        if(floor.isIn(ADBlockTags.PLANTER_BOXES)) {
            info.setReturnValue(true);
        }
    }
}
