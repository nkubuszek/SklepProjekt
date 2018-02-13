package com.store;

import com.store.helpers.SerializationHelper;
import com.store.interfaces.IWarehouseBuilder;

//wzorzec projektowy - fasada
class StoreManager
{
    private Warehouse warehouse;
    private final IWarehouseBuilder builder;
    public StoreManager(IWarehouseBuilder builder)
    {
        this.builder = builder;
    }

    public void CreateWarehouse()
    {
        this.warehouse = builder.createWarehouse();
    }

    public void SaveWarehouse()
    {
        if (this.warehouse != null)
        {
            SerializationHelper.SerializeWarehouse(this.warehouse);
        }
    }

    public String ShowAllItems()
    {
        return warehouse.showAllItems();
    }
}
