public class Main {
    /* Given a string, compute recursively (no loops) a new string where all appearances of “pi” have been replaced by “3.14”.
     Получив строку, вычислите рекурсивно (без циклов) новую строку, в которой все появления “pi” были заменены на “3.14”.*/
    public static void main(String[] args) {
        System.out.println(changePi("xpix"));// → "x3.14x"
        System.out.println(changePi("pipi"));// → "3.143.14"
        System.out.println(changePi("pip"));// → "3.14p"
    }

    private static String changePi(String str) {
        String etalon = "3.14";
        if (str.length() == 0) {
            return "0";
        }
        if (str.contains("pi")) {
            return str.replaceAll("pi", etalon);
        }
        return "err";
    }
}
