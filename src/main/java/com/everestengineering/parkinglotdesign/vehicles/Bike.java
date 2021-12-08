package com.everestengineering.parkinglotdesign.vehicles;

public class Bike implements Vehicle {

    private String bikeRegistrationNumber;
    private String bikeColor;
    public Bike(String bikeRegistrationNumber,String bikeColor){
        this.bikeRegistrationNumber=bikeRegistrationNumber;
        this.bikeColor=bikeColor;

    }
    @Override
    public String getVehicleRegistrationNumber() {
        return bikeRegistrationNumber;
    }

    @Override
    public String getVehicleColor() {
        return bikeColor;
    }
}