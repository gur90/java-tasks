public class ClassWork23_11 {


    public static void main(String[] args) {
        String phrase3 = "aged wine is always good in making people high";
        System.out.println(cypher(phrase3));
    }

    private static String cypher(String text) {
        String output = text.replace("a", "*").replace("g", "_").replace("h", "%").replace("e", "@");
        return output;
    }
}