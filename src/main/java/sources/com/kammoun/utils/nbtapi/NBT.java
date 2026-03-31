package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.iface.NBTFileHandle;
import com.kammoun.utils.nbtapi.iface.ReadWriteItemNBT;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.iface.ReadableItemNBT;
import com.kammoun.utils.nbtapi.iface.ReadableNBT;
import com.kammoun.utils.nbtapi.iface.ReadableNBTList;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import com.kammoun.utils.nbtapi.wrapper.NBTProxy;
import com.kammoun.utils.nbtapi.wrapper.ProxyBuilder;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Level;
import javax.annotation.Nullable;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class NBT {
    private NBT() {
    }

    public static boolean preloadApi() {
        try {
            if (MinecraftVersion.getVersion() == MinecraftVersion.UNKNOWN) {
                NbtApiException.confirmedBroken = true;
                return false;
            }
            for (ClassWrapper classWrapper : ClassWrapper.values()) {
                if (classWrapper.isEnabled() && classWrapper.getClazz() == null) {
                    NbtApiException.confirmedBroken = true;
                    return false;
                }
            }
            for (ReflectionMethod reflectionMethod : ReflectionMethod.values()) {
                if (reflectionMethod.isCompatible() && !reflectionMethod.isLoaded()) {
                    NbtApiException.confirmedBroken = true;
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            NbtApiException.confirmedBroken = true;
            MinecraftVersion.getLogger().log(Level.WARNING, "[NBTAPI] Error during the selfcheck!", (Throwable) e);
            return false;
        }
    }

    public static ReadableNBT readNbt(ItemStack itemStack) {
        return new NBTItem(itemStack.clone(), false, true, false);
    }

    public static <T> T get(ItemStack itemStack, Function<ReadableItemNBT, T> function) {
        NBTItem nBTItem = new NBTItem(itemStack, false, true, false);
        T apply = function.apply(nBTItem);
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTItem.setClosed();
        return apply;
    }

    public static void get(ItemStack itemStack, Consumer<ReadableItemNBT> consumer) {
        NBTItem nBTItem = new NBTItem(itemStack, false, true, false);
        consumer.accept(nBTItem);
        nBTItem.setClosed();
    }

    public static <T> T get(Entity entity, Function<ReadableNBT, T> function) {
        NBTEntity nBTEntity = new NBTEntity(entity, true);
        T apply = function.apply(nBTEntity);
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTEntity.setClosed();
        return apply;
    }

    public static void get(Entity entity, Consumer<ReadableNBT> consumer) {
        NBTEntity nBTEntity = new NBTEntity(entity, true);
        consumer.accept(nBTEntity);
        nBTEntity.setClosed();
    }

    public static <T> T get(BlockState blockState, Function<ReadableNBT, T> function) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState, true);
        T apply = function.apply(nBTTileEntity);
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTTileEntity.setClosed();
        return apply;
    }

    public static void get(BlockState blockState, Consumer<ReadableNBT> consumer) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState, true);
        consumer.accept(nBTTileEntity);
        nBTTileEntity.setClosed();
    }

    public static <T> T getPersistentData(Entity entity, Function<ReadableNBT, T> function) {
        T apply = function.apply(new NBTEntity(entity).getPersistentDataContainer());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        return apply;
    }

    public static <T> T getPersistentData(BlockState blockState, Function<ReadableNBT, T> function) {
        T apply = function.apply(new NBTTileEntity(blockState).getPersistentDataContainer());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        return apply;
    }

    public static <T> T modify(ItemStack itemStack, Function<ReadWriteItemNBT, T> function) {
        NBTItem nBTItem = new NBTItem(itemStack, false, false, true);
        T apply = function.apply(nBTItem);
        nBTItem.finalizeChanges();
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTItem.setClosed();
        return apply;
    }

    public static void modify(ItemStack itemStack, Consumer<ReadWriteItemNBT> consumer) {
        NBTItem nBTItem = new NBTItem(itemStack, false, false, true);
        consumer.accept(nBTItem);
        nBTItem.finalizeChanges();
        nBTItem.setClosed();
    }

    public static <T> T modify(Entity entity, Function<ReadWriteNBT, T> function) {
        NBTEntity nBTEntity = new NBTEntity(entity);
        NBTContainer nBTContainer = new NBTContainer(nBTEntity.getCompound());
        T apply = function.apply(nBTContainer);
        nBTEntity.setCompound(nBTContainer.getCompound());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTEntity.setClosed();
        return apply;
    }

    public static void modifyComponents(ItemStack itemStack, Consumer<ReadWriteNBT> consumer) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            throw new NbtApiException("This method only works for 1.20.5+!");
        }
        ReadWriteNBT itemStackToNBT = itemStackToNBT(itemStack);
        consumer.accept(itemStackToNBT.getOrCreateCompound("components"));
        itemStack.setItemMeta(itemStackFromNBT(itemStackToNBT).getItemMeta());
    }

    public static <T> T modifyComponents(ItemStack itemStack, Function<ReadWriteNBT, T> function) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            throw new NbtApiException("This method only works for 1.20.5+!");
        }
        ReadWriteNBT itemStackToNBT = itemStackToNBT(itemStack);
        T apply = function.apply(itemStackToNBT.getOrCreateCompound("components"));
        itemStack.setItemMeta(itemStackFromNBT(itemStackToNBT).getItemMeta());
        return apply;
    }

    public static void getComponents(ItemStack itemStack, Consumer<ReadableNBT> consumer) {
        if (!MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            throw new NbtApiException("This method only works for 1.20.5+!");
        }
        consumer.accept(itemStackToNBT(itemStack).getOrCreateCompound("components"));
    }

    public static <T> T getComponents(ItemStack itemStack, Function<ReadableNBT, T> function) {
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            return function.apply(itemStackToNBT(itemStack).getOrCreateCompound("components"));
        }
        throw new NbtApiException("This method only works for 1.20.5+!");
    }

    public static void modify(Entity entity, Consumer<ReadWriteNBT> consumer) {
        NBTEntity nBTEntity = new NBTEntity(entity);
        NBTContainer nBTContainer = new NBTContainer(nBTEntity.getCompound());
        consumer.accept(nBTContainer);
        nBTEntity.setCompound(nBTContainer.getCompound());
        nBTEntity.setClosed();
    }

    public static <T> T modifyPersistentData(Entity entity, Function<ReadWriteNBT, T> function) {
        T apply = function.apply(new NBTEntity(entity).getPersistentDataContainer());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        return apply;
    }

    public static void modifyPersistentData(Entity entity, Consumer<ReadWriteNBT> consumer) {
        consumer.accept(new NBTEntity(entity).getPersistentDataContainer());
    }

    public static <T> T modify(BlockState blockState, Function<ReadWriteNBT, T> function) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState);
        NBTContainer nBTContainer = new NBTContainer(nBTTileEntity.getCompound());
        T apply = function.apply(nBTContainer);
        nBTTileEntity.setCompound(nBTContainer.getCompound());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTTileEntity.setClosed();
        return apply;
    }

    public static void modify(BlockState blockState, Consumer<ReadWriteNBT> consumer) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState);
        NBTContainer nBTContainer = new NBTContainer(nBTTileEntity.getCompound());
        consumer.accept(nBTContainer);
        nBTTileEntity.setCompound(nBTContainer.getCompound());
        nBTTileEntity.setClosed();
    }

    public static <T> T modifyPersistentData(BlockState blockState, Function<ReadWriteNBT, T> function) {
        T apply = function.apply(new NBTTileEntity(blockState).getPersistentDataContainer());
        if ((apply instanceof ReadableNBT) || (apply instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        return apply;
    }

    public static void modifyPersistentData(BlockState blockState, Consumer<ReadWriteNBT> consumer) {
        consumer.accept(new NBTTileEntity(blockState).getPersistentDataContainer());
    }

    public static ReadWriteNBT gameProfileToNBT(GameProfile gameProfile) {
        return NBTGameProfile.toNBT(gameProfile);
    }

    public static GameProfile gameProfileFromNBT(ReadableNBT readableNBT) {
        return NBTGameProfile.fromNBT((NBTCompound) readableNBT);
    }

    public static ReadWriteNBT itemStackToNBT(ItemStack itemStack) {
        return NBTItem.convertItemtoNBT(itemStack);
    }

    @Nullable
    public static ItemStack itemStackFromNBT(ReadableNBT readableNBT) {
        return NBTItem.convertNBTtoItem((NBTCompound) readableNBT);
    }

    public static ReadWriteNBT itemStackArrayToNBT(ItemStack[] itemStackArr) {
        return NBTItem.convertItemArraytoNBT(itemStackArr);
    }

    @Nullable
    public static ItemStack[] itemStackArrayFromNBT(ReadableNBT readableNBT) {
        return NBTItem.convertNBTtoItemArray((NBTCompound) readableNBT);
    }

    public static ReadWriteNBT createNBTObject() {
        return new NBTContainer();
    }

    public static ReadWriteNBT parseNBT(String str) {
        return new NBTContainer(str);
    }

    public static ReadWriteNBT readNBT(InputStream inputStream) {
        return new NBTContainer(inputStream);
    }

    public static ReadWriteNBT wrapNMSTag(Object obj) {
        return new NBTContainer(obj);
    }

    public static NBTFileHandle getFileHandle(File file) throws IOException {
        return new NBTFile(file);
    }

    public static ReadWriteNBT readFile(File file) throws IOException {
        return NBTFile.readFrom(file);
    }

    public static void writeFile(File file, ReadWriteNBT readWriteNBT) throws IOException {
        NBTFile.saveTo(file, (NBTCompound) readWriteNBT);
    }

    public static <T extends NBTProxy> T readNbt(ItemStack itemStack, Class<T> cls) {
        return new ProxyBuilder(new NBTItem(itemStack, false, true, false), cls).readOnly().build();
    }

    public static <T extends NBTProxy> T readNbt(Entity entity, Class<T> cls) {
        return new ProxyBuilder(new NBTEntity(entity, true), cls).readOnly().build();
    }

    public static <T extends NBTProxy> T readNbt(BlockState blockState, Class<T> cls) {
        return new ProxyBuilder(new NBTTileEntity(blockState, true), cls).readOnly().build();
    }

    public static <T, X extends NBTProxy> T modify(ItemStack itemStack, Class<X> cls, Function<X, T> function) {
        NBTItem nBTItem = new NBTItem(itemStack, false, false, true);
        T t = (T) function.apply(new ProxyBuilder(nBTItem, cls).build());
        nBTItem.finalizeChanges();
        if ((t instanceof ReadableNBT) || (t instanceof ReadableNBTList)) {
            throw new NbtApiException("Tried returning part of the NBT to outside of the NBT scope!");
        }
        nBTItem.setClosed();
        return t;
    }

    public static <X extends NBTProxy> void modify(ItemStack itemStack, Class<X> cls, Consumer<X> consumer) {
        NBTItem nBTItem = new NBTItem(itemStack, false, false, true);
        consumer.accept(new ProxyBuilder(nBTItem, cls).build());
        nBTItem.finalizeChanges();
        nBTItem.setClosed();
    }

    public static <X extends NBTProxy> void modify(Entity entity, Class<X> cls, Consumer<X> consumer) {
        NBTEntity nBTEntity = new NBTEntity(entity);
        NBTContainer nBTContainer = new NBTContainer(nBTEntity.getCompound());
        consumer.accept(new ProxyBuilder(nBTContainer, cls).build());
        nBTEntity.setCompound(nBTContainer.getCompound());
        nBTContainer.setClosed();
    }

    public static <T, X extends NBTProxy> T modify(Entity entity, Class<X> cls, Function<X, T> function) {
        NBTEntity nBTEntity = new NBTEntity(entity);
        NBTContainer nBTContainer = new NBTContainer(nBTEntity.getCompound());
        T t = (T) function.apply(new ProxyBuilder(nBTContainer, cls).build());
        nBTEntity.setCompound(nBTContainer.getCompound());
        nBTContainer.setClosed();
        return t;
    }

    public static <X extends NBTProxy> void modify(BlockState blockState, Class<X> cls, Consumer<X> consumer) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState);
        NBTContainer nBTContainer = new NBTContainer(nBTTileEntity.getCompound());
        consumer.accept(new ProxyBuilder(nBTContainer, cls).build());
        nBTTileEntity.setCompound(nBTContainer);
        nBTContainer.setClosed();
    }

    public static <T, X extends NBTProxy> T modify(BlockState blockState, Class<X> cls, Function<X, T> function) {
        NBTTileEntity nBTTileEntity = new NBTTileEntity(blockState);
        NBTContainer nBTContainer = new NBTContainer(nBTTileEntity.getCompound());
        T t = (T) function.apply(new ProxyBuilder(nBTContainer, cls).build());
        nBTTileEntity.setCompound(nBTContainer);
        nBTContainer.setClosed();
        return t;
    }
}
