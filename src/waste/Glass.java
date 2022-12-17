package waste;

public class Glass extends Waste {
    private String color;

    @Override
    public void use() {
        System.out.println(String.format("glass %s color - send to glass recycling ", color));
    }

    public Glass(double weight, double volume, String title, String color) {
        super(weight, volume, title);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Glass " +
                "color='" + color + '\'' +
                ", title: " + getTitle() + ", volume: " + getVolume()
                + ", weight:  " + getWeight();
    }
}
