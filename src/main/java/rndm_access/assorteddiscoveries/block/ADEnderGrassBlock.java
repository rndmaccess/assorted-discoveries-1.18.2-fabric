package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.core.ADBlockTags;

public class ADEnderGrassBlock extends PlantBlock {
    protected static final VoxelShape ENDER_GRASS_SHAPE;

    public ADEnderGrassBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return ADBlockTags.ENDER_GRASS_PLANTABLE_ON.contains(floor.getBlock());
    }

    /*
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return isValidBlock(world, pos);
    }
    */

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = (double) pos.getX() + random.nextFloat();
        double y = (double) pos.getY() + random.nextFloat();
        double z = (double) pos.getZ() + random.nextFloat();

        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0D, 0.0D, 0.0D);
    }

    /**
     * A helper method used for checking that the plant placement is valid.
     */
    /*
    private boolean isValidBlock(BlockView world, BlockPos pos) {
        Block block = world.getBlockState(pos.below()).getBlock();

        return ADBlockTags.ENDER_GRASS_PLANTABLE_ON.contains(block);
    }
    */

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return ENDER_GRASS_SHAPE;
    }

    static {
        ENDER_GRASS_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D);
    }
}
