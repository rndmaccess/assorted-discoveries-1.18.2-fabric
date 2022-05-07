package rndm_access.assorteddiscoveries.client.entity;

import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.DrownedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.client.entity.layers.ADCharredRemnantOuterLayer;
import rndm_access.assorteddiscoveries.common.entity.hostile.ADCharredRemnant;

public class ADCharredRemnantRenderer extends ZombieBaseEntityRenderer<ADCharredRemnant, DrownedEntityModel<ADCharredRemnant>> {
    private static final Identifier TEXTURE = new Identifier(ADReference.MOD_ID, "textures/entity/zombie/charred_remnant.png");

    public ADCharredRemnantRenderer(EntityRendererFactory.Context context) {
        super(context, new DrownedEntityModel<>(context.getPart(EntityModelLayers.DROWNED)),
                new DrownedEntityModel<>(context.getPart(EntityModelLayers.DROWNED_INNER_ARMOR)),
                new DrownedEntityModel<>(context.getPart(EntityModelLayers.DROWNED_OUTER_ARMOR)));
        this.addFeature(new ADCharredRemnantOuterLayer<>(this, context.getModelLoader()));
    }

    public Identifier getTexture(ZombieEntity zombieEntity) {
        return TEXTURE;
    }

    protected void setupTransforms(ADCharredRemnant charredRemnantEntity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(charredRemnantEntity, matrixStack, f, g, h);
        float i = charredRemnantEntity.getLeaningPitch(h);
        if (i > 0.0F) {
            matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(MathHelper.lerp(i,
                    charredRemnantEntity.getPitch(), -10.0F - charredRemnantEntity.getPitch())));
        }
    }

    @Override
    protected int getBlockLight(ADCharredRemnant entity, BlockPos pos) {
        return 15;
    }
}
