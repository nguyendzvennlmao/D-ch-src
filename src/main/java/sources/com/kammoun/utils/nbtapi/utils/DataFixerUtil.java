package com.kammoun.utils.nbtapi.utils;

import com.kammoun.utils.nbtapi.NBT;
import com.kammoun.utils.nbtapi.NBTCompound;
import com.kammoun.utils.nbtapi.NBTReflectionUtil;
import com.kammoun.utils.nbtapi.NbtApiException;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class DataFixerUtil {
    public static final int VERSION1_12R1 = 1343;
    public static final int VERSION1_16R1 = 2586;
    public static final int VERSION1_17R1 = 2730;
    public static final int VERSION1_18R1 = 2975;
    public static final int VERSION1_19R1 = 3120;
    public static final int VERSION1_19R3 = 3337;
    public static final int VERSION1_20R1 = 3465;
    public static final int VERSION1_20R2 = 3578;
    public static final int VERSION1_20R3 = 3700;
    public static final int VERSION1_20R4 = 3837;
    public static final int VERSION1_21R1 = 3953;
    public static final int VERSION1_21R2 = 4080;
    public static final int VERSION1_21R3 = 4189;
    public static final int VERSION1_21R4 = 4323;
    public static final int VERSION1_21R5 = 4435;
    public static final int VERSION1_21R6 = 4554;
    public static final int VERSION1_21R7 = 4671;

    @Deprecated
    public static final int VERSION1_12_2 = 1343;

    @Deprecated
    public static final int VERSION1_16_5 = 2586;

    @Deprecated
    public static final int VERSION1_17_1 = 2730;

    @Deprecated
    public static final int VERSION1_18_2 = 2975;

    @Deprecated
    public static final int VERSION1_19_2 = 3120;

    @Deprecated
    public static final int VERSION1_19_4 = 3337;

    @Deprecated
    public static final int VERSION1_20_1 = 3465;

    @Deprecated
    public static final int VERSION1_20_2 = 3578;

    @Deprecated
    public static final int VERSION1_20_4 = 3700;

    @Deprecated
    public static final int VERSION1_20_5 = 3837;

    @Deprecated
    public static final int VERSION1_21 = 3953;

    @Deprecated
    public static final int VERSION1_21_2 = 4080;

    @Deprecated
    public static final int VERSION1_21_3 = 4189;

    @Deprecated
    public static final int VERSION1_21_4 = 4323;

    @Deprecated
    public static final int VERSION1_21_5 = 4435;

    public static Object fixUpRawItemData(Object obj, int i, int i2) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        return ((DataFixer) ReflectionMethod.GET_DATAFIXER.run(null, new Object[0])).update((DSL.TypeReference) ReflectionUtil.getMappedField(ClassWrapper.NMS_REFERENCES.getClazz(), "net.minecraft.util.datafix.fixes.References#ITEM_STACK").get(null), new Dynamic((DynamicOps) ReflectionUtil.getMappedField(ClassWrapper.NMS_NBTOPS.getClazz(), "net.minecraft.nbt.NbtOps#INSTANCE").get(null), obj), i, i2).getValue();
    }

    public static ReadWriteNBT fixUpItemData(ReadWriteNBT readWriteNBT, int i, int i2) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        return NBT.wrapNMSTag(fixUpRawItemData(NBTReflectionUtil.getToCompount(((NBTCompound) readWriteNBT).getCompound(), (NBTCompound) readWriteNBT), i, i2));
    }

    public static int getCurrentVersion() {
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R7)) {
            return VERSION1_21R7;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return VERSION1_21R6;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R5)) {
            return 4435;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R4)) {
            return 4323;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R3)) {
            return 4189;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R2)) {
            return 4080;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R1)) {
            return 3953;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            return 3837;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R3)) {
            return 3700;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R1)) {
            return 3465;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_19_R3)) {
            return 3337;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_19_R1)) {
            return 3120;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_18_R1)) {
            return 2975;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_17_R1)) {
            return 2730;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_16_R1)) {
            return 2586;
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_12_R1)) {
            return 1343;
        }
        throw new NbtApiException("Trying to update data *to* a version before 1.12.2? Something is probably going wrong, contact the plugin author.");
    }
}
