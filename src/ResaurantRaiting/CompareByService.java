package ResaurantRaiting;

import java.util.Comparator;

public class CompareByService implements Comparator<Place> {
    public int compare(Place o1, Place o2) {
        return (int) (o1.service - o2.service);
    }
}
