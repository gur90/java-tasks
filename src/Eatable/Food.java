package Eatable;

public abstract class Food implements Eateble {
    public String title;
    public int volume;

    public Food(String title, int volume) {
        this.title = title;
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("let`s eat!");
    }
}
