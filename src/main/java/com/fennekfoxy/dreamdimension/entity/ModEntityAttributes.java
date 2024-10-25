package com.fennekfoxy.dreamdimension.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ZombieEntity;

public class ModEntityAttributes {
    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.BURNED, createBurnedAttributes());
    }

    public static DefaultAttributeContainer.Builder createBurnedAttributes() {
        return ZombieEntity.createZombieAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0);
    }
}