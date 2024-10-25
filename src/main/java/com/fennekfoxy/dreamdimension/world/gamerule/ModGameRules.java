package com.fennekfoxy.dreamdimension.world.gamerule;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRules {

    public static final GameRules.Key<GameRules.BooleanRule> STONECUTTER_DAMAGE =
            GameRuleRegistry.register("stonecutterDamage", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(true));

    public static void registerGameRules() {
        // Call this method in your mod initializer to ensure the game rules are registered.
    }
}