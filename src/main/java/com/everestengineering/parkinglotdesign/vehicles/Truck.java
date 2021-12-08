package com.everestengineering.parkinglotdesign.vehicles;

public class Truck implements Vehicle {

    private String truckRegistrationNumber;
    private String truckColor;

    public Truck(String truckRegistrationNumber, String truckColor) {
        this.truckRegistrationNumber=truckRegistrationNumber;
        this.truckColor=truckColor;
    }

    @Override
    public String getVehicleRegistrationNumber() {
        return truckRegistrationNumber;
    }

    @Override
    public String getVehicleColor() {
        return truckColor;
    }
}
