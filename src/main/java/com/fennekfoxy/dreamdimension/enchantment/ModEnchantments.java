package com.fennekfoxy.dreamdimension.enchantment;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static final Enchantment ENDER_SLAYER_ENCHANTMENT = new EnderSlayerEnchantment();
    public static final Enchantment GRAPPLE_ENCHANTMENT = new GrappleEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND);

    public static void registerEnchantments() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(DreamDimension.MOD_ID, "ender_slayer_enchantment"), ENDER_SLAYER_ENCHANTMENT);
        Registry.register(Registry.ENCHANTMENT, new Identifier(DreamDimension.MOD_ID, "grapple_enchantment"), GRAPPLE_ENCHANTMENT);
    }
}

