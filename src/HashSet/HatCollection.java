package HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HatCollection {
    public double totalValue = 0;
    public HashSet<Hat> aLotOfHat = new HashSet<>();

    public HatCollection(HashSet<Hat> aLotOfHat) {
        this.aLotOfHat = aLotOfHat;
    }

    public void buyNew(Hat hat) {
        if (!aLotOfHat.contains(hat)) {
            aLotOfHat.add(hat);
            totalValue += hat.price;
        }
    }

    @Override
    public String toString() {
        return "HatCollection{" +
                "aLotOfHat=" + aLotOfHat +
                '}';
    }


}
