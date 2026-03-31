package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.CheckUtil;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;

public class NBTTileEntity extends NBTCompound {
    private final BlockState tile;
    private final boolean readonly;
    private final Object compound;
    private boolean closed;

    public NBTTileEntity(BlockState blockState, boolean z) {
        super(null, null);
        this.closed = false;
        if (blockState == null || (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_8_R3) && !blockState.isPlaced())) {
            throw new NullPointerException("Tile can't be null/not placed!");
        }
        this.tile = blockState;
        this.readonly = z;
        if (z) {
            this.compound = getCompound();
        } else {
            this.compound = null;
        }
    }

    @Deprecated
    public NBTTileEntity(BlockState blockState) {
        super(null, null);
        this.closed = false;
        if (blockState == null || (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_8_R3) && !blockState.isPlaced())) {
            throw new NullPointerException("Tile can't be null/not placed!");
        }
        this.readonly = false;
        this.compound = null;
        this.tile = blockState;
    }

    @Override
    public void setClosed() {
        this.closed = true;
    }

    @Override
    public boolean isClosed() {
        return this.closed;
    }

    @Override
    public boolean isReadOnly() {
        return this.readonly;
    }

    @Override
    public Object getCompound() {
        if (this.readonly && this.compound != null) {
            return this.compound;
        }
        if (Bukkit.isPrimaryThread()) {
            return NBTReflectionUtil.getTileEntityNBTTagCompound(this.tile);
        }
        throw new NbtApiException("BlockEntity NBT needs to be accessed sync!");
    }

    @Override
    public void setCompound(Object obj) {
        if (this.readonly) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        if (!Bukkit.isPrimaryThread()) {
            throw new NbtApiException("BlockEntity NBT needs to be accessed sync!");
        }
        NBTReflectionUtil.setTileEntityNBTTagCompound(this.tile, obj);
    }

    public NBTCompound getPersistentDataContainer() {
        CheckUtil.assertAvailable(MinecraftVersion.MC1_14_R1);
        if (hasTag("PublicBukkitValues")) {
            return getCompound("PublicBukkitValues");
        }
        NBTContainer nBTContainer = new NBTContainer();
        nBTContainer.addCompound("PublicBukkitValues").setString("__nbtapi", "Marker to make the PersistentDataContainer have content");
        mergeCompound((NBTCompound) nBTContainer);
        return getCompound("PublicBukkitValues");
    }
}
