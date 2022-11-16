
public class Array01 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2));// →true
        System.out.println(commonEnd(a1, a3));// →false
        System.out.println(commonEnd(a1, a4));// →true
        System.out.println("---------");
        int[] b1 = new int[]{1, 2, 3, 5, 9};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        printArray(middleWay(mc1, mc2));
        printArray(middleWay(kc1, kc2));
        printArray(middleWay(nc1, nc2));
        System.out.println("---------");
        printArray(reverse3(b1));
        printArray(reverse3(b2));
        printArray(reverse3(b3));
        System.out.println("--------");
        printArray(middleWaySecondDec(mc1, mc2));
        printArray(middleWaySecondDec(kc1, kc2));
        printArray(middleWaySecondDec(nc1, nc2));
        System.out.println("----------");
        int[] oneArray = new int[]{4, 5};
        int[] twoArray = new int[]{4, 2};
        int[] threeArray = new int[]{3, 5};
        System.out.println(no23(oneArray));
        System.out.println(no23(twoArray));
        System.out.println(no23(threeArray));
        int[] array01 = new int[]{1, 2, 3};
        int[] array02 = new int[]{2, 3, 5};
        int[] array03 = new int[]{1, 2, 1};
        printArray(fix23(array01));
        printArray(fix23(array02));
        printArray(fix23(array03));
    }

    private static int[] fix23(int[] array01) {
        int[] output = new int[array01.length];
        for (int i = 0; i < array01.length; i++) {
            if (array01[i] == 2 && array01[i + 1] == 3) {
                array01[i + 1] = 0;
                return array01;
            }
        }
        return array01;
    }

    private static boolean no23(int[] input) {
        if (input[0] == 2 || input[1] == 3 || input[0] == 3 || input[1] == 2) {
            return false;
        }
        return true;
    }

    private static void printArray(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] output = new int[2];
        output[0] = a[1];
        output[1] = b[1];
        return output;
    }

    public static int[] middleWaySecondDec(int[] a, int[] b) {
        int middleA = 0;
        int middleB = 0;
        for (int i = 0; i < a.length; i++) {
            middleA += a[i];
        }
        System.out.println("среднее арифметическое массива а: " + middleA / a.length);
        for (int i = 0; i < b.length; i++) {
            middleB += b[i];
        }
        System.out.println("среднее арифметическое массива b: " + middleB / b.length);
        int[] output = new int[]{middleA / a.length, middleB / b.length};
        return output;
    }

    private static int[] reverse3(int[] b) {
        int[] output = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            output[output.length - 1 - i] = b[i];
        }
        return output;
    }

    private static int[] reverse3SecondDec(int[] b) {
        int[] output = new int[3];
        int[] temp = new int[]{};
        output[0] = b[b.length - 1];
        output[output.length - 1] = b[0];
        output[1] = b[1];
        return output;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
