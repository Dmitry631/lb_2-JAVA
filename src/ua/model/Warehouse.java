package ua.model;

import ua.util.Utils;

import java.util.Objects;

public record Warehouse(String name, String location){
    public Warehouse{
        if(!Utils.checkString(name))
            throw new IllegalArgumentException("Incorrect name");
        else if(!Utils.checkString(location))
            throw new IllegalArgumentException("Incorrect location");
    }
}
