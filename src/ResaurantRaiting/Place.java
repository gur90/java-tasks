package ResaurantRaiting;

public abstract class Place {
    public double rate;
    public String title;
    public int chairs;
    public int service;

    public Place(double rate, String title, int chairs, int service) {
        this.rate = rate;
        this.title = title;
        this.chairs = chairs;
        this.service = service;
    }

    @Override
    public String toString() {
        return "Place{" +
                "rate=" + rate +
                ", title='" + title + '\'' +
                ", chairs=" + chairs +
                ", service=" + service +
                '}';
    }
}
