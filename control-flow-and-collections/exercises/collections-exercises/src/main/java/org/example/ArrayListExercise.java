package org.example;

import java.util.ArrayList;

public class ArrayListExercise {

    public static int sumEven(ArrayList<Integer> array) {
        int total = 0;
        for (int integer : array) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
