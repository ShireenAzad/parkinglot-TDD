package com.everestengineering.parkinglotdesign.parkinglotfunctions;

import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ParkingLot {
    private final List<ArrayList<String>> vehiclesData;
    private final LinkedHashMap<String,Vehicle> ticketsData;

    public ParkingLot(List<ArrayList<String>> vehiclesData, LinkedHashMap<String, Vehicle> ticketsData) {
        this.vehiclesData = vehiclesData;
        this.ticketsData = ticketsData;

    }

    public List<ArrayList<String>> parkVehicle(Vehicle vehicle) {
        ParkingLotValidation parkingLotFull = new ParkingLotValidation(vehiclesData);
        String vehicleType=vehicle.getClass().getSimpleName().toUpperCase();
        if (parkingLotFull.isParkingLotFull(vehicleType)){
            return vehiclesData;}
        for (int i = 0; i < vehiclesData.size(); i++) {
            for (int j = 0; j < vehiclesData.get(0).size(); j++) {
                if (vehiclesData.get(i).get(j).equals(vehicleType)) {
                    Ticket ticket = new Ticket(ticketsData);
                    ticket.generateTicket(ParkingLotSpace.getId() + "_" + (i + 1) + "_" + (j + 1),vehicle);
                    vehiclesData.get(i).set(j, (vehicleType + " is parked"));
                    return vehiclesData;
                }
            }
        }
        return vehiclesData;
    }

    public List<ArrayList<String>> unparkVehicle(String ticketId) {
        Ticket ticket = new Ticket(ticketsData);
        Vehicle vehicle = ticket.removeTicket(ticketId);
        if (vehicle!=null) {
            System.out.println("Unparked vehicle with Registration Number: " + vehicle.getVehicleRegistrationNumber() + " and Color: " +vehicle.getVehicleColor());
            return vehiclesData;

        }
        System.out.println("Invalid Ticket");
        return vehiclesData;
    }
}
