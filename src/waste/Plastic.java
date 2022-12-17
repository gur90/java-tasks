package waste;

public class Plastic extends Waste {
    private String marking;

    @Override
    public void use() {
        System.out.println(String.format("plastic %s  marking  %s - send to recycling", getTitle(), marking));
    }

    public Plastic(double weight, double volume, String title, String marking) {
        super(weight, volume, title);
        this.marking = marking;
    }

    @Override
    public String toString() {
        return "Plastic " +
                "marking='" + marking + '\'' +
                ", title: " + getTitle() + ", volume: " + getVolume()
                + ", weight:  " + getWeight();
    }
}
