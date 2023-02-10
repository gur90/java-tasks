package AboutEnum;

public enum Leather {
    COW(50), CROCODILE(1000), SHEEP(70), FISH(50);
    public int price;

    Leather(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
