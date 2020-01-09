package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence and we will tell you how many instances of each character appear:");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        sentence = RemoveNonAlpha.remove(sentence);
        char[] letters = sentence.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            characters.put(letters[i], 0);
        }
        for (char letter : letters) {
            if (characters.containsKey(letter)) {
                characters.put(letter, characters.get(letter) + 1);
            } else {
                characters.put(letter, 1);
            }
        }
        System.out.println(characters.entrySet());
    }
}
