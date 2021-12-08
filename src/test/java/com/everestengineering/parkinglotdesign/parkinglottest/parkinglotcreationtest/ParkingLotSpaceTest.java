package com.everestengineering.parkinglotdesign.parkinglottest.parkinglotcreationtest;

import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingLotSpaceTest {


    @Test
    public void getFloors() {
        ParkingLotSpace plot = new ParkingLotSpace("PR123", 2, 6);

        assertEquals(ParkingLotSpace.getFloors(), 2, "number of floors in parking lot are fetched successfully.");

    }

    @Test
    public void getSlots() {
        ParkingLotSpace plot = new ParkingLotSpace("PR123", 2, 6);

        assertEquals(ParkingLotSpace.getSlots(), 6, "number of slots in each floor are fetched successfully");
    }

}