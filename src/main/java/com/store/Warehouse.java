package com.store;

import com.store.model.*;

import java.io.Serializable;
import java.util.*;

public class Warehouse implements Serializable
{
    private final List<Item> items;
    public void AddItem(Item item)
    {
        items.add(item);
    }
    public void AddItemsRange(Item[] items)
    {
        Collections.addAll(this.items, items);
    }
    public void RemoveItem(Item item)
    {
        items.remove(item);
    }
    public void RemoveAll()
    {
        items.clear();
    }

    public String showAllItems()
    {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for(Item item : items)
        {
            builder.append(index).append(". ").append(item).append("\n");
            ++index;
        }

        return builder.toString();
    }

    public Warehouse()
    {
        this.items = new ArrayList<>();
    }
}
