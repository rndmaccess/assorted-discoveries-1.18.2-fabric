package rndm_access.assorteddiscoveries.common.util;

import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public final class ADVoxelShapeHelper {

    private ADVoxelShapeHelper() {
    }

    /**
     * Use the second argument's shapes to cut smaller shapes into the first
     * argument's shape and return the new shape.
     */
    public static VoxelShape cutBox(VoxelShape shape, VoxelShape... cutShapes) {
        for (int i = 0; i < cutShapes.length; i++) {
            shape = VoxelShapes.combine(shape, cutShapes[i], BooleanBiFunction.ONLY_FIRST);
        }
        return shape;
    }

    public static VoxelShape rotateSouth(VoxelShape source) {
        return rotate(source, Direction.SOUTH);
    }

    public static VoxelShape rotateWest(VoxelShape source) {
        return rotate(source, Direction.WEST);
    }

    public static VoxelShape rotateEast(VoxelShape source) {
        return rotate(source, Direction.EAST);
    }

    private static VoxelShape rotate(VoxelShape source, Direction direction) {
        VoxelShape rotatedShape = VoxelShapes.empty();

        for(Box box : source.getBoundingBoxes()) {
            VoxelShape tempShape = rotateValues(direction, box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ);
            rotatedShape = VoxelShapes.union(tempShape, rotatedShape);
        }
        return rotatedShape;
    }

    private static VoxelShape rotateValues(Direction direction, double minX, double minY, double minZ, double maxX,
                                           double maxY, double maxZ) {
        double tempMinX = minX;
        double tempMaxX = maxX;
        double tempMinZ = minZ;

        switch(direction)
        {
            case EAST:
                minX = 1.0F - maxZ;
                minZ = tempMinX;
                maxX = 1.0F - tempMinZ;
                maxZ = tempMaxX;
                break;
            case SOUTH:
                minX = 1.0F - maxX;
                minZ = 1.0F - maxZ;
                maxX = 1.0F - tempMinX;
                maxZ = 1.0F - tempMinZ;
                break;
            case WEST:
                minX = minZ;
                minZ = 1.0F - maxX;
                maxX = maxZ;
                maxZ = 1.0F - tempMinX;
                break;
            default:
                break;
        }
        return VoxelShapes.cuboid(minX, minY, minZ, maxX, maxY, maxZ);
    }
}
