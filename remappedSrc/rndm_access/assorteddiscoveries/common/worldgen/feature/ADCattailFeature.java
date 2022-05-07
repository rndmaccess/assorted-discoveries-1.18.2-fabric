package rndm_access.assorteddiscoveries.common.worldgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import rndm_access.assorteddiscoveries.common.block.ADCattailBlock;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.Random;

public class ADCattailFeature extends Feature<ProbabilityConfig> {
    public ADCattailFeature(Codec<ProbabilityConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<ProbabilityConfig> context) {
        boolean placeFlag = false;
        Random random = context.getRandom();
        StructureWorldAccess worldAccess = context.getWorld();
        BlockPos originPos = context.getOrigin();
        int i = random.nextInt(8) - random.nextInt(8);
        int j = random.nextInt(8) - random.nextInt(8);
        int k = worldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, originPos.getX() + i, originPos.getZ() + j);
        BlockPos cattailBottomPos = new BlockPos(originPos.getX() + i, k, originPos.getZ() + j);

        BlockState cattailBottom = ADBlocks.CATTAIL.getDefaultState();

        if (cattailBottom.canPlaceAt(worldAccess, cattailBottomPos)) {
            BlockState cattailTop = cattailBottom.with(ADCattailBlock.HALF, DoubleBlockHalf.UPPER);
            BlockPos cattailTopPos = cattailBottomPos.up();

            if (worldAccess.getBlockState(cattailTopPos).isAir() && worldAccess.getBlockState(cattailBottomPos).isOf(Blocks.WATER)) {
                worldAccess.setBlockState(cattailBottomPos, cattailBottom, 2);
                worldAccess.setBlockState(cattailTopPos, cattailTop, 2);
                placeFlag = true;
            }
        }
        return placeFlag;
    }
}
