package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
    Laptop testLaptop1 = new Laptop("Dell", "Inspiron 15", "Windows 11", "AMD RYZEN 7", 6, 699.99, "15.6 inch", "Dedicated Graphics");

    //TODO: Test that a laptop object inherits manufacture

    @Test
    public void manufactureIsInherited() {
        String msg = "a new laptop object is given assigned a manufacture";
        assertEquals("Dell", testLaptop1.getManufacturer(), msg);
    }

    //TODO: Test that a laptop object inherits a price

    @Test
    public void priceIsInherited() {
        String msg = "a new laptop object is given assigned a price";
        assertEquals(699.99, testLaptop1.getPrice(), msg);
    }

    //TODO: Test that a laptop object is given a graphics

    @Test
    public void graphicsIsAssigned() {
        String msg = "a new laptop object is given assigned graphics";
        assertEquals("Dedicated Graphics", testLaptop1.getGraphics(), msg);
    }
}
