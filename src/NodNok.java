import java.util.ArrayList;

public class NodNok {
    public static void main(String[] args) {
      /*  System.out.println(nod(60, 15));
        System.out.println(nok(5, 8));
        char[] characterArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        createChar(characterArray);*/
        crate();
    }

    private static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    private static int nod(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return nod(b, a % b);
        }
    }

    private static void crate() {
        String output = "";
        ArrayList<String> result = new ArrayList<String>();
        for (char i = 65; i < 90; i++) {
            output += i;
        }
        result.add(output);
        System.out.print(result);
    }

    public static char[] createChar(char[] arr) {
        char[] output = new char[]{};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return output;
    }

}
