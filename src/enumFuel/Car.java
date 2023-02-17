package enumFuel;

public class Car {
    public int volume;
    public Fuel fuel;

    public Car(int volume, Fuel fuel) {
        this.volume = volume;
        this.fuel = fuel;
    }

    public double priceForFullTank() {
        return volume * fuel.getPrice();
    }
}
