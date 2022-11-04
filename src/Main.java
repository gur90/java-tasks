public class Main {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    private static String starOut(String s) {
        String result = "";
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) != '*' && s.charAt(i) == '*') {
                result = s.substring(0, i - 1) + s.substring(i + 2);
            }
            if (s.contains("**")) {
                if (s.charAt(i) == '*') {
                    result = s.substring(0, i - 2) + s.substring(i + 2);
                }
            }
        }
        return result;
    }
}
