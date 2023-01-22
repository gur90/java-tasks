import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Opel", "Blue", 165, 5));
        cars.add(new Car("WF", "Red", 200, 3));
        cars.add(new Car("Toyota", "Yellow", 240, 5));
        cars.add(new Car("UAZ", "Grey", 120, 5));
        cars.add(new Car("Lada", "White", 150, 5));
        System.out.println("before removing " + cars);

        Iterator<Car> myIterator = cars.iterator();
        while (myIterator.hasNext()) {
            if (myIterator.next().title.equals("Opel")) {
                myIterator.remove();
            }

        }
        System.out.println("after removing " + cars);
    }
}
