public class StringExcersize {
    public static void main(String[] args) {
//        System.out.println(withoutX2("xHi"));// ? "Hi"
//        System.out.println(withoutX2("Hxi"));// ? "Hi"
//        System.out.println(withoutX2("Hi"));// ? "Hi"
        wordEnds("abcXY123XYijk", "XY");// ? "c13i"
        wordEnds("XY123XY", "XY");// ? "13"
        wordEnds("XY1XY", "XY");// ? "11"
    }

    private static void wordEnds(String input, String etalon) {
        int start = input.length();
        int end = etalon.length();
        String result = "";
        for (int i = 0; i < start - end + 1; i++) {
            String temp = input.substring(i, i + end);
            if (i > 0 && temp.equals(etalon)) {
                result += input.substring(i - 1, i);
            }
            if (i < start - end && temp.equals(etalon)) {
                result += input.substring(i + end, i + end + 1);
            }
        }
        System.out.println(result);
    }

    private static String withoutX2(String str) {
        if (str.charAt(0) == 'x') {
            return str.substring(1);
        }
        if (str.charAt(1) == 'x') {
            return str = str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}
