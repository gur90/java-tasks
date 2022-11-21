public class Arrays03 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3};
        int[] c = new int[]{8, 6, 7, 9, 5};
        int[] d = new int[]{8};
        int[] e = new int[]{1, 2, 3};
        Arrays.printArray(swapEnds(a));
        Arrays.printArray(swapEnds(b));
        Arrays.printArray(swapEnds(c));
        System.out.println("------");
        Arrays.printArray(frontPiece(e));
        Arrays.printArray(frontPiece(d));
        int[] one = new int[]{1, 2, 3};
        int[] two = new int[]{7, 9, 8};
        int[] three = new int[]{1, 7};
        int[] four = new int[]{};
        Arrays.printArray(front11(one, two));
        Arrays.printArray(front11(three, four));
    }

    private static int[] front11(int[] a, int[] b) {
        int[] output = new int[2];
        int[] outputForSmall = new int[1];
        if (a.length == 0) {
            outputForSmall[0] = b[0];
            return outputForSmall;
        } else if (b.length == 0) {
            outputForSmall[0] = a[0];
            return outputForSmall;
        }
        output[0] = a[0];
        output[1] = b[0];

        return output;
    }

    private static int[] frontPiece(int[] input) {
        int[] output = new int[2];

        if (input.length < 2) {
            return input;
        } else {
            output[0] = input[0];
            output[1] = input[1];
        }
        return output;
    }

    private static int[] swapEnds(int[] input) {
        int tmpl = 0;
        tmpl = input[0];
        input[0] = input[input.length - 1];
        input[input.length - 1] = tmpl;
        return input;
    }
}
