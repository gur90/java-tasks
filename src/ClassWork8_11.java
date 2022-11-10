public class ClassWork8_11 {
    public static void main(String[] args) {
        System.out.println(numPositive(5, -9, 8));
    }
    private static int numPositive(int a, int b, int c) {
        if (a > 0 && b > 0 || (b > 0 && c > 0) || (a > 0 && c > 0)) {
            return 2;
        } else if (a > 0 && b > 0 && c > 0) {
            return 3;
        } else if (a < 0 && b < 0 && c < 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
