import java.util.Objects;

public class HomeWork22_11 {
    public static void main(String[] args) {
        System.out.println(printSymbol("photography", 11));
        System.out.println(whisper("ANNA ROGOZINA"));
        String[] array = new String[]{"cat", "car", "bear"};
        System.out.println(findWorld(array, "car"));
    }

    private static int findWorld(String[] input, String world) {
        for (int i = 0; i < input.length; i++) {
            if (Objects.equals(input[i], world)) {
                return i;
            }
        }
        return -1;
    }


    private static String whisper(String str) {
        String output = str.toLowerCase();
        return output;
    }

    private static char printSymbol(String input, int index) {
        if (index > input.length() - 1) {
            System.out.println("error");
            return 'e';
        } else {
            return input.charAt(index);
        }
    }
}
