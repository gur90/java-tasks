package Eatable;

public class Brocolli extends Food {
    public Brocolli(String title, int volume) {
        super(title, volume);
    }

    public String toString() {
        return "Broccolli " +
                title +
                ", volume:" + volume;
    }
}
