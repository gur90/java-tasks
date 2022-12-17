package cars;

public class Tire {
    private int radius;
    private boolean isSummer;
    private String title;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isSummer() {
        return isSummer;
    }

    public void setSummer(boolean summer) {
        isSummer = summer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Tire(int radius, boolean isSummer, String title) {
        this.radius = radius;
        this.isSummer = isSummer;
        this.title = title;
    }

    public Tire() {

    }

    @Override
    public String toString() {
        return "Tire: " + '\n' +
                "radius= " + radius + '\n' +
                "season= " + (isSummer ? "summer" : "winter") + '\n' +
                "title= '" + title + '\'' + '\n';
    }
}
