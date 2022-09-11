package rndm_access.assorteddiscoveries.mixin;

import net.minecraft.block.MapColor;
import net.minecraft.client.render.entity.SheepEntityRenderer;
import net.minecraft.client.render.entity.model.SheepEntityModel;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//@Mixin(DyeColor.class)
public interface DyeColorHelper {
    /*
    @Invoker("init")
    DyeColor init(int id, String name, int color, MapColor mapColor,
                               int fireworkColor, int signColor, CallbackInfo info) {
        throw new AssertionError();
    }
    */
}
