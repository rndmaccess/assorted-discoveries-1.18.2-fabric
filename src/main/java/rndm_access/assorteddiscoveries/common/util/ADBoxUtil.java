package rndm_access.assorteddiscoveries.common.util;

import java.util.List;

import com.mojang.datafixers.util.Pair;

import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

/**
 * A utility class that rotates bounding boxes.
 *
 * @author Ryan
 */
public final class ADBoxUtil {
    private static final double CENTER = 0.5;
    private static final double NINETY_DEGREES = Math.toRadians(90);
    private static final double ONE_HUNDRED_EIGHTY_DEGREES = Math.toRadians(180);
    private static final double TWO_HUNDRED_SEVENTY_DEGREES = Math.toRadians(270);

    private ADBoxUtil() {
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

    /**
     * @param shape The shape to rotate.
     * @return The shape passed rotated 90 radians on the Y axis.
     */
    public static VoxelShape rotate90Y(VoxelShape shape) {
        return rotateY(NINETY_DEGREES, shape);
    }

    /**
     * @param shape The shape to rotate.
     * @return The shape passed rotated 180 radians on the Y axis.
     */
    public static VoxelShape rotate180Y(VoxelShape shape) {
        return rotateY(ONE_HUNDRED_EIGHTY_DEGREES, shape);
    }

    /**
     * @param shape The shape to rotate.
     * @return The shape passed rotated 270 radians on the Y axis.
     */
    public static VoxelShape rotate270Y(VoxelShape shape) {
        return rotateY(TWO_HUNDRED_SEVENTY_DEGREES, shape);
    }

    /**
     * Rotates each box the number of radians on the Y axis.
     *
     * @param radians The degree to rotate.
     * @param shape   The shape to rotate.
     * @return A VoxelShape that contains all the boxes rotated.
     */
    private static VoxelShape rotateY(double radians, VoxelShape shape) {
        VoxelShape rotatedShapes = VoxelShapes.empty();
        List<Box> boxList = shape.getBoundingBoxes();

        for (Box box : boxList) {
            Pair<Double, Double> min = rotatePoint(box.minX, box.minZ, radians);
            Pair<Double, Double> max = rotatePoint(box.maxX, box.maxZ, radians);

            // Store the x and z coordinates in two pairs
            Pair<Double, Double> x = Pair.of(min.getFirst(), max.getFirst());
            Pair<Double, Double> z = Pair.of(min.getSecond(), max.getSecond());

            // Swap the minimum and maximum x or z coordinate if the minimum is greater than
            // the maximum.
            if (x.getFirst() > x.getSecond()) {
                x = x.swap();
            }
            if (z.getFirst() > z.getSecond()) {
                z = z.swap();
            }

            // Build the new box
            VoxelShape rotated = VoxelShapes.cuboid(x.getFirst(), box.minY, z.getFirst(), x.getSecond(), box.maxY,
                    z.getSecond());

            rotatedShapes = VoxelShapes.union(rotatedShapes, rotated);
        }
        return rotatedShapes;
    }

    private static Pair<Double, Double> rotatePoint(double p1, double p2, double rotation) {
        return rotatePoint(p1, p2, rotation, CENTER);
    }

    private static Pair<Double, Double> rotatePoint(double p1, double p2, double rotation, double center) {
        return Pair.of(((p1 - center) * Math.cos(rotation) - ((p2 - center) * Math.sin(rotation))) + center,
                ((p1 - center) * Math.sin(rotation)) + ((p2 - center) * Math.cos(rotation)) + center);
    }
}
