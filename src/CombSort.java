import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        char[] array = (Arrays.toString(createArr(30)).toCharArray());

    }

    private static char[] createArr(int n) {
        char[] output = new char[n];
        for (int i = 0; i < n; i++) {
            int randomCharNum = (int) (Math.random() * ((65 - 95) + 1) + 95);
            output[i] = (char) randomCharNum;
        }


        return output;
    }
}
