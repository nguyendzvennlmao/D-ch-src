package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.iface.NBTFileHandle;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ObjectCreator;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;

public class NBTFile extends NBTCompound implements NBTFileHandle {
    private final File file;
    private Object nbt;

    @Deprecated
    public NBTFile(File file) throws IOException {
        super(null, null);
        if (file == null) {
            throw new NullPointerException("File can't be null!");
        }
        this.file = file;
        if (file.exists()) {
            this.nbt = NBTReflectionUtil.readNBT(Files.newInputStream(file.toPath(), new OpenOption[0]));
        } else {
            this.nbt = ObjectCreator.NMS_NBTTAGCOMPOUND.getInstance(new Object[0]);
            save();
        }
    }

    @Override
    public void save() throws IOException {
        try {
            getWriteLock().lock();
            saveTo(this.file, this);
        } finally {
            getWriteLock().unlock();
        }
    }

    @Override
    public File getFile() {
        return this.file;
    }

    @Override
    public Object getCompound() {
        return this.nbt;
    }

    @Override
    public void setCompound(Object obj) {
        this.nbt = obj;
    }

    @Deprecated
    public static NBTCompound readFrom(File file) throws IOException {
        return !file.exists() ? new NBTContainer() : new NBTContainer(NBTReflectionUtil.readNBT(Files.newInputStream(file.toPath(), new OpenOption[0])));
    }

    @Deprecated
    public static void saveTo(File file, NBTCompound nBTCompound) throws IOException {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            if (!file.createNewFile()) {
                throw new IOException("Unable to create file at " + file.getAbsolutePath());
            }
        }
        nBTCompound.writeCompound(Files.newOutputStream(file.toPath(), new OpenOption[0]));
    }
}
