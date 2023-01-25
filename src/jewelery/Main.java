package jewelery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jewelery> jeweleries = new ArrayList<>();
        jeweleries.add(new Jewelery(895, 5, "panda", 67));
        jeweleries.add(new Jewelery(695, 8, "earrings", 670));
        jeweleries.add(new Jewelery(995, 7, "ring", 123));
        jeweleries.add(new Jewelery(999, 15, "chain", 976));
        jeweleries.add(new Jewelery(799, 9, "double ring", 76));
        System.out.println(jeweleries);
        Collections.sort(jeweleries, new CompareByGoldContent().reversed());
        System.out.println(jeweleries);
        Collections.sort(jeweleries, new CompareByTitle());
        System.out.println("compare by title " + jeweleries)

        ;
        Collections.sort(jeweleries, new Comparator<Jewelery>() {
            @Override
            public int compare(Jewelery o1, Jewelery o2) {
                return Integer.compare(o2.goldContent, o1.goldContent);
            }

            public Comparator<Jewelery> reversed() {
                return Comparator.super.reversed();
            }
        }.reversed());
        System.out.println(jeweleries);
    }
}
