public class Main {
    public static void main(String[] args) {
        buyAlcohol();
        toDetermineSeason(6);
        String result = testSeason(1);
        System.out.println("The season is " + result);
        System.out.println("---------");
        System.out.println(getTheTablet(2));
    }

    public static void buyAlcohol() {
        int age = 60;
        String answer = "";
        switch (age) {
            case 10:
                System.out.println("You are too young");
                break;
            case 17:
                System.out.println("Please, wait for one year");
                break;
            case 18:
                System.out.println("You can buy only beer");
                break;
            case 20:
                System.out.println("You can buy only beer and wine");
                break;
            case 30:
                System.out.println("You can buy what you want");
                break;
            default:
                System.out.println("invalid age");
                break;
        }
    }

    public static void toDetermineSeason(int month) {
        String season = "";
        switch (month) {
            case (1):
                System.out.println(month + " is winter");
                break;
            case (2):
                System.out.println(month + " is winter");
                break;
            case (3):
                System.out.println(month + " is spting");
                break;
            case (4):
                System.out.println(month + " is spring");
                break;
            case (5):
                System.out.println(month + " is spring");
                break;
            case (6):
                System.out.println(month + " is summer");
                break;
            case (7):
                System.out.println(month + " is summer");
                break;
            case (8):
                System.out.println(month + " is summer");
                break;
            case (9):
                System.out.println(month + " is automn");
                break;
            case (10):
                System.out.println(month + " is automn");
                break;
            case (11):
                System.out.println(month + " is automn");
                break;
            case (12):
                System.out.println(month + " is winter");
                break;
            default:
                System.out.println("invalid month");
        }
        System.out.println("-----------");
    }

    public static String testSeason(int month) {
        String season = "";
        switch (month) {
            case (1):
                season = "winter";
                break;
            default:
                season = "invalid";

        }
        return season;
    }

    public static String getTheTablet(int number) {
        String tablet = "";
        switch (number) {
            case (1):
                tablet = "Now you are the cleverest in the world";
                break;
            case (2):
                tablet = "You are very strong";
                break;
            case (3):
                tablet = "You are 45 years old now";
                break;
            default:
                tablet = "bad choice";
        }
        return tablet;
    }
}
