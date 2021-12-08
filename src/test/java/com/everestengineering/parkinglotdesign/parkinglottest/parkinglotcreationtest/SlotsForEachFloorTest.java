package com.everestengineering.parkinglotdesign.parkinglottest.parkinglotcreationtest;

import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SlotsForEachFloorTest {
    @Test
    public void slotsCreationTesting() {
        ParkingLotSpace plot = new ParkingLotSpace("PR123", 2, 6);
        List<ArrayList<String>> floors = plot.createParkingLot(2, 6);
        assertEquals(floors.get(0).size(), 6, "Slot objects are created successfully.");
        ParkingLotSpace plot1 = new ParkingLotSpace("PR123", 2, 4);
        List<ArrayList<String>> floors1 = plot.createParkingLot(2, 4);
        assertNotEquals(floors.get(0).size(), 4, "Slot objects are not created successfully in each floor.");
    }
}
