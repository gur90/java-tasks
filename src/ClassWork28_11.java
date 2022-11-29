public class ClassWork28_11 {
    public static void main(String[] args) {
        String[] array = new String[]{"It's", "raining", "outside", "you'd better", "take", "an", "umbrella"};
        System.out.println(joinArray(array, "+-+"));
    }

    private static String joinArray(String[]input, String space) {
        String output="";
        for (int i = 0; i < input.length; i++) {
            if(i%2==0) {
                output += (input[i] + space);
            }
        }
        return output;
    }
}
