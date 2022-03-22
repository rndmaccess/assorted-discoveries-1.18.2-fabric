package rndm_access.assorteddiscoveries.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import rndm_access.assorteddiscoveries.common.core.ADBlockEntityTypes;

public class ADDyedCampfireBlockEntity extends CampfireBlockEntity {

    public ADDyedCampfireBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ADBlockEntityTypes.DYED_CAMPFIRE.get();
    }
}
