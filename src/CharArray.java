import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    private static char[] createArray() {
        char[] output = new char[36];
        int num =65t;
        for (int i = 0; i < 36; i++) {
            output[i] = (char) num;
            num++;
        }

        return output;
    }
}
