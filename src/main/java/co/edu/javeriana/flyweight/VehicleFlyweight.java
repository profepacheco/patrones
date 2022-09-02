package co.edu.javeriana.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFlyweight {

    private HashMap<String, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(String color){
        if(vehicles.containsKey(color)){
            return vehicles.get(color);
        }else{
            Vehicle newVehicle = new Vehicle(color, "NUEVO");
            vehicles.put(color, newVehicle);
            return newVehicle;
        }
    }

}
