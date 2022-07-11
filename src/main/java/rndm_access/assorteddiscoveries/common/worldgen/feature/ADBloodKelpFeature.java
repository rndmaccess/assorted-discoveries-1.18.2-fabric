package rndm_access.assorteddiscoveries.common.worldgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.KelpFeature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import rndm_access.assorteddiscoveries.common.block.ADBloodKelpPlantBlock;
import rndm_access.assorteddiscoveries.common.core.ADBlocks;

import java.util.Random;

public class ADBloodKelpFeature extends Feature<DefaultFeatureConfig> {
    public ADBloodKelpFeature(Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
    }

    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        int i = 0;
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        Random random = context.getRandom();
        int y = structureWorldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, blockPos.getX(), blockPos.getZ());
        BlockPos blockPos2 = new BlockPos(blockPos.getX(), y, blockPos.getZ());

        if (structureWorldAccess.getBlockState(blockPos2).isOf(Blocks.WATER)) {
            BlockState bloodKelpState = ADBlocks.BLOOD_KELP.getDefaultState();
            ADBloodKelpPlantBlock bloodKelpPlantState = (ADBloodKelpPlantBlock) ADBlocks.BLOOD_KELP_PLANT;
            int maxHeight = 1 + random.nextInt(10);

            for(int l = 0; l <= maxHeight; ++l) {
                if (structureWorldAccess.getBlockState(blockPos2).isOf(Blocks.WATER)
                        && structureWorldAccess.getBlockState(blockPos2.up()).isOf(Blocks.WATER)
                        && bloodKelpPlantState.getDefaultState().canPlaceAt(structureWorldAccess, blockPos2)) {
                    if (l == maxHeight) {
                        structureWorldAccess.setBlockState(blockPos2, bloodKelpState.with(KelpBlock.AGE, random.nextInt(4) + 20), 2);
                        ++i;
                    } else {
                        structureWorldAccess.setBlockState(blockPos2, bloodKelpPlantState.setGrowthState(random), 2);
                    }
                } else if (l > 0) {
                    BlockPos blockPos3 = blockPos2.down();
                    if (bloodKelpState.canPlaceAt(structureWorldAccess, blockPos3) && !structureWorldAccess.getBlockState(blockPos3.down()).isOf(Blocks.KELP)) {
                        structureWorldAccess.setBlockState(blockPos3, bloodKelpState.with(KelpBlock.AGE, random.nextInt(4) + 20), 2);
                        ++i;
                    }
                    break;
                }
                blockPos2 = blockPos2.up();
            }
        }
        return i > 0;
    }
}
