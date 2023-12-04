package org.launchcode;

import java.util.Scanner;
public class GasMileageCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        Double miles = input.nextDouble();
        System.out.println("Enter amount of gas consumed:");
        Double gasUsed = input.nextDouble();
        System.out.println("Gas Mileage: " + (miles / gasUsed) + "miles-per-gallon");
    }
}
