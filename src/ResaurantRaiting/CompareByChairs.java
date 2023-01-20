package ResaurantRaiting;

import java.util.Comparator;

public class CompareByChairs implements Comparator<Place> {

    @Override
    public int compare(Place o1, Place o2) {
        return o1.chairs - o2.chairs;
    }
}
