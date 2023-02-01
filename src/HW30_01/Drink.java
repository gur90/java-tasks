package HW30_01;

import java.util.Objects;

public abstract class Drink {
    public String title;
    public int price;

    public Drink(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return price == drink.price && Objects.equals(title, drink.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}
