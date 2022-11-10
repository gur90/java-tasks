public class ClassWork10_11 {
    public static void main(String[] args) {
        // lifeOfBarrel();
        // timer();
        numberUpAndDown(267);
    }

    private static void numberDown(int n) {
        for (int i = n; i >= 240; i--) {
            System.out.print(i + " ");
        }
    }

    private static void numberUp(int n) {
        for (int i = n; i <= 240; i++) {
            System.out.print(i + " ");
        }
    }


    private static void numberUpAndDown(int n) {
        if (n <= 240) {
            numberUp(n);
        } else {
            numberDown(n);
        }
    }

    private static void timer() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static void lifeOfBarrel() {
        int count = 0;
        int i = 1;
        while (i < 200) {
            System.out.println("Day " + i);
            System.out.println("barrel has " + i * 2 + " liters");
            i++;
            count++;
            if (count == 198) {
                i = 1;
            }
        }
        System.out.println("barrel has " + i + " liters");
    }
}
