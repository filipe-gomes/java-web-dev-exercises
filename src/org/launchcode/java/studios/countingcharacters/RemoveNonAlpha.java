package org.launchcode.java.studios.countingcharacters;

public class RemoveNonAlpha {
    public static String remove(String inputString) {
        return inputString.replaceAll("[^a-zA-Z]", "");
    }
}
