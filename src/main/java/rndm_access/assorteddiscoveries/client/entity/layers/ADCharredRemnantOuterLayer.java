package rndm_access.assorteddiscoveries.client.entity.layers;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.DrownedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.ADReference;
import rndm_access.assorteddiscoveries.common.entity.hostile.ADCharredRemnant;

public class ADCharredRemnantOuterLayer<T extends ADCharredRemnant> extends FeatureRenderer<T, DrownedEntityModel<T>> {
    private static final Identifier SKIN = new Identifier(ADReference.MOD_ID, "textures/entity/zombie/charred_remnant_outer_layer.png");
    private final DrownedEntityModel<T> model;

    public ADCharredRemnantOuterLayer(FeatureRendererContext<T, DrownedEntityModel<T>> render, EntityModelLoader loader) {
        super(render);
        this.model = new DrownedEntityModel<>(loader.getModelPart(EntityModelLayers.DROWNED_OUTER));
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T drownedEntity, float f, float g, float h, float j, float k, float l) {
        render(this.getContextModel(), this.model, SKIN, matrixStack, vertexConsumerProvider, i,
                drownedEntity, f, g, j, k, l, h, 1.0F, 1.0F, 1.0F);
    }
}
