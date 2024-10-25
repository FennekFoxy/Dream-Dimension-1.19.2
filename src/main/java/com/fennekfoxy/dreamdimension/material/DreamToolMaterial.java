package com.fennekfoxy.dreamdimension.material;

import com.fennekfoxy.dreamdimension.item.ModItems;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DreamToolMaterial implements ToolMaterial {

    //Singleton instance of the material
    public static final DreamToolMaterial INSTANCE = new DreamToolMaterial();

    @Override
    public int getDurability() {
        return 4064;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10F;
    }

    @Override
    public float getAttackDamage() {
        return 1F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 19;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DREAM);
    }
}
