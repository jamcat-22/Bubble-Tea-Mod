package com.github.jamcat22.bobamod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent APPLE_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent APPLE_MILK_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent BERRY_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent BERRY_MILK_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent WATERMELON_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent WATERMELON_MILK_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent CACTUS_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 90, 0), 1.0f).build();
    public static final FoodComponent CHOCOMILK_BOBA = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
}
