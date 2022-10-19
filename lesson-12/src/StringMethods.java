public class StringMethods {
    public static void main(String[] args) {
        System.out.println(containPart("spring", "ing"));
        System.out.println(checkEnd("potato", "a"));
        System.out.println(checkEquals("hellloin"));
        System.out.println(checkEqIgnoreCase("MY NAME IS ANN"));
        System.out.println("------");
        System.out.println(emptyString("A"));
        System.out.println(theLengthOfString("qwertyuiop"));
        System.out.println("--------");
        System.out.println(replaceChar('r', 'k'));
        System.out.println(startsWithMethod("geometry"));
        System.out.println(substrMethod("veryBigProblem"));
        System.out.println(helloTrim(" Today i am very happy "));
    }

    public static boolean containPart(String str, String etalon) {
        return str.contains(etalon);
    }

    public static boolean checkEnd(String str, String end) {
        return str.endsWith(end);
    }

    public static boolean checkEquals(String str) {
        return str.equals("hellloin");
    }

    public static boolean checkEqIgnoreCase(String str) {
        return str.equalsIgnoreCase("my name is Ann");
    }

    public static boolean emptyString(String myString) {
        return myString.isEmpty();

    }

    public static int theLengthOfString(String s) {
        return s.length();
    }

    public static String replaceChar(char old, char newCh) {
        String myString = "object is returned that represents a character sequence identical";
        return myString.replace(old, newCh);
    }

    public static boolean startsWithMethod(String s) {
        String suf = "ge";
        return s.startsWith(suf);
    }

    public static String substrMethod(String str) {
        return str.substring(5).toLowerCase();
    }

    public static String helloTrim(String myString) {
        String newString = " but, you can not see that ";
        return myString.trim().concat(newString.trim());
    }
}
