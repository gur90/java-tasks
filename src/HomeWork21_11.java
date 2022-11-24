import java.util.Arrays;

public class HomeWork21_11 {
    public static void main(String[] args) {
        int[]numbers=new int[]{2, 7, 9, 12, 5};
        int[]arrays=new int[]{1, 3, 4, 6};
        System.out.println(Arrays.toString(changeArr(numbers)));
        System.out.println(Arrays.toString(changeArr(arrays)));
    }

    private static int[] changeArr(int[]input) {
        int storadge;
        for (int i = 0; i < input.length-1; i+=2) {
            storadge=input[i];
            input[i]=input[i+1];
            input[i+1]=storadge;
        }
        return input;
    }
}
