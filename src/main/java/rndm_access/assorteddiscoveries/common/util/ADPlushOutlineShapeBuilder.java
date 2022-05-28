package rndm_access.assorteddiscoveries.common.util;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import rndm_access.assorteddiscoveries.common.block.ADDirectionalPlushBlock;
import rndm_access.assorteddiscoveries.common.block.ADDirectionalTallPlushBlock;

/**
 * This class builds the north outline shape for most plush blocks.
 * The outline shape produced will automatically be rotated when passed
 * to the constructor in {@link ADDirectionalPlushBlock} or {@link ADDirectionalTallPlushBlock}.
 */
public class ADPlushOutlineShapeBuilder {
    private VoxelShape shapes;

    public ADPlushOutlineShapeBuilder() {
        this.shapes = VoxelShapes.empty();
    }

    public ADPlushOutlineShapeBuilder(VoxelShape shapes) {
        this.shapes = shapes;
    }

    public ADPlushOutlineShapeBuilder addBottomMagmaCubeBodyShape() {
        VoxelShape bottomBody = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 9.0D, 13.0D);

        this.combineShapes(bottomBody);
        return this;
    }

    public ADPlushOutlineShapeBuilder addMiddleMagmaCubeBodyShape() {
        VoxelShape middleBody = Block.createCuboidShape(4.0D, 7.0D, 4.0D, 12.0D, 16.0D, 12.0D);

        this.combineShapes(middleBody);
        return this;
    }

    public ADPlushOutlineShapeBuilder addTopMagmaCubeBodyShape() {
        VoxelShape topBody = Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D);

        this.combineShapes(topBody);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBottomMagmaCubeEyeShapes() {
        VoxelShape bottomLeftEye = Block.createCuboidShape(10.0D, 5.0D, 2.5D, 12.0D, 7.0D, 3.0D);
        VoxelShape bottomRightEye = Block.createCuboidShape(4.0D, 5.0D, 2.5D, 6.0D, 7.0D, 3.0D);

        this.combineShapes(bottomLeftEye, bottomRightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addMiddleMagmaCubeEyeShapes() {
        VoxelShape middleLeftEye = Block.createCuboidShape(9.0D, 13.0D, 3.5D, 10.5D, 14.5D, 4.0D);
        VoxelShape middleRightEye = Block.createCuboidShape(5.0D, 13.0D, 3.5D, 6.5D, 14.5D, 4.0D);

        this.combineShapes(middleLeftEye, middleRightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addTopMagmaCubeEyeShapes() {
        VoxelShape topLeftEye = Block.createCuboidShape(6.5D, 2.0D, 5.5D, 7.5D, 3.0D, 6.0D);
        VoxelShape topRightEye = Block.createCuboidShape(8.5D, 2.0D, 5.5D, 9.5D, 3.0D, 6.0D);

        this.combineShapes(topLeftEye, topRightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBottomSlimeMouthShape() {
        VoxelShape bottomMouth = Block.createCuboidShape(6.0D, 2.0D, 2.5D, 7.0D, 3.0D, 3.0D);

        this.combineShapes(bottomMouth);
        return this;
    }

    public ADPlushOutlineShapeBuilder addMiddleSlimeMouthShape() {
        VoxelShape middleMouth = Block.createCuboidShape(6.5D, 10.5D, 3.5D, 7.5D, 11.5D, 4.0D);

        this.combineShapes(middleMouth);
        return this;
    }

    public ADPlushOutlineShapeBuilder addTopSlimeMouthShape() {
        VoxelShape topMouth = Block.createCuboidShape(7.0D, 1.0D, 5.5D, 7.5D, 1.5D, 6.0D);

        this.combineShapes(topMouth);
        return this;
    }

    public ADPlushOutlineShapeBuilder addAnimalTorsoShape() {
        VoxelShape torso = Block.createCuboidShape(4.5D, 2.5D, 4.5D, 11.5D, 9.0D, 14.5D);

        this.combineShapes(torso);
        return this;
    }

    public ADPlushOutlineShapeBuilder addAnimalHeadShape() {
        VoxelShape head = Block.createCuboidShape(4.0D, 5.0D, 1.5D, 12.0D, 13.0D, 9.5D);

        this.combineShapes(head);
        return this;
    }

    public ADPlushOutlineShapeBuilder addAnimalLegShapes() {
        VoxelShape frontRightLeg = Block.createCuboidShape(4.5D, 0.0D, 4.5D, 7.0D, 2.5D, 7.0D);
        VoxelShape backLeftLeg = Block.createCuboidShape(9.0D, 0.0D, 12.0D, 11.5D, 2.5D, 14.5D);
        VoxelShape frontLeftLeg = Block.createCuboidShape(9.0D, 0.0D, 4.5D, 11.5D, 2.5D, 7.0D);
        VoxelShape backRightLeg = Block.createCuboidShape(4.5D, 0.0D, 12.0D, 7.0D, 2.5D, 14.5D);

        this.combineShapes(frontRightLeg, backLeftLeg, frontLeftLeg, backRightLeg);
        return this;
    }

    public ADPlushOutlineShapeBuilder addAnimalEyeShapes() {
        VoxelShape leftEye = Block.createCuboidShape(9.0D, 9.0D, 1.0D, 11.0D, 11.0D, 1.5D);
        VoxelShape rightEye = Block.createCuboidShape(5.0D, 9.0D, 1.0D, 7.0D, 11.0D, 1.5D);

        this.combineShapes(leftEye, rightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addAnimalSnoutShape() {
        VoxelShape snout = Block.createCuboidShape(6.0D, 6.0D, 0.5D, 10.0D, 8.0D, 1.5D);

        this.combineShapes(snout);
        return this;
    }

    public ADPlushOutlineShapeBuilder addPiglinSnoutShape() {
        VoxelShape snout = Block.createCuboidShape(6.0D, 8.0D, 4.0D, 10.0D, 10.0D, 5.0D);

        this.combineShapes(snout);
        return this;
    }

    public ADPlushOutlineShapeBuilder addPiglinEarShapes() {
        VoxelShape rightEar = Block.createCuboidShape(1.5D, 9.0D, 8.0D, 3.5D, 12.0D, 12.0D);
        VoxelShape leftEar = Block.createCuboidShape(11.5D, 9.0D, 8.0D, 14.0D, 12.0D, 12.0D);

        this.combineShapes(rightEar, leftEar);
        return this;
    }

    public ADPlushOutlineShapeBuilder addHumanoidHeadShape() {
        VoxelShape head = Block.createCuboidShape(3.5D, 7.0D, 5.0D, 12.5D, 15.0D, 13.5D);

        this.combineShapes(head);
        return this;
    }

    public ADPlushOutlineShapeBuilder addHumanoidTorsoShape() {
        VoxelShape torso = Block.createCuboidShape(4.0D, 2.0D, 7.0D, 12.0D, 7.0D, 12.0D);

        this.combineShapes(torso);
        return this;
    }

    public ADPlushOutlineShapeBuilder addHumanoidLegShapes() {
        VoxelShape leftLeg = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 11.5D, 2.0D, 11.0D);
        VoxelShape rightLeg = Block.createCuboidShape(4.5D, 0.0D, 8.0D, 7.5D, 2.0D, 11.0D);

        this.combineShapes(leftLeg, rightLeg);
        return this;
    }

    public ADPlushOutlineShapeBuilder addHumanoidEyeShapes() {
        VoxelShape leftEye = Block.createCuboidShape(9.0D, 11.0D, 4.5D, 11.0D, 13.0D, 5.0D);
        VoxelShape rightEye = Block.createCuboidShape(5.0D, 11.0D, 4.5D, 7.0D, 13.0D, 5.0D);

        this.combineShapes(leftEye, rightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addPiglinArmShapes() {
        VoxelShape leftArm = Block.createCuboidShape(12.0D, 3.0D, 7.5D, 14.5D, 8.0D, 10.5D);
        VoxelShape rightArm = Block.createCuboidShape(1.5D, 3.0D, 7.5D, 4.0D, 8.0D, 10.5D);

        this.combineShapes(leftArm, rightArm);
        return this;
    }

    public ADPlushOutlineShapeBuilder addZombieArmShapes() {
        VoxelShape leftArm = Block.createCuboidShape(11.0D, 5.0D, 3.0D, 14.0D, 8.0D, 10.5D);
        VoxelShape rightArm = Block.createCuboidShape(2.0D, 5.0D, 3.0D, 5.0D, 8.0D, 10.5D);

        this.combineShapes(leftArm, rightArm);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWolfTailShape() {
        VoxelShape tail = Block.createCuboidShape(7.0D, 2.5D, 14.0D, 9.0D, 8.0D, 16.0D);

        this.combineShapes(tail);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWolfEarShapes() {
        VoxelShape leftEarShape = Block.createCuboidShape(9.0D, 13.0D, 3.0D, 12.0D, 15.0D, 5.0D);
        VoxelShape rightEarShape = Block.createCuboidShape(4.0D, 13.0D, 3.0D, 7.0D, 15.0D, 5.0D);

        this.combineShapes(leftEarShape, rightEarShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSheepLegShapes() {
        VoxelShape frontRightLeg = Block.createCuboidShape(4.5D, 1.0D, 4.5D, 7.0D, 2.5D, 7.0D);
        VoxelShape frontLeftLeg = Block.createCuboidShape(9.0D, 1.0D, 4.5D, 11.5D, 2.5D, 7.0D);
        VoxelShape backRightLeg = Block.createCuboidShape(4.5D, 1.0D, 12.0D, 7.0D, 2.5D, 14.5D);
        VoxelShape backLeftLeg = Block.createCuboidShape(9.0D, 1.0D, 12.0D, 11.5D, 2.5D, 14.5D);

        this.combineShapes(frontRightLeg, frontLeftLeg, backRightLeg, backLeftLeg);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSheepFootShapes() {
        VoxelShape frontRightFoot = Block.createCuboidShape(5.0D, 0.0D, 5.0D, 6.5D, 1.0D, 6.5D);
        VoxelShape frontLeftFoot = Block.createCuboidShape(9.5D, 0.0D, 5.0D, 11.0D, 1.0D, 6.5D);
        VoxelShape backRightFoot = Block.createCuboidShape(5.0D, 0.0D, 12.5D, 6.5D, 1.0D, 14.0D);
        VoxelShape backLeftFoot = Block.createCuboidShape(9.5D, 0.0D, 12.5D, 11.0D, 1.0D, 14.0D);

        this.combineShapes(frontRightFoot, frontLeftFoot, backRightFoot, backLeftFoot);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSheepEyeShapes() {
        VoxelShape leftEye = Block.createCuboidShape(9.0D, 8.0D, 1.0D, 11.0D, 10.0D, 1.5D);
        VoxelShape rightEye = Block.createCuboidShape(5.0D, 8.0D, 1.0D, 7.0D, 10.0D, 1.5D);

        this.combineShapes(leftEye, rightEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSheepMouthShape() {
        VoxelShape mouth = Block.createCuboidShape(7.5D, 6.0D, 1.0D, 8.5D, 7.0D, 1.5D);

        this.combineShapes(mouth);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBlazeHeadShape() {
        VoxelShape head = Block.createCuboidShape(4.5D, 8.0D, 5.5D, 11.5D, 15.0D, 12.5D);

        this.combineShapes(head);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBlazeEyeShapes() {
        VoxelShape rightEye = Block.createCuboidShape(5.5D, 11.0D, 5.0D, 7.5D, 13.0D, 5.5D);
        VoxelShape leftEye = Block.createCuboidShape(8.5D, 11.0D, 5.0D, 10.5D, 13.0D, 5.5D);

        this.combineShapes(rightEye, leftEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBlazeRodShapes() {
        VoxelShape rightFrontBottomRod = Block.createCuboidShape(4.5D, 1.0D, 5.5D, 6.5D, 7.0D, 7.5D);
        VoxelShape rightBackBottomRod = Block.createCuboidShape(4.5D, 1.0D, 10.5D, 6.5D, 7.0D, 12.5D);
        VoxelShape leftFrontBottomRod = Block.createCuboidShape(9.5D, 1.0D, 5.5D, 11.5D, 7.0D, 7.5D);
        VoxelShape leftBackBottomRod = Block.createCuboidShape(9.5D, 1.0D, 10.5D, 11.5D, 7.0D, 12.5D);
        VoxelShape middleTopRod = Block.createCuboidShape(7.0D, 6.0D, 13.0D, 9.0D, 12.0D, 15.0D);
        VoxelShape leftTopRod = Block.createCuboidShape(12.5D, 6.0D, 8.0D, 14.5D, 12.0D, 10.0D);
        VoxelShape rightTopRod = Block.createCuboidShape(1.5D, 6.0D, 8.0D, 3.5D, 12.0D, 10.0D);

        this.combineShapes(rightFrontBottomRod, rightBackBottomRod, leftFrontBottomRod,
                leftBackBottomRod, middleTopRod, leftTopRod, rightTopRod);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatEyeShapes() {
        VoxelShape rightEye = Block.createCuboidShape(8.5D, 6.0D, 0.5D, 10.5D, 8.0D, 1.0D);
        VoxelShape leftEye = Block.createCuboidShape(5.5D, 6.0D, 0.5D, 7.5D, 8.0D, 1.0D);

        this.combineShapes(rightEye, leftEye);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatHeadShape() {
        VoxelShape head = Block.createCuboidShape(4.5D, 3.0D, 1.0D, 11.5D, 9.5D, 8.0D);

        this.combineShapes(head);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatEarShapes() {
        VoxelShape rightEarShape = Block.createCuboidShape(5.0D, 9.5D, 3.5D, 7.0D, 11.0D, 6.5D);
        VoxelShape leftEarShape = Block.createCuboidShape(9.0D, 9.5D, 3.5D, 11.0D, 11.0D, 6.5D);

        this.combineShapes(rightEarShape, leftEarShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatLegShapes() {
        VoxelShape frontRightLeg = Block.createCuboidShape(5.0D, 0.0D, 4.0D, 7.0D, 2.0D, 6.0D);
        VoxelShape frontLeftLeg = Block.createCuboidShape(9.0D, 0.0D, 4.0D, 11.0D, 2.0D, 6.0D);
        VoxelShape backRightLeg = Block.createCuboidShape(5.0D, 0.0D, 10.0D, 7.0D, 2.0D, 12.0D);
        VoxelShape backLeftLeg = Block.createCuboidShape(9.0D, 0.0D, 10.0D, 11.0D, 2.0D, 12.0D);

        this.combineShapes(frontRightLeg, frontLeftLeg, backRightLeg, backLeftLeg);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatTorsoShape() {
        VoxelShape torso = Block.createCuboidShape(5.0D, 2.0D, 4.0D, 11.0D, 7.0D, 12.0D);

        this.combineShapes(torso);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCatSnoutShape() {
        VoxelShape snout = Block.createCuboidShape(6.5D, 3.5D, 0.0D, 9.5D, 5.5D, 1.0D);

        this.combineShapes(snout);
        return this;
    }

    public ADPlushOutlineShapeBuilder addPersianCatNoseShape() {
        VoxelShape nose = Block.createCuboidShape(7.5D, 4.5D, 0.5D, 8.5D, 5.5D, 1.0D);

        this.combineShapes(nose);
        return this;
    }

    public ADPlushOutlineShapeBuilder addDesertVillagerHatShape() {
        VoxelShape hatMain = Block.createCuboidShape(3.0D, 12.0D, 4.5D, 13.0D, 14.0D, 13.0D);
        VoxelShape hatPompom = Block.createCuboidShape(6.0D, 14.0D, 7.0D, 10.0D, 15.0D, 10.5D);

        this.combineShapes(hatMain, hatPompom);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSavannaVillagerHeadbandShape() {
        VoxelShape headbandShape = Block.createCuboidShape(3.0D, 12.0D, 4.5D, 13.0D, 13.0D, 13.0D);

        this.combineShapes(headbandShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSnowVillagerHatShape() {
        VoxelShape snowHatShape = Block.createCuboidShape(3.0D, 11.0D, 4.5D, 13.0D, 15.0D, 13.0D);

        this.combineShapes(snowHatShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addSwampVillagerHatShapes() {
        VoxelShape hatTopShape = Block.createCuboidShape(3.0, 13.0, 4.5, 13.0, 15.0, 13.0);
        VoxelShape hatLeftBackDetailShape = Block.createCuboidShape(9.0, 12.0, 9.0, 13.0, 13.0, 13.0);
        VoxelShape hatRightBackDetailShape = Block.createCuboidShape(3.0, 11.0, 9.0, 6.5, 13.0, 13.0);
        VoxelShape hatLeftFrontDetailShape = Block.createCuboidShape(11.0, 12.0, 4.5, 13.0, 13.0, 6.5);
        VoxelShape hatMiddleFrontDetail0Shape = Block.createCuboidShape(5.0, 12.0, 4.5, 9.0, 13.0, 5.5);
        VoxelShape hatMiddleFrontDetail1Shape = Block.createCuboidShape(8.0, 11.0, 4.5, 9.0, 12.0, 5.5);

        this.combineShapes(hatTopShape, hatLeftBackDetailShape, hatRightBackDetailShape,
                hatLeftFrontDetailShape, hatMiddleFrontDetail0Shape, hatMiddleFrontDetail1Shape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWanderingTraderHoodShapes() {
        VoxelShape hoodFullShape = Block.createCuboidShape(3.0D, 5.0D, 4.5D, 13.0D, 15.0D, 13.0D);
        VoxelShape hoodOpeningShape = Block.createCuboidShape(4.0D, 5.0D, 4.5D, 12.0D, 11.0D, 5.5D);
        VoxelShape hoodShape = ADVoxelShapeHelper.cutBox(hoodFullShape, hoodOpeningShape);

        this.combineShapes(hoodShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerHeadShape() {
        VoxelShape headShape = Block.createCuboidShape(4.0D, 5.0D, 5.5D, 12.0D, 14.0D, 12.0D);

        this.combineShapes(headShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerTorsoShape() {
        VoxelShape torsoShape = Block.createCuboidShape(5.0D, 1.5D, 7.0D, 11.0D, 5.0D, 11.0D);

        this.combineShapes(torsoShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerFootShapes() {
        VoxelShape rightFootShape = Block.createCuboidShape(5.5D, 0.0D, 8.0D, 7.5D, 1.5D, 10.0D);
        VoxelShape leftFootShape = Block.createCuboidShape(8.5D, 0.0D, 8.0D, 10.5D, 1.5D, 10.0D);

        this.combineShapes(rightFootShape, leftFootShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerEyeShapes() {
        VoxelShape leftEyeShape = Block.createCuboidShape(8.5D, 8.0D, 5.0D, 10.5D, 10.0D, 5.5D);
        VoxelShape rightEyeShape = Block.createCuboidShape(5.5D, 8.0D, 5.0D, 7.5D, 10.0D, 5.5D);

        this.combineShapes(leftEyeShape, rightEyeShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerNoseShape() {
        VoxelShape noseShape = Block.createCuboidShape(7.0D, 4.5D, 3.5D, 9.0D, 7.5D, 5.5D);

        this.combineShapes(noseShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addVillagerArmShape() {
        VoxelShape armShape = Block.createCuboidShape(4.5D, 1.5D, 5.0D, 11.5D, 5.0D, 9.0D);

        this.combineShapes(armShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addZombieVillagerArmShapes() {
        VoxelShape leftArmShape = Block.createCuboidShape(11.0D, 2.0D, 3.0D, 14.0D, 5.0D, 10.5D);
        VoxelShape rightArmShape = Block.createCuboidShape(2.0D, 2.0D, 3.0D, 5.0D, 5.0D, 10.5D);

        this.combineShapes(leftArmShape, rightArmShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitchHatShapes() {
        VoxelShape hatRimShape = Block.createCuboidShape(3.0D, 11.0D, 4.5D, 13.0D, 12.0D, 13.0D);
        VoxelShape hatMiddleShape = Block.createCuboidShape(4.0D, 12.0D, 5.5D, 12.0D, 15.0D, 12.0D);
        VoxelShape hatTopShape = Block.createCuboidShape(6.0D, 15.0D, 7.5D, 10.0D, 17.5D, 10.0D);
        VoxelShape hatPointShape = Block.createCuboidShape(6.5D, 17.5D, 8.5D, 9.0D, 19.5D, 9.5D);

        this.combineShapes(hatRimShape, hatMiddleShape, hatTopShape, hatPointShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitchWartShape() {
        VoxelShape wartShape = Block.createCuboidShape(7.0D, 5.0D, 2.5D, 8.0D, 6.0D, 3.5D);

        this.combineShapes(wartShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowTorsoShape() {
        VoxelShape torsoShape = Block.createCuboidShape(4.5D, 2.0D, 6.0D, 11.5D, 8.0D, 14.5D);

        this.combineShapes(torsoShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowHeadShape() {
        VoxelShape headShape = Block.createCuboidShape(4.0D, 5.5D, 3.0D, 12.0D, 13.0D, 10.5D);

        this.combineShapes(headShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowSnoutShape() {
        VoxelShape snoutShape = Block.createCuboidShape(6.0D, 6.0D, 1.5D, 10.0D, 9.0D, 3.5D);

        this.combineShapes(snoutShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowUtterShape() {
        VoxelShape utterShape = Block.createCuboidShape(7.0D, 1.0D, 11.5D, 9.0D, 3.0D, 15.0D);

        this.combineShapes(utterShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowLegShapes() {
        VoxelShape backLeftLegShape = Block.createCuboidShape(9.5D, 0.0D, 12.5D, 11.5D, 2.0D, 14.5D);
        VoxelShape backRightLegShape = Block.createCuboidShape(4.5D, 0.0D, 12.5D, 6.5D, 2.0D, 14.5D);
        VoxelShape frontRightLegShape = Block.createCuboidShape(4.5D, 0.0D, 6.0D, 6.5D, 2.0D, 8.0D);
        VoxelShape frontLeftLegShape = Block.createCuboidShape(9.5D, 0.0D, 6.0D, 11.5D, 2.0D, 8.0D);

        this.combineShapes(backLeftLegShape, backRightLegShape, frontRightLegShape, frontLeftLegShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowEyeShapes() {
        VoxelShape leftEyeShape = Block.createCuboidShape(9.0D, 9.5D, 2.5D, 11.0D, 11.5D, 3.0D);
        VoxelShape rightEyeShape = Block.createCuboidShape(5.0D, 9.5D, 2.5D, 7.0D, 11.5D, 3.0D);

        this.combineShapes(leftEyeShape, rightEyeShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCowHornShapes() {
        VoxelShape rightHornShape = Block.createCuboidShape(2.5D, 10.5D, 5.0D, 5.0D, 14.0D, 8.0D);
        VoxelShape leftHornShape = Block.createCuboidShape(11.0D, 10.5D, 5.0D, 13.5D, 14.0D, 8.0D);

        this.combineShapes(rightHornShape, leftHornShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addMooshroomMushroomShapes() {
        VoxelShape headMushroomStemShape = Block.createCuboidShape(7.5D, 13.0D, 6.0D, 8.5D, 14.0D, 7.0D);
        VoxelShape headMushroomBottomShape = Block.createCuboidShape(6.0D, 14.0D, 4.5D, 10.0D, 15.0D, 8.5D);
        VoxelShape headMushroomTopShape = Block.createCuboidShape(7.0D, 15.0D, 5.5D, 9.0D, 16.0D, 7.5D);

        this.combineShapes(headMushroomStemShape, headMushroomBottomShape, headMushroomTopShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCreeperHeadShape() {
        VoxelShape headShape = Block.createCuboidShape(4.0, 6.0, 4.0D, 12.0D, 14.0D, 12.0D);

        this.combineShapes(headShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCreeperTorsoShape() {
        VoxelShape torsoShape = Block.createCuboidShape(6.0D, 2.0D, 6.5D, 10.0D, 6.0D, 9.5D);

        this.combineShapes(torsoShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCreeperFootShapes() {
        VoxelShape backFootShape = Block.createCuboidShape(6.0D, 0.0D, 9.5D, 10.0D, 3.0D, 12.5D);
        VoxelShape frontFootShape = Block.createCuboidShape(6.0D, 0.0D, 3.5D, 10.0D, 3.0D, 6.5D);

        this.combineShapes(backFootShape, frontFootShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCreeperEyeShapes() {
        VoxelShape leftEyeShape = Block.createCuboidShape(9.0D, 10.0D, 3.5D, 11.0D, 12.0D, 4.0D);
        VoxelShape rightEyeShape = Block.createCuboidShape(5.0D, 10.0D, 3.5D, 7.0D, 12.0D, 4.0D);

        this.combineShapes(leftEyeShape, rightEyeShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addCreeperMouthShapes() {
        VoxelShape middleMouthShape = Block.createCuboidShape(7.5D, 8.0D, 3.5D, 8.5D, 9.0D, 4.0D);
        VoxelShape rightMouthShape = Block.createCuboidShape(7.0D, 7.5D, 3.5D, 7.5D, 8.5D, 4.0D);
        VoxelShape leftMouthShape = Block.createCuboidShape(8.5D, 7.5D, 3.5D, 9.0D, 8.5D, 4.0D);

        this.combineShapes(middleMouthShape, rightMouthShape, leftMouthShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBeeBodyShape() {
        VoxelShape bodyShape = Block.createCuboidShape(4.0D, 0.0D, 2.0D, 12.0D, 7.0D, 13.0D);

        this.combineShapes(bodyShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBeeStingerShape() {
        VoxelShape stingerShape = Block.createCuboidShape(7.5D, 3.0D, 13.0D, 8.5D, 4.0D, 14.0D);

        this.combineShapes(stingerShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBeeWingShapes() {
        VoxelShape leftWingShape = Block.createCuboidShape(9.0D, 7.0D, 4.0D, 14.0D, 8.0D, 9.0D);
        VoxelShape rightWingShape = Block.createCuboidShape(2.0D, 7.0D, 4.0D, 7.0D, 8.0D, 9.0D);

        this.combineShapes(leftWingShape, rightWingShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBeeEyeShapes() {
        VoxelShape rightEyeShape = Block.createCuboidShape(3.5D, 2.0D, 1.5D, 7.0D, 5.0D, 4.0D);
        VoxelShape leftEyeShape = Block.createCuboidShape(9.0D, 2.0D, 1.5D, 12.5D, 5.0D, 4.0D);

        this.combineShapes(rightEyeShape, leftEyeShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addBeeLegShapes() {
        VoxelShape frontLeftLegFrontShape = Block.createCuboidShape(12.0D, 0.0D, 4.0D, 14.0D, 1.0D, 5.0D);
        VoxelShape frontLeftLegBack = Block.createCuboidShape(12.0D, 0.0D, 5.0D, 13.0D, 1.0D, 6.0D);
        VoxelShape frontRightLegFront = Block.createCuboidShape(2.0D, 0.0D, 4.0D, 4.0D, 1.0D, 5.0D);
        VoxelShape frontRightLegBack = Block.createCuboidShape(3.0D, 0.0D, 5.0D, 4.0D, 1.0D, 6.0D);
        VoxelShape backLeftLeg = Block.createCuboidShape(12.0D, 0.0D, 11.0D, 13.0D, 1.0D, 12.0D);
        VoxelShape backRightLeg = Block.createCuboidShape(3.0D, 0.0D, 11.0D, 4.0D, 1.0D, 12.0D);

        this.combineShapes(frontLeftLegFrontShape, frontLeftLegBack, frontRightLegFront,
                frontRightLegBack, backLeftLeg, backRightLeg);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitherHeadShape() {
        VoxelShape headShape = Block.createCuboidShape(4.0, 8.0, 4.0, 12.0, 16.0, 12.0);

        this.combineShapes(headShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitherMouthShape() {
        VoxelShape mouthShape = Block.createCuboidShape(6.5, 10.0, 3.5, 9.5, 11.0, 4.0);

        this.combineShapes(mouthShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitherEyeShapes() {
        VoxelShape rightEyeShape = Block.createCuboidShape(5.0, 12.0, 3.5, 7.0, 14.0, 4.0);
        VoxelShape leftEyeShape = Block.createCuboidShape(9.0, 12.0, 3.5, 11.0, 14.0, 4.0);

        this.combineShapes(rightEyeShape, leftEyeShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitherTorsoShapes() {
        VoxelShape mainTorsoShape = Block.createCuboidShape(6.5, 2.0, 6.5, 9.5, 8.0, 9.0);
        VoxelShape torsoBendShape = Block.createCuboidShape(6.5, 0.0, 6.5, 9.5, 4.0, 10.5);

        this.combineShapes(mainTorsoShape, torsoBendShape);
        return this;
    }

    public ADPlushOutlineShapeBuilder addWitherSpikeShapes() {
        VoxelShape topSpikeShape = Block.createCuboidShape(3.0, 5.0, 6.5, 13.0, 7.0, 9.0);
        VoxelShape bottomSpikeShape = Block.createCuboidShape(3.0, 2.0, 6.5, 13.0, 4.0, 9.0);

        this.combineShapes(topSpikeShape, bottomSpikeShape);
        return this;
    }

    protected void combineShapes(VoxelShape... shapes) {
        this.shapes = VoxelShapes.union(this.shapes, shapes);
    }

    public VoxelShape build() {
        return this.shapes;
    }
}
