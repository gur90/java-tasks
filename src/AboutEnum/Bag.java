package AboutEnum;

public class Bag {
    public Leather material;
    public double leatherArea;

    public Bag(Leather material, double leatherArea) {
        this.material = material;
        this.leatherArea = leatherArea;
    }

    public double calculatePrice() {
        return leatherArea * material.getPrice();
    }
}
