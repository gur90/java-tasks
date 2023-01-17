package Products;

abstract public class Product implements Comparable<Product> {
    private int price;
    private String title;

    public Product(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title " + title +
                ", price " + price;
    }
}
