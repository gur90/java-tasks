public class LogicalTasks04 {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));// → 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19
        System.out.println("---------");
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
        System.out.println("------");
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        System.out.println("-----------");
        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        System.out.println("----------");
        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println("---------");
        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false
        System.out.println("---------");
        System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true
        System.out.println("------------");
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
    }

    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else {
            return str;
        }
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b) {
            return true;
        } else {
            return bOk && c > b;
        }
    }

    public static boolean lessBy10(int a, int b, int c) {
        return a + 10 == b || b + 10 == c || a + 10 == c || b + 10 == a;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == (b = c)) {
            return 5;
        } else if (b != a && c != a) {
            return 0;
        } else {
        return 1;
        }
    }

    public static boolean shareDigit(int a, int b) {
        return a % 10 == b / 10 || a / 10 == b % 10;
    }

    public static boolean squirrelPlay(int temp, boolean summer) {
        if (temp >= 60 && temp <= 90) {
            return true;
        } else {
            return summer && temp <= 100;
        }
    }

    public static String alarmClock(int weekday, boolean vacation) {
        if (weekday >= 1 && weekday <= 5 && !vacation) {
            return "7:00";
        }
        else if ((weekday == 0 || weekday == 6) && vacation) {
            return "off";
        } else {
            return "10:00";
        }
    }
}
