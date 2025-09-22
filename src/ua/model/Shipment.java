package ua.model;

import ua.util.Utils;

import java.util.Objects;

public record Shipment(Vehicle vehicle, Route route, String cargo, String shipmentDate){
    public Shipment{
        if(!Utils.checkString(cargo))
            throw new IllegalArgumentException("Incorrect cargo");
        if(!Utils.checkDate(shipmentDate))
            throw new IllegalArgumentException("Incorrect date");
    }
}
