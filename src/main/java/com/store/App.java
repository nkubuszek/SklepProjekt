package com.store;

import com.store.implementations.TestWarehouseBuilder;


/**
 * Hello world!
 *
 */
class App
{
    public static void main( String[] args )
    {
        StoreManager manager = new StoreManager(new TestWarehouseBuilder());
        manager.CreateWarehouse();
        System.out.print(manager.ShowAllItems());
    }
}
