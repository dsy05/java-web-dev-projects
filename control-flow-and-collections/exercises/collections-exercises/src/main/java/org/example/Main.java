package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String message = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //each value
        for (int i : integerArray) {
            System.out.println(i);
        }
        //odd values
        for (int i : integerArray) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        //string array
        String[] messageWordsArray = message.split(" ");
        System.out.println(Arrays.toString(messageWordsArray));

        String[] messageSentenceArray = message.split("\\.");
        System.out.println(Arrays.toString(messageSentenceArray));

        //ArrayList
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(5);
//        array.add(6);
//        array.add(7);
//        array.add(8);
//        array.add(9);
//        array.add(10);
//        System.out.println(array);
//        System.out.println(array.get(2));
//
//        Integer sum = ArrayListExercise.sumEven(array);
//        System.out.println(sum);
//
//        ArrayList<String> wordArray = new ArrayList<>() {
//            {
//                add("banana");
//                add("string");
//                add("Practice");
//                add("array");
//                add("more");
//                add("mouse");
//                add("try");
//            }
//        };
//        System.out.println(wordArray);
//        System.out.println(wordArray.get(2));
////        String word = ArrayListWord.wordSearch(wordArray);
////        System.out.println(sum);
//        Scanner input;
//        input = new Scanner(System.in);
//        System.out.println("Enter a word length: ");
//        int numChars = input.nextInt();
//
//        for (String item : wordArray) {
//            if (item.length() == numChars) {
//                System.out.println(item);
//            }
//        }

        //hashmap
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}