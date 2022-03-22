package rndm_access.assorteddiscoveries.common.levelgen.structure;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.JigsawFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;

public class ADCabinFeature extends JigsawFeature {

    public ADCabinFeature(Codec<JigsawConfiguration> config) {
        super(config, 0, false, true, ADCabinFeature::checkLocation);
    }

    /**
     * This method prevents cabins from spawning in water.
     *
     * @param config
     * @return True if this cabin can spawn.
     */
    private static boolean checkLocation(PieceGeneratorSupplier.Context<JigsawConfiguration> config) {
        BlockPos blockPos = config.chunkPos().getWorldPosition();
        int landHeight = config.chunkGenerator().getFirstOccupiedHeight(blockPos.getX(), blockPos.getZ(),
                Heightmap.Types.WORLD_SURFACE_WG, config.heightAccessor());
        NoiseColumn columnOfBlocks = config.chunkGenerator().getBaseColumn(blockPos.getX(), blockPos.getZ(),
                config.heightAccessor());

        BlockState topBlock = columnOfBlocks.getBlock(landHeight);

        return topBlock.getFluidState().isEmpty();
    }

    @Override
    public Decoration step() {
        return Decoration.SURFACE_STRUCTURES;
    }
}
