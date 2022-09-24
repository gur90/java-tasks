public class LogicalTasks2 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8)); // 1
        System.out.println(teaParty(3, 8)); // 0
        System.out.println(teaParty(20, 6)); // 2
        System.out.println("----------");
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
        System.out.println("-------");
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
        System.out.println("------------");
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
        System.out.println("-----------");
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4));
        System.out.println("----------");
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
        System.out.println("----------");
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
        System.out.println("---------");
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true));
        System.out.println("---------");
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    // do not work well
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }

    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || c + b == a;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static int maxMod5(int a, int b) {
        if (a < b && a % 5 == b % 5) {
            return a;
        } else if (a > b && a % 5 == b % 5) {
            return b;
        } else if ((a - b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        } else if ((a + b) - (b + c) == 10 || (a + b) - (a + c) == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public static int dateFashion(int style, int fashion) {
        if (style >= 8 || fashion >= 8) {
            return 2;
        } else if (style <= 2 || fashion <= 2) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int sortaSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    public static boolean in1To10(int a, boolean outsideMode) {
        if (a <= 1 || a >= 10 && outsideMode) {
            return true;
        } else if (a <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean old35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }
}
