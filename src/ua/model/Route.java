package ua.model;

import ua.util.Utils;

import java.util.Objects;

public record Route(String origin, String destination, double distance){
    public Route{
        if(!Utils.checkString(origin))
            throw new IllegalArgumentException("Incorrect origin");
        if(!Utils.checkString(destination))
            throw new IllegalArgumentException("Incorrect destination");
        if(!Utils.checkDistance(distance))
            throw new IllegalArgumentException("Distance less zero");
    }
}
