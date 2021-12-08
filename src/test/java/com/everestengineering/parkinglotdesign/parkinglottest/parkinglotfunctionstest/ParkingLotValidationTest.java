package com.everestengineering.parkinglotdesign.parkinglottest.parkinglotfunctionstest;

import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import com.everestengineering.parkinglotdesign.parkinglotfunctions.ParkingLot;
import com.everestengineering.parkinglotdesign.parkinglotfunctions.ParkingLotValidation;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;
import com.everestengineering.parkinglotdesign.vehicles.VehicleType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.everestengineering.parkinglotdesign.parkinglottest.parkinglotfunctionstest.ParkingLotTest.ticketsData;
import static com.everestengineering.parkinglotdesign.parkinglottest.parkinglotfunctionstest.TicketTest.vehiclesData;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotValidationTest {
    @BeforeAll
    public static void creatingParkingLotTesting() {
        ParkingLotSpace plot = new ParkingLotSpace("PR1234", 2, 5);
        vehiclesData = plot.createParkingLot(2, 5);
    }

    @Test
    public void checkingIsParkingLotFull() {

        ParkingLot parkingLot = new ParkingLot(vehiclesData, ticketsData);
        Vehicle vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        vehicle= VehicleType.valueOf("CAR").createVehicle("KA-01-DB-1541", "RED");
        parkingLot.parkVehicle(vehicle);
        ParkingLotValidation parkingLotCreationValidation = new ParkingLotValidation(vehiclesData);
        boolean parkingLotFull = parkingLotCreationValidation.isParkingLotFull("CAR");
        assertEquals(parkingLotFull, true, "parking lot is full");
        parkingLotFull = parkingLotCreationValidation.isParkingLotFull("BIKE");
        assertEquals(parkingLotFull, false, "There is slot to park the vehicle");

    }
}
