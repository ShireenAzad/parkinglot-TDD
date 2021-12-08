package com.everestengineering.parkinglotdesign.input;


import com.everestengineering.parkinglotdesign.parkinglotcreation.ParkingLotCreationValidation;

import java.util.List;

public class InputValidations {
    public String validateInput(String commands, List<String> inputCommand) {
        String initialCommand = "create_parking_lot";
        if (inputCommand.size() == 0) {
            if (commands.startsWith(initialCommand)) {
                ParkingLotCreationValidation parkingLotCreationValidation = new ParkingLotCreationValidation(commands);
                commands = parkingLotCreationValidation.validation();
                if (commands.length() != 0) {
                    inputCommand.add(commands);
                    return commands;
                }
                return "";
            }
            System.out.println("Please create the parking lot initially");
            return "";
        }
        if (commands.startsWith(initialCommand)) {
            System.out.println("Parking lot is already created");
            return "";
        }
        inputCommand.add(commands);
        return commands;
    }
}


