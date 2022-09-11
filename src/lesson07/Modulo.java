public class Modulo {
    public static void main(String[] args) {
        int a;
        int b;
        evenNum(7, 13);
        oddNum(2, 13);
        elevenNum(11, 88);
        findNum(2134);
    }

    public static void evenNum(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " четное число");
            }
        }
    }

    public static void oddNum(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " нечетное число");
            }
        }
    }

    public static void elevenNum(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0) {
                System.out.println(i + " кратно 11");
            }
        }
    }

    public static void findNum(int n) {
        if (n % 32 == 30 || n % 58 == 44) {
            System.out.println(n);
        } else {
            System.out.println("введите другое число");
        }
    }
}

