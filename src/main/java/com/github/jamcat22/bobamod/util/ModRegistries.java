package com.github.jamcat22.bobamod.util;

import com.github.jamcat22.bobamod.item.ModItems;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCustomTrades();
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(ModItems.TAPIOCA_PEARLS, 16),
                        8,2,0.03f));
                });
        
        TradeOfferHelper.registerWanderingTraderOffers(1,
        factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.CASSAVA, 6),
                    9,2,0.03f));
        });
    }
}
