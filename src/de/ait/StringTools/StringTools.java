package de.ait.StringTools;

public class StringTools {
    public static String whisper(String input) {
        return input.toLowerCase();
    }

    public static String[] upArr(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].charAt(0) == 'f') {
                input[i] = input[i].toUpperCase();
            }
        }
        return input;
    }
}
