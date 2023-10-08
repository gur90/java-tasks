
public class HomeTask10 {
    public static void main(String[] args) {
        System.out.println(startHiFirst("hi there")); //true
        System.out.println(startHiFirst("hi"));// true
        System.out.println(startHiFirst("hello hi"));// false
        System.out.println("----------------");
        System.out.println(teenNumbers(13, 20, 10));//true
        System.out.println(teenNumbers(20, 19, 10));//true
        System.out.println(teenNumbers(20, 10, 13));//true
        System.out.println(teenNumbers(9, 6, 4));
    }

    public static boolean startHiFirst(String str) {
        String input = str.substring(0, 2);
        if (input.equals("hi") ) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean startHiSecond(String str){
        return str.startsWith("hi");
    }

    public static boolean teenNumbers(int one, int two, int three) {
        return (one <= 19 && one >= 13) || (two <= 19 && two >= 13) || (three <= 19 && three >= 13);
    }
}
