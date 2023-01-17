package Products;

public class Alcohol extends Product {
    public Alcohol(int price, String title) {
        super(price, title);
    }

    @Override
    public int compareTo(Product o) {
        return o.getTitle().compareTo(this.getTitle());
    }
}
