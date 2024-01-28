package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int x;
        int y;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a value for x(numerator): ");
        x = input.nextInt();
        System.out.println("Enter a value for y(denominator): ");
        y = input.nextInt();
        input.close();

        Divide(x,y);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new DivideZeroException("Cannot divide by zero! Y value cannot equal 0!");
            } catch (DivideZeroException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The quotient for: " + x + " / " + y + " = " + x/y);
        // Write code here!
    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//    }
}