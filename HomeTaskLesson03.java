package lesson03;

public class HomeTaskLesson03 {
    public static void main(String[] args) {
        findSquareCircle();
        circumferenceLength();
        cost();
        squareBellarusUkraine();
        squareMoscowBerlin();
        deposit();
    }

    public static void findSquareCircle() {
        final double PI = 3.14;
        final double min = 18;
        final double max = 26;
        double r = 10;
        double square = PI * r * r;
        double anotherSquare = Math.PI * Math.pow(r, 2);
        double anotherPi = Math.PI;
        System.out.println("площадь1: " + square);
        System.out.println("площадь2: " + anotherSquare);
    }

    public static void circumferenceLength() {
        double radius = 55;
        double length = (2 * 3.14 * radius);
        System.out.println(length);
    }

    public static void cost() {
        float dollar = 45;
        float evro = (float) (45 * 1.1);
        System.out.println(evro);
    }

    public static void squareBellarusUkraine() {
        int bel = 207600 / 200000;
        int ukr = 603549 / 200000;
        System.out.println(bel + ":" + ukr);
    }

    public static void squareMoscowBerlin() {
        double squareMoscow = 2561.0;
        double squareBerlin = 891.0;
        double result = squareMoscow / squareBerlin;
        System.out.println(result);
    }

    public static void deposit() {
        double money = 1000.0;
        double percent = 3.5;
        double year = 7.0;
        double result = ((money * percent * (365 / 365)) / 100) * year;
        System.out.println(result + money);
    }

}
