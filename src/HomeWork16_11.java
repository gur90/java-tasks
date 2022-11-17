public class HomeWork16_11 {
    public static void main(String[] args) {
        createArr();
        tossCoin();
        int []arr = new int [7];
        fillArray(arr, 6, 99);
    }

    private static void fillArray(int[]input, int maxRandom, int minRandom) {
        int[]output = new int[input.length];
        for (int i = 0; i < input.length ; i++) {
            int random = (int) (minRandom + Math.random() * (maxRandom - minRandom));
            output[i]=random;
            System.out.println(output[i ]+", ");
        }
    }

    private static void tossCoin() {
        String[] arr = new String[2];
        double random = Math.random();
        if (random > 0.5) {
            System.out.println("head");
        } else {
            System.out.println("tail");
        }
    }

    private static void createArr() {
        int length = 0;
        for (int i = 3; i <= 19; i++) {
            length++;
        }
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            int random = (int) (3 + Math.random() * (20 - 3));
            arr[i] = random;
            System.out.println(arr[i]);
        }
    }
}
