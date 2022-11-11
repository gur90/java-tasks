public class NodNok {
    public static void main(String[] args) {
        char[] characterArray = new char[10];
        createChar();
    }

    public static String[] createChar() {
        String[] output = new String[]{};
        for (char i = 65; i < 90; i++) {
            System.out.print(i + " ");
            output[]+=charAt(i);
        }
        return output;
    }

}
