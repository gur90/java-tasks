public class Arrays02 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};
        int[] input1 = new int[]{1, 1};
        int[] input2 = new int[]{1, 1, 1, 1};
        System.out.println(sum2(input));
        System.out.println(sum2(input1));
        System.out.println(sum2(input2));
        int[] inputA = new int[]{2, 5};
        int[] inputB = new int[]{4, 3};
        int[] inputC = new int[]{4, 5};
        System.out.println(has23(inputA));
        System.out.println(has23(inputB));
        System.out.println(has23(inputC));
        int[] inputAA = new int[]{2, 2};
        int[] inputBB = new int[]{3, 3};
        int[] inputCC = new int[]{4, 3};
        System.out.println(double23(inputAA));
        System.out.println(double23(inputBB));
        System.out.println(double23(inputCC));
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        int[] c = new int[]{1, 1};
        Arrays.printArray(biggerTwo(a, b));
        Arrays.printArray(biggerTwo(b, a));
        Arrays.printArray(biggerTwo(c, a));
        int[] aa = new int[]{4, 5, 6};
        int[] bb = new int[]{1, 2};
        int[] cc = new int[]{3};
        Arrays.printArray(makeLast(aa));
        Arrays.printArray(makeLast(bb));
        Arrays.printArray(makeLast(cc));
        int[] aaa = new int[]{1, 2, 3};
        int[] bbb = new int[]{1, 3};
        int[] ccc = new int[]{7, 2, 3};
        int[] ddd = new int[]{1};
        int[] eee = new int[]{1, 2};
        int[] fff = new int[]{};
        System.out.println(start1(aaa, bbb));
        System.out.println(start1(ccc, ddd));
        System.out.println(start1(eee, fff));
        int[] array = new int[]{1, 2};
        int[] array1 = new int[]{3, 4};
        int[] array2 = new int[]{4, 4};
        int[] array3 = new int[]{2, 2};
        Arrays.printArray(plusTwo(array, array1));
        Arrays.printArray(plusTwo(array2, array3));
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];
        return output;
    }

    private static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0 && b.length != 0) {
            if (b[0] == 1) {
                count++;
            }
            if (a[0] == 1) {
                count++;
            }

        } else if (b.length == 0) {
            if (a[0] == 1) {
                count++;
            }
        } else {
            if (b[0] == 1) {
                count++;
            }
        }
        return count;
    }

    private static int[] makeLast(int[] input) {
        int[] output = new int[input.length * 2];
        output[output.length - 1] = input[input.length - 1];
        return output;
    }

    private static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] > b[0] + b[1]) {
            return a;
        } else {
            return b;
        }
    }

    private static boolean double23(int[] input) {
        return input[0] == input[1];
    }

    private static boolean has23(int[] input) {
        return input[0] == 2 || input[1] == 3 || input[0] == 3 || input[1] == 2;
    }

    private static int sum2(int[] input) {
        int result = 0;
        if (input.length >= 2) {
            result = input[0] + input[1];
        } else if (input.length == 1) {
            result = input[0];
        } else if (input.length == 0) {
            result = 0;
        }
        return result;
    }
}
