package rndm_access.assorteddiscoveries.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rndm_access.assorteddiscoveries.common.util.ADBoxUtil;

public class ADCreeperPlushBlock extends ADAbstractPlushBlock {
    protected static final VoxelShape NORTH_HEAD;
    protected static final VoxelShape NORTH_TORSO;
    protected static final VoxelShape NORTH_BACK_FOOT;
    protected static final VoxelShape NORTH_FRONT_FOOT;
    protected static final VoxelShape NORTH_LEFT_EYE;
    protected static final VoxelShape NORTH_RIGHT_EYE;
    protected static final VoxelShape NORTH_MIDDLE_MOUTH;
    protected static final VoxelShape NORTH_RIGHT_MOUTH;
    protected static final VoxelShape NORTH_LEFT_MOUTH;
    protected static final VoxelShape NORTH_FEET;
    protected static final VoxelShape NORTH_EYES;
    protected static final VoxelShape NORTH_MOUTH;
    protected static final VoxelShape NORTH_BODY;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;

    public ADCreeperPlushBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape northShape() {
        return NORTH_SHAPE;
    }

    @Override
    protected VoxelShape southShape() {
        return SOUTH_SHAPE;
    }

    @Override
    protected VoxelShape westShape() {
        return WEST_SHAPE;
    }

    @Override
    protected VoxelShape eastShape() {
        return EAST_SHAPE;
    }

    static {
        NORTH_HEAD = Block.createCuboidShape(4.0, 7.0, 4.0D, 12.0D, 15.0D, 12.0D);
        NORTH_TORSO = Block.createCuboidShape(6.0D, 3.0D, 6.0D, 10.0D, 7.0D, 10.0D);
        NORTH_BACK_FOOT = Block.createCuboidShape(6.0D, 0.0D, 10.0D, 10.0D, 3.0D, 13.0D);
        NORTH_FRONT_FOOT = Block.createCuboidShape(6.0D, 0.0D, 3.0D, 10.0D, 3.0D, 6.0D);
        NORTH_LEFT_EYE = Block.createCuboidShape(9.0D, 11.0D, 3.5D, 11.0D, 13.0D, 4.0D);
        NORTH_RIGHT_EYE = Block.createCuboidShape(5.0D, 11.0D, 3.5D, 7.0D, 13.0D, 4.0D);
        NORTH_MIDDLE_MOUTH = Block.createCuboidShape(7.5D, 9.0D, 3.5D, 8.5D, 11.0D, 4.0D);
        NORTH_RIGHT_MOUTH = Block.createCuboidShape(6.5D, 8.0D, 3.5D, 7.5D, 10.0D, 4.0D);
        NORTH_LEFT_MOUTH = Block.createCuboidShape(8.5D, 8.0D, 3.5D, 9.5D, 10.0D, 4.0D);
        NORTH_FEET = VoxelShapes.union(NORTH_BACK_FOOT, NORTH_FRONT_FOOT);
        NORTH_EYES = VoxelShapes.union(NORTH_LEFT_EYE, NORTH_RIGHT_EYE);
        NORTH_MOUTH = VoxelShapes.union(NORTH_MIDDLE_MOUTH, NORTH_RIGHT_MOUTH, NORTH_LEFT_MOUTH);
        NORTH_BODY = VoxelShapes.union(NORTH_HEAD, NORTH_TORSO);
        NORTH_SHAPE = VoxelShapes.union(NORTH_FEET, NORTH_EYES, NORTH_MOUTH, NORTH_BODY);
        SOUTH_SHAPE = ADBoxUtil.rotate180Y(NORTH_SHAPE);
        WEST_SHAPE = ADBoxUtil.rotate270Y(NORTH_SHAPE);
        EAST_SHAPE = ADBoxUtil.rotate90Y(NORTH_SHAPE);
    }
}
