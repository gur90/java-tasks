public class HelloInteger {
    public static void main(String[] args) {
        goodMorningInteger();
        findSquare();
        //helloByte();
        findRectangle();
        findCube();
        hallyHelloByte();
        numberOfGrains();

    }

    public static void goodMorningInteger() {
        int a = 2;
        int f = 3;
        int c = a + f;
        System.out.println("Сумма а и ф = " + c);
    }

    public static void findSquare() {
        int myFirstVariable = 5;
        int square = myFirstVariable * myFirstVariable;
        int perimeter = 4 * myFirstVariable;
        System.out.println("The square is " + square);
        System.out.println("the perimeter is " + perimeter);

    }

    public static void findRectangle() {
        int a = 5;
        int b = 6;
        int perimeter = 5 * 2 + 6 * 2;
        int square = 5 * 6;
        System.out.println(perimeter);
        System.out.println(square);
    }

    public static void findCube() {
        byte a = 8;
        byte perimeter = (byte) (a * 12);
        int square = 6 * (a * a);
        System.out.println(perimeter);
        System.out.println(square);

    }

    public static void numberOfGrains() {
        long a = 2L;
        int b = 63;
        long result = (long) (Math.pow(a, b) -1);
        System.out.println(result);
    }
    /*public static void helloByte() {
        byte a = 111;
        short b = 1111;
        int c = 1_111_111_111;
        long d = 1_3_4_5_6_7_8L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }*/

    public static void hallyHelloByte() {
        System.out.println("Hello");
    }
}

