package com.fennekfoxy.dreamdimension.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class EnderSlayerEnchantment extends Enchantment {
    private ItemStack stack;

    public EnderSlayerEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getMinPower(int level) {
        return 5 + (level - 1) * 10;
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        this.stack = stack;
        return stack.getItem() instanceof SwordItem; // Accept only swords
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof EndermanEntity || target instanceof EndermiteEntity ||
                target instanceof EnderDragonEntity || target instanceof ShulkerEntity) {
            target.damage(DamageSource.mob(user), 2.5F * level); // Extra damage per level
        }
        super.onTargetDamaged(user, target, level);
    }
}

