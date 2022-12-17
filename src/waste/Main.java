package waste;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Plastic bottle = new Plastic(0.4, 3.0, "bottle", "qwerty6");
        bottle.use();
        Glass cup = new Glass(0.03, 3, "cup", "green");
        cup.use();
        Organic bananaPeel = new Organic(0.1, 2.4, "banana peel", 3);
        bananaPeel.use();
        System.out.println("----------");
        Waste[] wastes = new Waste[]{bottle, bananaPeel, cup};
        Arrays.toString(Waste.printInfo(wastes));
        System.out.println("---------");
        for (Waste el : wastes) {
            el.use();
        }
    }
}
