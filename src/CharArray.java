import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mixArray(createArray())));
    }

    private static char[] mixArray(char[]input) {
        char[]output=new char[input.length];
        int min =1;
        int max= input.length-1;
        for (int i = 0; i < output.length; i++) {
            int random = min + (int)(Math.random()*max);
            output[i]=input[random];
        }
        return output;
    }

    private static char[] createArray() {
        char[] output = new char[26];
        int num =65;
        for (int i = 0; i < 26; i++) {
            output[i] = (char) num;
            num++;
        }
        return output;
    }
}

