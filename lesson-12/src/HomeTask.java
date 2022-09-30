public class HomeTask {
    public static void main(String[] args) {
        simpleNumber(6);
    }

    public static void simpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("it is not simple");
                return;
            }
        }
        System.out.println("it is simple");
    }

}
