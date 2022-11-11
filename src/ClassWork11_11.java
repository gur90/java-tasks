public class ClassWork11_11 {
    public static void main(String[] args) {
        System.out.println(openAccount(100, 2));
        deleteFiveAndSix(12);
    }

    private static double openAccount(double money, int month) {
        double output = 0;
        for (int i = 0; i < month; i++) {
            output = (money + money * 7 / 100);
        }
        return output;
    }

    private static void deleteFiveAndSix(int finish) {
        for (int i = 1; i < finish; i++) {
            if (i % 5 == 0) {
                i += 2;
            }
            System.out.println(i);
        }
    }
}
