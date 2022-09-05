public class Main {
    public static void main(String[] args) {
        buyAlcohol();
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
}
