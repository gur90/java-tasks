package Eatable;

public class Spagetty extends Food {
    public Spagetty(String title, int volume) {
        super(title, volume);
    }

    public String toString() {
        return "Spagetty " +
                title +
                ", volume:" + volume;
    }
}
