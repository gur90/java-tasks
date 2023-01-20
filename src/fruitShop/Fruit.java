package fruitShop;

public abstract class Fruit {
    public double weight;
    public static int count = 0;
    public static double total = 0;

    public Fruit(double weight) {
        this.weight = weight;
        count++;
        total += costOfFruits();
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Turkey");
    }


    public abstract double costOfFruits();


}


