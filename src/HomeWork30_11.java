import java.util.Arrays;

public class HomeWork30_11 {
    public static void main(String[] args) {
        System.out.println("People can change the world , if they want to");
        endToUpper("People can change the world , if they want to");
    }

    private static String endToUpper(String input) {
        String[] output = input.split(" ");
        for (int i = 0; i < output.length; i++) {
            output[i] = output[i].substring(0, output[i].length() - 1) + String.valueOf(output[i].charAt(output[i].length() - 1)).toUpperCase();
        }
        System.out.println(String.join(" ", output));
        return String.join(" ", output);
    }
}
