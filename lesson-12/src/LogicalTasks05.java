public class LogicalTasks05 {
    public static void main(String[] args) {
        System.out.println(specialEleven(22));//→ true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false

        System.out.println("------");
        System.out.println(cigar(30, false));
        System.out.println(cigar(50, false));
        System.out.println(cigar(70, true));
        System.out.println("--------");
        System.out.println(less20(18));// → true
        System.out.println(less20(19));// → true
        System.out.println(less20(20));// → false
        System.out.println("-------");
        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false
        System.out.println("------");
        System.out.println(fizzString2(1));//→ "1!"
        System.out.println(fizzString2(2));// → "2!"
        System.out.println(fizzString2(3));// → "Fizz!"
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static boolean cigar(int n, boolean week) {
        if (n >= 40 && n <= 60 && !week) {
            return true;
        } else return week;
    }

    public static boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public static boolean answerCell(boolean morning, boolean momCalling, boolean iAmAsleep) {
        if (morning && momCalling) {
            return true;
        } else if (iAmAsleep) {
            return false;
        } else return !morning;
    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}
