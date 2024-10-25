package com.fennekfoxy.dreamdimension.entity.renderer;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class BurnedEntityRenderer extends ZombieEntityRenderer {

    public BurnedEntityRenderer(EntityRendererFactory.Context context) {
        super(context, EntityModelLayers.ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public Identifier getTexture(ZombieEntity entity) {
        return new Identifier(DreamDimension.MOD_ID, "textures/entity/burned.png");
    }
}