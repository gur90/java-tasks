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
        if (speed <= 60 && !birthday || speed<=65 && birthday) {
            return 0;
        } else if (speed <= 80 && !birthday || speed<=85 && birthday) {
            return 1;
        } else {
            return 2;
        }

    }
}
