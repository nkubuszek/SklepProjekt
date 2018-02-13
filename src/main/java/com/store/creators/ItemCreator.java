package com.store.creators;

import com.store.model.*;

//wzorzec projektowy - fabryka
public class ItemCreator
{
    public static Item createMovie(String title, String genre, double price, int year, int quantity)
    {
        MovieItem movie = new MovieItem(title, genre, price, year, quantity);
        return movie;
    }

    public static Item createGame(String title, String genre, double price, String platform, int year, int quantity)
    {
        GameItem game = new GameItem(title, genre, price, platform, year, quantity);
        return game;
    }

    public static Item createMusicAlbum(String title, String genre, String author, double price, int year, int quantity, String... songs)
    {
        MusicAlbumItem musicAlbum = new MusicAlbumItem(title, genre, author, price, year, quantity, songs);
        return musicAlbum;
    }

    public static Item createAccesorie(String name, double price, int year, int quantity)
    {
        AccesorieItem accesorie = new AccesorieItem(name, price, year, quantity);
        return accesorie;
    }
}
