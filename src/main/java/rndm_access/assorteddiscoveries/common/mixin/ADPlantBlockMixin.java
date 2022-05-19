package rndm_access.assorteddiscoveries.common.mixin;

import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ShovelItem;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rndm_access.assorteddiscoveries.common.block.ADGrassSlabBlock;
import rndm_access.assorteddiscoveries.common.core.ADBlockTags;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

@Mixin(PlantBlock.class)
public class ADPlantBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void canPlantOnTop(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {

        // Add the ability to plant plants on blocks in the dirt slabs tag.
        if(floor.isIn(ADBlockTags.DIRT_SLABS) && floor.get(ADGrassSlabBlock.TYPE) != SlabType.BOTTOM) {
            info.setReturnValue(true);
        }
    }
}
