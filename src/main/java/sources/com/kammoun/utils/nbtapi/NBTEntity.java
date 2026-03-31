package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.CheckUtil;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;

public class NBTEntity extends NBTCompound {
    private final Entity ent;
    private final boolean readonly;
    private final Object compound;
    private boolean closed;

    public NBTEntity(Entity entity, boolean z) {
        super(null, null);
        this.closed = false;
        if (entity == null) {
            throw new NullPointerException("Entity can't be null!");
        }
        this.readonly = z;
        this.ent = entity;
        if (z) {
            this.compound = getCompound();
        } else {
            this.compound = null;
        }
    }

    @Deprecated
    public NBTEntity(Entity entity) {
        super(null, null);
        this.closed = false;
        if (entity == null) {
            throw new NullPointerException("Entity can't be null!");
        }
        this.readonly = false;
        this.compound = null;
        this.ent = entity;
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
            return NBTReflectionUtil.getEntityNBTTagCompound(NBTReflectionUtil.getNMSEntity(this.ent));
        }
        throw new NbtApiException("Entity NBT needs to be accessed sync!");
    }

    @Override
    public void setCompound(Object obj) {
        if (this.readonly) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        if (!Bukkit.isPrimaryThread()) {
            throw new NbtApiException("Entity NBT needs to be accessed sync!");
        }
        NBTReflectionUtil.setEntityNBTTag(obj, NBTReflectionUtil.getNMSEntity(this.ent));
    }

    public NBTCompound getPersistentDataContainer() {
        CheckUtil.assertAvailable(MinecraftVersion.MC1_14_R1);
        return new NBTPersistentDataContainer(this.ent.getPersistentDataContainer());
    }
}
