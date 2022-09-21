public class LogicalTasks {
    public static void main(String[] args) {
        System.out.println(squirrelsParty(30, false)); // false
        System.out.println(squirrelsParty(50, false));//true
        System.out.println(squirrelsParty(70, true)); //true
        System.out.println("------------");
        System.out.println(squirrelsPartySecond(30, false));
        System.out.println(squirrelsPartySecond(50, false));
        System.out.println(squirrelsPartySecond(70, true));
        System.out.println("-------");
        System.out.println(caughtSpeeding(60, false));// 0
        System.out.println(caughtSpeeding(65, false));// 1
        System.out.println(caughtSpeeding(65, true));// 0
        System.out.println("---------");
        System.out.println(love6(6, 4)); // true
        System.out.println(love6(4, 5)); // false
        System.out.println(love6(1, 5)); // true
        System.out.println("--------");
        System.out.println(more20(20));//false
        System.out.println(more20(21));// true
        System.out.println(more20(42));//true
        System.out.println("----------");
        System.out.println(nearTen(12));// true
        System.out.println(nearTen(17)); // false
        System.out.println(nearTen(19));// true
    }

    public static boolean squirrelsParty(int cigars, boolean weekend) {
        if (cigars >= 40 && cigars <= 60 && !weekend) {
            return true;
        } else if (cigars >= 40 && weekend) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean squirrelsPartySecond(int cigars, boolean weekend) {
        return (cigars >= 40 && cigars <= 60 && !weekend) || (cigars >= 40 && weekend);
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (speed <= 60 && !birthday || speed <= 65 && birthday) {
            return 0;
        } else if (speed <= 80 && !birthday || speed <= 85 && birthday) {
            return 1;
        } else {
            return 2;
        }

    }

    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(a + b) == 6;
    }

    public static boolean more20(int number) {
        return number % 20 == 1 || number % 20 == 2;
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
