package AboutEnum;

public class Coffee {
    public String title;
    public Size size;
    public String clientName;

    public Coffee(String title, Size size, String clientName) {
        this.title = title;
        this.size = size;
        this.clientName = clientName;
    }

    public double calculatePrice() {
        double price;
        switch (size) {
            case SMALL:
                price = 3;
                break;
            case MEDIUM:
                price = 3.5;
                break;
            case BIG:
                price = 4;
                break;
            case SPECIAL:
                price = 5;
                break;
            default:
                price = 0;
        }
        return price;
    }
}
