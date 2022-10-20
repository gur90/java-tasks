public class HomeTask10 {
    public static void main(String[] args) {
        startHi("hi there") //true
        startHi("hi")// true
        startHi("hello hi")// false
    }

    public static boolean startHi(String str) {
        String input = str.substring(0, 2);
        if (input == "hi") {
            return true
        } else {
            return false
        } ;
    }
}
