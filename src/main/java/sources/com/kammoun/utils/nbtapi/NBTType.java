package com.kammoun.utils.nbtapi;

import com.kammoun.utils.jackson.annotation.JsonProperty;

public enum NBTType {
    NBTTagEnd(0, JsonProperty.USE_DEFAULT_NAME),
    NBTTagByte(1, "BYTE"),
    NBTTagShort(2, "SHORT"),
    NBTTagInt(3, "INT"),
    NBTTagLong(4, "LONG"),
    NBTTagFloat(5, "FLOAT"),
    NBTTagDouble(6, "DOUBLE"),
    NBTTagByteArray(7, "BYTE[]"),
    NBTTagString(8, "STRING"),
    NBTTagList(9, "LIST"),
    NBTTagCompound(10, "COMPOUND"),
    NBTTagIntArray(11, "INT[]"),
    NBTTagLongArray(12, "LONG[]");

    private final int id;
    private final String name;

    NBTType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static NBTType valueOf(int i) {
        for (NBTType nBTType : values()) {
            if (nBTType.getId() == i) {
                return nBTType;
            }
        }
        return NBTTagEnd;
    }

    public static NBTType fromName(String str) {
        for (NBTType nBTType : values()) {
            if (nBTType.getName().equals(str)) {
                return nBTType;
            }
        }
        return NBTTagEnd;
    }
}
