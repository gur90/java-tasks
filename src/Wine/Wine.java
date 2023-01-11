package Wine;

public class Wine {
    public String title;
    public static int numberOfBottles = 0;

    public static int getNumberOfBottles() {
        return numberOfBottles;
    }

    @Override
    public String toString() {
        return "Wine " +
                "title " + title;
    }

    public Wine(String title) {
        this.title = title;
        numberOfBottles++;
    }
}
