package rndm_access.assorteddiscoveries.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import rndm_access.assorteddiscoveries.common.core.ADItemTags;

import java.util.Random;

public class ADMixedSeedPacketItem extends Item {
    public ADMixedSeedPacketItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        Random random = new Random();
        ItemStack heldStack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            for (int i = 0; i <= 2; i++) {
                Item randomSeed = ADItemTags.PACKET_SEEDS.getRandomElement(random);
                int randomCount = random.nextInt(i + 1) + 1;

                player.addItem(new ItemStack(randomSeed, randomCount));
            }
        }

        player.playSound(SoundEvents.BAMBOO_STEP, 1.0F, 1.0F);

        if (player.isCreative()) {
            return InteractionResultHolder.pass(heldStack);
        } else {
            return InteractionResultHolder.consume(new ItemStack(heldStack.getItem(), heldStack.getCount() - 1));
        }
    }
}
