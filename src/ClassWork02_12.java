public class ClassWork02_12 {
    public static void main(String[] args) {
        System.out.println(decToBinary(78));

    }

    private static String decToBinary(int dec) {
        String acc = "";
        int rem;
        while (dec > 0) {
            rem = dec % 2;
            acc = rem + acc;
            dec = dec / 2;
        }
        return acc;
    }
}
