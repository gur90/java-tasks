public class HomeWork32 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{7, 1, 2, 3, 4, 9};
        int[] c = new int[]{1, 2};

        printArray(makeMiddle(a));
        printArray(makeMiddle(b));
        printArray(makeMiddle(c));
        int[] aa = new int[]{1, 2, 3, 4, 5};
        int[] bb = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] cc = new int[]{1, 2, 3};
        printArray(midThreee(aa));
        printArray(midThreee(bb));
        printArray(midThreee(cc));
        int[] aaa = new int[]{1, 3, 4, 5};
        int[] bbb = new int[]{2, 1, 3, 4, 5};
        int[] ccc = new int[]{1, 1, 1};

        System.out.println(unlucky(aaa));
        System.out.println(unlucky(bbb));
        System.out.println(unlucky(ccc));
        int[] aaaa = new int[]{1, 2, 3};
        int[] bbbb = new int[]{1, 2, 3, 1};
        int[] cccc = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(aaaa));
        System.out.println(sameFirstLast(bbbb));
        System.out.println(sameFirstLast(cccc));
        System.out.println(sum3(aaaa));
        System.out.println(sum3(bbbb));
        System.out.println(sum3(cccc));
        int[] a1 = new int[]{1, 2, 3};
        int[] b1 = new int[]{11, 5, 9};
        int[] c1 = new int[]{2, 11, 3};
        printArray(maxEnd3(a1));
        printArray(maxEnd3(b1));
        printArray(maxEnd3(c1));
    }

    private static int[] maxEnd3(int[] input) {
        if (input[0] > input[input.length - 1]) {
            input[1] = input[0];
            input[input.length - 1] = input[0];
        }
        if (input[0] < input[input.length - 1]) {
            input[0] = input[input.length - 1];
            input[1] = input[input.length - 1];
        }
        return input;
    }

    private static int sum3(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result += input[i];
        }
        return result;
    }

    private static boolean sameFirstLast(int[] input) {
        return input[0] == input[input.length - 1];
    }

    private static boolean unlucky(int[] input) {
        return (input[0] == 1 && input[1] == 3) || (input[input.length - 1] == 3 && input[input.length - 2] == 1) || (input[1] == 1 && input[2] == 3);
    }

    private static int[] midThreee(int[] input) {
        int[] output = new int[3];
        for (int i = 0; i < input.length; i++) {
            output[1] = input[(input.length - 1) / 2];
            output[0] = input[(input.length - 1) / 2 - 1];
            output[2] = input[(input.length - 1) / 2 + 1];
        }
        return output;
    }

    private static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    private static int[] makeMiddle(int[] input) {
        int[] output = new int[2];
        for (int i = 0; i < input.length; i++) {
            output[0] = input[input.length / 2 - 1];
            ;
            output[1] = input[input.length / 2];
        }
        return output;
    }
}
