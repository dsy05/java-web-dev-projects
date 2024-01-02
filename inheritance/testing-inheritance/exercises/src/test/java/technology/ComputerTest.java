package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    Computer testComputer1 = new Computer("Dell", "OptiPlex 3090", "Windows 11", "Intel Core i5", 10, 599.99);

    //TODO: Test that a computer object is given a manufacture

    @Test
    public void manufactureIsAssigned() {
        String msg = "a new computer object is given assigned a manufacture";
        assertEquals("Dell", testComputer1.getManufacturer(), msg);
    }

    //TODO: Test that a computer object is given a price

    @Test
    public void manufactureIsAssignedPrice() {
        String msg = "a new computer object is given assigned a price";
        assertEquals(599.99, testComputer1.getPrice(), msg);
    }

    //TODO: Test that a computer object is given a model

    @Test
    public void manufactureIsAssignedModel() {
        String msg = "a new computer object is given assigned a model";
        assertEquals("OptiPlex 3090", testComputer1.getModel(), msg);
    }


}
