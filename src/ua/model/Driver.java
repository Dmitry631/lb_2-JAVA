package ua.model;

import ua.util.Utils;

import java.util.Objects;

public record Driver(String firstName, String lastName, String licenseNumber){
    public Driver{
        if(!Utils.checkNamedData(firstName))
            throw new IllegalArgumentException("Incorrect name");
        if(!Utils.checkString(licenseNumber))
            throw new IllegalArgumentException("Empty licenseNumber");
        if(!Utils.checkString(licenseNumber))
            throw new IllegalArgumentException("Empty licenseNumber");
    }
}
