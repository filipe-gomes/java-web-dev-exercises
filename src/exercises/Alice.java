package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a word, and we will check if it's in the first sentence of Alice in Wonderland:");
        String word = input.next();
        input.close();
        String lowerAlice = alice.toLowerCase();
        String[] splitSentence = lowerAlice.split("\\b+");
        if (Arrays.asList(splitSentence).contains(word.toLowerCase())) {
            System.out.println("true");
            System.out.println("Word is in index " + lowerAlice.indexOf(word) + " and it is " + word.length() + " characters long");
        } else {
            System.out.println("false");
        }
    }
}