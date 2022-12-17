package waste;

public abstract class Waste {
    private double weight;
    private double volume;
    private String title;

    public void use() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Waste(double weight, double volume, String title) {
        this.weight = weight;
        this.volume = volume;
        this.title = title;
    }

    public static Waste[] printInfo(Waste[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        return input;
    }
}
