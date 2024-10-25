package com.fennekfoxy.dreamdimension.mixin;

import com.fennekfoxy.dreamdimension.damagesource.CustomDamageSources;
import com.fennekfoxy.dreamdimension.world.gamerule.ModGameRules;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class StonecutterDamage {

    @Inject(method = "onSteppedOn", at = @At("HEAD"))
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity, CallbackInfo ci) {
        if (!world.isClient && entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;

            if (world.getGameRules().getBoolean(ModGameRules.STONECUTTER_DAMAGE)){


                 // Check if the block is a StonecutterBlock
                 if (state.getBlock() instanceof StonecutterBlock && !world.isClient && !(livingEntity instanceof VillagerEntity)) {
                     // Deal 1 point of damage to the entity stepping on the stonecutter
                     entity.damage(CustomDamageSources.STONECUTTER_DAMAGE, 1.0F);
                 }
            }
        }
    }
}