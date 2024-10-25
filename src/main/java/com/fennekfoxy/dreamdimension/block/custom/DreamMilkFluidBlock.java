package com.fennekfoxy.dreamdimension.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DreamMilkFluidBlock extends FluidBlock {


    public DreamMilkFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);

        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            // Apply a custom status effect to the player
            player.clearStatusEffects();
        }
    }
}