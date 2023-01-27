package pet;

import java.util.Objects;

public class Snake extends Pet {
    public String name;

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return Objects.equals(name, snake.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
