package pet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Marusia");
        Snake snake = new Snake("Shishi");
        Hamster hamster = new Hamster("Ham");
        Food forCat = new Food("kit cat", "meat");
        Food forSnake = new Food("mouse", "meat");
        Food forHamster = new Food("fish", "fish");
        HashMap<Pet, Food> whatAnimalsEat = new HashMap<>();
        whatAnimalsEat.put(cat, forCat);
        whatAnimalsEat.put(snake, forSnake);
        whatAnimalsEat.put(hamster, forHamster);
        whatAnimalsEat.put(new Cat("Popo"), forCat);
        for (Pet key : whatAnimalsEat.keySet()) {
            System.out.println(key);
        }
        System.out.println(whatAnimalsEat.containsKey(new Cat("Popo")));
    }
}
