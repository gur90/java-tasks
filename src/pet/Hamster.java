package pet;

import java.util.Objects;

public class Hamster extends Pet {
    public String name;

    public Hamster(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return Objects.equals(name, hamster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
