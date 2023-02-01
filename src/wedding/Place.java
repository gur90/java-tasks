package wedding;

public class Place {
    private String adress;
    private int capacity;

    public Place(String adress, int capacity) {
        this.adress = adress;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("place: %s capacity: %d", adress, capacity);
    }
}
