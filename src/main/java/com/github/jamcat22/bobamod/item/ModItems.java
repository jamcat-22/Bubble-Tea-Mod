package com.github.jamcat22.bobamod.item;

import com.github.jamcat22.bobamod.BobaMod;
import com.github.jamcat22.bobamod.block.ModBlocks;
import com.github.jamcat22.bobamod.item.custom.BobaItem;
import com.github.jamcat22.bobamod.item.custom.BobaMilkItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item APPLE_BOBA = registerItem("apple_boba", 
            new BobaItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.APPLE_BOBA).maxCount(16)));
    public static final Item APPLE_MILK_BOBA = registerItem("apple_milk_boba", 
            new BobaMilkItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.APPLE_MILK_BOBA).maxCount(16)));
    public static final Item BERRY_BOBA = registerItem("berry_boba", 
            new BobaItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BERRY_BOBA).maxCount(16)));
    public static final Item BERRY_MILK_BOBA = registerItem("berry_milk_boba", 
            new BobaMilkItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BERRY_MILK_BOBA).maxCount(16)));
    public static final Item WATERMELON_BOBA = registerItem("watermelon_boba", 
            new BobaItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.WATERMELON_BOBA).maxCount(16)));
    public static final Item WATERMELON_MILK_BOBA = registerItem("watermelon_milk_boba", 
            new BobaMilkItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.WATERMELON_MILK_BOBA).maxCount(16)));
    public static final Item CACTUS_BOBA = registerItem("cactus_boba", 
            new BobaItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CACTUS_BOBA).maxCount(16)));
    public static final Item CHOCOMILK_BOBA = registerItem("chocomilk_boba", 
            new BobaMilkItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CHOCOMILK_BOBA).maxCount(16)));
    
    public static final Item TAPIOCA_PEARLS = registerItem("tapioca_pearls", new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));
    public static final Item RAW_TAPIOCA_PEARLS = registerItem("raw_tapioca_pearls", new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));
    public static final Item TAPIOCA_FLOUR = registerItem("tapioca_flour", new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));
    public static final Item CASSAVA = registerItem("cassava", new AliasedBlockItem(ModBlocks.CASSAVA_CROP, new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BobaMod.MOD_ID, name), item);
    } 

    public static void registerModItems() {
        BobaMod.LOGGER.info("Registering Mod Items for " + BobaMod.MOD_ID);
    }
}