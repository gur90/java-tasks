public class varargs {
    public static void main(String[] args) {
        addWithSeparator("*-*", "q", "p", "u");
    }

    private static void addWithSeparator(String sep, String... args) {
        String result = "";
        for (int i = 0; i < args.length; i++) {
            result += args[i] + sep;
        }
        System.out.println(result);
    }
}
