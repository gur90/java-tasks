
import java.util.Scanner;

public class HomeWork25_11 extends Exception {
    public static void main(String[] args) {

    }

    public static void calculate() throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        String numberOne = input.next();
        int number = Integer.parseInt(numberOne);
        if (number == Integer.parseInt(numberOne)) {
            System.out.println("Please choose 1 if you want to combine, 2 - to subtract, 3 - to divide, 4 - to multiply");
        }
        int operator = input.nextInt();
        System.out.println("enter another number");
        int numberTwo = input.nextInt();
        if (operator == 1) {
            System.out.println("The result is: " + (number + numberTwo));
        } else if (operator == 2) {
            System.out.println("The result is: " + (number - numberTwo));
        } else if (operator == 3) {
            System.out.println("The result is: " + (number / numberTwo));

        } else if (operator == 4) {
            System.out.println("The result is: " + (number * numberTwo));
        } else {
            throw new Exception(
                    "error"
            );
        }
    }
}
