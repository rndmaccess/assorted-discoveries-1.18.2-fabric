package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class ADSoilSlabBlock extends SlabBlock {
    public ADSoilSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    // @Override
    // public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing,
    //         IPlantable plantable) {
    //     PlantType type = plantable.getPlantType(world, pos);
    //
    //     if (ADBlockStateUtil.isBottomSlab(state)) {
    //         return false;
    //     } else {
    //         return type.equals(PlantType.PLAINS) || type.equals(PlantType.BEACH) || type.equals(PlantType.CAVE);
    //     }
    // }


}
