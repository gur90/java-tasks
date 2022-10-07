public class Homework13 {
    public static void main(String[] args) {
        // myFor(3,7);
        printNumber(2, 9);
        printSquare(8);
    }

    public static void myFor(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void printNumber(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
    public static void printSquare(int n){
        for (int i = 1; i <n; i++) {
            System.out.println(n);
        }
        //System.out.println(n);
    }
}
