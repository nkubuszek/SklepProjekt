package com.store.model;

public class AccesorieItem extends Item
{
    public AccesorieItem()
    {

    }

    public AccesorieItem(String name, double price, int year, int quantity)
    {
        this.name = name;
        this.price = price;
        this.year = year;
        this.quantity = quantity;
    }
}
