package com.fennekfoxy.dreamdimension.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;

public class BurnedEntity extends ZombieEntity {
    public BurnedEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean successfulAttack = super.tryAttack(target);
        if (successfulAttack){
            target.setOnFireFor(5);
        }
        return successfulAttack;
    }

    @Override
    protected boolean burnsInDaylight() {
        return false;
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }
}
