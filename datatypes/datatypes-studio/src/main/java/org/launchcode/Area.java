package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        Double radius = input.nextDouble();
        Double areaCircle = Circle.getArea(radius);
        System.out.println("Area of a circle of radius " + radius + " is: " + areaCircle);
    }
}
