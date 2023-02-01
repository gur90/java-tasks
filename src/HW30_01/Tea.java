package HW30_01;

public class Tea extends Drink implements Natural {
    public Tea(String title, int price) {
        super(title, price);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
