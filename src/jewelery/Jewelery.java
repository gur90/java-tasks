package jewelery;

public class Jewelery {
    public int goldContent;
    public int weight;
    public String title;
    public int price;

    public Jewelery(int goldContent, int weight, String title, int price) {
        this.goldContent = goldContent;
        this.weight = weight;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jewelery{" +
                "goldContent=" + goldContent +
                ", weight=" + weight +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
