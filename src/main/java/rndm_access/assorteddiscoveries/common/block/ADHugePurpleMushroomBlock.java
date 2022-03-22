package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import rndm_access.assorteddiscoveries.common.core.ADSoundEvents;

public class ADHugePurpleMushroomBlock extends HugeMushroomBlock {
    public ADHugePurpleMushroomBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        float strength = 0.5F;
        float height = fallDistance * strength;
        SoundEvent sound = ADSoundEvents.BLOCK_MUSHROOM_BOUNCE.get();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        if (entity.isSuppressingBounce()) {
            level.playLocalSound(x, y, z, sound, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() / 0.4F,
                    true);

            entity.setOnGround(true);

        } else {
            Vec3 vector3d = entity.getDeltaMovement();

            // Set a maximum height of 10.
            if (height >= 10) {
                height = 10;
            }
            // Set a minimum height of 2.
            if (height <= 2) {
                height = 2;
            }

            // Update the entities motion and play the bounce sound.
            entity.setDeltaMovement(vector3d.x, -vector3d.y + Math.sqrt(0.2 * (height + 0.2F)), vector3d.z);

            level.playLocalSound(x, y, z, sound, SoundSource.BLOCKS, 1.0F, 0.8F + level.getRandom().nextFloat() * 0.4F,
                    true);

            entity.setOnGround(false);
        }
    }

    @Override
    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entityIn) {
    }
}
