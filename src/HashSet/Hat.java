package HashSet;

import java.util.Objects;

public class Hat {
    public double price;
    public String color;
    public String countryFrom;

    public Hat(double price, String color, String countryFrom) {
        this.price = price;
        this.color = color;
        this.countryFrom = countryFrom;
    }

    @Override
    public String toString() {
        return "Hat from " + countryFrom +
                ", price " + price +
                ", color " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hat hat = (Hat) o;
        return Double.compare(hat.price, price) == 0 && Objects.equals(color, hat.color) && Objects.equals(countryFrom, hat.countryFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, countryFrom);
    }
}
