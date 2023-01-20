package Eatable;

public class Potatoes extends Food {
    public Potatoes(String title, int volume) {
        super(title, volume);
    }

    @Override
    public String toString() {
        return "Potatoes " +
                title +
                ", volume:" + volume;
    }
}
