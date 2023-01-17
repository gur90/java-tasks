package Products;

public class Furniture extends Product {
    public Furniture(int price, String title) {
        super(price, title);
    }

    @Override
    public int compareTo(Product o) {
        return o.getTitle().compareTo(this.getTitle());
    }
}
