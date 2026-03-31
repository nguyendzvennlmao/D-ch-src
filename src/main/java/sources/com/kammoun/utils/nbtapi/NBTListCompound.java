package com.kammoun.utils.nbtapi;

public class NBTListCompound extends NBTCompound {
    private NBTList<?> owner;
    private Object compound;

    public NBTListCompound(NBTList<?> nBTList, Object obj) {
        super(null, null);
        this.owner = nBTList;
        this.compound = obj;
    }

    public NBTList<?> getListParent() {
        return this.owner;
    }

    @Override
    public boolean isClosed() {
        return this.owner.getParent().isClosed();
    }

    @Override
    public boolean isReadOnly() {
        return this.owner.getParent().isReadOnly();
    }

    @Override
    public Object getCompound() {
        if (isClosed()) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        return this.compound;
    }

    @Override
    public void setCompound(Object obj) {
        if (isClosed()) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        if (isReadOnly()) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        this.compound = obj;
    }

    @Override
    public void saveCompound() {
        this.owner.save();
    }
}
