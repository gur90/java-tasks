package enumFuel;

public class Main {
    public static void main(String[] args) {
        Car opel = new Car(50, Fuel.DIZEL);
        System.out.println(opel.priceForFullTank());
    }
}
