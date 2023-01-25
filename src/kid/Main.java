package kid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Kid olga = new Kid("Olga", "Valeriy", "Solnishko", 5, 122);
        Kid petr = new Kid("Petr", "Vasiliy", "Solnishko", 6, 124);
        Kid anna = new Kid("Anna", "Boris", "Bosonozhky", 4, 119);
        Kid artem = new Kid("Artem", "Evgeniy", "Bosonozhky", 7, 130);
        ArrayList<Kid> kids = new ArrayList<>();

        kids.add(olga);
        kids.add(petr);
        kids.add(anna);
        kids.add(artem);
        myCompareByName(kids);
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("after sorting by name " + kids);

        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getAdultName().compareTo(o2.getAdultName());
            }
        });
        System.out.println("after sorting by adult`s name " + kids);
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.titleOfGroup.compareTo(o2.titleOfGroup);
            }
        });
        System.out.println("after sorting by title of group " + kids);

        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("after sorting by age " + kids);

        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getHeight() - o2.getHeight();
            }
        });
        System.out.println("after sorting by height " + kids);
    }

    public static void myCompareByName(ArrayList<Kid> kids) {
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("after sorting by name " + kids);
    }
}
