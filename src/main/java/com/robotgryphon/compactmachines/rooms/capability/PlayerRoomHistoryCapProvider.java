package com.robotgryphon.compactmachines.rooms.capability;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerRoomHistoryCapProvider implements ICapabilityProvider {

    private final PlayerEntity player;
    private final CMRoomHistory history;
    private LazyOptional<IRoomHistory> opt = LazyOptional.empty();

    public PlayerRoomHistoryCapProvider(PlayerEntity player) {
        this.player = player;
        this.history = new CMRoomHistory();
        this.opt = LazyOptional.of(() -> this.history);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityRoomHistory.HISTORY_CAPABILITY)
            return opt.cast();

        return LazyOptional.empty();
    }
}
