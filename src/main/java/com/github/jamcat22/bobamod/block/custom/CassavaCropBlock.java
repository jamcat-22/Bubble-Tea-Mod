package com.github.jamcat22.bobamod.block.custom;

import com.github.jamcat22.bobamod.item.ModItems;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class CassavaCropBlock extends CropBlock {
    public CassavaCropBlock(Settings settings) {
        super(settings);  
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CASSAVA;
    }
}
