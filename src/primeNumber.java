import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class primeNumber {
    public static void main(String[] args) {
        primeNum(126);
    }

    static int i = 2;

    private static void primeNum(int num) {
        if (num > 1) {
            if (num % i != 0) {
                i++;
                primeNum(num);
            } else if (num % i == 0) {
                printNum(i, num);
            }
        } else {
            System.out.println("not prime");
        }
    }

    private static void printNum(int i, int num) {
        if (num == i) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }


}
