package technology;

public class Computer extends AbstractEntity{

    private String manufacturer;
    private String model;
    private String operatingSystem;
    private String processor;
    private int quantity;
    private double price;

    public Computer(String manufacturer, String model, String operatingSystem, String processor, int quantity, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.quantity = quantity;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        return line + newLine +
                "PRODUCT STOCK INFORMATION" + newLine +
                line + newLine +
                "ID: " + getId() + newLine +
                "Manufacture: " + manufacturer + newLine +
                "Model: " + model + newLine +
                "Operating System: " + operatingSystem + newLine +
                "Processor: " + processor + newLine +
                "Quantity: " + quantity + newLine +
                "Price: " + price + newLine;
    }

    @Override
    public String describe() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        String pipe = " || ";
        return line + newLine +
                manufacturer + pipe + model + newLine +
                quantity + pipe + price + newLine +
                line + newLine +
                operatingSystem + pipe + processor + newLine;
    }


}
