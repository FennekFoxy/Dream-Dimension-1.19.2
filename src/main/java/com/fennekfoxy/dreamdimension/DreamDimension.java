package com.fennekfoxy.dreamdimension;

import com.fennekfoxy.dreamdimension.block.ModBlocks;
import com.fennekfoxy.dreamdimension.effect.ModEffects;
import com.fennekfoxy.dreamdimension.entity.ModEntities;
import com.fennekfoxy.dreamdimension.entity.ModEntityAttributes;
import com.fennekfoxy.dreamdimension.event.PlayerSleepHandler;
import com.fennekfoxy.dreamdimension.fluid.ModFluids;
import com.fennekfoxy.dreamdimension.item.ModItems;
import com.fennekfoxy.dreamdimension.painting.ModPaintings;
import com.fennekfoxy.dreamdimension.util.ModLootTableModifiers;
import com.fennekfoxy.dreamdimension.villager.ModVillagers;
import com.fennekfoxy.dreamdimension.world.biome.ModBiomes;
import com.fennekfoxy.dreamdimension.world.dimension.ModDimensions;
import com.fennekfoxy.dreamdimension.world.feature.ModConfiguredFeatures;
import com.fennekfoxy.dreamdimension.world.gamerule.ModGameRules;
import com.fennekfoxy.dreamdimension.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class DreamDimension implements ModInitializer {
	public static final String MOD_ID = "dreamdimension";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		ModBiomes.registerBiomes();
		ModDimensions.register();
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModEntities.registerEntities();
		ModEntityAttributes.registerAttributes();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModGameRules.registerGameRules();
		ModEffects.registerEffects();

		ModVillagers.registerVillagers();

		ModPaintings.RegisterPaintings();

		ModLootTableModifiers.modifyLootTables();

		EntitySleepEvents.STOP_SLEEPING.register(new PlayerSleepHandler());

		ModFluids.register();
		ModOreGeneration.generateOres();

		// Check if the optional mod (examplemod) is present
		if (FabricLoader.getInstance().isModLoaded("examplemod")) {
			// If the mod is present, register features that depend on the mod
			//registerExampleModCompat();
		}
	}
}