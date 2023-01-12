import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        char[] array = createArr(30);
        System.out.println(Arrays.toString(array));
        char[] copyArray = createCopyArray(array);
        System.out.println("copy of array" + Arrays.toString(copyArray));
        char[] bubble = bubbleSortArray(copyArray);
        System.out.println("bubble sort" + Arrays.toString(bubble));
        char[] cocktail = cocktailSort(copyArray);
        System.out.println("cocktail sort" + Arrays.toString(cocktail));
        char[] comb = combSort(copyArray);
        System.out.println("comb sort" + Arrays.toString(comb));
    }

    private static char[] combSort(char[] input) {
        final double FACTOR = 1.24733095;
        int step = input.length;
        while (step > 1) {
            boolean swapped = false;
            step = (int) (step / FACTOR);
            step = (int) (step / FACTOR);
            for (int i = 0; step + i < input.length; i++) {
                if (input[i] > input[i + 1]) {
                    swapped(input, i, i + step);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return input;
    }

    private static void swapped(char[] input, int x, int y) {
        int temp = input[x];
        input[x] = input[y];
        input[y] = (char) temp;
    }

    private static char[] cocktailSort(char[] input) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = (char) temp;
                    swapped = true;
                }
            }
            start++;
            for (int i = end; i > start; i--) {
                int temp = input[i - 1];
                input[i - 1] = input[i];
                input[i] = (char) temp;
                swapped = true;
            }

            end--;
            if (!swapped) {
                break;
            }
        }
        return input;
    }

    private static char[] bubbleSortArray(char[] input) {

        int count = 0;
        char temp;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortArray(input);
        }
        return input;
    }

    private static char[] createCopyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = input[i];
        }
        return output;
    }


    private static char[] createArr(int n) {
        char[] output = new char[n];
        for (int i = 0; i < n; i++) {
            char randomChar = createRandom();
            output[i] = randomChar;
        }


        return output;
    }

    private static char createRandom() {
        char random = (char) (Math.random() * ((65 - 95) + 1) + 95);
        return random;
    }
}
