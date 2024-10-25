package com.fennekfoxy.dreamdimension.item;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DREAM = FabricItemGroupBuilder.build(
            new Identifier(DreamDimension.MOD_ID, "dream"), () -> new ItemStack(ModItems.DREAM));
}
