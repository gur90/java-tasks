package vehicle;

public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car();
//        System.out.println(bmw.getNumberOfWheels());
        Car maserati = new Car(
                true,
                4,
                320,
                2,
                1900);
        System.out.println(maserati);
        Scooter xiaomi = new Scooter(27.0, 1, 7.5, 3, true, true);
        System.out.println("xiomy " + xiaomi);
        Scooter maxSpeed = new Scooter(32.0, 2, 6.3, 2, true, false);
        System.out.println("maxSpeed " + maxSpeed);
    }
}
