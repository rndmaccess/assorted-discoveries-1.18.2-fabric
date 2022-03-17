package rndm_access.assorteddiscoveries.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class ADOverworldPlanterBoxBlock extends ADPlanterBoxBlock {
    public ADOverworldPlanterBoxBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter blockGetter, BlockPos pos, Direction facing,
            IPlantable plantable) {
        PlantType type = plantable.getPlantType(blockGetter, pos);

        return type.equals(PlantType.CROP);
    }
}
