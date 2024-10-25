package com.fennekfoxy.dreamdimension.world.dimension;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

import net.minecraft.world.dimension.DimensionType;


public class ModDimensions {
    public static final RegistryKey<World> DREAM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(DreamDimension.MOD_ID, "dreamdim"));
    public static final RegistryKey<DimensionType> DREAM_DIMENSION_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, DREAM_DIMENSION_KEY.getValue());
    public static final RegistryKey<World> NIGHTMARE_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(DreamDimension.MOD_ID, "nightmaredim"));
    public static final RegistryKey<DimensionType> NIGHTMARE_DIMENSION_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, NIGHTMARE_DIMENSION_KEY.getValue());

    public static void register() {
        DreamDimension.LOGGER.debug("Registering ModDimensions for " + DreamDimension.MOD_ID);
    }


}

