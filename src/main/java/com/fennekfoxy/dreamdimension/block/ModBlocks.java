package com.fennekfoxy.dreamdimension.block;

import com.fennekfoxy.dreamdimension.DreamDimension;
import com.fennekfoxy.dreamdimension.block.custom.*;
import com.fennekfoxy.dreamdimension.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

public class ModBlocks {
    public static final Block DREAM_BLOCK = registerBlock("dream_block",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(3).strength(4f).requiresTool()), ModItemGroup.DREAM);
    public static final Block DREAM_ORE = registerBlock("dream_ore",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(3).strength(4f).requiresTool()), ModItemGroup.DREAM);
    public static final Block RAW_DREAM_BLOCK = registerBlock("raw_dream_block",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(3).strength(4f).requiresTool()), ModItemGroup.DREAM);
    public static final Block JUMP_BLOCK = registerBlock("jump_block",
            new JumpBlock(FabricBlockSettings.of(Material.STONE).strength(1)), ModItemGroup.DREAM);
    public static final Block INFUSION_STATION = registerBlock("infusion_station",
            new InfusionStationBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().nonOpaque()), ModItemGroup.DREAM);
    public static final Block FLOAT_BLOCK = registerBlock("float_block",
            new FloatBlock(FabricBlockSettings.of(Material.STONE).strength(1)), ModItemGroup.DREAM);
    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));



    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(DreamDimension.MOD_ID, name), block);

    }


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DreamDimension.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(DreamDimension.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        DreamDimension.LOGGER.debug("Registering ModBlocks for " + DreamDimension.MOD_ID);
    }
}
