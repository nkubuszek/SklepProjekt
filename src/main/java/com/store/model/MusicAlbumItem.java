package com.store.model;

import java.util.Arrays;
import java.util.List;

public class MusicAlbumItem extends Item
{
    private String genre;
    private String author;
    private List<String> songs;

    public MusicAlbumItem()
    {

    }

    public MusicAlbumItem(String title, String genre, String author, double price, int year, int quantity, String... songs)
    {
        this.name = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
        this.year = year;
        this.quantity = quantity;
        this.songs = Arrays.asList(songs);
    }

    @Override
    public String toString()
    {
        return super.toString() + " Gatunek: " + genre + " Autor: " + author;
    }
}
