
import java.util.Scanner;

public class HomeWork25_11 {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int numberOne = input.nextInt();
        System.out.println("Please choose 1 if you want to combine, 2 - to subtract, 3 - to divide, 4 - to multiply");
        int operator = input.nextInt();
        System.out.println("enter another number");
        int numberTwo = input.nextInt();
        if (operator == 1) {
            System.out.println("The result is: " + (numberOne + numberTwo));
        } else if (operator == 2) {
            System.out.println("The result is: " + (numberOne - numberTwo));
        } else if (operator == 3) {
            System.out.println("The result is: " + (numberOne / numberTwo));

        } else if (operator == 4) {
            System.out.println("The result is: " + (numberOne * numberTwo));
        }
    }
}
