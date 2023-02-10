package AboutEnum;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Caribo", Size.MEDIUM, "Vova");
        //System.out.println(coffee.calculatePrice());
        Bag bag = new Bag(Leather.CROCODILE, 6.5);
        System.out.println(bag.calculatePrice());
    }
}
