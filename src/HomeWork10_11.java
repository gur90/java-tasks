public class HomeWork10_11 {
    public static void main(String[] args) {
        String output = camomile(9);
        System.out.println(output);
        basket(10);
    }
    private static void basket(int days) {
        int count = 0;
        for (int i = 1; i <= days; i++) {
            //System.out.println("Day " + i + " basket has " + count);
            if (days == i) {
                System.out.println("Day " + i + " basket has " + count);
            }
            count += 2;
            if (count == 22) {
                count = 0;
            }
        }
    }

    private static String camomile(int n) {
        if (n % 2 == 0) {
            return "He loves";
        } else {
            return "He doesn't";
        }
    }
}
