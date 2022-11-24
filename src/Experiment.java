import java.util.Arrays;

public class Experiment {
    public static void main(String[] args) {
        System.out.println(returnTrueOrFalse(36));
        System.out.println(returnTrueOrFalse(35));
        System.out.println("______________");
        System.out.println(mode36(72));
        System.out.println(mode36(36));
        System.out.println("----------");
        printBeforeNumber();
        System.out.println("-----------");
        printNumberTwo();
        int[] a = new int[]{0, 19, 20, 14};
        reverseArray(a);
        reverseArrayNumberTwo(a);
    }

    private static void reverseArray(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }

    private static void reverseArrayNumberTwo(int[] input) {
        int[] output = new int[input.length];
        int i = 0;
        while (i < input.length) {
            output[output.length - 1 - i] = input[i];
            i++;
        }
        i = 0;
        while (i < output.length) {
            System.out.print(output[i] + " ");
            i++;
        }
    }

    private static void printBeforeNumber() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
            if (mode36(i)) {
                return;
            }
        }
    }

    private static void printNumberTwo() {
        int i = 1;
        while (i < 1000) {
            System.out.println(i);
            if (mode36(i)) {
                return;
            }
            i++;
        }
    }

    private static boolean mode36(int number) {
        return number % 36 == 0 && number != 36;
    }

    private static boolean returnTrueOrFalse(int number) {
        return (number % 6 == 0) ? true : false;
    }
}
