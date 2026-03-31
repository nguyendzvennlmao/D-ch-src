package com.kammoun.utils.nbtapi.utils;

import com.kammoun.utils.nbtapi.NBTType;
import com.kammoun.utils.nbtapi.NbtApiException;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBTCompoundList;
import com.kammoun.utils.nbtapi.iface.ReadableNBT;
import com.kammoun.utils.nbtapi.iface.ReadableNBTList;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import javax.annotation.Nullable;

public class GameprofileUtil {
    private static Method GET_NAME;
    private static Method GET_ID;
    private static Method GET_VALUE;
    private static Method GET_SIGNATURE;
    private static Method GET_PROPERTY_NAME;
    private static Method GET_PROPERTIES;

    @Nullable
    public static GameProfile readGameProfile(ReadableNBT readableNBT) {
        String str = null;
        UUID uuid = null;
        if (readableNBT.hasTag("Name") && readableNBT.getType("Name") == NBTType.NBTTagString) {
            str = readableNBT.getString("Name");
        } else if (readableNBT.hasTag("name") && readableNBT.getType("name") == NBTType.NBTTagString) {
            str = readableNBT.getString("name");
        }
        if (readableNBT.hasTag("Id") && readableNBT.getType("Id") == NBTType.NBTTagIntArray && readableNBT.getIntArray("Id").length == 4) {
            uuid = readableNBT.getUUID("Id");
        } else if (readableNBT.hasTag("id") && readableNBT.getType("id") == NBTType.NBTTagIntArray && readableNBT.getIntArray("id").length == 4) {
            uuid = readableNBT.getUUID("id");
        }
        try {
            GameProfile gameProfile = new GameProfile(uuid, str);
            if (readableNBT.hasTag("Properties") && readableNBT.getType("Properties") == NBTType.NBTTagCompound) {
                ReadableNBT compound = readableNBT.getCompound("Properties");
                for (String str2 : compound.getKeys()) {
                    ReadableNBTList<ReadWriteNBT> compoundList = compound.getCompoundList(str);
                    for (int i = 0; i < compoundList.size(); i++) {
                        ReadWriteNBT readWriteNBT = compoundList.get(i);
                        String string = readWriteNBT.getString("Value");
                        if (readWriteNBT.hasTag("Signature") && readWriteNBT.getType("Signature") == NBTType.NBTTagString) {
                            gameProfile.getProperties().put(str2, new Property(str2, string, readWriteNBT.getString("Signature")));
                        } else {
                            gameProfile.getProperties().put(str2, new Property(str2, string));
                        }
                    }
                }
            } else if (readableNBT.getType("properties") == NBTType.NBTTagList) {
                ReadableNBTList<ReadWriteNBT> compoundList2 = readableNBT.getCompoundList("properties");
                for (int i2 = 0; i2 < compoundList2.size(); i2++) {
                    ReadWriteNBT readWriteNBT2 = compoundList2.get(i2);
                    String string2 = readWriteNBT2.getString("name");
                    String string3 = readWriteNBT2.getString("value");
                    if (readWriteNBT2.hasTag("signature") && readWriteNBT2.getType("signature") == NBTType.NBTTagString) {
                        gameProfile.getProperties().put(string2, new Property(string2, string3, readWriteNBT2.getString("signature")));
                    } else {
                        gameProfile.getProperties().put(string2, new Property(string2, string3));
                    }
                }
            }
            return gameProfile;
        } catch (Throwable th) {
            return null;
        }
    }

    public static ReadWriteNBT writeGameProfile(ReadWriteNBT readWriteNBT, GameProfile gameProfile) {
        String name = getName(gameProfile);
        if (name != null && !name.isEmpty()) {
            readWriteNBT.setString(MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4) ? "name" : "Name", getName(gameProfile));
        }
        UUID id = getId(gameProfile);
        if (id != null) {
            readWriteNBT.setUUID(MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4) ? "id" : "Id", id);
        }
        PropertyMap properties = getProperties(gameProfile);
        if (!properties.isEmpty()) {
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
                ReadWriteNBTCompoundList compoundList = readWriteNBT.getCompoundList("properties");
                for (Property property : properties.values()) {
                    ReadWriteNBT addCompound = compoundList.addCompound();
                    addCompound.setString("name", getPropertyName(property));
                    addCompound.setString("value", getValue(property));
                    if (property.hasSignature()) {
                        addCompound.setString("signature", getSignature(property));
                    }
                }
            } else {
                ReadWriteNBT orCreateCompound = readWriteNBT.getOrCreateCompound("Properties");
                for (String str : gameProfile.getProperties().keySet()) {
                    ReadWriteNBTCompoundList compoundList2 = orCreateCompound.getCompoundList(str);
                    for (Property property2 : properties.get(str)) {
                        ReadWriteNBT addCompound2 = compoundList2.addCompound();
                        addCompound2.setString("Value", getValue(property2));
                        if (property2.hasSignature()) {
                            addCompound2.setString("Signature", getSignature(property2));
                        }
                    }
                }
            }
        }
        return readWriteNBT;
    }

    private static String getName(GameProfile gameProfile) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return gameProfile.getName();
        }
        try {
            return GET_NAME.invoke(gameProfile, new Object[0]).toString();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get GameProfile name via reflection", e);
        }
    }

    private static UUID getId(GameProfile gameProfile) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return gameProfile.getId();
        }
        try {
            return (UUID) GET_ID.invoke(gameProfile, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get GameProfile id via reflection", e);
        }
    }

    private static String getValue(Property property) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return property.getValue();
        }
        try {
            return GET_VALUE.invoke(property, new Object[0]).toString();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get Property value via reflection", e);
        }
    }

    private static String getSignature(Property property) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return property.getSignature();
        }
        try {
            return GET_SIGNATURE.invoke(property, new Object[0]).toString();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get Property signature via reflection", e);
        }
    }

    private static String getPropertyName(Property property) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return property.getName();
        }
        try {
            return GET_PROPERTY_NAME.invoke(property, new Object[0]).toString();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get Property name via reflection", e);
        }
    }

    private static PropertyMap getProperties(GameProfile gameProfile) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            return gameProfile.getProperties();
        }
        try {
            return (PropertyMap) GET_PROPERTIES.invoke(gameProfile, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new NbtApiException("Failed to get GameProfile properties via reflection", e);
        }
    }

    static {
        GET_NAME = null;
        GET_ID = null;
        GET_VALUE = null;
        GET_SIGNATURE = null;
        GET_PROPERTY_NAME = null;
        GET_PROPERTIES = null;
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_21_R6)) {
            try {
                GET_NAME = GameProfile.class.getDeclaredMethod("name", new Class[0]);
                GET_ID = GameProfile.class.getDeclaredMethod("id", new Class[0]);
                GET_VALUE = Property.class.getDeclaredMethod("value", new Class[0]);
                GET_SIGNATURE = Property.class.getDeclaredMethod("signature", new Class[0]);
                GET_PROPERTY_NAME = Property.class.getDeclaredMethod("name", new Class[0]);
                GET_PROPERTIES = GameProfile.class.getDeclaredMethod("properties", new Class[0]);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
}
