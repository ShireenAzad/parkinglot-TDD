package com.everestengineering.parkinglotdesign.display;

import java.util.ArrayList;
import java.util.List;

public class DisplayVehicleDataInEachFloor {
    private final String vehicleType;
    private final List<ArrayList<String>> vehiclesData;
    private final String command;

    public DisplayVehicleDataInEachFloor(String command, String vehicleType, List<ArrayList<String>> vehiclesData) {
        this.command = command;
        this.vehicleType = vehicleType;
        this.vehiclesData = vehiclesData;
    }

    public void displayVehicleDataInEachFloor(Display displayData) {
        String displayType = displayData.getClass().getSimpleName().toUpperCase();
        for (DisplayType type : DisplayType.values()) {
            String Type = type.toString();


            {
                displayData.display(vehicleType, vehiclesData);
                return;
            }

        }
    }
}
