public class Juliy {
    public static void main(String[] args) {
        allCezarDecision();
    }

    public static void allCezarDecision() {
        String etalon = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        String input = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        System.out.println(input);
        System.out.println(codedInput(input));
        System.out.println(etalon);
    }

    private static String problemChars(char symbol) {
        char result = (char) (symbol + 3);
        if (symbol == ' ') {
            result = ' ';
        } else if (symbol == '.') {
            result = '.';
        } else if (symbol == ',') {
            result = ',';
        } else if (symbol == '!') {
            result = '!';
        } else if (symbol == 'э') {
            result = 'а';
        } else if (symbol == 'ю') {
            result = 'б';
        } else if (symbol == 'я') {
            result = 'в';
        } else if (symbol == 'е') {
            result = 'з';
        } else if (symbol == 'г') {
            result = 'е';
        } else if (symbol == 'д') {
            result = 'ж';
        }
        return String.valueOf(result);
    }

    private static String changeChars(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + problemChars(input.charAt(i));
        }
        return output;
    }

    public static String codedInput(String input) {
        String newInput = String.valueOf(changeChars(input));
        return newInput;
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
