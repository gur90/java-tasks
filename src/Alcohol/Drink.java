package Alcohol;

public class Drink {
    private String title;

    public Drink(String title, double volume) {
        this.title = title;

        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "title='" + title + '\'' +
                ", volume=" + volume +
                '}';
    }

    private double volume;

    public Drink() {
        this.title = title;
        this.volume = volume;
    }
}
