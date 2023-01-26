import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1};
        int[] b = {0, 1, 1, 0, 1};
        int[] c = {1, 0};
        System.out.println(Arrays.toString(zeroFront(a)));// ? [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(b)));// ? [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(c)));// ? [0, 1]
        int[] aa = {1, 0, 1, 0, 0, 1, 1};
        int[] a1 = {3, 3, 2};
        int[] a2 = {2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(aa)));// ? [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(a1)));// ? [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(a2)));// ? [2, 2, 2]
    }

    private static int[] evenOdd(int[] input) {
        int temp = 0;
        int tempForN = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                tempForN = input[i];
                input[i] = input[temp];
                input[temp] = tempForN;
                temp++;
            }
        }
        return input;
    }

    private static int[] zeroFront(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                input[i] = input[count];
                input[count] = 0;
                count++;
            }
        }
        return input;
    }
}
