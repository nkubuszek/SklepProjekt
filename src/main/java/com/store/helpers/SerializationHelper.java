package com.store.helpers;

import com.store.Warehouse;
import java.io.*;
import java.nio.file.*;

public class SerializationHelper
{
    public static void SerializeWarehouse(Warehouse warehouse)
    {
        try
        {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("save.dat"));
            o.writeObject(warehouse);
            o.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception when serializing object!");
        }
    }

    public static Warehouse DeserializeWarehouse()
    {
        Path path = Paths.get("warehouse.dat");
        if (Files.exists(path))
        {
            try
            {
                ObjectInputStream i = new ObjectInputStream(new FileInputStream("warehouse.dat"));
                Warehouse warehouse = (Warehouse)i.readObject();
                i.close();
                Files.delete(Paths.get("warehouse.dat"));
                return warehouse;
            }
            catch (Exception e)
            {
                System.out.println("Exception where deserializing object!");
            }
        }

        return null;
    }

}
