package wedding;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LocalDate.of(2023, 02, 01);
        Wedding wedding = new Wedding(
                "Ivan",
                "Anna",
                LocalDate.of(2023, 03, 9),
                new Place("Voron str, 45", 45)
        );

        TreeSet<Wedding> weddings = new TreeSet<>();
        weddings.add(new Wedding(
                "Ivan",
                "Anna",
                LocalDate.of(2023, 03, 9),
                new Place("Voron str, 45", 45)
        ));
        weddings.add(new Wedding(
                "Max",
                "Anna",
                LocalDate.of(2023, 8, 10),
                new Place("Voron str, 45", 75)
        ));
        System.out.println(weddings);
        Set<Wedding> result = weddings.subSet(new Wedding(
                        "Ivan",
                        "Anna",
                        LocalDate.of(2023, 03, 9),
                        new Place("Voron str, 45", 45)
                ),
                new Wedding(
                        "Max",
                        "Anna",
                        LocalDate.of(2023, 8, 10),
                        new Place("Voron str, 45", 75)
                ));
    }
}
