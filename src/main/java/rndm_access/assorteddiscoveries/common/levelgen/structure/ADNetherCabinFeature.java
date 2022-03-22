package rndm_access.assorteddiscoveries.common.levelgen.structure;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.JigsawFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;

public class ADNetherCabinFeature extends JigsawFeature {
    private static final int NETHER_CABIN_HEIGHT = 33;

    public ADNetherCabinFeature(Codec<JigsawConfiguration> config) {
        super(config, NETHER_CABIN_HEIGHT, false, false, ADNetherCabinFeature::checkLocation);
    }

    @Override
    public Decoration step() {
        return Decoration.SURFACE_STRUCTURES;
    }

    private static boolean checkLocation(PieceGeneratorSupplier.Context<JigsawConfiguration> config) {
        WorldgenRandom worldgenrandom = new WorldgenRandom(new LegacyRandomSource(0L));
        worldgenrandom.setLargeFeatureSeed(config.seed(), config.chunkPos().x, config.chunkPos().z);

        BlockPos blockPos = config.chunkPos().getWorldPosition();
        NoiseColumn columnOfBlocks = config.chunkGenerator().getBaseColumn(blockPos.getX(), blockPos.getZ(),
                config.heightAccessor());

        return columnOfBlocks.getBlock(34).isAir() && worldgenrandom.nextInt(5) >= 2;
    }
}
