package com.store.implementations;

import com.store.Warehouse;
import com.store.creators.ItemCreator;
import com.store.interfaces.IWarehouseBuilder;
import com.store.model.*;

public class TestWarehouseBuilder implements IWarehouseBuilder
{

    public Warehouse createWarehouse() {
        Warehouse warehouse = new Warehouse();

        Item game = ItemCreator.createGame("Uncharted 3", "Przygodowa", 99, "PS4", 2015, 3);
        Item musicAlbum = ItemCreator.createMusicAlbum("Polskie kolędy", "Swiateczne", "Polscy artysci", 29,
                2017, 10, "Pojdzmy wszyscy do stajenki", "Przybiezeli do Betlejem", "Wsrod nocnej ciszy");
        Item movie = ItemCreator.createMovie("Interstellar", "Sci-Fi", 59, 2014, 2);
        Item accesory = ItemCreator.createAccesorie("Pad Playstation 4", 199, 2017, 20);

        warehouse.AddItemsRange(new Item[] {game, musicAlbum, movie, accesory});

        return warehouse;
    }
}
