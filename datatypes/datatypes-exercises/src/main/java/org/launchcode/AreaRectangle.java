package org.launchcode;

import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        Double length = input.nextDouble();
        System.out.println("Enter width of the rectangle:");
        Double width = input.nextDouble();
        System.out.println("Rectangle area: " + (length * width));
    }
}
