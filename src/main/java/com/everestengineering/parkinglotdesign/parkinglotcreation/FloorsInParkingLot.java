package com.everestengineering.parkinglotdesign.parkinglotcreation;

import java.util.ArrayList;
import java.util.List;

public class FloorsInParkingLot {
    public List<ArrayList<String>> createFloors() {
        List<ArrayList<String>> vehiclesData = new ArrayList<>();
        for (int i = 0; i < ParkingLotSpace.getFloors(); ++i)
            vehiclesData.add(new ArrayList<>());
        SlotsForEachFloor slots = new SlotsForEachFloor(vehiclesData);
        vehiclesData = slots.createSlots();
        return vehiclesData;
    }
}
