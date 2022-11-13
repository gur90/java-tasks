public class Homework11_11 {
    public static void main(String[] args) {
        tree(15, 1);
    }

    private static void tree(int height, int age) {
        for (int i = age; i <= 120; i++) {
            if (i < 20) {
                System.out.println("Years: " + i + " Height: " + height);
                height = height + (height * 20 / 100);
            } else if (i < 120) {
                System.out.println("Years: " + i + " Height: " + height);
                height = height + (height * 8 / 100);
            }
        }
    }
}
