package com.fennekfoxy.dreamdimension;

import com.fennekfoxy.dreamdimension.block.ModBlocks;
import com.fennekfoxy.dreamdimension.entity.ModEntityRenderer;
import com.fennekfoxy.dreamdimension.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class DreamDimensionClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {

        ModEntityRenderer.registerRenderers();


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DREAM_MILK, ModFluids.FLOWING_DREAM_MILK,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1FFFFFF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_DREAM_MILK, ModFluids.FLOWING_DREAM_MILK);

    }
}
