package rndm_access.assorteddiscoveries.block;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Note: This is a temporary class for torches. This class has a custom
 * constructor that takes a supplier. Once forge adds a constructor that takes a
 * supplier to the TorchBlock class this class will be deleted.
 *
 * @author Ryan
 *
 */
public class ADTorchBlock extends TorchBlock {
    protected Supplier<ParticleOptions> flameParticle;

    public ADTorchBlock(BlockBehaviour.Properties properties, Supplier<ParticleOptions> flameParticle) {
        super(properties, null);
        this.flameParticle = flameParticle;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        double d0 = pos.getX() + 0.5D;
        double d1 = pos.getY() + 0.7D;
        double d2 = pos.getZ() + 0.5D;
        level.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        level.addParticle(this.flameParticle.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }
}
