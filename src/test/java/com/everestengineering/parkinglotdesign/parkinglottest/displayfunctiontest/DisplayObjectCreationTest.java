package com.everestengineering.parkinglotdesign.parkinglottest.displayfunctiontest;

import com.everestengineering.parkinglotdesign.display.Display;
import com.everestengineering.parkinglotdesign.display.DisplayType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DisplayObjectCreationTest {
    @Test
    public void checkingDisplayObjectCreation() {
        Display displayData = DisplayType.valueOf("free_count").displayVehicleData();
        assertNotNull(displayData, "Display free_count object is created");
        displayData = DisplayType.valueOf("free_slots").displayVehicleData();
        assertNotNull(displayData, "Display free_slots object is created");
        displayData = DisplayType.valueOf("occupied_slots").displayVehicleData();
        assertNotNull(displayData, "Display occupied_slots object is created");

    }
}
