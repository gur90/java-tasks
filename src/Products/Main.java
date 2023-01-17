package Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Furniture(456, "Table"));
        products.add(new Furniture(65, "Chair"));
        products.add(new Furniture(6, "Lamp"));
        products.add(new Alcohol(34, "Wine"));
        products.add(new Alcohol(41, "Martini"));
        products.add(new Alcohol(4, "Vodka"));
        System.out.println(products);
        System.out.println("----------");
        Collections.sort(products);
        System.out.println(products);
    }
}
