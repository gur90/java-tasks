package HW30_01;

public class Coffee extends Drink implements Natural {
    public Coffee(String title, int price) {
        super(title, price);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
