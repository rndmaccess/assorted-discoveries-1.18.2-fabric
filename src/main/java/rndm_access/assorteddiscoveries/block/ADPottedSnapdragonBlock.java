package rndm_access.assorteddiscoveries.block;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ADPottedSnapdragonBlock extends FlowerPotBlock {
    public ADPottedSnapdragonBlock(Supplier<FlowerPotBlock> pot, Supplier<Block> flower, Properties properties) {
        super(pot, flower, properties);
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        double x = (double) pos.getX() + rand.nextFloat();
        double y = (double) pos.getY() + rand.nextFloat();
        double z = (double) pos.getZ() + rand.nextFloat();

        worldIn.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0D, 0.0D, 0.0D);
        super.animateTick(stateIn, worldIn, pos, rand);
    }
}
