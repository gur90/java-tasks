package fruitShop;

public class Pear extends Fruit {
    private static double totalPrice;

    public static double getTotalPrice() {
        return totalPrice;
    }

    public Pear(double weight) {
        super(weight);
        totalPrice += costOfFruits();
    }

    @Override
    public double costOfFruits() {
        return weight * 5;
    }
}
