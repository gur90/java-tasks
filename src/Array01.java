
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
        int[] b1 = new int[]{1, 2, 3};
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

    private static int[] reverse3(int[] b) {
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
