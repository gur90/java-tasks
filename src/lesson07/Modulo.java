package lesson07;

public class Modulo {
    public static void main(String[] args) {
        int a;
        int b;
        printEvenNum(7, 13);
        printOddNum(2, 13);
        multiplyEleven(11, 88);
        findNumber(0, 3000);
    }

    public static void printEvenNum(int a, int b) {
        int summa = 0;
        for (int i = a; i <= b; i++) {
            if (findEvenNumber(i)) {
                summa += 1;
                System.out.println(summa);// тут я хотела вывести сколько всего четных чисел
                System.out.println(i + " even");
            }
        }
    }

    public static boolean findEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void printOddNum(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (!findEvenNumber(i)) {
                System.out.println(i + " odd");
            }
        }
    }

    public static void multiplyEleven(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0) {
                System.out.println(i + " кратно 11");
            }
        }
    }

    public static void findNumber(int start, int number) {
        start = 0;
        number = 3000;
        for (int i = start; i < number; i++) {
            if (checkingConditions(i)) {
                System.out.println(i + " true");
            }
        }
    }

    public static boolean checkingConditions(int inputValue) {
        return inputValue % 32 == 30 & inputValue % 58 == 44;
    }
}

