package ResaurantRaiting;

import java.util.Comparator;

public class CompareByRate implements Comparator<Place> {
    @Override
    public int compare(Place o1, Place o2) {
        return (int) (o1.rate - o2.rate);
    }
}
