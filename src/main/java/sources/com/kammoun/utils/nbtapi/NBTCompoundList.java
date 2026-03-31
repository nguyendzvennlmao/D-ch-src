package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBTCompoundList;
import com.kammoun.utils.nbtapi.iface.ReadableNBT;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;

public class NBTCompoundList extends NBTList<ReadWriteNBT> implements ReadWriteNBTCompoundList {
    public NBTCompoundList(NBTCompound nBTCompound, String str, NBTType nBTType, Object obj) {
        super(nBTCompound, str, nBTType, obj);
    }

    @Override
    public NBTListCompound addCompound() {
        return (NBTListCompound) addCompound((NBTCompound) null);
    }

    public NBTCompound addCompound(NBTCompound nBTCompound) {
        if (getParent().isReadOnly()) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        try {
            Object newInstance = ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz().newInstance();
            if (MinecraftVersion.getVersion().getVersionId() >= MinecraftVersion.MC1_14_R1.getVersionId()) {
                ReflectionMethod.LIST_ADD.run(this.listObject, Integer.valueOf(size()), newInstance);
            } else {
                ReflectionMethod.LEGACY_LIST_ADD.run(this.listObject, newInstance);
            }
            getParent().saveCompound();
            NBTListCompound nBTListCompound = new NBTListCompound(this, newInstance);
            if (nBTCompound != null) {
                nBTListCompound.mergeCompound(nBTCompound);
            }
            return nBTListCompound;
        } catch (Exception e) {
            throw new NbtApiException(e);
        }
    }

    @Override
    public ReadWriteNBT addCompound(ReadableNBT readableNBT) {
        if (readableNBT instanceof NBTCompound) {
            return addCompound((NBTCompound) readableNBT);
        }
        return null;
    }

    @Override
    @Deprecated
    public boolean add(ReadWriteNBT readWriteNBT) {
        return addCompound(readWriteNBT) != null;
    }

    @Override
    public void add(int i, ReadWriteNBT readWriteNBT) {
        if (readWriteNBT != null) {
            throw new NbtApiException("You need to pass null! ListCompounds from other lists won't work.");
        }
        if (getParent().isReadOnly()) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        try {
            Object newInstance = ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz().newInstance();
            if (MinecraftVersion.getVersion().getVersionId() >= MinecraftVersion.MC1_14_R1.getVersionId()) {
                ReflectionMethod.LIST_ADD.run(this.listObject, Integer.valueOf(i), newInstance);
            } else {
                ReflectionMethod.LEGACY_LIST_ADD.run(this.listObject, newInstance);
            }
            super.getParent().saveCompound();
        } catch (Exception e) {
            throw new NbtApiException(e);
        }
    }

    @Override
    public NBTListCompound get(int i) {
        try {
            return new NBTListCompound(this, ReflectionMethod.LIST_GET_COMPOUND.run(this.listObject, Integer.valueOf(i)));
        } catch (Exception e) {
            throw new NbtApiException(e);
        }
    }

    @Override
    public NBTListCompound set(int i, ReadWriteNBT readWriteNBT) {
        throw new NbtApiException("This method doesn't work in the ListCompound context.");
    }

    @Override
    public Object asTag(ReadWriteNBT readWriteNBT) {
        return null;
    }

    @Override
    public ReadWriteNBT remove(int i) {
        return (ReadWriteNBT) super.remove(i);
    }
}
