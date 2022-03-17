package rndm_access.assorteddiscoveries.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.KelpPlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;
import rndm_access.assorteddiscoveries.common.core.ADItems;
import rndm_access.assorteddiscoveries.common.core.ADParticleTypes;

public class ADBloodKelpPlantBlock extends KelpPlantBlock {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public ADBloodKelpPlantBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, false));
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ADBlocks.BLOOD_KELP.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, Random random) {

        double x = (double) pos.getX() + random.nextFloat();
        double y = (double) pos.getY() + random.nextFloat();
        double z = (double) pos.getZ() + random.nextFloat();

        if (stateIn.getValue(LIT)) {
            level.addParticle(ADParticleTypes.BLOOD_KELP_SPORE.get(), x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
            BlockHitResult result) {

        if (state.getValue(LIT)) {
            player.addItem(new ItemStack(ADItems.BLOOD_KELP_SEED_CLUSTER.get()));
            level.setBlockAndUpdate(pos, state.setValue(LIT, false));
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    /**
     * This method decides whether or not the blood kelp should have spores.
     *
     * @param level
     * @param pos    The position of the new block.
     * @param random
     */
    public boolean growSpores(ServerLevel level, BlockPos pos, Random random) {
        float sporeChance = 0.5F;
        float sporeChancePicked = random.nextFloat();

        if (sporeChancePicked <= sporeChance) {
            level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(LIT, true));
            return true;
        }
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
