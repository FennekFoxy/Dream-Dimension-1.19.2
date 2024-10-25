package com.fennekfoxy.dreamdimension.world.biome;


import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class PeacefulMeadowsBiome {


    public static Biome createPeacefulMeadows() {
        // Biome spawn settings
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnSettings);

        // Biome generation settings
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultGrass(generationSettings);
        DefaultBiomeFeatures.addPlainsTallGrass(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);

        // Biome effects
        BiomeEffects.Builder biomeEffects = new BiomeEffects.Builder()
                .skyColor(0x77ADFF) // Light blue sky
                .waterColor(0x3F76E4) // Light blue water
                .waterFogColor(0x050533)
                .fogColor(0xC0D8FF)
                .grassColorModifier(BiomeEffects.GrassColorModifier.NONE);

        // Build the biome
        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.7F) // Moderate temperature
                .downfall(0.8F) // Regular rainfall
                .effects(biomeEffects.build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}