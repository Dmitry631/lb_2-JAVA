package ua.main;

import ua.model.*;

public class Main {
    public static void main(String[] argv){
        showClasses();
        showErrors();

    }

    public static void showClasses(){
        Vehicle vehicle = new Vehicle("AE0606EA", "Scania", 3);
        System.out.println(vehicle.toString());

        Driver driver = new Driver("Dmitry", "Rodenko", "qwety");
        System.out.println(driver.toString());


        Route route = new Route("KR", "CH", 867);
        System.out.println(route.toString());


        Shipment shipment = new Shipment(vehicle, route, "cargo", "20.03.2025");
        System.out.println(shipment.toString());


//        Object warehouse = Warehouse.createWarehouse("Warehouse", "Ch");
        Warehouse warehouse = new Warehouse("Warehouse", "");
        System.out.println(warehouse);
//        System.out.println(warehouse.location());
    }

    public static void showErrors(){
        String incorrect_string;
//        incorrect_string = "";
//        Vehicle vehicle = new Vehicle(incorrect_string, "Scania", 3);
//        System.out.println(vehicle.toString());

//        incorrect_string = "Name111";
//        Driver driver = new Driver(incorrect_string, "Surname", "LicenseNumber");
//        System.out.println(driver.toString());

        Object route = new Route("KR", "CH", -7);
        System.out.println(route.toString());
    }
}
