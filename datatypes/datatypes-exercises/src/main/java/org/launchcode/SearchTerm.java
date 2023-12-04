package org.launchcode;
import java.util.Scanner;
public class SearchTerm {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter term to search:");
        String searchTerm = input.next().toLowerCase();
        System.out.println("Search Term: " + searchTerm);
        System.out.println("Search Term Found In Passage: " + firstSentence.contains(searchTerm));
    }
}
