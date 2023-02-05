package violin;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023, 9, 06);
        LocalDate date2 = LocalDate.of(2021, 11, 8);
        LocalDate date3 = LocalDate.of(2003, 10, 06);
        Set<Violin> violins = new HashSet<>(Set.of(
                new Violin("Enrice", date1),
                new Violin("Onrice", date2),
                new Violin("Anrice", date3)));

        System.out.println(getMasterNameOfOldestViolin(new Violin("Enrice", date1),
                new Violin("Onrice", date2),
                new Violin("Anrice", date3)));

    }

    public static String getMasterNameOfOldestViolin(Violin... violins) {
        TreeSet<Violin> violinsSet = new TreeSet<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return -o1.dateOfCreation.compareTo(o2.dateOfCreation);
            }
        });
        Collections.addAll(violinsSet, violins);
        return violinsSet.last().nameOfMaster;
    }
}
