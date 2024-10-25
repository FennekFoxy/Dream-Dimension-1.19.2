package com.fennekfoxy.dreamdimension.mixin;

import com.fennekfoxy.dreamdimension.DreamDimension;
import net.minecraft.client.render.entity.FoxEntityRenderer;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoxEntityRenderer.class)
public abstract class FennekFox {

    private static final Identifier FENNEKFOXY_FOX_TEXTURE = new Identifier(DreamDimension.MOD_ID, "textures/entity/fox/fennekfoxy.png");

    @Inject(method = "getTexture(Lnet/minecraft/entity/passive/FoxEntity;)Lnet/minecraft/util/Identifier;", at = @At("HEAD"), cancellable = true)
    public void getTexture(FoxEntity entity, CallbackInfoReturnable<Identifier> cir) {
        if (entity.hasCustomName() && "FennekFoxy".equals(entity.getCustomName().getString())) {
            cir.setReturnValue(FENNEKFOXY_FOX_TEXTURE);
        }
    }
}