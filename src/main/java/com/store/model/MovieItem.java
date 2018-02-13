package com.store.model;

public class MovieItem extends Item
{
    private String genre;

    public MovieItem()
    {

    }

    public MovieItem(String name, String genre, double price, int year, int quantity)
    {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Gatunek: " + genre;
    }
}
