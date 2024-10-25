package com.fennekfoxy.dreamdimension.world.feature;

import com.fennekfoxy.dreamdimension.DreamDimension;
import com.fennekfoxy.dreamdimension.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_DREAM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DREAM_ORE.getDefaultState()));
/*
    public static final List<OreFeatureConfig.Target> NETHER_DREAM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_DREAM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_DREAM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_DREAM_ORE.getDefaultState()));*/



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DREAM_ORE =
            ConfiguredFeatures.register("dream_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DREAM_ORES, 4));

/*    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_DREAM_ORE =
            ConfiguredFeatures.register("nether_dream_ore",Feature.ORE, new OreFeatureConfig(NETHER_DREAM_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_DREAM_ORE =
            ConfiguredFeatures.register("end_dream_ore",Feature.ORE, new OreFeatureConfig(END_DREAM_ORES, 12));*/


    public static void registerConfiguredFeatures() {
            DreamDimension.LOGGER.debug("Registering the ModConfiguredFeatures for " + DreamDimension.MOD_ID);
    }
}
