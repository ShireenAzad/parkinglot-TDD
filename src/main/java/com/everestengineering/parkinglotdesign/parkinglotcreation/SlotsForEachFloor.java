package com.everestengineering.parkinglotdesign.parkinglotcreation;

import java.util.ArrayList;
import java.util.List;

public class SlotsForEachFloor {

    private final List<ArrayList<String>> vehiclesData;


    SlotsForEachFloor(List<ArrayList<String>> vehiclesData) {

        this.vehiclesData = vehiclesData;

    }

    public List<ArrayList<String>> createSlots() {

        for (int i = 0; i < ParkingLotSpace.getFloors(); ++i)
            for (int j = 0; j < ParkingLotSpace.getSlots(); ++j)
                if (j == 0)
                    vehiclesData.get(i).add(j, "TRUCK");
                else if (j == 1 || j == 2)
                    vehiclesData.get(i).add(j, "BIKE");
                else
                    vehiclesData.get(i).add(j, "CAR");
        return vehiclesData;

    }
}
