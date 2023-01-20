import java.util.*;

public class IteratorIntro {
    public static void main(String[] args) {
        // листы list
        ArrayList<String> hamsters = new ArrayList<>();
        LinkedList<String> pandas = new LinkedList<>();
        Vector<String> hamsters2 = new Vector<>();       // никогда не используется
        List<String> planets2 = new ArrayList<>();        // не можем сделать объект листа
        // множества set
        HashSet<String> spiders = new HashSet<>();
        //
        // iterator
        HashSet<String> planets = new HashSet<>();
        planets.add("Mars");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        System.out.println(planets);
        Iterator<String> iterator = planets.iterator(); // получили объект итератор, сохранили его в переменную

        System.out.println(iterator.next());
        iterator.remove();


        Iterator<String> newIter = planets.iterator();
        while (newIter.hasNext()) {
            if (newIter.next().equals("Pluto")) {
                newIter.remove();
            }
        }
        System.out.println(planets);
    }
}
