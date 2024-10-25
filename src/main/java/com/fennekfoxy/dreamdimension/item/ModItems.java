package com.fennekfoxy.dreamdimension.item;

import com.fennekfoxy.dreamdimension.DreamDimension;
import com.fennekfoxy.dreamdimension.block.ModBlocks;
import com.fennekfoxy.dreamdimension.entity.ModEntities;
import com.fennekfoxy.dreamdimension.item.custom.DreamCharmItem;
import com.fennekfoxy.dreamdimension.item.custom.DreamItem;
import com.fennekfoxy.dreamdimension.item.custom.NightmareShardItem;
import com.fennekfoxy.dreamdimension.material.DreamToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;

public class ModItems {


    public static final Item SCYTHE = registerItem("scythe",
            new SwordItem(DreamToolMaterial.INSTANCE, 10, 3f, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_SWORD = registerItem("dream_sword",
            new SwordItem((ToolMaterial) DreamToolMaterial.INSTANCE, 6, .6f,new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_PICKAXE = registerItem("dream_pickaxe",
            new PickaxeItem(DreamToolMaterial.INSTANCE,4, .2f, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_AXE = registerItem("dream_axe",
            new AxeItem(DreamToolMaterial.INSTANCE, 9, 0f, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_SHOVEL = registerItem("dream_shovel",
            new ShovelItem(DreamToolMaterial.INSTANCE,2, 0f,new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_SWORD = registerItem("nightmare_sword",
            new SwordItem((ToolMaterial) ToolMaterials.NETHERITE, 10, 5f,new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_PICKAXE = registerItem("nightmare_pickaxe",
            new PickaxeItem(ToolMaterials.NETHERITE,7, 1.2f, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_AXE = registerItem("nightmare_axe",
            new AxeItem(ToolMaterials.NETHERITE, 11, 1f, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_SHOVEL = registerItem("nightmare_shovel",
            new ShovelItem(ToolMaterials.NETHERITE,4, 1f,new FabricItemSettings().group(ModItemGroup.DREAM)));

    public static final Item DREAM_HELMET = registerItem("dream_helmet",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_CHESTPLATE = registerItem("dream_chestplate",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_LEGGINGS = registerItem("dream_leggings",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_BOOTS = registerItem("dream_boots",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_HELMET = registerItem("nightmare_helmet",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_CHESTPLATE = registerItem("nightmare_chestplate",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_LEGGINGS = registerItem("nightmare_leggings",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_BOOTS = registerItem("nightmare_boots",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.DREAM)));

    public static final Item CLOUD_BOOTS = registerItem("cloud_boots",
            new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item SHADOW_CLOAK = registerItem("shadow_cloak",
            new ArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.DREAM)));

    public static final Item DREAM = registerItem("dream",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_ESSENCE = registerItem("dream_essence",
            new DreamItem(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item DREAM_CHARM = registerItem("dream_charm",
            new DreamCharmItem(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item NIGHTMARE_SHARD = registerItem("nightmare_shard",
            new NightmareShardItem(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item RAW_DREAM = registerItem("raw_dream",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item MEMORY_CUBE = registerItem("memory_cube",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item WAKING_STONE = registerItem("waking_stone",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 5), .5f).build())));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings().group(ModItemGroup.DREAM)));
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ModItemGroup.DREAM)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), .5f).build())));


    public static final Item BURNED_SPAWN_EGG = registerItem("burned_spawn_egg",
            new SpawnEggItem(ModEntities.BURNED, 0x4E201A, 0xFF7A18, new FabricItemSettings().group(ModItemGroup.DREAM)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DreamDimension.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DreamDimension.LOGGER.debug("Registering Mod Items for " + DreamDimension.MOD_ID);
    }
}
