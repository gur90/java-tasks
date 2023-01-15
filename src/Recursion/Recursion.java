package Recursion;

public class Recursion {
    public static void main(String[] args) {
//        printAllUntil(0, 9);
//        System.out.println(sumOfDigits(12));
//        printNumbers(789);
//        sumOfDigits(789);
        printUntil(10);
    }

    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return n;
        }
        return sumOfDigits(n / 10) + n % 10;
    }


    public static void printNumbers(int n) {
        System.out.println(n % 10);
        if (n > 10) {
            printNumbers(n / 10);
        }
    }

    public static void printUntil(int n) {
        printAllUntil(1, n);
    }

    private static void printAllUntil(int start, int n) {
        System.out.println(start);
        if (start < n) {

            printAllUntil(start + 1, n);
        }
    }
}
