public class HomeWork9_11 {
    public static void main(String[] args) {
        guessTheNumber(201);
        calculateSeven();
        calculateTwo();
        cantWalking();
    }

    private static void cantWalking() {
        int k = 0;
        while (k <= 300) {
            if (k % 6 == 0) {
                System.out.println("Himmel und Erde");
            } else if (k == 100) {
                System.out.println("Sagen Sie mir, kann man in Ihrem Land durch Null teilen?");
            } else {
                System.out.println(k);
            }
            k++;
        }
    }

    private static void calculateTwo() {
        int j = 1;
        while (j <= 512) {
            System.out.print(j + " ");
            j *= 2;
        }
    }

    private static void calculateSeven() {
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    private static void guessTheNumber(int number) {
        if (number > 200) {
            System.out.println("+");
        } else if (number < -200) {
            System.out.println("-");
        } else {
            System.out.println("ok");
        }
    }
}
