package com.store.model;

import java.io.Serializable;

public abstract class Item implements Serializable
{
    String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    double price;
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    int year;

    int quantity;
    public int getQuantity()
    {
        return this.quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String toString()
    {
        String s = "Nazwa: " +
                name +
                " Cena: " +
                price +
                " Ilosc: " +
                quantity +
                " Rok produkcji: " +
                year;

        return s;
    }
}
