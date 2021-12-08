package com.everestengineering.parkinglotdesign.parkinglotfunctions;

import com.everestengineering.parkinglotdesign.vehicles.Vehicle;

import java.util.LinkedHashMap;

public class Ticket {

    private LinkedHashMap<String, Vehicle> ticketsData = new LinkedHashMap<>();

    public Ticket(LinkedHashMap<String, Vehicle> ticketsData) {
        this.ticketsData = ticketsData;
    }

    public LinkedHashMap<String, Vehicle> generateTicket(String ticket, Vehicle vehicle) {
        ticketsData.put(ticket,vehicle);
        System.out.println("Parked vehicle. Ticket ID: " + ticket);
        return ticketsData;
    }

    public Vehicle removeTicket(String ticket) {
        Vehicle vehicle = null;
        if(ticketsData.containsKey(ticket)) {
           vehicle = ticketsData.get(ticket);
            ticketsData.remove(ticket);
        }
                return vehicle;
    }
}
