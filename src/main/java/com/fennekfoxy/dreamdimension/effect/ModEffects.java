package com.fennekfoxy.dreamdimension.effect;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModEffects {
    public static final StatusEffect BLEEDING = new BleedingEffect();

    public static void registerEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(DreamDimension.MOD_ID, "bleeding"), BLEEDING);
    }
}
