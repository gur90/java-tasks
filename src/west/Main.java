package west;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        Cowboy cowboy1 = new Cowboy("Alex", 78);
//        Cowboy cowboy2 = new Cowboy("Rem", 8);
//        Cowboy cowboy3 = new Cowboy("Deni", 54);
//        PriorityQueue<Cowboy> cowboys = new PriorityQueue<>();
//        cowboys.offer(cowboy2);
//        cowboys.offer(cowboy1);
//        cowboys.offer(cowboy3);
//        System.out.println(cowboys);


        Saloon saloon = new Saloon("Red house");
        saloon.letCowboyIn(new Cowboy("Alex", 78));
        saloon.letCowboyIn(new Cowboy("Rem", 8));
        saloon.letCowboyIn(new Cowboy("Deni", 54));
        System.out.println(saloon);
        saloon.serveDrink();
        saloon.serveDrink();
        saloon.serveDrink();
        System.out.println(saloon);
        saloon.serveDrink();
    }

}
