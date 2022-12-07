import java.util.Arrays;

public class BinaryToDec {
    public static void main(String[] args) {
        System.out.println(binaryToDec(111010));
        System.out.println(binaryToDecTwo("111010"));
        // System.out.println(methodPow(2, 6));
    }

    private static int binaryToDecTwo(String input) {
        int result = 0;
        double count = input.length() - 1;
        String[] arr = input.split("");
        for (int i = 0; i < arr.length; i++) {
            result += (int) (Integer.parseInt(arr[i]) * Math.pow(2.0, count));
            count--;
        }
        return result;
    }

    private static int methodPow(int power, int number) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }

    private static int binaryToDec(int num) {
        int result = 0;
        int mult = 1;
        while (num > 0) {
            int last = num % 10;
            result += last * mult;
            num /= 10;
            mult *= 2;
        }
        return result;
    }
}
