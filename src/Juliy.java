public class Juliy {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    public static void enigmaCaesar(String input) {
        char a = 'a';
        char b = 35;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 32 || input.charAt(i) == 171 || input.charAt(i) == 187) {
                result = input.charAt(i);
                char output = (char) result;
                System.out.print(output);
            } else {
                result = input.charAt(i) + 3;
                char output = (char) result;
                System.out.print(output);
            }
        }
    }

}
