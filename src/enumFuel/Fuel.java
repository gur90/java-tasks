package enumFuel;

public enum Fuel {
    PETROL95(1.57), PETROL98(1.76), DIZEL(1.74);
    public double price;

    Fuel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
