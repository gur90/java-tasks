package HW30_01;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Bar, Integer> ratings = new HashMap<>();
        ratings.put(new Bar("WhiteTea", "Lesson str 31", new Tea("Green", 5)), 9);
        ratings.put(new Bar("WhiteTea", "Lesson str 31", new Tea("Green", 5)), 9);
        ratings.put(new Bar("WhiteTea", "Lesson str 31", new Tea("Green", 5)), 9);
        ratings.put(new Bar<>("Coffee Bar", "Andru str 45", new Coffee("Cappuchino", 6)), 10);

        System.out.println(ratings);
    }
}
