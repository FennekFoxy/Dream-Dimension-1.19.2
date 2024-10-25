package com.fennekfoxy.dreamdimension.fluid;

import com.fennekfoxy.dreamdimension.DreamDimension;
import com.fennekfoxy.dreamdimension.block.custom.DreamMilkFluidBlock;
import com.fennekfoxy.dreamdimension.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_DREAM_MILK;
    public static FlowableFluid FLOWING_DREAM_MILK;
    public static Block DREAM_MILK_BLOCK;
    public static Item DREAM_MILK_BUCKET;

    public static void register(){
        STILL_DREAM_MILK = Registry.register(Registry.FLUID,
                new Identifier(DreamDimension.MOD_ID, "dream_milk"), new DreamMilkFluid.Still());
        FLOWING_DREAM_MILK = Registry.register(Registry.FLUID,
                new Identifier(DreamDimension.MOD_ID, "flowing_dream_milk"), new DreamMilkFluid.Flowing());

        DREAM_MILK_BLOCK = Registry.register(Registry.BLOCK, new Identifier(DreamDimension.MOD_ID, "dream_milk_block"),
                new DreamMilkFluidBlock(ModFluids.STILL_DREAM_MILK, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        DREAM_MILK_BUCKET = Registry.register(Registry.ITEM, new Identifier(DreamDimension.MOD_ID, "dream_milk_bucket"),
                new BucketItem(ModFluids.STILL_DREAM_MILK, new FabricItemSettings().group(ModItemGroup.DREAM).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
