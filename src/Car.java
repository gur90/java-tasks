import java.util.Objects;

public class Car {
    public String title;
    public String color;
    public int maxSpeed;
    public int numberOfDoors;

    public Car(String title, String color, int maxSpeed, int numberOfDoors) {
        this.title = title;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String toString() {
        return "\n Car " + title +
                ", color: " + color +
                ", maxSpeed: " + maxSpeed +
                ", numberOfDoors: " + numberOfDoors + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && numberOfDoors == car.numberOfDoors && Objects.equals(title, car.title) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, color, maxSpeed, numberOfDoors);
    }
}
