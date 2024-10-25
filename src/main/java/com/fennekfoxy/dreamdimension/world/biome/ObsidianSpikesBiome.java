package com.fennekfoxy.dreamdimension.world.biome;


import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ObsidianSpikesBiome {


    public static Biome createObsidianSpikesBiome() {
        // Biome spawn settings
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(spawnSettings);

        // Biome generation settings
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addPlainsTallGrass(generationSettings);

        // Biome effects
        BiomeEffects.Builder biomeEffects = new BiomeEffects.Builder()
                .skyColor(0x6e0202) // Light blue sky
                .waterColor(0xff0000) // Light blue water
                .waterFogColor(0x6e0202)
                .fogColor(0x6e0202)
                .grassColorModifier(BiomeEffects.GrassColorModifier.NONE);

        // Build the biome
        return new Biome.Builder()
                .precipitation(Biome.Precipitation.NONE)
                .temperature(5F) // Moderate temperature
                .downfall(0F) // Regular rainfall
                .effects(biomeEffects.build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}