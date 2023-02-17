package funcInter;

public class Main {
    public static void main(String[] args) {
        FuncInterface divis12 = (n) -> {
            return n % 12 == 0;
        };
        FuncInterface divis24 = (n) -> {
            return n % 24 == 0;
        };
        System.out.println(divis24.division12(48));
        StringInterface strings = (a, b) -> {
            if (a.length() > b.length()) {
                return a;
            } else {
                return b;
            }
        };
        StringInterface strings2 = (a, b) -> (a.length() > b.length()) ? a.toUpperCase().replaceAll(",", "") : b.toUpperCase().replaceAll(",", "");
        System.out.println(strings2.returnTheLargestString("let, s go for a walk, ok?", "ok? it is meeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee,"));
    }

}
