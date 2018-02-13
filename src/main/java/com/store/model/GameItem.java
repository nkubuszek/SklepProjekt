package com.store.model;

public class GameItem extends Item
{
    private String genre;
    private String platform;

    public GameItem()
    {

    }

    public GameItem(String title, String genre, double price, String platform, int year, int quantity)
    {
        this.name = title;
        this.genre = genre;
        this.platform = platform;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Gatunek: " + genre;
    }
}

