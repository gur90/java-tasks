package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Hat sambrero = new Hat(7.8, "red", "Mexico");
        Hat kepi = new Hat(2.3, "blue", "USA");
        Hat kepi2 = new Hat(2.3, "blue", "USA");
        HatCollection hathat = new HatCollection(new HashSet<>());
        System.out.println("---------");
        hathat.buyNew(kepi2);
        hathat.buyNew(sambrero);
        hathat.buyNew(kepi);
        hathat.buyNew(kepi);
        System.out.println("after buying  " + hathat);
        System.out.println(hathat.totalValue);
    }
}
