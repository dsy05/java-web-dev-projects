package technology;

public class SmartPhone extends Computer{
    private String backCamera;
    private String frontCamera;
    private String size;

    public SmartPhone(String manufacturer, String model, String operatingSystem, String processor, int quantity, double price, String backCamera, String frontCamera, String size) {
        super(manufacturer, model, operatingSystem, processor, quantity, price);
        this.backCamera = backCamera;
        this.frontCamera = frontCamera;
        this.size = size;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        return super.toString() +
                line + newLine +
                "Front Camera: " + frontCamera + newLine +
                "Back Camera: " + backCamera + newLine +
                "Device Size: " + size + newLine;
    }

    @Override
    public String describe() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        String pipe = " || ";
        return super.describe() +
                line + newLine +
                frontCamera + pipe + backCamera + pipe + size + newLine;

    }
}
