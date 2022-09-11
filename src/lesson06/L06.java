public class L06 {
    public static void main(String[] args) {
        buyAlcohol();
        toDetermineSeason(4);
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
            case (12):
            case (1):
            case (2):
                System.out.println(month + " is winter");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println(month + " is spring");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println(month + " is summer");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println(month + " is automn");
                break;

            default:
                System.out.println("invalid month");
        }
        System.out.println("-----------");
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
