package flower;

import java.util.Objects;

public class Flower {
    public String color;
    public String title;

    public Flower(String color, String title) {
        this.color = color;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Flower " + title +
                "color " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(color, flower.color) && Objects.equals(title, flower.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, title);
    }
}
