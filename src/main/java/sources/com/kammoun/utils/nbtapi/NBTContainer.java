package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ObjectCreator;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.io.InputStream;

public class NBTContainer extends NBTCompound {
    private Object nbt;
    private boolean closed;
    private boolean readOnly;

    @Deprecated
    public NBTContainer() {
        super(null, null);
        this.nbt = ObjectCreator.NMS_NBTTAGCOMPOUND.getInstance(new Object[0]);
    }

    @Deprecated
    public NBTContainer(Object obj) {
        super(null, null);
        obj = obj == null ? ObjectCreator.NMS_NBTTAGCOMPOUND.getInstance(new Object[0]) : obj;
        if (!ClassWrapper.NMS_NBTTAGCOMPOUND.getClazz().isAssignableFrom(obj.getClass())) {
            throw new NbtApiException("The object '" + obj.getClass() + "' is not a valid NBT-Object!");
        }
        this.nbt = obj;
    }

    @Deprecated
    public NBTContainer(InputStream inputStream) {
        super(null, null);
        this.nbt = NBTReflectionUtil.readNBT(inputStream);
    }

    @Deprecated
    public NBTContainer(String str) {
        super(null, null);
        if (str == null) {
            throw new NullPointerException("The String can't be null!");
        }
        try {
            this.nbt = ReflectionMethod.PARSE_NBT.run(null, str);
        } catch (Exception e) {
            throw new NbtApiException("Unable to parse Malformed Json!", e);
        }
    }

    @Override
    public Object getCompound() {
        return this.nbt;
    }

    @Override
    public void setCompound(Object obj) {
        this.nbt = obj;
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
        return this.readOnly;
    }

    public NBTContainer setReadOnly(boolean z) {
        this.readOnly = true;
        return this;
    }
}
