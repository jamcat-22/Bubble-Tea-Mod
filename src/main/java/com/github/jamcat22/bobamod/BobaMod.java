package com.github.jamcat22.bobamod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.jamcat22.bobamod.block.ModBlocks;
import com.github.jamcat22.bobamod.item.ModItems;
import com.github.jamcat22.bobamod.util.ModRegistries;
import com.github.jamcat22.bobamod.world.feature.ModConfiguredFeatures;
import com.github.jamcat22.bobamod.world.gen.ModWorldGen;

public class BobaMod implements ModInitializer {
	public static final String MOD_ID = "bobamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();
	}
}
