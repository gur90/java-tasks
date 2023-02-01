package HW30_01;

import java.util.Objects;

public class Bar<G extends Drink & Natural> {
    public String title;
    public String adress;
    public G drinks;

    public Bar(String title, String adress, G drinks) {
        this.title = title;
        this.adress = adress;
        this.drinks = drinks;
    }

    public Bar() {

    }

    @Override
    public String toString() {
        return "Bar{" +
                "title='" + title + '\'' +
                ", adress='" + adress + '\'' +
                ", drinks=" + drinks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar<?> bar = (Bar<?>) o;
        return Objects.equals(title, bar.title) && Objects.equals(adress, bar.adress) && Objects.equals(drinks, bar.drinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, adress, drinks);
    }
}
