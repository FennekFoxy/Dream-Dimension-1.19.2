package com.fennekfoxy.dreamdimension.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.fennekfoxy.dreamdimension.world.dimension.ModDimensions.DREAM_DIMENSION_KEY;
import static com.fennekfoxy.dreamdimension.world.dimension.ModDimensions.NIGHTMARE_DIMENSION_KEY;

public class WakingStone extends Item {

    public WakingStone(Settings settings) {
        super(settings);
    }
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!world.isClient && player instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
            ServerWorld currentWorld = serverPlayer.getWorld();

            if (currentWorld.getRegistryKey() == DREAM_DIMENSION_KEY || currentWorld.getRegistryKey() == NIGHTMARE_DIMENSION_KEY) {
                // Teleport the player to their spawn point in the Overworld
                teleportToOverworldSpawn(serverPlayer);
            }
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, itemStack);
    }

    // Function to teleport the player to the Overworld's spawn point using moveToWorld
    private void teleportToOverworldSpawn(ServerPlayerEntity player) {
        ServerWorld overworld = player.getServer().getWorld(World.OVERWORLD);
        if (overworld == null) {
            return; // Safety check if the Overworld isn't loaded
        }

        // Find the player's bed spawn position or the world spawn point
        BlockPos spawnPos = player.getSpawnPointPosition();
        boolean isSpawnForced = player.isSpawnForced(); // Check if the bed spawn is forced
        float spawnAngle = player.getSpawnAngle();

        if (spawnPos != null) {
            // Bed spawn point is set, teleport player to the bed
            player.moveToWorld(overworld);
            BlockPos respawnPos = PlayerEntity.findRespawnPosition(overworld, spawnPos, spawnAngle, isSpawnForced, false));
            player.teleport(respawnPos.getX(), respawnPos.getY(), respawnPos.getZ());
        } else {
            // If no bed spawn is set, teleport to world spawn
            player.moveToWorld(overworld);
            BlockPos worldSpawnPos = overworld.getSpawnPos();
            player.teleport(worldSpawnPos.getX(), worldSpawnPos.getY(), worldSpawnPos.getZ());
        }
    }
}