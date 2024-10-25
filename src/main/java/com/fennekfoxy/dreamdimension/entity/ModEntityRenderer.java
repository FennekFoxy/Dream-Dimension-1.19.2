package com.fennekfoxy.dreamdimension.entity;

import com.fennekfoxy.dreamdimension.entity.renderer.BurnedEntityRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModEntityRenderer {
    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntities.BURNED, BurnedEntityRenderer::new);
    }
}