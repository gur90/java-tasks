package west;

import java.util.PriorityQueue;

public class Saloon {
    public String title;
    public PriorityQueue<Cowboy> cowboys = new PriorityQueue<>();

    public Saloon(String title) {
        this.title = title;
    }

    public void serveDrink() {
        if (cowboys.isEmpty()) {
            System.out.println("No one there");
        }
        System.out.println(cowboys.poll().getName() + " please take your whiskey");
    }

    public void letCowboyIn(Cowboy cowboy) {
        cowboys.offer(cowboy);
    }

    @Override
    public String toString() {
        return "Saloon{" +
                "title='" + title + '\'' +
                ", cowboys=" + cowboys +
                '}';
    }
}
