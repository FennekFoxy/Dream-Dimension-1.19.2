package com.fennekfoxy.dreamdimension.event;

import com.fennekfoxy.dreamdimension.item.ModItems;
import com.fennekfoxy.dreamdimension.itemaction.DreamCharmItemAction;
import com.fennekfoxy.dreamdimension.itemaction.NightmareShardItemAction;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class PlayerSleepHandler implements EntitySleepEvents.StopSleeping {

    @Override
    public void onStopSleeping( LivingEntity entity, BlockPos sleepingPos) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            if (!entity.getWorld().isClient && player.getMainHandStack().isOf(ModItems.DREAM_CHARM) || player.getOffHandStack().isOf(ModItems.DREAM_CHARM)) {

                ServerWorld serverWorld = (ServerWorld) player.getWorld();
                DreamCharmItemAction.onItemHeldAfterSleep(player, serverWorld);
            } else if (!entity.getWorld().isClient && player.getMainHandStack().isOf(ModItems.NIGHTMARE_SHARD) || player.getOffHandStack().isOf(ModItems.NIGHTMARE_SHARD)) {

                ServerWorld serverWorld = (ServerWorld) player.getWorld();
                NightmareShardItemAction.onItemHeldAfterSleep(player, serverWorld);
            }
        }
    }
}




