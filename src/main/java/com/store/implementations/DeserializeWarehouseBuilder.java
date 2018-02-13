package com.store.implementations;

import com.store.Warehouse;
import com.store.helpers.SerializationHelper;
import com.store.interfaces.IWarehouseBuilder;

public class DeserializeWarehouseBuilder implements IWarehouseBuilder
{
    public Warehouse createWarehouse() {
        Warehouse warehouse = SerializationHelper.DeserializeWarehouse();

        if (warehouse == null)
            warehouse = new Warehouse();

        return warehouse;
    }
}
