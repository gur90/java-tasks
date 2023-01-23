public class Recursion {
    public static void main(String[] args) {
        //System.out.println(pairStar("hello"));// ? "hel*lo"
        //System.out.println(pairStar("xxyy"));// ? "x*xy*y"
        //System.out.println(pairStar("aaaa"));// ? "a*a*a*a"
        int[] a = {1, 2, 11};
        int[] a1 = {11, 11};
        int[] a2 = {1, 2, 3, 4};
        // System.out.println(array11(a, 0)); //? 1
        System.out.println(array11(a1, 0));  //2
        array11(a2, 0);// ? 0
    }

    public static int array11(int[] input, int index) {
        if (input.length < 1) {
            return 0;
        }
        if (input[index] == 11) {
            return 1 + array11(input, index + 1);
        }
        return array11(input, index);
    }

    private static String pairStar(String input) {
        if (input.length() < 2) {
            return input;
        }
        if (input.substring(0, 1).equals(input.substring(1, 2))) {
            return input = input.substring(0, 1) + "*" + pairStar(input.substring(1));
        }
        return input.substring(0, 1) + pairStar(input.substring(1));
    }

}
