package ua.main;

import ua.model.*;

import java.lang.classfile.instruction.SwitchCase;

public class Main {
    public static void main(String[] argv){
//        showClasses();

        Vehicle vehicle = new Vehicle("AE0606EA", "Scania", 3);
        Route route = new Route("KR", "CH", 867);
        Shipment shipment = new Shipment(vehicle, route, "cargo", Status.IN_TRANSIT, "20.03.2025");
        showSwitch(shipment);
        Shipment shipment2 = new Shipment(vehicle, route, "cargo", Status.DELIVERED, "20.03.2025");
        showSwitch(shipment2);

//        showErrors();
    }

    public static void showClasses(){
        Vehicle vehicle = new Vehicle("AE0606EA", "Scania", 3);
        System.out.println(vehicle.toString());

        Driver driver = new Driver("Dmitry", "Rodenko", "qwety");
        System.out.println(driver.toString());


        Route route = new Route("KR", "CH", 867);
        System.out.println(route.toString());


        Shipment shipment = new Shipment(vehicle, route, "cargo", Status.IN_TRANSIT, "20.03.2025");
        System.out.println(shipment.toString());


        Object warehouse = new Warehouse("Warehouse", "Ch");
        System.out.println(warehouse);
    }

    public static void showErrors(){
        String incorrect_string;
//        incorrect_string = "";
//        Vehicle vehicle = new Vehicle(incorrect_string, "Scania", 3);
//        System.out.println(vehicle.toString());

//        incorrect_string = "Name111";
//        Driver driver = new Driver(incorrect_string, "Surname", "LicenseNumber");
//        System.out.println(driver.toString());

//        Object route = new Route("KR", "CH", -7);
//        System.out.println(route.toString());
    }

    public static void showSwitch(Shipment shipment) {
        Status status = shipment.status();

        switch (status) {
            case SENT -> System.out.println("Shipment is sent");
            case IN_TRANSIT -> System.out.println("Shipment in transit");
            case DELIVERED -> System.out.println("Shipment has delivered");
            case DETAINED -> System.out.println("Shipment is detained");
        }
    }
}
