package com.kammoun.donutCore.sell.database;

import com.kammoun.donutCore.sell.model.SellPlayerData;
import java.util.Collection;
import java.util.UUID;

public interface SellRepository {
    SellPlayerData load(UUID uuid, int i);

    void save(SellPlayerData sellPlayerData, int i);

    void saveAll(Collection collection, int i);

    boolean exists(UUID uuid);

    void delete(UUID uuid);
}
