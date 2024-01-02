package technology;

public class Laptop extends Computer{

    private String screen;
    private String graphics;

    public Laptop(String manufacturer, String model, String operatingSystem, String processor, int quantity, double price, String screen, String graphics) {
        super(manufacturer, model, operatingSystem, processor, quantity, price);
        this.screen = screen;
        this.graphics = graphics;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        return super.toString() +
                line + newLine +
                "Monitor Spec: " + screen + newLine +
                "Graphics: " + graphics + newLine;
    }

    @Override
    public String describe() {
        String newLine = System.lineSeparator();
        String line = "*************************";
        String pipe = " || ";
        return super.describe() +
                line + newLine +
                screen + pipe + graphics + newLine;

    }
}
