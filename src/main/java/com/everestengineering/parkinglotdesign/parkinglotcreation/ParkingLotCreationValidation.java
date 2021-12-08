package com.everestengineering.parkinglotdesign.parkinglotcreation;

public class ParkingLotCreationValidation {
    private final String command;

    public ParkingLotCreationValidation(String command) {
        this.command = command;
    }

    public String validation() {
        String[] commandsData = command.split(" ");
        if ((Integer.parseInt(commandsData[2]) > 0) && (Integer.parseInt(commandsData[3])) > 0)
            return command;
        else {
            System.out.println("Create the parking lot at least with one floor and slot");
            return "";
        }
    }
}

