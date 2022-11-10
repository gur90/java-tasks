public class HomeWork8_11 {
    public static void main(String[] args) {
        /*printDays(10, 6);
        navBar(true);
        calculate(4, 5, 1);
        calculate(4, 5, 2);*/
        myFor();
    }

    private static void myFor() {
        for (int i = 10; i >= 3; i--) {
            System.out.println(i);

        }
        System.out.println("get ready!");
        for (int i = 2; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("boom!!");
    }

    private static void calculate(int a, int b, int c) {
        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("print another number");
                break;
        }
    }

    private static void navBar(boolean isAdmin) {
        String result = isAdmin ? "admin`s room, goods, docs" : "my lovely, cart, login";
        System.out.println(result);
    }

    private static void printDays(int month, int years) {
        int allMonth = month + years * 12;
        int output = allMonth * 29;
        System.out.println(output);
    }
}
