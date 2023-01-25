package jewelery;

import java.util.Comparator;

public class CompareByTitle implements Comparator<Jewelery> {
    @Override
    public int compare(Jewelery o1, Jewelery o2) {
        return o1.title.compareTo(o2.title);
    }

    @Override
    public Comparator<Jewelery> reversed() {
        return Comparator.super.reversed();
    }
}
