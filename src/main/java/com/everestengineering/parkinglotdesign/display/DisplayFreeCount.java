package com.everestengineering.parkinglotdesign.display;


import java.util.ArrayList;
import java.util.List;

class DisplayFreeCount implements Display {
    public void display(String vehicleType, List<ArrayList<String>> vehiclesData) {
        for (int i = 0; i < vehiclesData.size(); i++) {
            int free_count = 0;
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehiclesData.get(i).get(j).equals(vehicleType))
                    free_count++;
            }
            System.out.println("No. of free slots for " + vehicleType + " on Floor " + (i + 1) + ":" + free_count);

        }

    }
}

