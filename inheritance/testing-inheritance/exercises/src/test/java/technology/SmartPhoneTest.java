package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartPhoneTest {
    SmartPhone testSmartPhone1 = new SmartPhone("Samsung", "Galaxy S22", "Android 13-Tiramisu", "Snapdragon 8", 10, 1099.99, "Cinematic 8K", "12MP Sensor", "6.1 inch");

    //TODO: Test that a smartphone object inherits manufacture

    @Test
    public void manufactureIsInherited() {
        String msg = "a new smartphone object inherits a manufacture";
        assertEquals("Samsung", testSmartPhone1.getManufacturer(), msg);
    }

    //TODO: Test that a smartphone object inherits a price

    @Test
    public void priceIsInherited() {
        String msg = "a new smartphone object inherits price";
        assertEquals(1099.99, testSmartPhone1.getPrice(), msg);
    }

    //TODO: Test that a smartphone object is given a graphics

    @Test
    public void sizeIsAssigned() {
        String msg = "a new smartphone object is given assigned size";
        assertEquals("6.1 inch", testSmartPhone1.getSize(), msg);
    }
}
