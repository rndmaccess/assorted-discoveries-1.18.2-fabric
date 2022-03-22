package rndm_access.assorteddiscoveries.client.entity.layers;

import net.minecraft.client.render.entity.model.DrownedEntityModel;
import net.minecraft.util.Identifier;
import rndm_access.assorteddiscoveries.Reference;

public class ADCharredRemnantOuterLayer<T extends ADCharredRemnant> extends RenderLayer<T, DrownedEntityModel<T>> {
    private static final Identifier TEXTURE = new Identifier(Reference.MOD_ID, "textures/entity/zombie/charred_remnant_outer_layer.png");
    private final DrownedEntityModel<T> model;

    public ADCharredRemnantOuterLayer(RenderLayerParent<T, DrownedEntityModel<T>> render, EntityModelSet modelSet) {
        super(render);
        // new DrownedModel<>(0.25F, 0.0F, 64, 64);
        this.model = new DrownedEntityModel<>(modelSet.bakeLayer(ModelLayers.DROWNED_OUTER_LAYER));
    }

    @Override
    public void render(PoseStack stack, MultiBufferSource buffer, int p_225628_3_, T p_225628_4_, float p_225628_5_,
            float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
        coloredCutoutModelCopyLayerRender(this.getParentModel(), this.model, TEXTURE,
                stack, buffer, p_225628_3_, p_225628_4_, p_225628_5_, p_225628_6_, p_225628_8_, p_225628_9_,
                p_225628_10_, p_225628_7_, 1.0F, 1.0F, 1.0F);
    }
}
