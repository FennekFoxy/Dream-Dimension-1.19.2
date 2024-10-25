package com.fennekfoxy.dreamdimension.world.biome;


import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.registry.BuiltinRegistries;

public class ModBiomes {
    public static final RegistryKey<Biome> PEACEFUL_MEADOWS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(DreamDimension.MOD_ID, "peaceful_meadows"));
    public static final Biome PEACEFUL_MEADOWS = PeacefulMeadowsBiome.createPeacefulMeadows();
    public static final RegistryKey<Biome> OBSIDIAN_SPIKES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(DreamDimension.MOD_ID, "obsidian_spikes"));
    public static final Biome OBSIDIAN_SPIKES = ObsidianSpikesBiome.createObsidianSpikesBiome();

    public static void registerBiomes() {
        Registry.register(BuiltinRegistries.BIOME, PEACEFUL_MEADOWS_KEY.getValue(), PEACEFUL_MEADOWS);
        Registry.register(BuiltinRegistries.BIOME, OBSIDIAN_SPIKES_KEY.getValue(), OBSIDIAN_SPIKES);
    }
}