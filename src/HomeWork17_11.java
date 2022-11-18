public class HomeWork17_11 {
    public static void main(String[] args) {
        int[] array = new int[]{-5, -10, -24, -50};
        System.out.println(getBiggestNumber(array));
    }

    private static int getBiggestNumber(int[] input) {
        int max= input[0];
        for (int i = 0; i < input.length; i++) {
            if(input[i]>max){
                max= input[i];
            }
        }
        return max;
    }
}
