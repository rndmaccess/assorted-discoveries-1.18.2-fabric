package rndm_access.assorteddiscoveries.common.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ADOnionBlock extends BeetrootBlock {

    private static final VoxelShape[] ONION_SHAPE_BY_AGE = new VoxelShape[] {
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 11.0D, 13.0D),
            Block.box(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D), Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D) };
    private Supplier<Item> seedItem;

    public ADOnionBlock(Properties properties, Supplier<Item> seedItem) {
        super(properties);
        this.seedItem = seedItem;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blcokGetter, BlockPos pos, CollisionContext context) {
        return ONION_SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }

    /**
     * Returns the item when using pick block.
     */
    @Override
    protected ItemLike getBaseSeedId() {
        return seedItem.get();
    }
}
