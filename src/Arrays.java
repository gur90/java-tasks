public class Arrays {
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3};
        int[] input2 = new int[]{1, 5, 3};
        int[] input3 = new int[]{5, 2, 3};
        printArray(maxTriple(input1));
        printArray(maxTriple(input2));
        printArray(maxTriple(input3));
        int[] input11 = new int[]{1, 2, 3};
        int[] input12 = new int[]{4, 5};
        int[] input13 = new int[]{4};
        int[] input14 = new int[]{4, 5};
        int[] input15 = new int[]{};
        int[] input16 = new int[]{1, 2};
        printArray(make2(input12, input11));
        printArray(make2(input13, input11));
        printArray(make2(input15, input16));
        printArray(makePi());
        int[] input21 = new int[]{1, 2, 3};
        int[] input22 = new int[]{5, 11, 9};
        int[] input23 = new int[]{7, 0, 0};
        printArray(rotateLeft(input21));
        printArray(rotateLeft(input22));
        printArray(rotateLeft(input23));

    }

    private static int[] rotateLeft(int[] input) {
        int[] output = new int[input.length];
        output[0] = input[1];
        output[1] = input[2];
        output[2] = input[0];
        return output;
    }

    private static int[] makePi() {
        int[] output = new int[3];
        double pi = 3.14;
        int a = (int) pi;
        int b = (int) ((pi % 3) * 10);
        int c = (int) ((pi * 100) % 10);
        output[0] = a;
        output[1] = b;
        output[2] = c;
        return output;
    }

    private static int[] make2(int[] a, int[] b) {
        int[] output = new int[2];
        if (a.length >= 2) {
            output[0] = a[0];
            output[1] = a[1];
        } else if (a.length == 1) {
            output[0] = a[0];
            output[1] = b[0];
        } else {
            output[0] = b[0];
            output[1] = b[1];
        }
        return output;
    }

    private static int[] maxTriple(int[] input) {
        int[] output = new int[1];
        int number = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > number) {
                number = input[i];
            }
        }
        return new int[]{output[0] = number};
    }

    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
