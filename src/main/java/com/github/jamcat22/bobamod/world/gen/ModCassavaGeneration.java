package com.github.jamcat22.bobamod.world.gen;

import com.github.jamcat22.bobamod.world.feature.ModPlacedFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModCassavaGeneration {
    public static void generateCassava() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CASSAVA_PLACED.getKey().get());
    }
}
