package west;

import java.util.Objects;

public class Cowboy implements Comparable<Cowboy> {
    private String name;
    private int revolverSize;

    public Cowboy(String name, int revolverSize) {
        this.name = name;
        this.revolverSize = revolverSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevolverSize() {
        return revolverSize;
    }

    public void setRevolverSize(int revolverSize) {
        this.revolverSize = revolverSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cowboy cowboy = (Cowboy) o;
        return revolverSize == cowboy.revolverSize && Objects.equals(name, cowboy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, revolverSize);
    }

    @Override
    public int compareTo(Cowboy o) {
        return -Integer.compare(revolverSize, o.revolverSize);
    }

    @Override
    public String toString() {
        return "Cowboy{" +
                "name='" + name + '\'' +
                ", revolverSize=" + revolverSize +
                '}';
    }
}
