package Eatable;

public class Container<T extends Eateble> {
    public String brand;
    public double volume;
    public T content;

    public void say() {
        content.print();
    }

    public Container(String brand, double volume, T content) {
        this.brand = brand;
        this.volume = volume;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Container " +
                "brand " + brand +
                ", volume=" + volume +
                ", content: " + content;
    }
}
