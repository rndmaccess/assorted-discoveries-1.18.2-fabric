package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;
import rndm_access.assorteddiscoveries.common.core.ADItems;
import rndm_access.assorteddiscoveries.common.core.ADParticleTypes;

public class ADBloodKelpPlantBlock extends KelpPlantBlock {
    public static final BooleanProperty LIT;

    public ADBloodKelpPlantBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LIT, false));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ADBlocks.BLOOD_KELP;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = (double) pos.getX() + random.nextFloat();
        double y = (double) pos.getY() + random.nextFloat();
        double z = (double) pos.getZ() + random.nextFloat();

        if (state.get(LIT)) {
            world.addParticle(ADParticleTypes.BLOOD_KELP_SPORE, x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(LIT)) {
            player.giveItemStack(new ItemStack(ADItems.BLOOD_KELP_SEED_CLUSTER));
            world.setBlockState(pos, state.with(LIT, false));
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    /**
     * This method decides whether the blood kelp should have spores.
     *
     * @param world
     * @param pos    The position of the new block.
     * @param random
     */
    public boolean growSpores(World world, BlockPos pos, Random random) {
        float sporeChance = 0.5F;
        float sporeChancePicked = random.nextFloat();

        if (sporeChancePicked <= sporeChance) {
            world.setBlockState(pos, this.getDefaultState().with(LIT, true));
            return true;
        }
        return false;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    static {
        LIT = Properties.LIT;
    }
}
