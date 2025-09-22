package ua.model;

import ua.util.Utils;

import javax.swing.*;
import java.util.Objects;

public record Vehicle(String licensePlate, String model, int capacity){
    public Vehicle{
        if(!Utils.checkNumber(capacity))
            throw new IllegalArgumentException("Capacity less zero");
        if(!Utils.checkLicensePlate(licensePlate))
            throw new IllegalArgumentException("Incorrect licensePlate");
        if(!Utils.checkString(model))
            throw new IllegalArgumentException("Incorrect model");
    }
}
