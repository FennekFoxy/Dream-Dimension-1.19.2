package com.fennekfoxy.dreamdimension.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ZombieEntity.class)
public abstract class ZombieMixin {


    // Inject into the damage method to check for lava damage and cancel it
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void makeZombieImmuneToLava(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        ZombieEntity zombie = (ZombieEntity) (Object) this;

        // Check if the damage source is lava
        if (source == DamageSource.LAVA) {
            // Cancel the damage if it's from lava
            cir.setReturnValue(false);
        }
    }

}