public class DoWhile {
    public static void main(String[] args) {
        myNewLoop(3, 9);
        System.out.println("-------");
        mynewestLoop(5, 17);
        drawStar(5);
    }

    public static void myNewLoop(int a, int b) {
        int i = 0;
        while (i < b) {
            System.out.println(a);
            i++;
        }
    }

    public static void mynewestLoop(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    public static void drawStar(int numberLines) {
        String star = "*";
        String result = "";
        int i = 0;
        while (i <= numberLines) {
            result += star;
            System.out.println(result);
            i++;
        }
    }
}

