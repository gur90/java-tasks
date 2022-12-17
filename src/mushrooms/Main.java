package mushrooms;

public class Main {
    public static void main(String[] args) {
        FlyAgaric flyAgar = new FlyAgaric("red", 10, false, "forest");
        flyAgar.printInfo();
        BirchMushroom birch = new BirchMushroom("grey", 8, true, "under tree");
        birch.printInfo();
        Chanterelle chan = new Chanterelle("orange", 6, true, "under the fallen leaves");
        chan.printInfo();
        Mushroom[] mashrooms = new Mushroom[]{flyAgar, birch, chan};
        for (Mushroom el : mashrooms) {
            System.out.println(el);
        }
    }
}
