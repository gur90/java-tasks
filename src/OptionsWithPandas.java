import java.util.Objects;

public class OptionsWithPandas {
    public String name;
    public int age;

    public OptionsWithPandas(String name) {
        this.name = name;
    }

    public OptionsWithPandas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "OptionsWithPandas{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionsWithPandas that = (OptionsWithPandas) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
