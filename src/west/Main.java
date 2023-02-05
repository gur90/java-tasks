package west;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
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
