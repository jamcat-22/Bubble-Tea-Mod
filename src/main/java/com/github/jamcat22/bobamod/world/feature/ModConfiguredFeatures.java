package com.github.jamcat22.bobamod.world.feature;

import java.util.List;

import com.github.jamcat22.bobamod.BobaMod;
import com.github.jamcat22.bobamod.block.ModBlocks;
import com.github.jamcat22.bobamod.block.custom.WildCassavaCropBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_CASSAVA = ConfiguredFeatures.register("patch_cassava", Feature.RANDOM_PATCH, 
    ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of((BlockState)ModBlocks.WILD_CASSAVA_CROP.getDefaultState().with(WildCassavaCropBlock.AGE, 7))), List.of(Blocks.GRASS_BLOCK, Blocks.DIRT)));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BobaMod.MOD_ID);
    }
}
