package com.everestengineering.parkinglotdesign.display;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class DisplayFreeSlots implements Display {
    public void display(String vehicleType, List<ArrayList<String>> vehiclesData) {
        for (int i = 0; i < vehiclesData.size(); i++) {
            List<Integer> freeSlots = new ArrayList<>();
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehiclesData.get(i).get(j).equals(vehicleType))
                    freeSlots.add(j + 1);
            }
            if (freeSlots.size() > 0) {
                List<String> freeSlotsOfVehicle = freeSlots.stream().map(String::valueOf).collect(Collectors.toList());
                String result = String.join(",", freeSlotsOfVehicle);
                System.out.println("Free slots for " + vehicleType + " on Floor " + (i + 1) + ":" + result);
            } else
                System.out.println("Free slots for " + vehicleType + " on Floor " + (i + 1) + ":");
        }

    }

}
