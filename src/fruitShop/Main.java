package fruitShop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(5.6);
        Apple apple2 = new Apple(5.6);
        System.out.println(apple.costOfFruits());
        Pear pear = new Pear(7.0);
        System.out.println("pear cost " + pear.costOfFruits());
        Apricot apricot = new Apricot(5.5);
        Apricot apricot2 = new Apricot(5.5);
        System.out.println(apricot.costOfFruits());

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(pear);
        fruits.add(apricot);
        fruits.add(apricot2);

        System.out.println("Total: " + Fruit.total);
        System.out.println("Total goods: " + Fruit.count);
        System.out.println("apple cost: " + Apple.getTotalPrice());
        System.out.println("apricot cost: " + Apricot.getTotalPrice());
        System.out.println(Apple.getTotalPrice() + Apricot.getTotalPrice() + Pear.getTotalPrice());
    }
}
