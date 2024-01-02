package technology;

public class Program {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", "OptiPlex 3090", "Windows 11", "Intel Core i5", 10, 599.99);
        Computer computer2 = new Computer("HP", "Envy", "Windows 11", "AMD Ryzen 5", 5, 999.99);

        Laptop laptop1 = new Laptop("Dell", "Inspiron 15", "Windows 11", "AMD RYZEN 7", 6, 699.99, "15.6 inch", "Dedicated Graphics");
        Laptop laptop2 = new Laptop("Lenovo", "IdeaPad 5i", "Windows 11", "Intel Core i3", 8, 449.99, "15.6 inch Touch Display", "Integrated Graphics");

        SmartPhone smartPhone1 = new SmartPhone("Samsung", "Galaxy S22", "Android 13-Tiramisu", "Snapdragon 8", 10, 1099.99, "Cinematic 8K", "12MP Sensor", "6.1 inch");
        SmartPhone smartPhone2 = new SmartPhone("Apple", "iPhone 15 Pro Max", "iOS 17", "A17 Pro", 15, 1199.99, "48MP Pro Camera System", "24MP Sensor", "6.7 inch");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);

        System.out.println(computer1.describe());
        System.out.println(computer2.describe());
        System.out.println(laptop1.describe());
        System.out.println(laptop2.describe());
        System.out.println(smartPhone1.describe());
        System.out.println(smartPhone2.describe());
    }


}
