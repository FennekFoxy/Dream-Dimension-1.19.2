package com.fennekfoxy.dreamdimension.entity;

import com.fennekfoxy.dreamdimension.DreamDimension;
import com.fennekfoxy.dreamdimension.entity.custom.BurnedEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<BurnedEntity> BURNED = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(DreamDimension.MOD_ID, "burned"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BurnedEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build()
    );

    public static void registerEntities() {
        System.out.println("Registering entities for " + DreamDimension.MOD_ID);
    }
}