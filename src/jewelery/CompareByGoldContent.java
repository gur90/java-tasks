package jewelery;

import java.util.Comparator;

public class CompareByGoldContent implements Comparator<Jewelery> {

    @Override
    public int compare(Jewelery o1, Jewelery o2) {
        return Integer.compare(o1.goldContent, o2.goldContent);
    }

    @Override
    public Comparator<Jewelery> reversed() {
        return Comparator.super.reversed();
    }
}
