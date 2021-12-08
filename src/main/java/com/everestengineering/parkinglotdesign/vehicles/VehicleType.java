package com.everestengineering.parkinglotdesign.vehicles;

public enum VehicleType {
    TRUCK {
        public Vehicle createVehicle(String registrationNumber,String color) {
            return new Truck(registrationNumber,color);
        }
    },
    BIKE {
        public Vehicle createVehicle(String registrationNumber,String color) {
            return new Bike(registrationNumber,color);
        }
    },
    CAR {
        public Vehicle createVehicle(String registrationNumber,String color) {
            return new Car(registrationNumber,color);
        }
    };

    public abstract Vehicle createVehicle(String registrationNumber,String color);
};