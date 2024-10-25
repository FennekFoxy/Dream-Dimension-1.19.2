package com.fennekfoxy.dreamdimension.itemaction;

import com.fennekfoxy.dreamdimension.world.dimension.ModDimensions;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.Random;

public class DreamCharmItemAction{

    private static final Random random = new Random();

    public static void onItemHeldAfterSleep(PlayerEntity player, ServerWorld world) {



        if (!(player instanceof ServerPlayerEntity)) return;
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
        MinecraftServer server = world.getServer();
        if (server != null) {
            float chance = random.nextFloat();
            if(chance < 0.75) {
                ServerWorld dreamDim = server.getWorld(ModDimensions.DREAM_DIMENSION_KEY);
                if (dreamDim != null) {
                    ServerPlayerEntity teleportedPlayer = (ServerPlayerEntity) serverPlayer.moveToWorld(dreamDim);
                    if (teleportedPlayer != null){
                        teleportedPlayer.teleport(dreamDim,player.getX(),player.getY(),player.getZ(),teleportedPlayer.getYaw(),teleportedPlayer.getPitch());
                    }
                }
            } else {
                ServerWorld dreamDim = server.getWorld(ModDimensions.NIGHTMARE_DIMENSION_KEY);
                if (dreamDim != null) {
                    ServerPlayerEntity teleportedPlayer = (ServerPlayerEntity) serverPlayer.moveToWorld(dreamDim);
                    if (teleportedPlayer != null){
                        teleportedPlayer.teleport(dreamDim,player.getX(),player.getY(),player.getZ(),teleportedPlayer.getYaw(),teleportedPlayer.getPitch());
                    }
                }
            }

        }
    }
}