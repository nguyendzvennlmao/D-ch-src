package com.kammoun.utils.nbtapi.utils.nmsmappings;

import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import com.kammoun.utils.nbtapi.NbtApiException;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import java.util.HashMap;
import java.util.Map;

public class MojangToMapping {
    private static Map<String, String> MC1_18R1 = new HashMap<String, String>() {
        {
            put("net.minecraft.nbt.CompoundTag#contains(java.lang.String)", "e");
            put("net.minecraft.nbt.CompoundTag#getCompound(java.lang.String)", "p");
            put("net.minecraft.nbt.CompoundTag#getList(java.lang.String,int)", "c");
            put("net.minecraft.nbt.CompoundTag#putByteArray(java.lang.String,byte[])", "a");
            put("net.minecraft.nbt.CompoundTag#getDouble(java.lang.String)", "k");
            put("net.minecraft.nbt.CompoundTag#putDouble(java.lang.String,double)", "a");
            put("net.minecraft.nbt.CompoundTag#getByteArray(java.lang.String)", "m");
            put("net.minecraft.nbt.CompoundTag#putInt(java.lang.String,int)", "a");
            put("net.minecraft.nbt.CompoundTag#getIntArray(java.lang.String)", "n");
            put("net.minecraft.nbt.CompoundTag#remove(java.lang.String)", "r");
            put("net.minecraft.nbt.CompoundTag#get(java.lang.String)", "c");
            put("net.minecraft.nbt.CompoundTag#merge(net.minecraft.nbt.CompoundTag)", "a");
            put("net.minecraft.nbt.CompoundTag#putBoolean(java.lang.String,boolean)", "a");
            put("net.minecraft.nbt.CompoundTag#getTagType(java.lang.String)", "d");
            put("net.minecraft.nbt.CompoundTag#putLong(java.lang.String,long)", "a");
            put("net.minecraft.nbt.CompoundTag#putLongArray(java.lang.String,long[])", "a");
            put("net.minecraft.nbt.CompoundTag#getLongArray(java.lang.String)", "o");
            put("net.minecraft.nbt.CompoundTag#getString(java.lang.String)", "l");
            put("net.minecraft.nbt.CompoundTag#getInt(java.lang.String)", "h");
            put("net.minecraft.nbt.CompoundTag#putString(java.lang.String,java.lang.String)", "a");
            put("net.minecraft.nbt.CompoundTag#put(java.lang.String,net.minecraft.nbt.Tag)", "a");
            put("net.minecraft.nbt.CompoundTag#getByte(java.lang.String)", "f");
            put("net.minecraft.nbt.CompoundTag#putIntArray(java.lang.String,int[])", "a");
            put("net.minecraft.nbt.CompoundTag#getShort(java.lang.String)", "g");
            put("net.minecraft.nbt.CompoundTag#putByte(java.lang.String,byte)", "a");
            put("net.minecraft.nbt.CompoundTag#getAllKeys()", "d");
            put("net.minecraft.nbt.CompoundTag#putUUID(java.lang.String,java.util.UUID)", "a");
            put("net.minecraft.nbt.CompoundTag#putShort(java.lang.String,short)", "a");
            put("net.minecraft.nbt.CompoundTag#getLong(java.lang.String)", "i");
            put("net.minecraft.nbt.CompoundTag#putFloat(java.lang.String,float)", "a");
            put("net.minecraft.nbt.CompoundTag#getBoolean(java.lang.String)", "q");
            put("net.minecraft.nbt.CompoundTag#getUUID(java.lang.String)", "a");
            put("net.minecraft.nbt.CompoundTag#getFloat(java.lang.String)", "j");
            put("net.minecraft.nbt.ListTag#addTag(int,net.minecraft.nbt.Tag)", "b");
            put("net.minecraft.nbt.ListTag#setTag(int,net.minecraft.nbt.Tag)", "a");
            put("net.minecraft.nbt.ListTag#getString(int)", "j");
            put("net.minecraft.nbt.ListTag#remove(int)", "remove");
            put("net.minecraft.nbt.ListTag#getCompound(int)", "a");
            put("net.minecraft.nbt.ListTag#size()", "size");
            put("net.minecraft.nbt.ListTag#get(int)", "get");
            put("net.minecraft.nbt.NbtIo#readCompressed(java.io.InputStream)", "a");
            put("net.minecraft.nbt.NbtIo#writeCompressed(net.minecraft.nbt.CompoundTag,java.io.OutputStream)", "a");
            put("net.minecraft.nbt.NbtUtils#readGameProfile(net.minecraft.nbt.CompoundTag)", "a");
            put("net.minecraft.nbt.NbtUtils#writeGameProfile(net.minecraft.nbt.CompoundTag,com.mojang.authlib.GameProfile)", "a");
            put("net.minecraft.nbt.TagParser#parseTag(java.lang.String)", "a");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bk");
            put("net.minecraft.world.entity.Entity#load(net.minecraft.nbt.CompoundTag)", "g");
            put("net.minecraft.world.entity.Entity#saveWithoutId(net.minecraft.nbt.CompoundTag)", "f");
            put("net.minecraft.world.item.ItemStack#setTag(net.minecraft.nbt.CompoundTag)", "c");
            put("net.minecraft.world.item.ItemStack#getTag()", "s");
            put("net.minecraft.world.item.ItemStack#save(net.minecraft.nbt.CompoundTag)", "b");
            put("net.minecraft.world.level.block.entity.BlockEntity#saveWithId()", "n");
            put("net.minecraft.world.level.block.entity.BlockEntity#getBlockState()", "q");
            put("net.minecraft.world.level.block.entity.BlockEntity#load(net.minecraft.nbt.CompoundTag)", "a");
            put("net.minecraft.server.level.ServerLevel#getBlockEntity(net.minecraft.core.BlockPos)", "c_");
        }
    };
    private static Map<String, String> MC1_18R2 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_18R1);
            put("net.minecraft.world.item.ItemStack#getTag()", "t");
        }
    };
    private static Map<String, String> MC1_19R1 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_18R2);
            put("net.minecraft.world.item.ItemStack#getTag()", "u");
        }
    };
    private static Map<String, String> MC1_19R2 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_19R1);
            put("net.minecraft.nbt.CompoundTag#getAllKeys()", "e");
        }
    };
    private static Map<String, String> MC1_20R1 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_19R2);
            put("net.minecraft.world.entity.Entity#getEncodeId()", "br");
            put("net.minecraft.world.item.ItemStack#getTag()", "v");
        }
    };
    private static Map<String, String> MC1_20R2 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_20R1);
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bu");
        }
    };
    private static Map<String, String> MC1_20R3 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_20R2);
            put("net.minecraft.nbt.NbtIo#readCompressed(java.io.InputStream,net.minecraft.nbt.NbtAccounter)", "a");
            put("net.minecraft.nbt.NbtAccounter#unlimitedHeap()", "a");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bw");
            put("net.minecraft.world.level.block.entity.BlockEntity#saveWithId()", "p");
            put("net.minecraft.world.level.block.entity.BlockEntity#getBlockState()", "r");
            put("net.minecraft.world.item.ItemStack#CODEC", "a");
        }
    };
    private static Map<String, String> MC1_20R4 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_20R3);
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bC");
            put("net.minecraft.world.level.block.entity.BlockEntity#getBlockState()", "n");
            put("net.minecraft.core.component.DataComponents#CUSTOM_DATA", "b");
            put("net.minecraft.core.component.DataComponentHolder#get(net.minecraft.core.component.DataComponentType)", "a");
            put("net.minecraft.world.item.component.CustomData#copyTag()", "c");
            put("net.minecraft.world.item.ItemStack#set(net.minecraft.core.component.DataComponentType,java.lang.Object)", "b");
            put("net.minecraft.world.item.ItemStack#save(net.minecraft.core.HolderLookup$Provider)", "a");
            put("net.minecraft.server.MinecraftServer#registryAccess()", "bc");
            put("net.minecraft.world.item.ItemStack#parseOptional(net.minecraft.core.HolderLookup$Provider,net.minecraft.nbt.CompoundTag)", "a");
            put("net.minecraft.world.level.block.entity.BlockEntity#saveWithId(net.minecraft.core.HolderLookup$Provider)", "c");
            put("net.minecraft.world.level.block.entity.BlockEntity#loadWithComponents(net.minecraft.nbt.CompoundTag,net.minecraft.core.HolderLookup$Provider)", "c");
            put("net.minecraft.util.datafix.DataFixers#getDataFixer()", "a");
            put("net.minecraft.util.datafix.fixes.References#ITEM_STACK", "t");
            put("net.minecraft.nbt.NbtOps#INSTANCE", "a");
            put("net.minecraft.world.item.ItemStack#CODEC", "b");
        }
    };
    private static Map<String, String> MC1_21R1 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_20R4);
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bD");
        }
    };
    private static Map<String, String> MC1_21R2 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R1);
            put("net.minecraft.server.MinecraftServer#registryAccess()", "ba");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bK");
            put("net.minecraft.world.level.block.entity.BlockEntity#getBlockState()", "m");
            put("net.minecraft.world.item.ItemStack#CODEC", "a");
        }
    };
    private static Map<String, String> MC1_21R3 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R2);
            put("net.minecraft.world.item.component.CustomData#copyTag()", "d");
        }
    };
    private static Map<String, String> MC1_21R4 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R3);
            put("net.minecraft.nbt.CompoundTag#getShort(java.lang.String)", "d");
            put("net.minecraft.nbt.CompoundTag#getString(java.lang.String)", "i");
            put("net.minecraft.nbt.CompoundTag#contains(java.lang.String)", "b");
            put("net.minecraft.nbt.CompoundTag#getDouble(java.lang.String)", "h");
            put("net.minecraft.nbt.CompoundTag#getByteArray(java.lang.String)", "j");
            put("net.minecraft.nbt.CompoundTag#getFloat(java.lang.String)", "g");
            put("net.minecraft.nbt.CompoundTag#get(java.lang.String)", "a");
            put("net.minecraft.nbt.CompoundTag#getLong(java.lang.String)", "f");
            put("net.minecraft.nbt.CompoundTag#getLongArray(java.lang.String)", "l");
            put("net.minecraft.nbt.CompoundTag#getInt(java.lang.String)", "e");
            put("net.minecraft.nbt.CompoundTag#getIntArray(java.lang.String)", "k");
            put("net.minecraft.nbt.CompoundTag#getCompound(java.lang.String)", "m");
            put("net.minecraft.nbt.CompoundTag#getByte(java.lang.String)", "c");
            put("net.minecraft.nbt.ListTag#getString(int)", "m");
            put("net.minecraft.world.entity.Entity#saveWithoutId(net.minecraft.nbt.CompoundTag)", "h");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bI");
            put("net.minecraft.world.entity.Entity#load(net.minecraft.nbt.CompoundTag)", "i");
            put("net.minecraft.nbt.Tag#getType()", "c");
            put("net.minecraft.nbt.TagType#getName()", "a");
            put("net.minecraft.nbt.CompoundTag#getList(java.lang.String)", "o");
            put("net.minecraft.world.item.ItemStack#parse(net.minecraft.core.HolderLookup$Provider,net.minecraft.nbt.Tag)", "a");
            put("net.minecraft.world.item.ItemStack#CODEC", "b");
        }
    };
    private static Map<String, String> MC1_21R5 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R3);
            put("net.minecraft.core.HolderLookup$Provider#createSerializationContext(com.mojang.serialization.DynamicOps)", "a");
            put("net.minecraft.nbt.CompoundTag#getByteArray(java.lang.String)", "j");
            put("net.minecraft.nbt.CompoundTag#getDouble(java.lang.String)", "h");
            put("net.minecraft.nbt.CompoundTag#keySet()", "e");
            put("net.minecraft.nbt.CompoundTag#getLong(java.lang.String)", "f");
            put("net.minecraft.nbt.CompoundTag#getList(java.lang.String)", "o");
            put("net.minecraft.nbt.CompoundTag#getInt(java.lang.String)", "e");
            put("net.minecraft.nbt.CompoundTag#getCompound(java.lang.String)", "m");
            put("net.minecraft.nbt.CompoundTag#getByte(java.lang.String)", "c");
            put("net.minecraft.nbt.CompoundTag#getShort(java.lang.String)", "d");
            put("net.minecraft.nbt.CompoundTag#getIntArray(java.lang.String)", "k");
            put("net.minecraft.nbt.CompoundTag#get(java.lang.String)", "a");
            put("net.minecraft.nbt.CompoundTag#getString(java.lang.String)", "i");
            put("net.minecraft.nbt.CompoundTag#getFloat(java.lang.String)", "g");
            put("net.minecraft.nbt.CompoundTag#getLongArray(java.lang.String)", "l");
            put("net.minecraft.nbt.CompoundTag#contains(java.lang.String)", "b");
            put("net.minecraft.nbt.ListTag#getString(int)", "m");
            put("net.minecraft.nbt.Tag#getType()", "c");
            put("net.minecraft.nbt.TagParser#parseCompoundFully(java.lang.String)", "a");
            put("net.minecraft.nbt.TagType#getName()", "a");
            put("net.minecraft.world.entity.Entity#load(net.minecraft.world.level.storage.ValueInput)", "e");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bN");
            put("net.minecraft.world.entity.Entity#saveWithoutId(net.minecraft.world.level.storage.ValueOutput)", "d");
            put("net.minecraft.world.level.block.entity.BlockEntity#saveWithId(net.minecraft.world.level.storage.ValueOutput)", "d");
            put("net.minecraft.world.level.block.entity.BlockEntity#loadWithComponents(net.minecraft.world.level.storage.ValueInput)", "b");
            put("net.minecraft.world.level.storage.TagValueInput#create(net.minecraft.util.ProblemReporter,net.minecraft.core.HolderLookup$Provider,net.minecraft.nbt.CompoundTag)", "a");
            put("net.minecraft.world.level.storage.TagValueOutput#createWithContext(net.minecraft.util.ProblemReporter,net.minecraft.core.HolderLookup$Provider)", "a");
            put("net.minecraft.world.level.storage.TagValueOutput#buildResult()", "b");
            put("net.minecraft.world.item.ItemStack#CODEC", "b");
            put("net.minecraft.util.ProblemReporter#DISCARDING", "a");
            put("net.minecraft.util.datafix.fixes.References#ITEM_STACK", "u");
        }
    };
    private static Map<String, String> MC1_21R6 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R5);
            put("net.minecraft.server.MinecraftServer#registryAccess()", "bg");
            put("net.minecraft.world.entity.Entity#load(net.minecraft.world.level.storage.ValueInput)", "d");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "bW");
            put("net.minecraft.world.item.component.CustomData#copyTag()", "b");
            put("net.minecraft.world.level.block.entity.BlockEntity#getBlockState()", "o");
            put("net.minecraft.util.datafix.fixes.References#ITEM_STACK", "v");
        }
    };
    private static Map<String, String> MC1_21R7 = new HashMap<String, String>() {
        {
            putAll(MojangToMapping.MC1_21R6);
            put("net.minecraft.nbt.NbtAccounter#unlimitedHeap()", "c");
            put("net.minecraft.server.MinecraftServer#registryAccess()", "bc");
            put("net.minecraft.world.entity.Entity#getEncodeId()", "ca");
            put("net.minecraft.util.datafix.fixes.References#ITEM_STACK", "x");
        }
    };

    static class AnonymousClass16 {
        static final int[] $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion = new int[MinecraftVersion.values().length];

        static {
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R7.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R6.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R5.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R4.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R3.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R2.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_21_R1.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_20_R4.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_20_R3.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_20_R2.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_20_R1.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_19_R3.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_19_R2.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_19_R1.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_18_R2.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.MC1_18_R1.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
        }
    }

    public static Map<String, String> getMapping() {
        switch (AnonymousClass16.$SwitchMap$de$tr7zw$changeme$nbtapi$utils$MinecraftVersion[MinecraftVersion.getVersion().ordinal()]) {
            case 1:
                return MC1_21R7;
            case 2:
                return MC1_21R6;
            case 3:
                return MC1_21R5;
            case 4:
                return MC1_21R4;
            case 5:
                return MC1_21R3;
            case 6:
                return MC1_21R2;
            case 7:
                return MC1_21R1;
            case 8:
                return MC1_20R4;
            case 9:
                return MC1_20R3;
            case 10:
                return MC1_20R2;
            case 11:
                return MC1_20R1;
            case 12:
                return MC1_19R2;
            case StdKeyDeserializer.TYPE_URI:
                return MC1_19R2;
            case StdKeyDeserializer.TYPE_URL:
                return MC1_19R1;
            case StdKeyDeserializer.TYPE_CLASS:
                return MC1_18R2;
            case 16:
                return MC1_18R1;
            case StdKeyDeserializer.TYPE_BYTE_ARRAY:
                return MC1_20R2;
            default:
                throw new NbtApiException("No fitting mapping found for version " + MinecraftVersion.getVersion() + ". This is a bug!");
        }
    }
}
