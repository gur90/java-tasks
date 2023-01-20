package fruitShop;

public class Apple extends Fruit {
    private static double totalPrice;

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Apple.totalPrice = totalPrice;
    }

    public Apple(double weight) {
        super(weight);
        totalPrice += costOfFruits();
    }

    @Override
    public double costOfFruits() {
        return weight * 20;
    }


}
