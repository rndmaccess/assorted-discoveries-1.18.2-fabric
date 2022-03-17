package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import rndm_access.assorteddiscoveries.common.util.ADBlockStateUtil;

public class ADSoilSlabBlock extends SlabBlock {

    public ADSoilSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing,
            IPlantable plantable) {
        PlantType type = plantable.getPlantType(world, pos);

        if (ADBlockStateUtil.isBottomSlab(state)) {
            return false;
        } else {
            return type.equals(PlantType.PLAINS) || type.equals(PlantType.BEACH) || type.equals(PlantType.CAVE);
        }
    }
}
