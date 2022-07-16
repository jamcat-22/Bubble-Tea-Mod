package com.github.jamcat22.bobamod.block;

import com.github.jamcat22.bobamod.BobaMod;
import com.github.jamcat22.bobamod.block.custom.CassavaCropBlock;
import com.github.jamcat22.bobamod.block.custom.WildCassavaCropBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block CASSAVA_CROP = registerBlockWithoutItem("cassava_crop", new CassavaCropBlock(FabricBlockSettings.copy(Blocks.CARROTS)));
    public static final Block WILD_CASSAVA_CROP = registerBlockWithoutItem("wild_cassava_crop", new WildCassavaCropBlock(FabricBlockSettings.copy(Blocks.CARROTS)));
    
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(BobaMod.MOD_ID, name), block);
    } 

    public static void registerModBlocks() {
        BobaMod.LOGGER.info("Registering Mod Blocks for " + BobaMod.MOD_ID);
    }
}
