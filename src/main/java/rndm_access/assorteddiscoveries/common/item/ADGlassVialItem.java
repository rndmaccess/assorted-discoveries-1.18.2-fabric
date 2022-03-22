package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import rndm_access.assorteddiscoveries.common.core.ADEntityTypeTags;
import rndm_access.assorteddiscoveries.common.core.ADItems;

public class ADGlassVialItem extends Item {
    public ADGlassVialItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player playerIn, LivingEntity target,
            InteractionHand hand) {
        if (stack.getItem().equals(ADItems.GLASS_VIAL.get())) {
            if (target instanceof Animal && target.getHealth() > 0.0
                    && ADEntityTypeTags.ANIMALS_THAT_GIVE_BLOOD.contains(target.getType())) {
                Mob animalTarget = (Mob) target;

                if (animalTarget.hurt(DamageSource.GENERIC, 1)) {
                    playerIn.addItem(new ItemStack(ADItems.BLOOD_VIAL.get()));
                    animalTarget.playSound(SoundEvents.BOTTLE_FILL, 1.0F, 1.0F);
                    stack.shrink(1);
                    return InteractionResult.CONSUME;
                }
            }
        }
        return InteractionResult.PASS;
    }
}
