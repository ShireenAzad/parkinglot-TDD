package com.everestengineering.parkinglotdesign.parkinglotfunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingLotValidation {
    private final List<ArrayList<String>> vehiclesData;

    public ParkingLotValidation(List<ArrayList<String>> vehiclesData) {
        this.vehiclesData = vehiclesData;

    }

    public boolean isParkingLotFull(String vehicleType) {
        int count = 0;
        for (ArrayList<String> i : vehiclesData) {
            count += Collections.frequency(i, vehicleType);
        }
        if (count == 0) {
            System.out.println("Parking Lot Full");
            return true;
        }
        return false;

    }
}
