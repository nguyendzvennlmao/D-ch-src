package com.kammoun.utils.nbtapi;

import com.kammoun.utils.nbtapi.utils.nmsmappings.ReflectionMethod;
import java.util.Map;
import org.bukkit.persistence.PersistentDataContainer;

public class NBTPersistentDataContainer extends NBTCompound {
    private final PersistentDataContainer container;

    public NBTPersistentDataContainer(PersistentDataContainer persistentDataContainer) {
        super(null, null);
        this.container = persistentDataContainer;
    }

    @Override
    public Object getCompound() {
        return ReflectionMethod.CRAFT_PERSISTENT_DATA_CONTAINER_TO_TAG.run(this.container, new Object[0]);
    }

    @Override
    public void setCompound(Object obj) {
        ((Map) ReflectionMethod.CRAFT_PERSISTENT_DATA_CONTAINER_GET_MAP.run(this.container, new Object[0])).clear();
        ReflectionMethod.CRAFT_PERSISTENT_DATA_CONTAINER_PUT_ALL.run(this.container, obj);
    }
}
