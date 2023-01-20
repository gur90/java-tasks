package fruitShop;

public class Apricot extends Fruit {
    private static double totalPrice;

    public static double getTotalPrice() {
        return totalPrice;
    }

    public Apricot(double weight) {
        super(weight);
        totalPrice += costOfFruits();
    }

    @Override
    public double costOfFruits() {
        return weight * 10;
    }
}
