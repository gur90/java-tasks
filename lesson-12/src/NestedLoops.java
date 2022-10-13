import java.text.DecimalFormat;

public class NestedLoops {
    public static void main(String[] args) {
        comboTreeNumbers();
        chessBoard();
        multiplicationTable();
        System.out.println("-------");
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        System.out.println("--------");
        doubleChar("The");// → "TThhee"
        doubleChar("AAbb");// → "AAAAbbbb"
        doubleChar("Hi-There"); //→ "HHii--TThheerree"
        System.out.println("-------");
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println("------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(768));
    }

    public static void comboTreeNumbers() {
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y < 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }

    public static void chessBoard() {
        String outputEven = "-*-*-*-*";
        String outputOdd = "*-*-*-*-";
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.println(outputEven);
            } else {
                System.out.println(outputOdd);
            }
        }
    }

    public static void multiplicationTable() {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }

    public static String minCat(String one, String two) {
        if (one.length() == two.length()) {
            return one + two;
        } else if (one.length() > two.length()) {
            int length = two.length();
            String catOne = one.substring(one.length() - length);
            return catOne + two;
        } else {
            int anotherLength = one.length();
            String catTwo = two.substring(two.length() - anotherLength);
            return one + catTwo;
        }
    }

    //почему печатает три вызова метода в одну строку?
    public static void doubleChar(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (c == a) {
            return b;
        } else {
            return a + b + c;
        }
    }

    public static int sumDigits(int n) {
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        return a + b + c;
    }
}

