public class Recursion {
    public static void main(String[] args) {
        // System.out.println(pairStar("hello"));// ? "hel*lo"
        System.out.println(pairStar("xxyy"));// ? "x*xy*y"
        pairStar("aaaa");// ? "a*a*a*a"
    }

    private static String pairStar(String input) {
        if (input.charAt(0) == input.charAt(1)) {
            input = input.charAt(0) + "*" + input.charAt(1) + input.substring(3, input.length());
            pairStar(input.substring(3));
        }

        return input;
    }
}
