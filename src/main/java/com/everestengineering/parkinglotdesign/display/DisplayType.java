package com.everestengineering.parkinglotdesign.display;


public enum DisplayType {
    free_count {
        public Display displayVehicleData() {
            return new DisplayFreeCount();
        }

    },
    free_slots {
        public Display displayVehicleData() {
            return new DisplayFreeSlots();
        }

    },
    occupied_slots {
        public Display displayVehicleData() {
            return new DisplayOccupiedSlots();
        }
    };

    public abstract Display displayVehicleData();
}
