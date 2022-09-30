public class HomeTask {
    public static void main(String[] args) {
        simpleNumber(149);
        System.out.println(primeNumber(149));
    }

    public static void simpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("it is not simple " + i);
                return;
            }
        }
        System.out.println("it is simple");
    }

    public static boolean primeNumber(int n) {
        return n / n == 1 && n != 1 && n % 2 != 0;
    }
}
