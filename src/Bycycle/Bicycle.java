package Bycycle;

public class Bicycle implements Comparable<Bicycle> {
    private int numberOfGears;
    private double maxSpeed;
    private String title;

    public Bicycle(int numberOfGears, double maxSpeed, String title) {
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
        this.title = title;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title=" + title +
                ", numberOfGears=" + numberOfGears +
                ", maxSpeed=" + maxSpeed;
    }

    @Override
    public int compareTo(Bicycle o) {
        //return o.getNumberOfGears() - this.getNumberOfGears();
        return this.getTitle().compareTo(o.getTitle());
    }
}
