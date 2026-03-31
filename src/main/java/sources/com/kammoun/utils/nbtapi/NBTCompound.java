package com.kammoun.utils.nbtapi;

import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import com.kammoun.utils.nbtapi.iface.NBTHandler;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.iface.ReadableNBT;
import com.kammoun.utils.nbtapi.utils.CheckUtil;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.PathUtil;
import com.kammoun.utils.nbtapi.utils.UUIDUtil;
import com.kammoun.utils.nbtapi.utils.nmsmappings.Forge1710Mappings;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.bukkit.inventory.ItemStack;

public class NBTCompound implements ReadWriteNBT {
    private final ReadWriteLock readWriteLock;
    private final Lock readLock;
    private final Lock writeLock;
    private String compundName;
    private NBTCompound parent;
    private final boolean readOnly;
    private Object readOnlyCache;

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType = new int[NBTType.values().length];

        static {
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagByte.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagCompound.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagDouble.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagEnd.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagFloat.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagInt.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagIntArray.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagList.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagLong.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagShort.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagString.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[NBTType.NBTTagLongArray.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    public NBTCompound(NBTCompound nBTCompound, String str) {
        this(nBTCompound, str, false);
    }

    public NBTCompound(NBTCompound nBTCompound, String str, boolean z) {
        this.readWriteLock = new ReentrantReadWriteLock();
        this.readLock = this.readWriteLock.readLock();
        this.writeLock = this.readWriteLock.writeLock();
        this.compundName = str;
        this.parent = nBTCompound;
        this.readOnly = z;
    }

    public Lock getReadLock() {
        return this.readLock;
    }

    public Lock getWriteLock() {
        return this.writeLock;
    }

    public void saveCompound() {
        if (this.parent != null) {
            this.parent.saveCompound();
        }
    }

    public void setResolvedObject(Object obj) {
        if (isClosed()) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        if (this.readOnly) {
            this.readOnlyCache = obj;
        }
    }

    protected void setClosed() {
        if (this.parent != null) {
            this.parent.setClosed();
        }
    }

    public boolean isClosed() {
        if (this.parent != null) {
            return this.parent.isClosed();
        }
        return false;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public Object getResolvedObject() {
        if (isClosed()) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        if (this.readOnlyCache != null) {
            return this.readOnlyCache;
        }
        Object compound = getCompound();
        if (compound instanceof Optional) {
            compound = ((Optional) compound).orElse(null);
        }
        if (compound == null) {
            return null;
        }
        if (!NBTReflectionUtil.validCompound(this)) {
            throw new NbtApiException("The Compound wasn't able to be linked back to the root!");
        }
        Object toCompount = NBTReflectionUtil.getToCompount(compound, this);
        if (this.readOnly) {
            this.readOnlyCache = toCompount;
        }
        return toCompount;
    }

    public String getName() {
        return this.compundName;
    }

    public Object getCompound() {
        return this.parent.getCompound();
    }

    public void setCompound(Object obj) {
        this.parent.setCompound(obj);
    }

    public NBTCompound getParent() {
        return this.parent;
    }

    public void mergeCompound(NBTCompound nBTCompound) {
        if (nBTCompound == null) {
            return;
        }
        try {
            this.writeLock.lock();
            NBTReflectionUtil.mergeOtherNBTCompound(this, nBTCompound);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public void mergeCompound(ReadableNBT readableNBT) {
        if (!(readableNBT instanceof NBTCompound)) {
            throw new NbtApiException("Unknown NBT object: " + readableNBT);
        }
        mergeCompound((NBTCompound) readableNBT);
    }

    @Override
    public void setString(String str, String str2) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_STRING, str, str2);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public String getString(String str) {
        try {
            this.readLock.lock();
            return (String) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_STRING, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setInteger(String str, Integer num) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_INT, str, num);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Integer getInteger(String str) {
        try {
            this.readLock.lock();
            return (Integer) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_INT, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setDouble(String str, Double d) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_DOUBLE, str, d);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Double getDouble(String str) {
        try {
            this.readLock.lock();
            return (Double) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_DOUBLE, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setByte(String str, Byte b) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_BYTE, str, b);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Byte getByte(String str) {
        try {
            this.readLock.lock();
            return (Byte) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_BYTE, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setShort(String str, Short sh) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_SHORT, str, sh);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Short getShort(String str) {
        try {
            this.readLock.lock();
            return (Short) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_SHORT, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setLong(String str, Long l) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_LONG, str, l);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Long getLong(String str) {
        try {
            this.readLock.lock();
            return (Long) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_LONG, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setFloat(String str, Float f) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_FLOAT, str, f);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Float getFloat(String str) {
        try {
            this.readLock.lock();
            return (Float) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_FLOAT, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setByteArray(String str, byte[] bArr) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_BYTEARRAY, str, bArr);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public byte[] getByteArray(String str) {
        try {
            this.readLock.lock();
            return (byte[]) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_BYTEARRAY, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setIntArray(String str, int[] iArr) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_INTARRAY, str, iArr);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public int[] getIntArray(String str) {
        try {
            this.readLock.lock();
            return (int[]) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_INTARRAY, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setLongArray(String str, long[] jArr) {
        CheckUtil.assertAvailable(MinecraftVersion.MC1_16_R1);
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_LONGARRAY, str, jArr);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public long[] getLongArray(String str) {
        CheckUtil.assertAvailable(MinecraftVersion.MC1_16_R1);
        try {
            this.readLock.lock();
            return (long[]) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_LONGARRAY, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setBoolean(String str, Boolean bool) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_BOOLEAN, str, bool);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    public void set(String str, Object obj) {
        NBTReflectionUtil.set(this, str, obj);
        saveCompound();
    }

    @Override
    public Boolean getBoolean(String str) {
        try {
            this.readLock.lock();
            return (Boolean) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_BOOLEAN, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Deprecated
    public void setObject(String str, Object obj) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.setObject(this, str, obj);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Deprecated
    public <T> T getObject(String str, Class<T> cls) {
        try {
            this.readLock.lock();
            T t = (T) NBTReflectionUtil.getObject(this, str, cls);
            this.readLock.unlock();
            return t;
        } catch (Throwable th) {
            this.readLock.unlock();
            throw th;
        }
    }

    @Override
    public void setItemStack(String str, ItemStack itemStack) {
        try {
            this.writeLock.lock();
            removeKey(str);
            addCompound(str).mergeCompound((NBTCompound) NBTItem.convertItemtoNBT(itemStack));
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public ItemStack getItemStack(String str) {
        try {
            this.readLock.lock();
            NBTCompound compound = getCompound(str);
            if (compound == null) {
                return null;
            }
            ItemStack convertNBTtoItem = NBTItem.convertNBTtoItem(compound);
            this.readLock.unlock();
            return convertNBTtoItem;
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setItemStackArray(String str, ItemStack[] itemStackArr) {
        try {
            this.writeLock.lock();
            removeKey(str);
            addCompound(str).mergeCompound((NBTCompound) NBTItem.convertItemArraytoNBT(itemStackArr));
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public ItemStack[] getItemStackArray(String str) {
        try {
            this.readLock.lock();
            NBTCompound compound = getCompound(str);
            if (compound == null) {
                return null;
            }
            ItemStack[] convertNBTtoItemArray = NBTItem.convertNBTtoItemArray(compound);
            this.readLock.unlock();
            return convertNBTtoItemArray;
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void setUUID(String str, UUID uuid) {
        try {
            this.writeLock.lock();
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R4)) {
                setIntArray(str, UUIDUtil.uuidToIntArray(uuid));
            } else if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_16_R1)) {
                NBTReflectionUtil.setData(this, ReflectionMethod.COMPOUND_SET_UUID, str, uuid);
            } else {
                setString(str, uuid.toString());
            }
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public UUID getUUID(String str) {
        try {
            this.readLock.lock();
            NBTType type = getType(str);
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R4) && type == NBTType.NBTTagIntArray) {
                UUID uuidFromIntArray = UUIDUtil.uuidFromIntArray(getIntArray(str));
                this.readLock.unlock();
                return uuidFromIntArray;
            }
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_16_R1) && type == NBTType.NBTTagIntArray) {
                UUID uuid = (UUID) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_UUID, str);
                this.readLock.unlock();
                return uuid;
            }
            if (type != NBTType.NBTTagString) {
                this.readLock.unlock();
                return null;
            }
            try {
                UUID fromString = UUID.fromString(getString(str));
                this.readLock.unlock();
                return fromString;
            } catch (IllegalArgumentException e) {
                return null;
            }
        } finally {
            this.readLock.unlock();
        }
    }

    @Deprecated
    public Boolean hasKey(String str) {
        return Boolean.valueOf(hasTag(str));
    }

    @Override
    public boolean hasTag(String str) {
        try {
            this.readLock.lock();
            Boolean bool = (Boolean) NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_HAS_KEY, str);
            if (bool == null) {
                return false;
            }
            boolean booleanValue = bool.booleanValue();
            this.readLock.unlock();
            return booleanValue;
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void removeKey(String str) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.remove(this, str);
            saveCompound();
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public Set<String> getKeys() {
        try {
            this.readLock.lock();
            return new HashSet(NBTReflectionUtil.getKeys(this));
        } finally {
            this.readLock.unlock();
        }
    }

    public NBTCompound addCompound(String str) {
        try {
            this.writeLock.lock();
            if (getType(str) == NBTType.NBTTagCompound) {
                NBTCompound compound = getCompound(str);
                this.writeLock.unlock();
                return compound;
            }
            NBTReflectionUtil.addNBTTagCompound(this, str);
            NBTCompound compound2 = getCompound(str);
            if (compound2 == null) {
                throw new NbtApiException("Error while adding Compound, got null!");
            }
            saveCompound();
            this.writeLock.unlock();
            return compound2;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTCompound getCompound(String str) {
        try {
            this.readLock.lock();
            if (getType(str) != NBTType.NBTTagCompound) {
                return null;
            }
            NBTCompound nBTCompound = new NBTCompound(this, str, this.readOnly);
            if (NBTReflectionUtil.validCompound(nBTCompound)) {
                this.readLock.unlock();
                return nBTCompound;
            }
            this.readLock.unlock();
            return null;
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public NBTCompound getOrCreateCompound(String str) {
        return addCompound(str);
    }

    @Override
    public NBTList<String> getStringList(String str) {
        try {
            this.writeLock.lock();
            NBTList<String> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagString, String.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<Integer> getIntegerList(String str) {
        try {
            this.writeLock.lock();
            NBTList<Integer> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagInt, Integer.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<int[]> getIntArrayList(String str) {
        try {
            this.writeLock.lock();
            NBTList<int[]> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagIntArray, int[].class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<UUID> getUUIDList(String str) {
        try {
            this.writeLock.lock();
            NBTList<UUID> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagIntArray, UUID.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<Float> getFloatList(String str) {
        try {
            this.writeLock.lock();
            NBTList<Float> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagFloat, Float.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<Double> getDoubleList(String str) {
        try {
            this.writeLock.lock();
            NBTList<Double> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagDouble, Double.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTList<Long> getLongList(String str) {
        try {
            this.writeLock.lock();
            NBTList<Long> list = NBTReflectionUtil.getList(this, str, NBTType.NBTTagLong, Long.class);
            saveCompound();
            this.writeLock.unlock();
            return list;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public NBTType getListType(String str) {
        try {
            this.readLock.lock();
            if (getType(str) != NBTType.NBTTagList) {
                return null;
            }
            return NBTReflectionUtil.getListType(this, str);
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public NBTCompoundList getCompoundList(String str) {
        try {
            this.writeLock.lock();
            NBTCompoundList nBTCompoundList = (NBTCompoundList) NBTReflectionUtil.getList(this, str, NBTType.NBTTagCompound, NBTListCompound.class);
            saveCompound();
            this.writeLock.unlock();
            return nBTCompoundList;
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override
    public <T> T getOrDefault(String str, T t) {
        if (t == null) {
            throw new NullPointerException("Default type in getOrDefault can't be null!");
        }
        if (!hasTag(str)) {
            return t;
        }
        Class<?> cls = t.getClass();
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return (T) getBoolean(str);
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return (T) getByte(str);
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return (T) getShort(str);
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return (T) getInteger(str);
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return (T) getLong(str);
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return (T) getFloat(str);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return (T) getDouble(str);
        }
        if (cls == byte[].class) {
            return (T) getByteArray(str);
        }
        if (cls == int[].class) {
            return (T) getIntArray(str);
        }
        if (cls == long[].class) {
            return (T) getLongArray(str);
        }
        if (cls == String.class) {
            return (T) getString(str);
        }
        if (cls == UUID.class) {
            T t2 = (T) getUUID(str);
            return t2 == null ? t : t2;
        }
        if (!cls.isEnum()) {
            throw new NbtApiException("Unsupported type for getOrDefault: " + cls.getName());
        }
        T t3 = (T) getEnum(str, t.getClass());
        return t3 == null ? t : t3;
    }

    @Override
    public <T> T getOrNull(String str, Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("Default type in getOrNull can't be null!");
        }
        if (!hasTag(str)) {
            return null;
        }
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return (T) getBoolean(str);
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return (T) getByte(str);
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return (T) getShort(str);
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return (T) getInteger(str);
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return (T) getLong(str);
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return (T) getFloat(str);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return (T) getDouble(str);
        }
        if (cls == byte[].class) {
            return (T) getByteArray(str);
        }
        if (cls == int[].class) {
            return (T) getIntArray(str);
        }
        if (cls == long[].class) {
            return (T) getLongArray(str);
        }
        if (cls == String.class) {
            return (T) getString(str);
        }
        if (cls == UUID.class) {
            return (T) getUUID(str);
        }
        if (cls.isEnum()) {
            return (T) getEnum(str, cls);
        }
        throw new NbtApiException("Unsupported type for getOrNull: " + cls.getName());
    }

    @Override
    public <T> T resolveOrNull(String str, Class<?> cls) {
        List<PathUtil.PathSegment> splitPath = PathUtil.splitPath(str);
        NBTCompound nBTCompound = this;
        for (int i = 0; i < splitPath.size() - 1; i++) {
            PathUtil.PathSegment pathSegment = splitPath.get(i);
            if (!pathSegment.hasIndex()) {
                nBTCompound = nBTCompound.getCompound(pathSegment.getPath());
                if (nBTCompound == null) {
                    return null;
                }
            } else if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagCompound) {
                NBTCompoundList compoundList = nBTCompound.getCompoundList(pathSegment.getPath());
                nBTCompound = pathSegment.getIndex() >= 0 ? compoundList.get(pathSegment.getIndex()) : compoundList.get(compoundList.size() + pathSegment.getIndex());
            }
        }
        PathUtil.PathSegment pathSegment2 = splitPath.get(splitPath.size() - 1);
        return !pathSegment2.hasIndex() ? (T) nBTCompound.getOrNull(pathSegment2.getPath(), cls) : (T) getIndexedValue(nBTCompound, pathSegment2, cls);
    }

    @Override
    public <T> T resolveOrDefault(String str, T t) {
        List<PathUtil.PathSegment> splitPath = PathUtil.splitPath(str);
        NBTCompound nBTCompound = this;
        for (int i = 0; i < splitPath.size() - 1; i++) {
            PathUtil.PathSegment pathSegment = splitPath.get(i);
            if (!pathSegment.hasIndex()) {
                nBTCompound = nBTCompound.getCompound(pathSegment.getPath());
                if (nBTCompound == null) {
                    return t;
                }
            } else if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagCompound) {
                NBTCompoundList compoundList = nBTCompound.getCompoundList(pathSegment.getPath());
                nBTCompound = pathSegment.getIndex() >= 0 ? compoundList.get(pathSegment.getIndex()) : compoundList.get(compoundList.size() + pathSegment.getIndex());
            }
        }
        PathUtil.PathSegment pathSegment2 = splitPath.get(splitPath.size() - 1);
        return !pathSegment2.hasIndex() ? (T) nBTCompound.getOrDefault(pathSegment2.getPath(), t) : (T) getIndexedValue(nBTCompound, pathSegment2, t.getClass());
    }

    private <T> T getIndexedValue(NBTCompound nBTCompound, PathUtil.PathSegment pathSegment, Class<T> cls) {
        if (cls == String.class) {
            if (nBTCompound.getType(pathSegment.getPath()) != NBTType.NBTTagList || nBTCompound.getListType(pathSegment.getPath()) != NBTType.NBTTagString) {
                throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
            }
            if (pathSegment.getIndex() >= 0) {
                return (T) nBTCompound.getStringList(pathSegment.getPath()).get(pathSegment.getIndex());
            }
            NBTList<String> stringList = nBTCompound.getStringList(pathSegment.getPath());
            return (T) stringList.get(stringList.size() + pathSegment.getIndex());
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagInt) {
                if (pathSegment.getIndex() >= 0) {
                    return (T) nBTCompound.getIntegerList(pathSegment.getPath()).get(pathSegment.getIndex());
                }
                NBTList<Integer> integerList = nBTCompound.getIntegerList(pathSegment.getPath());
                return (T) integerList.get(integerList.size() + pathSegment.getIndex());
            }
            if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagIntArray) {
                if (pathSegment.getIndex() >= 0) {
                    int[] intArray = nBTCompound.getIntArray(pathSegment.getPath());
                    if (intArray != null) {
                        return (T) Integer.valueOf(intArray[pathSegment.getIndex()]);
                    }
                } else {
                    int[] intArray2 = nBTCompound.getIntArray(pathSegment.getPath());
                    if (intArray2 != null) {
                        return (T) Integer.valueOf(intArray2[intArray2.length + pathSegment.getIndex()]);
                    }
                }
            }
            throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
        }
        if (cls == Long.TYPE || cls == Long.class) {
            if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagLong) {
                if (pathSegment.getIndex() >= 0) {
                    return (T) nBTCompound.getLongList(pathSegment.getPath()).get(pathSegment.getIndex());
                }
                NBTList<Long> longList = nBTCompound.getLongList(pathSegment.getPath());
                return (T) longList.get(longList.size() + pathSegment.getIndex());
            }
            if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagLongArray) {
                if (pathSegment.getIndex() >= 0) {
                    long[] longArray = nBTCompound.getLongArray(pathSegment.getPath());
                    if (longArray != null) {
                        return (T) Long.valueOf(longArray[pathSegment.getIndex()]);
                    }
                } else {
                    long[] longArray2 = nBTCompound.getLongArray(pathSegment.getPath());
                    if (longArray2 != null) {
                        return (T) Long.valueOf(longArray2[longArray2.length + pathSegment.getIndex()]);
                    }
                }
            }
            throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
        }
        if (cls == Float.TYPE || cls == Float.class) {
            if (nBTCompound.getType(pathSegment.getPath()) != NBTType.NBTTagList || nBTCompound.getListType(pathSegment.getPath()) != NBTType.NBTTagFloat) {
                throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
            }
            if (pathSegment.getIndex() >= 0) {
                return (T) nBTCompound.getFloatList(pathSegment.getPath()).get(pathSegment.getIndex());
            }
            NBTList<Float> floatList = nBTCompound.getFloatList(pathSegment.getPath());
            return (T) floatList.get(floatList.size() + pathSegment.getIndex());
        }
        if (cls == Double.TYPE || cls == Double.class) {
            if (nBTCompound.getType(pathSegment.getPath()) != NBTType.NBTTagList || nBTCompound.getListType(pathSegment.getPath()) != NBTType.NBTTagDouble) {
                throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
            }
            if (pathSegment.getIndex() >= 0) {
                return (T) nBTCompound.getDoubleList(pathSegment.getPath()).get(pathSegment.getIndex());
            }
            NBTList<Double> doubleList = nBTCompound.getDoubleList(pathSegment.getPath());
            return (T) doubleList.get(doubleList.size() + pathSegment.getIndex());
        }
        if (cls == int[].class) {
            if (nBTCompound.getType(pathSegment.getPath()) != NBTType.NBTTagList || nBTCompound.getListType(pathSegment.getPath()) != NBTType.NBTTagIntArray) {
                throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
            }
            if (pathSegment.getIndex() >= 0) {
                return (T) nBTCompound.getIntArrayList(pathSegment.getPath()).get(pathSegment.getIndex());
            }
            NBTList<int[]> intArrayList = nBTCompound.getIntArrayList(pathSegment.getPath());
            return (T) intArrayList.get(intArrayList.size() + pathSegment.getIndex());
        }
        if (cls != Byte.TYPE && cls != Byte.class) {
            throw new NbtApiException("Unable to get indexed value for type " + cls);
        }
        if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagByteArray) {
            if (pathSegment.getIndex() >= 0) {
                byte[] byteArray = nBTCompound.getByteArray(pathSegment.getPath());
                if (byteArray != null) {
                    return (T) Byte.valueOf(byteArray[pathSegment.getIndex()]);
                }
            } else {
                byte[] byteArray2 = nBTCompound.getByteArray(pathSegment.getPath());
                if (byteArray2 != null) {
                    return (T) Byte.valueOf(byteArray2[byteArray2.length + pathSegment.getIndex()]);
                }
            }
        }
        throw new NbtApiException("No fitting list/array found for " + pathSegment.getPath() + " of type " + cls);
    }

    @Override
    public ReadWriteNBT resolveCompound(String str) {
        List<PathUtil.PathSegment> splitPath = PathUtil.splitPath(str);
        NBTCompound nBTCompound = this;
        for (int i = 0; i < splitPath.size(); i++) {
            PathUtil.PathSegment pathSegment = splitPath.get(i);
            if (!pathSegment.hasIndex()) {
                nBTCompound = nBTCompound.getCompound(pathSegment.getPath());
                if (nBTCompound == null) {
                    return null;
                }
            } else if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagCompound) {
                NBTCompoundList compoundList = nBTCompound.getCompoundList(pathSegment.getPath());
                nBTCompound = pathSegment.getIndex() >= 0 ? compoundList.get(pathSegment.getIndex()) : compoundList.get(compoundList.size() + pathSegment.getIndex());
            }
        }
        return nBTCompound;
    }

    @Override
    public ReadWriteNBT resolveOrCreateCompound(String str) {
        List<PathUtil.PathSegment> splitPath = PathUtil.splitPath(str);
        NBTCompound nBTCompound = this;
        for (int i = 0; i < splitPath.size(); i++) {
            PathUtil.PathSegment pathSegment = splitPath.get(i);
            if (!pathSegment.hasIndex()) {
                nBTCompound = nBTCompound.getOrCreateCompound(pathSegment.getPath());
                if (nBTCompound == null) {
                    return null;
                }
            } else if (nBTCompound.getType(pathSegment.getPath()) == NBTType.NBTTagList && nBTCompound.getListType(pathSegment.getPath()) == NBTType.NBTTagCompound) {
                NBTCompoundList compoundList = nBTCompound.getCompoundList(pathSegment.getPath());
                nBTCompound = pathSegment.getIndex() >= 0 ? compoundList.get(pathSegment.getIndex()) : compoundList.get(compoundList.size() + pathSegment.getIndex());
            }
        }
        return nBTCompound;
    }

    @Override
    public <E extends Enum<?>> void setEnum(String str, E e) {
        if (e == null) {
            removeKey(str);
        } else {
            setString(str, e.name());
        }
    }

    @Override
    public <E extends Enum<E>> E getEnum(String str, Class<E> cls) {
        String string;
        if (str == null || cls == null || (string = getString(str)) == null) {
            return null;
        }
        try {
            return (E) Enum.valueOf(cls, string);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public NBTType getType(String str) {
        try {
            this.readLock.lock();
            if (MinecraftVersion.getVersion() == MinecraftVersion.MC1_7_R4) {
                Object data = NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET, str);
                if (data == null) {
                    return null;
                }
                NBTType valueOf = NBTType.valueOf(((Byte) ReflectionMethod.COMPOUND_OWN_TYPE_LEGACY.run(data, new Object[0])).byteValue());
                this.readLock.unlock();
                return valueOf;
            }
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R4)) {
                Object data2 = NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET, str);
                if (data2 == null) {
                    this.readLock.unlock();
                    return null;
                }
                NBTType fromName = NBTType.fromName((String) ReflectionMethod.TAGTYPE_GET_NAME.run(ReflectionMethod.TAGTYPE_OWN_TYPE.run(data2, new Object[0]), new Object[0]));
                this.readLock.unlock();
                return fromName;
            }
            Object data3 = NBTReflectionUtil.getData(this, ReflectionMethod.COMPOUND_GET_TYPE, str);
            if (data3 == null) {
                this.readLock.unlock();
                return null;
            }
            NBTType valueOf2 = NBTType.valueOf(((Byte) data3).byteValue());
            this.readLock.unlock();
            return valueOf2;
        } finally {
            this.readLock.unlock();
        }
    }

    @Override
    public void writeCompound(OutputStream outputStream) {
        try {
            this.writeLock.lock();
            NBTReflectionUtil.writeApiNBT(this, outputStream);
        } finally {
            this.writeLock.unlock();
        }
    }

    @Override
    public <T> T get(String str, NBTHandler<T> nBTHandler) {
        return nBTHandler.get(this, str);
    }

    @Override
    public <T> void set(String str, T t, NBTHandler<T> nBTHandler) {
        nBTHandler.set(this, str, t);
    }

    @Override
    public String toString() {
        return asNBTString();
    }

    @Deprecated
    public String toString(String str) {
        return asNBTString();
    }

    @Override
    public void clearNBT() {
        Iterator<String> it = getKeys().iterator();
        while (it.hasNext()) {
            removeKey(it.next());
        }
    }

    @Deprecated
    public String asNBTString() {
        try {
            this.readLock.lock();
            Object resolvedObject = getResolvedObject();
            return resolvedObject == null ? "{}" : (MinecraftVersion.isForgePresent() && MinecraftVersion.getVersion() == MinecraftVersion.MC1_7_R4) ? Forge1710Mappings.toString(resolvedObject) : resolvedObject.toString();
        } finally {
            this.readLock.unlock();
        }
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NBTCompound)) {
            return false;
        }
        NBTCompound nBTCompound = (NBTCompound) obj;
        if (!getKeys().equals(nBTCompound.getKeys())) {
            return false;
        }
        Iterator<String> it = getKeys().iterator();
        while (it.hasNext()) {
            if (!isEqual(this, nBTCompound, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public NBTCompound extractDifference(ReadableNBT readableNBT) {
        if (this == readableNBT) {
            return new NBTContainer();
        }
        if (readableNBT instanceof NBTCompound) {
            return saveDiff(new NBTContainer(), this, (NBTCompound) readableNBT);
        }
        throw new NbtApiException("Unknown NBT object: " + readableNBT);
    }

    private static NBTCompound saveDiff(NBTCompound nBTCompound, NBTCompound nBTCompound2, NBTCompound nBTCompound3) {
        Iterator<String> it = nBTCompound2.getKeys().iterator();
        while (it.hasNext()) {
            saveDiff(nBTCompound, nBTCompound2, nBTCompound3, it.next());
        }
        return nBTCompound;
    }

    private static void saveDiff(NBTCompound nBTCompound, NBTCompound nBTCompound2, NBTCompound nBTCompound3, String str) {
        boolean z = nBTCompound2.getType(str) != nBTCompound3.getType(str);
        switch (AnonymousClass1.$SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[nBTCompound2.getType(str).ordinal()]) {
            case 1:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setByte(str, nBTCompound2.getByte(str));
                    return;
                }
                return;
            case 2:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setByteArray(str, nBTCompound2.getByteArray(str));
                    return;
                }
                return;
            case 3:
                NBTCompound compound = nBTCompound2.getCompound(str);
                if (compound == null) {
                    return;
                }
                if (z) {
                    nBTCompound.addCompound(str).mergeCompound(compound);
                    return;
                }
                NBTCompound compound2 = nBTCompound3.getCompound(str);
                if (compound2 == null) {
                    nBTCompound.addCompound(str).mergeCompound(compound);
                    return;
                }
                NBTCompound extractDifference = compound.extractDifference((ReadableNBT) compound2);
                if (extractDifference.getKeys().isEmpty()) {
                    return;
                }
                nBTCompound.addCompound(str).mergeCompound(extractDifference);
                return;
            case 4:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setDouble(str, nBTCompound2.getDouble(str));
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setFloat(str, nBTCompound2.getFloat(str));
                    return;
                }
                return;
            case 7:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setInteger(str, nBTCompound2.getInteger(str));
                    return;
                }
                return;
            case 8:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setIntArray(str, nBTCompound2.getIntArray(str));
                    return;
                }
                return;
            case 9:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.set(str, NBTReflectionUtil.getEntry(nBTCompound2, str));
                    return;
                }
                return;
            case 10:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setLong(str, nBTCompound2.getLong(str));
                    return;
                }
                return;
            case 11:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setShort(str, nBTCompound2.getShort(str));
                    return;
                }
                return;
            case 12:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setString(str, nBTCompound2.getString(str));
                    return;
                }
                return;
            case StdKeyDeserializer.TYPE_URI:
                if (z || !isEqual(nBTCompound2, nBTCompound3, str)) {
                    nBTCompound.setLongArray(str, nBTCompound2.getLongArray(str));
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static boolean isEqual(NBTCompound nBTCompound, NBTCompound nBTCompound2, String str) {
        if (nBTCompound.getType(str) != nBTCompound2.getType(str)) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$de$tr7zw$changeme$nbtapi$NBTType[nBTCompound.getType(str).ordinal()]) {
            case 1:
                return nBTCompound.getByte(str).equals(nBTCompound2.getByte(str));
            case 2:
                return Arrays.equals(nBTCompound.getByteArray(str), nBTCompound2.getByteArray(str));
            case 3:
                NBTCompound compound = nBTCompound.getCompound(str);
                return compound != null && compound.equals(nBTCompound2.getCompound(str));
            case 4:
                return nBTCompound.getDouble(str).equals(nBTCompound2.getDouble(str));
            case 5:
                return true;
            case 6:
                return nBTCompound.getFloat(str).equals(nBTCompound2.getFloat(str));
            case 7:
                return nBTCompound.getInteger(str).equals(nBTCompound2.getInteger(str));
            case 8:
                return Arrays.equals(nBTCompound.getIntArray(str), nBTCompound2.getIntArray(str));
            case 9:
                return NBTReflectionUtil.getEntry(nBTCompound, str).toString().equals(NBTReflectionUtil.getEntry(nBTCompound2, str).toString());
            case 10:
                return nBTCompound.getLong(str).equals(nBTCompound2.getLong(str));
            case 11:
                return nBTCompound.getShort(str).equals(nBTCompound2.getShort(str));
            case 12:
                return nBTCompound.getString(str).equals(nBTCompound2.getString(str));
            case StdKeyDeserializer.TYPE_URI:
                return Arrays.equals(nBTCompound.getLongArray(str), nBTCompound2.getLongArray(str));
            default:
                return false;
        }
    }
}
