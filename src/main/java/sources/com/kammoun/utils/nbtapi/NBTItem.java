package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.iface.ReadWriteItemNBT;
import com.kammoun.utils.nbtapi.iface.ReadWriteNBT;
import com.kammoun.utils.nbtapi.iface.ReadableNBT;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ClassWrapper;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class NBTItem extends NBTCompound implements ReadWriteItemNBT {
    private ItemStack bukkitItem;
    private final boolean directApply;
    private final boolean finalizer;
    private ItemStack originalSrcStack;
    private Object cachedCompound;
    private boolean closed;

    @Deprecated
    public NBTItem(ItemStack itemStack) {
        this(itemStack, false);
    }

    public NBTItem(ItemStack itemStack, boolean z, boolean z2, boolean z3) {
        super(null, null, z2);
        this.originalSrcStack = null;
        this.cachedCompound = null;
        this.closed = false;
        if (itemStack == null || itemStack.getType() == Material.AIR || itemStack.getAmount() <= 0) {
            throw new NullPointerException("ItemStack can't be null/air/amount of 0! This is not a NBTAPI bug!");
        }
        this.finalizer = z3;
        if (z3) {
            this.bukkitItem = itemStack;
            this.originalSrcStack = itemStack;
            this.directApply = false;
        } else {
            if (z2) {
                this.bukkitItem = itemStack;
                this.directApply = false;
                return;
            }
            this.directApply = z;
            this.bukkitItem = itemStack.clone();
            if (z) {
                this.originalSrcStack = itemStack;
            }
        }
    }

    @Deprecated
    public NBTItem(ItemStack itemStack, boolean z) {
        super(null, null);
        this.originalSrcStack = null;
        this.cachedCompound = null;
        this.closed = false;
        if (itemStack == null || itemStack.getType() == Material.AIR || itemStack.getAmount() <= 0) {
            throw new NullPointerException("ItemStack can't be null/air/amount of 0! This is not a NBTAPI bug!");
        }
        this.finalizer = false;
        this.directApply = z;
        this.bukkitItem = itemStack.clone();
        if (z) {
            this.originalSrcStack = itemStack;
        }
    }

    @Override
    public Object getCompound() {
        if (this.closed) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        if (isReadOnly() && (this.cachedCompound != null || ClassWrapper.CRAFT_ITEMSTACK.getClazz().isAssignableFrom(this.bukkitItem.getClass()))) {
            if (this.cachedCompound == null) {
                this.cachedCompound = NBTReflectionUtil.getItemRootNBTTagCompound(NBTReflectionUtil.getCraftItemHandle(this.bukkitItem));
            }
            return this.cachedCompound;
        }
        if (!this.finalizer) {
            return NBTReflectionUtil.getItemRootNBTTagCompound(ReflectionMethod.ITEMSTACK_NMSCOPY.run(null, this.bukkitItem));
        }
        if (this.cachedCompound == null) {
            updateCachedCompound();
        }
        return this.cachedCompound;
    }

    private void updateCachedCompound() {
        if (this.finalizer) {
            this.cachedCompound = NBTReflectionUtil.getItemRootNBTTagCompound(ReflectionMethod.ITEMSTACK_NMSCOPY.run(null, this.bukkitItem));
        }
    }

    public void finalizeChanges() {
        if (!this.finalizer || this.cachedCompound == null) {
            return;
        }
        if (NBTReflectionUtil.getKeys(this).isEmpty()) {
            this.cachedCompound = null;
        }
        if (ClassWrapper.CRAFT_ITEMSTACK.getClazz().isAssignableFrom(this.originalSrcStack.getClass())) {
            NBTReflectionUtil.setItemStackCompound(NBTReflectionUtil.getCraftItemHandle(this.originalSrcStack), this.cachedCompound);
            this.bukkitItem = this.originalSrcStack;
        } else {
            Object run = ReflectionMethod.ITEMSTACK_NMSCOPY.run(null, this.bukkitItem);
            NBTReflectionUtil.setItemStackCompound(run, this.cachedCompound);
            this.bukkitItem = (ItemStack) ReflectionMethod.ITEMSTACK_BUKKITMIRROR.run(null, run);
            this.originalSrcStack.setItemMeta(this.bukkitItem.getItemMeta());
        }
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
    public void setCompound(Object obj) {
        if (isReadOnly()) {
            throw new NbtApiException("Tried setting data in read only mode!");
        }
        if (this.closed) {
            throw new NbtApiException("Tried using closed NBT data!");
        }
        if (this.finalizer) {
            this.cachedCompound = obj;
            return;
        }
        if (obj != null && ((Set) ReflectionMethod.COMPOUND_GET_KEYS.run(obj, new Object[0])).isEmpty()) {
            obj = null;
        }
        if (ClassWrapper.CRAFT_ITEMSTACK.getClazz().isAssignableFrom(this.bukkitItem.getClass())) {
            NBTReflectionUtil.setItemStackCompound(NBTReflectionUtil.getCraftItemHandle(this.bukkitItem), obj);
            return;
        }
        Object run = ReflectionMethod.ITEMSTACK_NMSCOPY.run(null, this.bukkitItem);
        NBTReflectionUtil.setItemStackCompound(run, obj);
        this.bukkitItem = (ItemStack) ReflectionMethod.ITEMSTACK_BUKKITMIRROR.run(null, run);
    }

    @Deprecated
    public void applyNBT(ItemStack itemStack) {
        if (itemStack == null || itemStack.getType() == Material.AIR) {
            throw new NullPointerException("ItemStack can't be null/Air! This is not a NBTAPI bug!");
        }
        NBTItem nBTItem = new NBTItem(new ItemStack(itemStack.getType()));
        nBTItem.mergeCompound((NBTCompound) this);
        itemStack.setItemMeta(nBTItem.getItem().getItemMeta());
    }

    @Deprecated
    public void mergeNBT(ItemStack itemStack) {
        NBTItem nBTItem = new NBTItem(itemStack);
        nBTItem.mergeCompound((NBTCompound) this);
        itemStack.setItemMeta(nBTItem.getItem().getItemMeta());
    }

    @Deprecated
    public void mergeCustomNBT(ItemStack itemStack) {
        if (itemStack == null || itemStack.getType() == Material.AIR) {
            throw new NullPointerException("ItemStack can't be null/Air!");
        }
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            NBT.modify(itemStack, (Consumer<ReadWriteItemNBT>) readWriteItemNBT -> {
                readWriteItemNBT.mergeCompound(this);
            });
            return;
        }
        ItemMeta itemMeta = itemStack.getItemMeta();
        NBTReflectionUtil.getUnhandledNBTTags(itemMeta).putAll(NBTReflectionUtil.getUnhandledNBTTags(this.bukkitItem.getItemMeta()));
        itemStack.setItemMeta(itemMeta);
    }

    @Override
    @Deprecated
    public boolean hasCustomNbtData() {
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            return hasNBTData();
        }
        finalizeChanges();
        return !NBTReflectionUtil.getUnhandledNBTTags(this.bukkitItem.getItemMeta()).isEmpty();
    }

    @Override
    @Deprecated
    public void clearCustomNBT() {
        finalizeChanges();
        if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
            setCompound(null);
            return;
        }
        ItemMeta itemMeta = this.bukkitItem.getItemMeta();
        NBTReflectionUtil.getUnhandledNBTTags(itemMeta).clear();
        this.bukkitItem.setItemMeta(itemMeta);
        updateCachedCompound();
    }

    public ItemStack getItem() {
        return this.bukkitItem;
    }

    protected void setItem(ItemStack itemStack) {
        this.bukkitItem = itemStack;
    }

    @Override
    public boolean hasNBTData() {
        return getCompound() != null;
    }

    @Override
    public void modifyMeta(BiConsumer<ReadableNBT, ItemMeta> biConsumer) {
        finalizeChanges();
        ItemMeta itemMeta = this.bukkitItem.getItemMeta();
        biConsumer.accept(new NBTContainer(getResolvedObject()).setReadOnly(true), itemMeta);
        this.bukkitItem.setItemMeta(itemMeta);
        updateCachedCompound();
        if (this.directApply) {
            if (MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4)) {
                throw new NbtApiException("Direct apply mode meta changes don't work anymore in 1.20.5+. Please switch to the modern NBT.modify sytnax!");
            }
            applyNBT(this.originalSrcStack);
        }
    }

    @Override
    public <T extends ItemMeta> void modifyMeta(Class<T> cls, BiConsumer<ReadableNBT, T> biConsumer) {
        finalizeChanges();
        ItemMeta itemMeta = this.bukkitItem.getItemMeta();
        biConsumer.accept(new NBTContainer(getResolvedObject()).setReadOnly(true), itemMeta);
        this.bukkitItem.setItemMeta(itemMeta);
        updateCachedCompound();
        if (this.directApply) {
            applyNBT(this.originalSrcStack);
        }
    }

    @Deprecated
    public static NBTContainer convertItemtoNBT(ItemStack itemStack) {
        return NBTReflectionUtil.convertNMSItemtoNBTCompound(ReflectionMethod.ITEMSTACK_NMSCOPY.run(null, itemStack));
    }

    @Nullable
    @Deprecated
    public static ItemStack convertNBTtoItem(NBTCompound nBTCompound) {
        return (ItemStack) ReflectionMethod.ITEMSTACK_BUKKITMIRROR.run(null, NBTReflectionUtil.convertNBTCompoundtoNMSItem(nBTCompound));
    }

    @Deprecated
    public static NBTContainer convertItemArraytoNBT(ItemStack[] itemStackArr) {
        NBTContainer nBTContainer = new NBTContainer();
        nBTContainer.setInteger("size", Integer.valueOf(itemStackArr.length));
        NBTCompoundList compoundList = nBTContainer.getCompoundList("items");
        for (int i = 0; i < itemStackArr.length; i++) {
            ItemStack itemStack = itemStackArr[i];
            if (itemStack != null && itemStack.getType() != Material.AIR) {
                NBTListCompound addCompound = compoundList.addCompound();
                addCompound.setInteger("Slot", Integer.valueOf(i));
                addCompound.mergeCompound((NBTCompound) convertItemtoNBT(itemStack));
            }
        }
        return nBTContainer;
    }

    @Nullable
    @Deprecated
    public static ItemStack[] convertNBTtoItemArray(NBTCompound nBTCompound) {
        if (!nBTCompound.hasTag("size")) {
            return null;
        }
        ItemStack[] itemStackArr = new ItemStack[nBTCompound.getInteger("size").intValue()];
        for (int i = 0; i < itemStackArr.length; i++) {
            itemStackArr[i] = new ItemStack(Material.AIR);
        }
        if (!nBTCompound.hasTag("items")) {
            return itemStackArr;
        }
        Iterator<ReadWriteNBT> it = nBTCompound.getCompoundList("items").iterator();
        while (it.hasNext()) {
            ReadWriteNBT next = it.next();
            if (next instanceof NBTCompound) {
                itemStackArr[next.getInteger("Slot").intValue()] = convertNBTtoItem((NBTCompound) next);
            }
        }
        return itemStackArr;
    }

    @Override
    public void saveCompound() {
        if (this.directApply) {
            applyNBT(this.originalSrcStack);
        }
    }
}
