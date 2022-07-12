package rndm_access.assorteddiscoveries.common.block;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
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
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADBloodKelpBlock extends KelpBlock {
    public static final BooleanProperty LIT = Properties.LIT;

    public ADBloodKelpBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LIT, false));
    }

    @Override
    @SuppressWarnings("depreciated")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Random random = new Random();

        if (state.get(LIT)) {
            player.giveItemStack(new ItemStack(ADItems.BLOOD_KELP_SEED_CLUSTER, random.nextInt(3) + 1));
            world.setBlockState(pos, state.with(LIT, false));
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    @Override
    protected Block getPlant() {
        return ADBlocks.BLOOD_KELP_PLANT;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = pos.getX() + random.nextDouble();
        double y = pos.getY() + random.nextDouble();
        double z = pos.getZ() + random.nextDouble();

        if (state.get(LIT)) {
            world.addParticle(ADParticleTypes.BLOOD_KELP_SPORE, x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos newStemPos = pos.offset(this.growthDirection);
        boolean isStemLit = state.get(LIT);
        int age = state.get(AGE);

        if (age < 25 && this.chooseStemState(world.getBlockState(newStemPos))) {
            world.setBlockState(pos, this.getPlant().getDefaultState().with(ADBloodKelpPlantBlock.LIT, isStemLit), 2);
            world.setBlockState(newStemPos, this.getBloodKelpState(random).with(AGE, age).cycle(AGE));
        }
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos newStemPos = pos.mutableCopy().offset(this.growthDirection);
        BlockPos oldStemPos = pos.mutableCopy();
        BlockState oldStem = world.getBlockState(oldStemPos);
        int age = Math.min(state.get(AGE) + 1, 25);
        int growthLength = this.getGrowthLength(random);

        // Grow the blood kelp, this supports multiple.
        for(int i = 0; i < growthLength && this.chooseStemState(world.getBlockState(newStemPos)); ++i) {
            world.setBlockState(oldStemPos, this.getPlant().getDefaultState()
                    .with(ADBloodKelpPlantBlock.LIT, oldStem.get(LIT)), 2);
            world.setBlockState(newStemPos, this.getBloodKelpState(random).with(AGE, age));

            age = Math.min(age + 1, 25);
            oldStemPos.offset(this.growthDirection);
            newStemPos.offset(this.growthDirection);
            oldStem = world.getBlockState(oldStemPos);
        }
    }

    public BlockState getBloodKelpState(Random random) {
        return this.getDefaultState().with(LIT, ADBlockStateUtil.isBloodKelpLit(random));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, AGE);
    }
}
