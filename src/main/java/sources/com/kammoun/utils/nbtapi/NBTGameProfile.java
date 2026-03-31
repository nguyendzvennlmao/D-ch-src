package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.GameprofileUtil;
import com.kammoun.utils.nbtapi.utils.MinecraftVersion;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ObjectCreator;
import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import com.mojang.authlib.GameProfile;

public class NBTGameProfile {
    @Deprecated
    public static NBTCompound toNBT(GameProfile gameProfile) {
        return MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4) ? (NBTCompound) GameprofileUtil.writeGameProfile(NBT.createNBTObject(), gameProfile) : new NBTContainer(ReflectionMethod.GAMEPROFILE_SERIALIZE.run(null, ObjectCreator.NMS_NBTTAGCOMPOUND.getInstance(new Object[0]), gameProfile));
    }

    @Deprecated
    public static GameProfile fromNBT(NBTCompound nBTCompound) {
        return MinecraftVersion.isAtLeastVersion(MinecraftVersion.MC1_20_R4) ? GameprofileUtil.readGameProfile(nBTCompound) : (GameProfile) ReflectionMethod.GAMEPROFILE_DESERIALIZE.run(null, NBTReflectionUtil.getToCompount(nBTCompound.getCompound(), nBTCompound));
    }
}
