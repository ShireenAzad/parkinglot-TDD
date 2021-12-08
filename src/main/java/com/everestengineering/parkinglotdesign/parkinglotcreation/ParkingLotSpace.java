package com.everestengineering.parkinglotdesign.parkinglotcreation;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSpace {
    private static String id;
    private static int floors;
    private static int slots;

    public ParkingLotSpace(String id, int floors, int slots) {
        ParkingLotSpace.id = id;
        ParkingLotSpace.floors = floors;
        ParkingLotSpace.slots = slots;
    }

    public static int getFloors() {
        return floors;
    }

    public static int getSlots() {
        return slots;
    }

    public static String getId() {
        return id;
    }

    public List<ArrayList<String>> createParkingLot(int floors, int slots) {
        FloorsInParkingLot floorsInParkingLot = new FloorsInParkingLot();
        List<ArrayList<String>> vehiclesData = floorsInParkingLot.createFloors();
        System.out.println("Created parking lot with " + floors + " floors and " + slots + " slots per floor");
        return vehiclesData;
    }
}

