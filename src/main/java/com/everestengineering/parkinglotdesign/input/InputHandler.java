package com.everestengineering.parkinglotdesign.input;

import java.util.Scanner;

public class InputHandler {

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        String inputCommandFromUser = sc.nextLine();
        boolean b = inputCommandFromUser.startsWith("create_parking_lot") || inputCommandFromUser.startsWith("park_vehicle") || inputCommandFromUser.startsWith("unpark_vehicle") || inputCommandFromUser.startsWith("display") || inputCommandFromUser.startsWith("exit");
        if (!b) {
            System.out.println("command not found.");
            return "";
        } else {
            return inputCommandFromUser;
        }
    }
}