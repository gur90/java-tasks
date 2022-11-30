import java.util.Scanner;

public class ClassWork29_11 {
    public static void main(String[] args) {
        // email validation
        //  - хотим проверить содержит ли email '@'
        String email1 = "anna-rogozina@gmail.com";
        String email2 = "eugine2022.com";
        email1.charAt(0); // хотим посмотреть символ
        System.out.println(isValid(email1));
        System.out.println("privet");
        System.out.println(checkTriangle(9, 3, 2));
        System.out.println("the result is: "+ printSc());
    }

    private static boolean printSc() {
        System.out.println("let's paint triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of first side");
        int num = input.nextInt();
        System.out.println("another length, please");
        int num2 = input.nextInt();
        System.out.println("the third side is:");
        int num3 = input.nextInt();
        return checkTriangle(num, num2, num3);
    }

    private static boolean checkTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

    public static boolean isValid(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '@') {
                count++;
            }
        }
        if (count >= 2) {
            return false;
        }
        return true;
    }
}
