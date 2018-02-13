package com.store.implementations;

import com.store.Warehouse;
import com.store.interfaces.IWarehouseBuilder;


public class EmptyWarehouseBuilder implements IWarehouseBuilder
{
    public Warehouse createWarehouse() {
        return new Warehouse();
    }
}
