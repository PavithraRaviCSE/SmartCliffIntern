package selfpractice;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapPractice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        VehicleTypeMap v = new VehicleTypeMap();

        System.out.println("Adding key-value pairs to vehicleTypeMap:");
        v.add("car", "sedan");
        v.add("truck", "pickup");
        v.add("motorcycle", "sportbike");
        v.add("van", "minivan");
        v.add("suv", "crossover");
        v.iterateValue();
        System.out.println();

        System.out.println("Copying mappings to copyMap:");
        VehicleTypeMap copyMap = new VehicleTypeMap();
        copyMap.copyFrom(v);
        copyMap.iterateValue();

        System.out.println("category of veicle type 'motorcycle':");
        v.getVehicle("motorcycle");
        
        System.out.println("Removing the mapping for the vehicle type 'van':");
        v.remove("van");
        v.iterateValue();

        System.out.println("Checking if the vehicleTypeMap contains the vehicle type 'suv':");
        v.contains("suv");

        System.out.println("Checking if the vehicleTypeMap contains the category 'pickup':");
        v.containsValue("pickup");
     
        System.out.println("Checking if the vehicleTypeMap is empty:");
        v.isEmpty();
        
        System.out.println("Determining and printing the number of key-value mappings in the vehicleTypeMap:");
        v.size();

        System.out.println("Retrieving and printing the set of vehicle types in the vehicleTypeMap:");
        v.retrieveKeys();

        System.out.println("Retrieving and printing the collection of categories in the vehicleTypeMap:");
        v.retrieveValues();
    }
}

class VehicleTypeMap {
    LinkedHashMap<String, String> map;

    VehicleTypeMap() {
        map = new LinkedHashMap<>();
    }
    void add(String key, String category) {
        map.put(key, category);
    }

    void copyFrom(VehicleTypeMap otherMap) {
        this.map.putAll(otherMap.map);
    }

    void getVehicle(String vehicleType) {
        if (map.containsKey(vehicleType)) {
            System.out.println("Vehicle: " + vehicleType + "\nCategory: " + map.get(vehicleType));
        } else {
            System.out.println("Vehicle type not found.");
        }
    }

    void remove(String vehicleType) {
        if (map.remove(vehicleType) != null) {
            System.out.println(vehicleType + " removed");
        } else {
            System.out.println(vehicleType + " not found");
        }
    }

    void iterateValue() {
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    void contains(String vehicleType) {
        if (map.containsKey(vehicleType)) {
            System.out.println("Contains " + vehicleType);
        } else {
            System.out.println("No element exists");
        }
    }

    void containsValue(String category) {
        if (map.containsValue(category)) {
            System.out.println("Contains " + category);
        } else {
            System.out.println("No element exists");
        }
    }
    void isEmpty() {
        System.out.println("Is empty: " + map.isEmpty());
    }

    void size() {
        System.out.println("Size: " + map.size());
    }

    void retrieveKeys() {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    void retrieveValues() {
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}
