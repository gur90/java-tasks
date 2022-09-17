
public class HomeTask10 {
    public static void main(String[] args) {
        System.out.println(startHi("hi there")); //true
        System.out.println(startHi("hi"));// true
        System.out.println(startHi("hello hi"));// false
        System.out.println("----------------");
        System.out.println(teenNumbers(13, 20, 10));//true
        System.out.println(teenNumbers(20, 19, 10));//true
        System.out.println(teenNumbers(20, 10, 13));//true
    }

    public static boolean startHi(String str) {
        String input = str.substring(0, 2);
        System.out.println(input);
        switch (input) {
            case "hi":
                return true;
            default:
                return false;

        }
    }

    public static boolean teenNumbers(int one, int two, int three) {
        boolean answer = false;
        if ((one <= 19 && one >= 13) || (two <= 19 && two>=13) || (three <= 19 && three>=13)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}