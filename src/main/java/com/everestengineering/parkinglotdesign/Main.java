package com.everestengineering.parkinglotdesign;

import com.everestengineering.parkinglotdesign.display.Display;
import com.everestengineering.parkinglotdesign.display.DisplayType;
import com.everestengineering.parkinglotdesign.display.DisplayVehicleDataInEachFloor;
import com.everestengineering.parkinglotdesign.input.InputHandler;
import com.everestengineering.parkinglotdesign.input.InputValidations;
import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotSpace;
import com.everestengineering.parkinglotdesign.parkinglotfunctions.ParkingLot;
import com.everestengineering.parkinglotdesign.vehicles.Vehicle;
import com.everestengineering.parkinglotdesign.vehicles.VehicleType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = null;
        List<ArrayList<String>> vehiclesData = new ArrayList<>();
        LinkedHashMap<String, Vehicle> ticketsData = new LinkedHashMap<>();
        List<String> commands = new ArrayList<>();
        while (true) {
            InputHandler handler = new InputHandler();
            String inputCommandFromUser = handler.getInput();
            if (inputCommandFromUser.length() > 0) {
                if (inputCommandFromUser.equals("exit"))
                    System.exit(0);

                InputValidations input = new InputValidations();
                inputCommandFromUser = input.validateInput(inputCommandFromUser, commands);
                if (inputCommandFromUser.length() != 0) {
                    String[] commandsData = inputCommandFromUser.split(" ");
                    switch (commandsData[0].trim()) {
                        case "create_parking_lot" -> {
                            ParkingLotSpace plot = new ParkingLotSpace(commandsData[1], Integer.parseInt(commandsData[2]), Integer.parseInt(commandsData[3]));
                            vehiclesData = plot.createParkingLot(Integer.parseInt(commandsData[2]), Integer.parseInt(commandsData[3]));
                        }
                        case "park_vehicle" -> {
                            parkingLot = new ParkingLot(vehiclesData, ticketsData);
                            Vehicle vehicle = VehicleType.valueOf(commandsData[1]).createVehicle(commandsData[2],commandsData[3]);
                            vehiclesData = parkingLot.parkVehicle(vehicle);
                        }
                        case "unpark_vehicle" -> {
                            assert parkingLot != null;
                            vehiclesData = parkingLot.unparkVehicle(commandsData[1]);
                        }
                        case "display" -> {
                            DisplayVehicleDataInEachFloor displayvehicleData = new DisplayVehicleDataInEachFloor(commandsData[1], commandsData[2], vehiclesData);
                            Display displayData = DisplayType.valueOf(commandsData[1]).displayVehicleData();
                            displayvehicleData.displayVehicleDataInEachFloor(displayData);
                        }
                    }
                }
            }
        }
    }
}



