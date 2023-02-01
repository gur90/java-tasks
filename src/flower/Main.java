package flower;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Event, Flower> flowersForDifferentEvents = new HashMap<>(Map.of(new Event("Wedding", "The biggest day in your memmory"), new Flower("red", "rose"), new Event("9 of may", "the day of victory"), new Flower("orange", "carnation"), new Event("31 of december", "Happy new year"), new Flower("green", "Christmas tree")));
        System.out.println(flowersForDifferentEvents);
        System.out.println(flowersForDifferentEvents.containsKey(new Event("Wedding", "The biggest day in your memmory")));
        System.out.println(flowersForDifferentEvents.containsValue(new Flower("red", "rose")));
    }

}
