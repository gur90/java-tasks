package ResaurantRaiting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Place> places = new ArrayList<>();
        places.add(new Bar(6.7, "Baraco", 100, 8));
        places.add(new Caffe(4.5, "Robin", 18, 7));
        places.add(new Restaurant(8.9, "Tanuki", 89, 10));
        places.sort(new CompareByRate());
        System.out.println(places);
        places.sort(new CompareByService());
        System.out.println(places);
    }
}
