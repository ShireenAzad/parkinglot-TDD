package com.everestengineering.parkinglotdesign.display;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class DisplayOccupiedSlots implements Display {
    public void display(String vehicleType, List<ArrayList<String>> vehiclesData) {
        for (int i = 0; i < vehiclesData.size(); i++) {
            List<Integer> occupiedSlots = new ArrayList<>();
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehicleType.equals("TRUCK") && j == 0) {
                    if (!(vehiclesData.get(i).get(j).equals(vehicleType)))
                        occupiedSlots.add(j + 1);
                } else if (vehicleType.equals("BIKE") && (j == 1 || j == 2)) {
                    if (!(vehiclesData.get(i).get(j).equals(vehicleType)))
                        occupiedSlots.add(j + 1);
                } else if (vehicleType.equals("CAR") && j > 2) {
                    if (!(vehiclesData.get(i).get(j).equals(vehicleType)))
                        occupiedSlots.add(j + 1);
                }
            }
            if (occupiedSlots.size() > 0) {
                List<String> occupiedSlotsOfVehicle = occupiedSlots.stream().map(String::valueOf).collect(Collectors.toList());
                String result = String.join(",", occupiedSlotsOfVehicle);
                System.out.println("Occupied slots for " + vehicleType + " on Floor " + (i + 1) + ":" + result);
            } else
                System.out.println("Occupied slots for " + vehicleType + " on Floor " + (i + 1) + ":");
        }

    }
}

