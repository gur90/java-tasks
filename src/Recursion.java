public class Recursion {
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));// ? "hel*lo"
        System.out.println(pairStar("xxyy"));// ? "x*xy*y"
        System.out.println(pairStar("aaaa"));// ? "a*a*a*a"
        int[] a = {1, 2, 11};
        int[] a1 = {11, 11};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(array11(a, 0)); //? 1
        System.out.println(array11(a1, 0));  //2
        System.out.println(array11(a2, 0));// ? 0
        System.out.println(noX("xaxb")); //? "ab"
        System.out.println(noX("abc")); //? "abc"
        System.out.println(noX("xx"));// ? ""

//        System.out.println(countHi("xxhixx"));// ? 1
//        System.out.println(countHi("xhixhix"));// ? 2
//        System.out.println(countHi("hi"));// ? 1

//        System.out.println(triangle(0));// ? 0
//        System.out.println(triangle(1));// ? 1
//        System.out.println(triangle(2));// ? 3
//        System.out.println(triangle(3));// ? 5
//        System.out.println(triangle(4));// ? 7
        System.out.println("********************");
        System.out.println(count8(8));// ? 1
        System.out.println(count8(818));// ? 2
        System.out.println(count8(88188));// ? 4
    }

    private static int count8(int n) {
        int dev10 = n / 10;
        if (n <= 8) {
            return 1;
        }
        if (n % 100 == 88) {
            return 2 + count8(dev10);
        }
        if (n % 10 == 8) {
            return 1 + count8(dev10);
        }
        return count8(dev10);
    }

    private static int triangle(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1 + triangle(n - 1);
        }
        return 2 + triangle(n - 1);
    }

    private static int countHi(String input) {
        if (input.length() < 2) {
            return 0;
        }
        if (input.charAt(0) == 'h' && input.charAt(1) == 'i') {
            return 1 + countHi(input.substring(2));
        }
        return countHi(input.substring(1));
    }

    private static String noX(String input) {
        if (input.length() < 1) {
            return "";
        }
        if (input.charAt(0) == 'x') {

            return noX(input.substring(1));
        }
        return input.charAt(0) + noX(input.substring(1));
    }

    public static int array11(int[] input, int index) {
        if (input.length - 1 < index) {
            return 0;
        }
        if (input[index] == 11) {
            return 1 + array11(input, index + 1);
        }
        return array11(input, index + 1);
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
