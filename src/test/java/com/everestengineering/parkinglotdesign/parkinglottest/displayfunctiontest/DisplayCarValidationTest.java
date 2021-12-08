package com.everestengineering.parkinglotdesign.parkinglottest.displayfunctiontest;

import com.everestengineering.parkinglotdesign.display.Display;
import com.everestengineering.parkinglotdesign.display.DisplayType;
import com.everestengineering.parkinglotdesign.display.DisplayVehicleDataInEachFloor;
import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import com.everestengineering.parkinglotdesign.parkinglotfunctions.ParkingLot;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;
import com.everestengineering.parkinglotdesign.vehicles.VehicleType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static com.everestengineering.parkinglotdesign.parkinglottest.parkinglotfunctionstest.ParkingLotTest.ticketsData;
import static com.everestengineering.parkinglotdesign.parkinglottest.parkinglotfunctionstest.ParkingLotTest.vehiclesData;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DisplayCarValidationTest {
    @BeforeAll
    public static void creatingParkingLotTesting() {
        ParkingLotSpace plot = new ParkingLotSpace("PR1234", 2, 5);
        vehiclesData = plot.createParkingLot(2, 5);
        ParkingLot parkingLot = new ParkingLot(vehiclesData, ticketsData);
        Vehicle vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
    }

    @Test
    public void checkingDisplayValidation() {
        DisplayVehicleDataInEachFloor displayVehicleData = new DisplayVehicleDataInEachFloor("free_count", "CAR", vehiclesData);
        Display displayData = DisplayType.valueOf("free_count").displayVehicleData();
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        displayVehicleData.displayVehicleDataInEachFloor(displayData);
        verify(out).println(contains("No. of free slots for CAR on Floor 1:1"));
        verify(out).println(contains("No. of free slots for CAR on Floor 2:2"));


    }

    @Test
    public void checkingDisplayOfFreeSlots() {
        DisplayVehicleDataInEachFloor displayVehicleData = new DisplayVehicleDataInEachFloor("free_slots", "CAR", vehiclesData);
        Display displayData = DisplayType.valueOf("free_slots").displayVehicleData();
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        displayVehicleData.displayVehicleDataInEachFloor(displayData);
        verify(out).println(contains("Free slots for CAR on Floor 1:5"));
        verify(out).println(contains("Free slots for CAR on Floor 2:4,5"));
    }

    @Test
    public void checkingDisplayOfOccupiedSlots() {
        DisplayVehicleDataInEachFloor displayVehicleData = new DisplayVehicleDataInEachFloor("occupied_slots", "CAR", vehiclesData);
        Display displayData = DisplayType.valueOf("occupied_slots").displayVehicleData();
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        displayVehicleData.displayVehicleDataInEachFloor(displayData);
        verify(out).println(contains("Occupied slots for CAR on Floor 1:4"));
        verify(out).println(contains("Occupied slots for CAR on Floor 2:"));
    }
}
