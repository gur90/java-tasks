package de.ait.specialTools;

public class SpecialTools {
    public static String[] cipherP(String[] arr) {
        String[] output = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'p') {
                output[i] = arr[i].replaceAll("a", "d");

            } else {
                output[i] = arr[i];
            }
        }
        return output;
    }
}
