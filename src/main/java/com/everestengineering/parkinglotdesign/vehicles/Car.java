package com.everestengineering.parkinglotdesign.vehicles;

public class Car implements Vehicle {

    private String carRegistrationNumber;
    private String carColor;

    public Car(String carRegistrationNumber, String carColor) {
        this.carRegistrationNumber=carRegistrationNumber;
        this.carColor=carColor;
    }

    @Override
    public String getVehicleRegistrationNumber() {
        return carRegistrationNumber;
    }

    @Override
    public String getVehicleColor() {
        return carColor;
    }

}

