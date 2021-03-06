package com.dayofpi.super_block_world.common.block_entities;

import com.dayofpi.super_block_world.common.blocks.WarpPipeBlock;
import com.dayofpi.super_block_world.registry.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class WarpPipeBE extends BlockEntity {
    private static final String DESTINATION_POS = "DestinationPos";
    @Nullable
    public BlockPos destinPos;

    public WarpPipeBE(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WARP_PIPE, pos, state);
    }

    private boolean hasDestinationPos() {
        return this.destinPos != null;
    }

    public void setDestinationPos(@Nullable BlockPos blockPos) {
        destinPos = blockPos;
        if (this.world != null) {
            BlockState blockState = this.getCachedState();
            this.world.setBlockState(this.getPos(), blockState.with(WarpPipeBlock.LINKED, destinPos != null));
        }
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains(DESTINATION_POS) && world != null) {
            this.setDestinationPos(NbtHelper.toBlockPos(nbt.getCompound(DESTINATION_POS)));
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.hasDestinationPos()) {
            nbt.put(DESTINATION_POS, NbtHelper.fromBlockPos(this.destinPos));
        }
    }
}
