package waste;

public class Organic extends Waste {
    private int decompositionTime;

    public Organic(double weight, double volume, String title, int decompositionTime) {
        super(weight, volume, title);
        this.decompositionTime = decompositionTime;
    }

    @Override
    public void use() {
        System.out.println(String.format("%s send to compost, it will  decompose for %d years ", getTitle(), decompositionTime));
    }

    @Override
    public String toString() {
        return "Organic " +
                "decompositionTime= " + decompositionTime + ", title: " + getTitle() + ", volume: " + getVolume()
                + ", weight:  " + getWeight();
    }
}
