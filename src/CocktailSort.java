import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CocktailSort {
    public static void main(String[] args) {
        byte[] array = createByteArray(78);
        System.out.println(Arrays.toString(array));
        byte[] copyArray = createCopy(array);
        System.out.println(Arrays.toString(copyArray));
        byte[] bubbleArray = bubbleSortCopyArray(copyArray);
        System.out.println("bubble sort: " + Arrays.toString(bubbleArray));
        byte[] cocktailArray = cocktailSortCopyArray(copyArray);
        System.out.println("cocktail sort " + Arrays.toString(cocktailArray));
    }

    private static byte[] cocktailSortCopyArray(byte[] input) {
        byte start = 0;
        byte end = (byte) (input.length - 1);
        boolean swapped = true;
        while (start <= end) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (input[i] > input[i + 1]) {
                    byte temp;
                    temp = input[i];
                    input[i + 1] = input[i];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (input[i] < input[i - 1]) {
                    byte temp = input[i - 1];
                    input[i - 1] = input[i];
                    input[i] = temp;
                    swapped = true;
                }
            }
            start++;
        }
        return input;
    }

    private static byte[] bubbleSortCopyArray(byte[] input) {
        int count = 0;
        byte temp = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortCopyArray(input);
        }
        return input;
    }

    private static byte[] createCopy(byte[] input) {
        byte[] output = new byte[input.length];
        for (byte el : input) {
            output = input;
        }
        return output;
    }

    private static byte[] createByteArray(int n) {
        byte[] output = new byte[n];
        Random rand = new Random();
        rand.nextBytes(output);
        return output;
    }
}
