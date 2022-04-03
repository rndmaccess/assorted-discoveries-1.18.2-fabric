package rndm_access.assorteddiscoveries.client.entity;

import rndm_access.assorteddiscoveries.Reference;
import rndm_access.assorteddiscoveries.common.entity.hostile.ADCharredRemnant;

public class ADCharredRemnantRenderer extends AbstractZombieRenderer<ADCharredRemnant, DrownedModel<ADCharredRemnant>> {
    private static final ResourceLocation CHARRED_REMNANT_LOCATION = new ResourceLocation(Reference.MOD_ID,
            "textures/entity/zombie/charred_remnant.png");

    public ADCharredRemnantRenderer(EntityRendererProvider.Context context) {
        super(context, new DrownedModel<>(context.bakeLayer(ModelLayers.DROWNED)),
                new DrownedModel<>(context.bakeLayer(ModelLayers.DROWNED_INNER_ARMOR)),
                new DrownedModel<>(context.bakeLayer(ModelLayers.DROWNED_OUTER_ARMOR)));
        this.addLayer(new ADCharredRemnantOuterLayer<>(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Zombie zombie) {
        return CHARRED_REMNANT_LOCATION;
    }

    @Override
    protected void setupRotations(ADCharredRemnant charredRemnantEntity, PoseStack stack, float x, float y, float z) {
        super.setupRotations(charredRemnantEntity, stack, x, y, z);
        float f = charredRemnantEntity.getSwimAmount(y);
        if (f > 0.0F) {
            stack.mulPose(Vector3f.XP.rotationDegrees(
                    Mth.lerp(f, charredRemnantEntity.getXRot(), -10.0F - charredRemnantEntity.getXRot())));
        }
    }

    @Override
    protected int getBlockLightLevel(ADCharredRemnant charredRemnantEntity, BlockPos pos) {
        return 15;
    }

    public static class CharredRemnantRendererProvider implements EntityRendererProvider<ADCharredRemnant> {

        @Override
        public EntityRenderer<ADCharredRemnant> create(Context context) {
            return new ADCharredRemnantRenderer(context);
        }
    }
}
